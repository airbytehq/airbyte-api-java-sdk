/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;


public class SourceTiktokMarketing {

    /**
     * The attribution window in days.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribution_window")
    private Optional<? extends Long> attributionWindow;

    /**
     * Authentication method
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceTiktokMarketingAuthenticationMethod> credentials;

    /**
     * The date until which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DD. All data generated between start_date and this date will be replicated. Not setting this option will result in always syncing the data till the current date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<? extends LocalDate> endDate;

    /**
     * Set to active if you want to include deleted data in reports.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_deleted")
    private Optional<? extends Boolean> includeDeleted;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceType")
    private Optional<? extends SourceTiktokMarketingTiktokMarketing> sourceType;

    /**
     * The Start Date in format: YYYY-MM-DD. Any data before this date will not be replicated. If this parameter is not set, all data will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends LocalDate> startDate;

    @JsonCreator
    public SourceTiktokMarketing(
            @JsonProperty("attribution_window") Optional<? extends Long> attributionWindow,
            @JsonProperty("credentials") Optional<? extends SourceTiktokMarketingAuthenticationMethod> credentials,
            @JsonProperty("end_date") Optional<? extends LocalDate> endDate,
            @JsonProperty("include_deleted") Optional<? extends Boolean> includeDeleted,
            @JsonProperty("start_date") Optional<? extends LocalDate> startDate) {
        Utils.checkNotNull(attributionWindow, "attributionWindow");
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(includeDeleted, "includeDeleted");
        Utils.checkNotNull(startDate, "startDate");
        this.attributionWindow = attributionWindow;
        this.credentials = credentials;
        this.endDate = endDate;
        this.includeDeleted = includeDeleted;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceTiktokMarketing() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The attribution window in days.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> attributionWindow() {
        return (Optional<Long>) attributionWindow;
    }

    /**
     * Authentication method
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceTiktokMarketingAuthenticationMethod> credentials() {
        return (Optional<SourceTiktokMarketingAuthenticationMethod>) credentials;
    }

    /**
     * The date until which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DD. All data generated between start_date and this date will be replicated. Not setting this option will result in always syncing the data till the current date.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LocalDate> endDate() {
        return (Optional<LocalDate>) endDate;
    }

    /**
     * Set to active if you want to include deleted data in reports.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> includeDeleted() {
        return (Optional<Boolean>) includeDeleted;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceTiktokMarketingTiktokMarketing> sourceType() {
        return (Optional<SourceTiktokMarketingTiktokMarketing>) sourceType;
    }

    /**
     * The Start Date in format: YYYY-MM-DD. Any data before this date will not be replicated. If this parameter is not set, all data will be replicated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LocalDate> startDate() {
        return (Optional<LocalDate>) startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The attribution window in days.
     */
    public SourceTiktokMarketing withAttributionWindow(long attributionWindow) {
        Utils.checkNotNull(attributionWindow, "attributionWindow");
        this.attributionWindow = Optional.ofNullable(attributionWindow);
        return this;
    }

    /**
     * The attribution window in days.
     */
    public SourceTiktokMarketing withAttributionWindow(Optional<? extends Long> attributionWindow) {
        Utils.checkNotNull(attributionWindow, "attributionWindow");
        this.attributionWindow = attributionWindow;
        return this;
    }

    /**
     * Authentication method
     */
    public SourceTiktokMarketing withCredentials(SourceTiktokMarketingAuthenticationMethod credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    /**
     * Authentication method
     */
    public SourceTiktokMarketing withCredentials(Optional<? extends SourceTiktokMarketingAuthenticationMethod> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * The date until which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DD. All data generated between start_date and this date will be replicated. Not setting this option will result in always syncing the data till the current date.
     */
    public SourceTiktokMarketing withEndDate(LocalDate endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * The date until which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DD. All data generated between start_date and this date will be replicated. Not setting this option will result in always syncing the data till the current date.
     */
    public SourceTiktokMarketing withEndDate(Optional<? extends LocalDate> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Set to active if you want to include deleted data in reports.
     */
    public SourceTiktokMarketing withIncludeDeleted(boolean includeDeleted) {
        Utils.checkNotNull(includeDeleted, "includeDeleted");
        this.includeDeleted = Optional.ofNullable(includeDeleted);
        return this;
    }

    /**
     * Set to active if you want to include deleted data in reports.
     */
    public SourceTiktokMarketing withIncludeDeleted(Optional<? extends Boolean> includeDeleted) {
        Utils.checkNotNull(includeDeleted, "includeDeleted");
        this.includeDeleted = includeDeleted;
        return this;
    }

    /**
     * The Start Date in format: YYYY-MM-DD. Any data before this date will not be replicated. If this parameter is not set, all data will be replicated.
     */
    public SourceTiktokMarketing withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The Start Date in format: YYYY-MM-DD. Any data before this date will not be replicated. If this parameter is not set, all data will be replicated.
     */
    public SourceTiktokMarketing withStartDate(Optional<? extends LocalDate> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceTiktokMarketing other = (SourceTiktokMarketing) o;
        return 
            java.util.Objects.deepEquals(this.attributionWindow, other.attributionWindow) &&
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.endDate, other.endDate) &&
            java.util.Objects.deepEquals(this.includeDeleted, other.includeDeleted) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attributionWindow,
            credentials,
            endDate,
            includeDeleted,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTiktokMarketing.class,
                "attributionWindow", attributionWindow,
                "credentials", credentials,
                "endDate", endDate,
                "includeDeleted", includeDeleted,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> attributionWindow;
 
        private Optional<? extends SourceTiktokMarketingAuthenticationMethod> credentials = Optional.empty();
 
        private Optional<? extends LocalDate> endDate = Optional.empty();
 
        private Optional<? extends Boolean> includeDeleted;
 
        private Optional<? extends LocalDate> startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The attribution window in days.
         */
        public Builder attributionWindow(long attributionWindow) {
            Utils.checkNotNull(attributionWindow, "attributionWindow");
            this.attributionWindow = Optional.ofNullable(attributionWindow);
            return this;
        }

        /**
         * The attribution window in days.
         */
        public Builder attributionWindow(Optional<? extends Long> attributionWindow) {
            Utils.checkNotNull(attributionWindow, "attributionWindow");
            this.attributionWindow = attributionWindow;
            return this;
        }

        /**
         * Authentication method
         */
        public Builder credentials(SourceTiktokMarketingAuthenticationMethod credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        /**
         * Authentication method
         */
        public Builder credentials(Optional<? extends SourceTiktokMarketingAuthenticationMethod> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * The date until which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DD. All data generated between start_date and this date will be replicated. Not setting this option will result in always syncing the data till the current date.
         */
        public Builder endDate(LocalDate endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * The date until which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DD. All data generated between start_date and this date will be replicated. Not setting this option will result in always syncing the data till the current date.
         */
        public Builder endDate(Optional<? extends LocalDate> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * Set to active if you want to include deleted data in reports.
         */
        public Builder includeDeleted(boolean includeDeleted) {
            Utils.checkNotNull(includeDeleted, "includeDeleted");
            this.includeDeleted = Optional.ofNullable(includeDeleted);
            return this;
        }

        /**
         * Set to active if you want to include deleted data in reports.
         */
        public Builder includeDeleted(Optional<? extends Boolean> includeDeleted) {
            Utils.checkNotNull(includeDeleted, "includeDeleted");
            this.includeDeleted = includeDeleted;
            return this;
        }

        /**
         * The Start Date in format: YYYY-MM-DD. Any data before this date will not be replicated. If this parameter is not set, all data will be replicated.
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The Start Date in format: YYYY-MM-DD. Any data before this date will not be replicated. If this parameter is not set, all data will be replicated.
         */
        public Builder startDate(Optional<? extends LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceTiktokMarketing build() {
            if (attributionWindow == null) {
                attributionWindow = _SINGLETON_VALUE_AttributionWindow.value();
            }
            if (includeDeleted == null) {
                includeDeleted = _SINGLETON_VALUE_IncludeDeleted.value();
            }
            if (startDate == null) {
                startDate = _SINGLETON_VALUE_StartDate.value();
            }
            return new SourceTiktokMarketing(
                attributionWindow,
                credentials,
                endDate,
                includeDeleted,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_AttributionWindow =
                new LazySingletonValue<>(
                        "attribution_window",
                        "3",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_IncludeDeleted =
                new LazySingletonValue<>(
                        "include_deleted",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends SourceTiktokMarketingTiktokMarketing>> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"tiktok-marketing\"",
                        new TypeReference<Optional<? extends SourceTiktokMarketingTiktokMarketing>>() {});

        private static final LazySingletonValue<Optional<? extends LocalDate>> _SINGLETON_VALUE_StartDate =
                new LazySingletonValue<>(
                        "start_date",
                        "\"2016-09-01\"",
                        new TypeReference<Optional<? extends LocalDate>>() {});
    }
}
