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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class SourceCodefresh {

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("api_key")
    private String apiKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_date_range")
    private Optional<? extends List<Object>> reportDateRange;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_granularity")
    private Optional<String> reportGranularity;

    @JsonProperty("sourceType")
    private Codefresh sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceCodefresh(
            @JsonProperty("account_id") String accountId,
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("report_date_range") Optional<? extends List<Object>> reportDateRange,
            @JsonProperty("report_granularity") Optional<String> reportGranularity,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(reportDateRange, "reportDateRange");
        Utils.checkNotNull(reportGranularity, "reportGranularity");
        Utils.checkNotNull(startDate, "startDate");
        this.accountId = accountId;
        this.apiKey = apiKey;
        this.reportDateRange = reportDateRange;
        this.reportGranularity = reportGranularity;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceCodefresh(
            String accountId,
            String apiKey,
            OffsetDateTime startDate) {
        this(accountId, apiKey, Optional.empty(), Optional.empty(), startDate);
    }

    @JsonIgnore
    public String accountId() {
        return accountId;
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Object>> reportDateRange() {
        return (Optional<List<Object>>) reportDateRange;
    }

    @JsonIgnore
    public Optional<String> reportGranularity() {
        return reportGranularity;
    }

    @JsonIgnore
    public Codefresh sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceCodefresh withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public SourceCodefresh withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public SourceCodefresh withReportDateRange(List<Object> reportDateRange) {
        Utils.checkNotNull(reportDateRange, "reportDateRange");
        this.reportDateRange = Optional.ofNullable(reportDateRange);
        return this;
    }

    public SourceCodefresh withReportDateRange(Optional<? extends List<Object>> reportDateRange) {
        Utils.checkNotNull(reportDateRange, "reportDateRange");
        this.reportDateRange = reportDateRange;
        return this;
    }

    public SourceCodefresh withReportGranularity(String reportGranularity) {
        Utils.checkNotNull(reportGranularity, "reportGranularity");
        this.reportGranularity = Optional.ofNullable(reportGranularity);
        return this;
    }

    public SourceCodefresh withReportGranularity(Optional<String> reportGranularity) {
        Utils.checkNotNull(reportGranularity, "reportGranularity");
        this.reportGranularity = reportGranularity;
        return this;
    }

    public SourceCodefresh withStartDate(OffsetDateTime startDate) {
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
        SourceCodefresh other = (SourceCodefresh) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.reportDateRange, other.reportDateRange) &&
            Objects.deepEquals(this.reportGranularity, other.reportGranularity) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            apiKey,
            reportDateRange,
            reportGranularity,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceCodefresh.class,
                "accountId", accountId,
                "apiKey", apiKey,
                "reportDateRange", reportDateRange,
                "reportGranularity", reportGranularity,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private String apiKey;
 
        private Optional<? extends List<Object>> reportDateRange = Optional.empty();
 
        private Optional<String> reportGranularity = Optional.empty();
 
        private OffsetDateTime startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder reportDateRange(List<Object> reportDateRange) {
            Utils.checkNotNull(reportDateRange, "reportDateRange");
            this.reportDateRange = Optional.ofNullable(reportDateRange);
            return this;
        }

        public Builder reportDateRange(Optional<? extends List<Object>> reportDateRange) {
            Utils.checkNotNull(reportDateRange, "reportDateRange");
            this.reportDateRange = reportDateRange;
            return this;
        }

        public Builder reportGranularity(String reportGranularity) {
            Utils.checkNotNull(reportGranularity, "reportGranularity");
            this.reportGranularity = Optional.ofNullable(reportGranularity);
            return this;
        }

        public Builder reportGranularity(Optional<String> reportGranularity) {
            Utils.checkNotNull(reportGranularity, "reportGranularity");
            this.reportGranularity = reportGranularity;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceCodefresh build() {
            return new SourceCodefresh(
                accountId,
                apiKey,
                reportDateRange,
                reportGranularity,
                startDate);
        }

        private static final LazySingletonValue<Codefresh> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"codefresh\"",
                        new TypeReference<Codefresh>() {});
    }
}
