/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import java.time.LocalDateTime;

import org.eclipse.openvsx.jooq.tables.Extension;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExtensionRecord extends UpdatableRecordImpl<ExtensionRecord> implements Record13<Long, Double, Integer, String, Long, String, Boolean, LocalDateTime, LocalDateTime, Long, Boolean, Long, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.extension.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.extension.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.extension.average_rating</code>.
     */
    public void setAverageRating(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.extension.average_rating</code>.
     */
    public Double getAverageRating() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>public.extension.download_count</code>.
     */
    public void setDownloadCount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.extension.download_count</code>.
     */
    public Integer getDownloadCount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.extension.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.extension.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.extension.namespace_id</code>.
     */
    public void setNamespaceId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.extension.namespace_id</code>.
     */
    public Long getNamespaceId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.extension.public_id</code>.
     */
    public void setPublicId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.extension.public_id</code>.
     */
    public String getPublicId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.extension.active</code>.
     */
    public void setActive(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.extension.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.extension.published_date</code>.
     */
    public void setPublishedDate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.extension.published_date</code>.
     */
    public LocalDateTime getPublishedDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>public.extension.last_updated_date</code>.
     */
    public void setLastUpdatedDate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.extension.last_updated_date</code>.
     */
    public LocalDateTime getLastUpdatedDate() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>public.extension.review_count</code>.
     */
    public void setReviewCount(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.extension.review_count</code>.
     */
    public Long getReviewCount() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.extension.deprecated</code>.
     */
    public void setDeprecated(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.extension.deprecated</code>.
     */
    public Boolean getDeprecated() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.extension.replacement_id</code>.
     */
    public void setReplacementId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.extension.replacement_id</code>.
     */
    public Long getReplacementId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>public.extension.downloadable</code>.
     */
    public void setDownloadable(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.extension.downloadable</code>.
     */
    public Boolean getDownloadable() {
        return (Boolean) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Double, Integer, String, Long, String, Boolean, LocalDateTime, LocalDateTime, Long, Boolean, Long, Boolean> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, Double, Integer, String, Long, String, Boolean, LocalDateTime, LocalDateTime, Long, Boolean, Long, Boolean> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Extension.EXTENSION.ID;
    }

    @Override
    public Field<Double> field2() {
        return Extension.EXTENSION.AVERAGE_RATING;
    }

    @Override
    public Field<Integer> field3() {
        return Extension.EXTENSION.DOWNLOAD_COUNT;
    }

    @Override
    public Field<String> field4() {
        return Extension.EXTENSION.NAME;
    }

    @Override
    public Field<Long> field5() {
        return Extension.EXTENSION.NAMESPACE_ID;
    }

    @Override
    public Field<String> field6() {
        return Extension.EXTENSION.PUBLIC_ID;
    }

    @Override
    public Field<Boolean> field7() {
        return Extension.EXTENSION.ACTIVE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Extension.EXTENSION.PUBLISHED_DATE;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Extension.EXTENSION.LAST_UPDATED_DATE;
    }

    @Override
    public Field<Long> field10() {
        return Extension.EXTENSION.REVIEW_COUNT;
    }

    @Override
    public Field<Boolean> field11() {
        return Extension.EXTENSION.DEPRECATED;
    }

    @Override
    public Field<Long> field12() {
        return Extension.EXTENSION.REPLACEMENT_ID;
    }

    @Override
    public Field<Boolean> field13() {
        return Extension.EXTENSION.DOWNLOADABLE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Double component2() {
        return getAverageRating();
    }

    @Override
    public Integer component3() {
        return getDownloadCount();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public Long component5() {
        return getNamespaceId();
    }

    @Override
    public String component6() {
        return getPublicId();
    }

    @Override
    public Boolean component7() {
        return getActive();
    }

    @Override
    public LocalDateTime component8() {
        return getPublishedDate();
    }

    @Override
    public LocalDateTime component9() {
        return getLastUpdatedDate();
    }

    @Override
    public Long component10() {
        return getReviewCount();
    }

    @Override
    public Boolean component11() {
        return getDeprecated();
    }

    @Override
    public Long component12() {
        return getReplacementId();
    }

    @Override
    public Boolean component13() {
        return getDownloadable();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Double value2() {
        return getAverageRating();
    }

    @Override
    public Integer value3() {
        return getDownloadCount();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public Long value5() {
        return getNamespaceId();
    }

    @Override
    public String value6() {
        return getPublicId();
    }

    @Override
    public Boolean value7() {
        return getActive();
    }

    @Override
    public LocalDateTime value8() {
        return getPublishedDate();
    }

    @Override
    public LocalDateTime value9() {
        return getLastUpdatedDate();
    }

    @Override
    public Long value10() {
        return getReviewCount();
    }

    @Override
    public Boolean value11() {
        return getDeprecated();
    }

    @Override
    public Long value12() {
        return getReplacementId();
    }

    @Override
    public Boolean value13() {
        return getDownloadable();
    }

    @Override
    public ExtensionRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ExtensionRecord value2(Double value) {
        setAverageRating(value);
        return this;
    }

    @Override
    public ExtensionRecord value3(Integer value) {
        setDownloadCount(value);
        return this;
    }

    @Override
    public ExtensionRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public ExtensionRecord value5(Long value) {
        setNamespaceId(value);
        return this;
    }

    @Override
    public ExtensionRecord value6(String value) {
        setPublicId(value);
        return this;
    }

    @Override
    public ExtensionRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public ExtensionRecord value8(LocalDateTime value) {
        setPublishedDate(value);
        return this;
    }

    @Override
    public ExtensionRecord value9(LocalDateTime value) {
        setLastUpdatedDate(value);
        return this;
    }

    @Override
    public ExtensionRecord value10(Long value) {
        setReviewCount(value);
        return this;
    }

    @Override
    public ExtensionRecord value11(Boolean value) {
        setDeprecated(value);
        return this;
    }

    @Override
    public ExtensionRecord value12(Long value) {
        setReplacementId(value);
        return this;
    }

    @Override
    public ExtensionRecord value13(Boolean value) {
        setDownloadable(value);
        return this;
    }

    @Override
    public ExtensionRecord values(Long value1, Double value2, Integer value3, String value4, Long value5, String value6, Boolean value7, LocalDateTime value8, LocalDateTime value9, Long value10, Boolean value11, Long value12, Boolean value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExtensionRecord
     */
    public ExtensionRecord() {
        super(Extension.EXTENSION);
    }

    /**
     * Create a detached, initialised ExtensionRecord
     */
    public ExtensionRecord(Long id, Double averageRating, Integer downloadCount, String name, Long namespaceId, String publicId, Boolean active, LocalDateTime publishedDate, LocalDateTime lastUpdatedDate, Long reviewCount, Boolean deprecated, Long replacementId, Boolean downloadable) {
        super(Extension.EXTENSION);

        setId(id);
        setAverageRating(averageRating);
        setDownloadCount(downloadCount);
        setName(name);
        setNamespaceId(namespaceId);
        setPublicId(publicId);
        setActive(active);
        setPublishedDate(publishedDate);
        setLastUpdatedDate(lastUpdatedDate);
        setReviewCount(reviewCount);
        setDeprecated(deprecated);
        setReplacementId(replacementId);
        setDownloadable(downloadable);
        resetChangedOnNotNull();
    }
}
