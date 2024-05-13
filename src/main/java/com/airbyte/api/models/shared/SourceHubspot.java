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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class SourceHubspot {

    /**
     * Choose how to authenticate to HubSpot.
     */
    @JsonProperty("credentials")
    private SourceHubspotAuthentication credentials;

    /**
     * If enabled then experimental streams become available for sync.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enable_experimental_streams")
    private Optional<? extends Boolean> enableExperimentalStreams;

    @JsonProperty("sourceType")
    private SourceHubspotHubspot sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If not set, "2006-06-01T00:00:00Z" (Hubspot creation date) will be used as start date. It's recommended to provide relevant to your data start date value to optimize synchronization.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends OffsetDateTime> startDate;

    @JsonCreator
    public SourceHubspot(
            @JsonProperty("credentials") SourceHubspotAuthentication credentials,
            @JsonProperty("enable_experimental_streams") Optional<? extends Boolean> enableExperimentalStreams,
            @JsonProperty("start_date") Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
        Utils.checkNotNull(startDate, "startDate");
        this.credentials = credentials;
        this.enableExperimentalStreams = enableExperimentalStreams;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceHubspot(
            SourceHubspotAuthentication credentials) {
        this(credentials, Optional.empty(), Optional.empty());
    }

    /**
     * Choose how to authenticate to HubSpot.
     */
    @JsonIgnore
    public SourceHubspotAuthentication credentials() {
        return credentials;
    }

    /**
     * If enabled then experimental streams become available for sync.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> enableExperimentalStreams() {
        return (Optional<Boolean>) enableExperimentalStreams;
    }

    @JsonIgnore
    public SourceHubspotHubspot sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If not set, "2006-06-01T00:00:00Z" (Hubspot creation date) will be used as start date. It's recommended to provide relevant to your data start date value to optimize synchronization.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return (Optional<OffsetDateTime>) startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Choose how to authenticate to HubSpot.
     */
    public SourceHubspot withCredentials(SourceHubspotAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * If enabled then experimental streams become available for sync.
     */
    public SourceHubspot withEnableExperimentalStreams(boolean enableExperimentalStreams) {
        Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
        this.enableExperimentalStreams = Optional.ofNullable(enableExperimentalStreams);
        return this;
    }

    /**
     * If enabled then experimental streams become available for sync.
     */
    public SourceHubspot withEnableExperimentalStreams(Optional<? extends Boolean> enableExperimentalStreams) {
        Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
        this.enableExperimentalStreams = enableExperimentalStreams;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If not set, "2006-06-01T00:00:00Z" (Hubspot creation date) will be used as start date. It's recommended to provide relevant to your data start date value to optimize synchronization.
     */
    public SourceHubspot withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If not set, "2006-06-01T00:00:00Z" (Hubspot creation date) will be used as start date. It's recommended to provide relevant to your data start date value to optimize synchronization.
     */
    public SourceHubspot withStartDate(Optional<? extends OffsetDateTime> startDate) {
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
        SourceHubspot other = (SourceHubspot) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.enableExperimentalStreams, other.enableExperimentalStreams) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials,
            enableExperimentalStreams,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceHubspot.class,
                "credentials", credentials,
                "enableExperimentalStreams", enableExperimentalStreams,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private SourceHubspotAuthentication credentials;
 
        private Optional<? extends Boolean> enableExperimentalStreams;
 
        private Optional<? extends OffsetDateTime> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Choose how to authenticate to HubSpot.
         */
        public Builder credentials(SourceHubspotAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * If enabled then experimental streams become available for sync.
         */
        public Builder enableExperimentalStreams(boolean enableExperimentalStreams) {
            Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
            this.enableExperimentalStreams = Optional.ofNullable(enableExperimentalStreams);
            return this;
        }

        /**
         * If enabled then experimental streams become available for sync.
         */
        public Builder enableExperimentalStreams(Optional<? extends Boolean> enableExperimentalStreams) {
            Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
            this.enableExperimentalStreams = enableExperimentalStreams;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If not set, "2006-06-01T00:00:00Z" (Hubspot creation date) will be used as start date. It's recommended to provide relevant to your data start date value to optimize synchronization.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If not set, "2006-06-01T00:00:00Z" (Hubspot creation date) will be used as start date. It's recommended to provide relevant to your data start date value to optimize synchronization.
         */
        public Builder startDate(Optional<? extends OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceHubspot build() {
            if (enableExperimentalStreams == null) {
                enableExperimentalStreams = _SINGLETON_VALUE_EnableExperimentalStreams.value();
            }
            return new SourceHubspot(
                credentials,
                enableExperimentalStreams,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_EnableExperimentalStreams =
                new LazySingletonValue<>(
                        "enable_experimental_streams",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<SourceHubspotHubspot> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"hubspot\"",
                        new TypeReference<SourceHubspotHubspot>() {});
    }
}

