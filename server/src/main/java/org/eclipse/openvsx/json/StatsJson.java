/********************************************************************************
 * Copyright (c) 2020 TypeFox and others
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/
package org.eclipse.openvsx.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class StatsJson extends ResultJson {

    public static StatsJson error(String message) {
        var user = new StatsJson();
        user.setError(message);
        return user;
    }

    private long userCount;

    private long extensionCount;

    private long namespaceCount;

    public long getUserCount() {
        return userCount;
    }

    public void setUserCount(long userCount) {
        this.userCount = userCount;
    }

    public long getExtensionCount() {
        return extensionCount;
    }

    public void setExtensionCount(long extensionCount) {
        this.extensionCount = extensionCount;
    }

    public long getNamespaceCount() {
        return namespaceCount;
    }

    public void setNamespaceCount(long namespaceCount) {
        this.namespaceCount = namespaceCount;
    }
}