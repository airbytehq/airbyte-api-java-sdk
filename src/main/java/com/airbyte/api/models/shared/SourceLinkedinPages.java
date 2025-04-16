/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class SourceLinkedinPages {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceLinkedinPagesAuthentication> credentials;

    /**
     * Specify the Organization ID
     */
    @JsonProperty("org_id")
    private String orgId;

    @JsonProperty("sourceType")
    private LinkedinPages sourceType;

    /**
     * Start date for getting metrics per time period. Must be atmost 12 months before the request date (UTC) and atleast 2 days prior to the request date (UTC). See https://bit.ly/linkedin-pages-date-rules &lbrace;&lbrace; "\n" &rbrace;&rbrace; &lbrace;&lbrace; response.errorDetails &rbrace;&rbrace;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<OffsetDateTime> startDate;

    /**
     * Granularity of the statistics for metrics per time period. Must be either "DAY" or "MONTH"
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time_granularity_type")
    private Optional<? extends TimeGranularityType> timeGranularityType;

    @JsonCreator
    public SourceLinkedinPages(
            @JsonProperty("credentials") Optional<? extends SourceLinkedinPagesAuthentication> credentials,
            @JsonProperty("org_id") String orgId,
            @JsonProperty("start_date") Optional<OffsetDateTime> startDate,
            @JsonProperty("time_granularity_type") Optional<? extends TimeGranularityType> timeGranularityType) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(timeGranularityType, "timeGranularityType");
        this.credentials = credentials;
        this.orgId = orgId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.timeGranularityType = timeGranularityType;
    }
    
    public SourceLinkedinPages(
            String orgId) {
        this(Optional.empty(), orgId, Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceLinkedinPagesAuthentication> credentials() {
        return (Optional<SourceLinkedinPagesAuthentication>) credentials;
    }

    /**
     * Specify the Organization ID
     */
    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    @JsonIgnore
    public LinkedinPages sourceType() {
        return sourceType;
    }

    /**
     * Start date for getting metrics per time period. Must be atmost 12 months before the request date (UTC) and atleast 2 days prior to the request date (UTC). See https://bit.ly/linkedin-pages-date-rules &lbrace;&lbrace; "\n" &rbrace;&rbrace; &lbrace;&lbrace; response.errorDetails &rbrace;&rbrace;
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return startDate;
    }

    /**
     * Granularity of the statistics for metrics per time period. Must be either "DAY" or "MONTH"
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TimeGranularityType> timeGranularityType() {
        return (Optional<TimeGranularityType>) timeGranularityType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceLinkedinPages withCredentials(SourceLinkedinPagesAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public SourceLinkedinPages withCredentials(Optional<? extends SourceLinkedinPagesAuthentication> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Specify the Organization ID
     */
    public SourceLinkedinPages withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    /**
     * Start date for getting metrics per time period. Must be atmost 12 months before the request date (UTC) and atleast 2 days prior to the request date (UTC). See https://bit.ly/linkedin-pages-date-rules &lbrace;&lbrace; "\n" &rbrace;&rbrace; &lbrace;&lbrace; response.errorDetails &rbrace;&rbrace;
     */
    public SourceLinkedinPages withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * Start date for getting metrics per time period. Must be atmost 12 months before the request date (UTC) and atleast 2 days prior to the request date (UTC). See https://bit.ly/linkedin-pages-date-rules &lbrace;&lbrace; "\n" &rbrace;&rbrace; &lbrace;&lbrace; response.errorDetails &rbrace;&rbrace;
     */
    public SourceLinkedinPages withStartDate(Optional<OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Granularity of the statistics for metrics per time period. Must be either "DAY" or "MONTH"
     */
    public SourceLinkedinPages withTimeGranularityType(TimeGranularityType timeGranularityType) {
        Utils.checkNotNull(timeGranularityType, "timeGranularityType");
        this.timeGranularityType = Optional.ofNullable(timeGranularityType);
        return this;
    }

    /**
     * Granularity of the statistics for metrics per time period. Must be either "DAY" or "MONTH"
     */
    public SourceLinkedinPages withTimeGranularityType(Optional<? extends TimeGranularityType> timeGranularityType) {
        Utils.checkNotNull(timeGranularityType, "timeGranularityType");
        this.timeGranularityType = timeGranularityType;
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
        SourceLinkedinPages other = (SourceLinkedinPages) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.orgId, other.orgId) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.timeGranularityType, other.timeGranularityType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            orgId,
            sourceType,
            startDate,
            timeGranularityType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceLinkedinPages.class,
                "credentials", credentials,
                "orgId", orgId,
                "sourceType", sourceType,
                "startDate", startDate,
                "timeGranularityType", timeGranularityType);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceLinkedinPagesAuthentication> credentials = Optional.empty();
 
        private String orgId;
 
        private Optional<OffsetDateTime> startDate;
 
        private Optional<? extends TimeGranularityType> timeGranularityType;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(SourceLinkedinPagesAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends SourceLinkedinPagesAuthentication> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Specify the Organization ID
         */
        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }

        /**
         * Start date for getting metrics per time period. Must be atmost 12 months before the request date (UTC) and atleast 2 days prior to the request date (UTC). See https://bit.ly/linkedin-pages-date-rules &lbrace;&lbrace; "\n" &rbrace;&rbrace; &lbrace;&lbrace; response.errorDetails &rbrace;&rbrace;
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * Start date for getting metrics per time period. Must be atmost 12 months before the request date (UTC) and atleast 2 days prior to the request date (UTC). See https://bit.ly/linkedin-pages-date-rules &lbrace;&lbrace; "\n" &rbrace;&rbrace; &lbrace;&lbrace; response.errorDetails &rbrace;&rbrace;
         */
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Granularity of the statistics for metrics per time period. Must be either "DAY" or "MONTH"
         */
        public Builder timeGranularityType(TimeGranularityType timeGranularityType) {
            Utils.checkNotNull(timeGranularityType, "timeGranularityType");
            this.timeGranularityType = Optional.ofNullable(timeGranularityType);
            return this;
        }

        /**
         * Granularity of the statistics for metrics per time period. Must be either "DAY" or "MONTH"
         */
        public Builder timeGranularityType(Optional<? extends TimeGranularityType> timeGranularityType) {
            Utils.checkNotNull(timeGranularityType, "timeGranularityType");
            this.timeGranularityType = timeGranularityType;
            return this;
        }
        
        public SourceLinkedinPages build() {
            if (startDate == null) {
                startDate = _SINGLETON_VALUE_StartDate.value();
            }
            if (timeGranularityType == null) {
                timeGranularityType = _SINGLETON_VALUE_TimeGranularityType.value();
            }
            return new SourceLinkedinPages(
                credentials,
                orgId,
                startDate,
                timeGranularityType);
        }

        private static final LazySingletonValue<LinkedinPages> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"linkedin-pages\"",
                        new TypeReference<LinkedinPages>() {});

        private static final LazySingletonValue<Optional<OffsetDateTime>> _SINGLETON_VALUE_StartDate =
                new LazySingletonValue<>(
                        "start_date",
                        "\"2023-01-01T00:00:00Z\"",
                        new TypeReference<Optional<OffsetDateTime>>() {});

        private static final LazySingletonValue<Optional<? extends TimeGranularityType>> _SINGLETON_VALUE_TimeGranularityType =
                new LazySingletonValue<>(
                        "time_granularity_type",
                        "\"DAY\"",
                        new TypeReference<Optional<? extends TimeGranularityType>>() {});
    }
}
