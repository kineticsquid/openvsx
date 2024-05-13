/********************************************************************************
 * Copyright (c) 2020 TypeFox and others
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/
package org.eclipse.openvsx.eclipse;

import jakarta.persistence.EntityManager;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.openvsx.ExtensionService;
import org.eclipse.openvsx.entities.Extension;
import org.eclipse.openvsx.entities.PersonalAccessToken;
import org.eclipse.openvsx.entities.UserData;
import org.eclipse.openvsx.json.UserJson;
import org.eclipse.openvsx.repositories.RepositoryService;
import org.eclipse.openvsx.util.ErrorResultException;
import org.eclipse.openvsx.util.NamingUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.LinkedHashSet;

@Component
public class PublisherComplianceChecker {

    protected final Logger logger = LoggerFactory.getLogger(PublisherComplianceChecker.class);

    private final TransactionTemplate transactions;
    private final EntityManager entityManager;
    private final RepositoryService repositories;
    private final ExtensionService extensions;
    private final EclipseService eclipseService;

    @Value("${ovsx.eclipse.check-compliance-on-start:false}")
    boolean checkCompliance;

    public PublisherComplianceChecker(
            TransactionTemplate transactions,
            EntityManager entityManager,
            RepositoryService repositories,
            ExtensionService extensions,
            EclipseService eclipseService
    ) {
        this.transactions = transactions;
        this.entityManager = entityManager;
        this.repositories = repositories;
        this.extensions = extensions;
        this.eclipseService = eclipseService;
    }

    @EventListener
    public void checkPublishers(ApplicationStartedEvent event) {
        if (!checkCompliance || !eclipseService.isActive())
            return;

        repositories.findAllUsers().forEach(user -> {
            var accessTokens = repositories.findAccessTokens(user);
            if (!accessTokens.isEmpty() && !isCompliant(user)) {
                // Found a non-compliant publisher: deactivate all extension versions
                transactions.<Void>execute(status -> {
                    deactivateExtensions(accessTokens);
                    return null;
                });
            }
        });
    }

    private boolean isCompliant(UserData user) {
        // Users without authentication provider have been created directly in the DB,
        // so we skip the agreement check in this case.
        if (user.getProvider() == null) {
            return true;
        }
        if (user.getEclipsePersonId() == null) {
            // The user has never logged in with Eclipse
            return false;
        }

        var json = new UserJson();
        try {
            eclipseService.enrichUserJson(json, user);
            return !json.publisherAgreement.status.equals("none");
        } catch(ErrorResultException e) {
            // no way to determine whether the user has a publisher agreement
            return true;
        }
    }

    private void deactivateExtensions(Streamable<PersonalAccessToken> accessTokens) {
        var affectedExtensions = new LinkedHashSet<Extension>();
        for (var accessToken : accessTokens) {
            var versions = repositories.findVersionsByAccessToken(accessToken, true);
            for (var version : versions) {
                version.setActive(false);
                entityManager.merge(version);
                var extension = version.getExtension();
                affectedExtensions.add(extension);
                logger.info("Deactivated: " + accessToken.getUser().getLoginName() + " - " + NamingUtil.toLogFormat(version));
            }
        }
        
        // Update affected extensions
        for (var extension : affectedExtensions) {
            extensions.updateExtension(extension);
            entityManager.merge(extension);
        }
    }
    
}