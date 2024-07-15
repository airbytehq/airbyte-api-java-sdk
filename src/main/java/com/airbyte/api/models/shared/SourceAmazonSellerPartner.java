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

public class SourceAmazonSellerPartner {

    /**
     * Type of the Account you're going to authorize the Airbyte application by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_type")
    private Optional<? extends AWSSellerPartnerAccountType> accountType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceAmazonSellerPartnerAuthType> authType;

    /**
     * Select the AWS Environment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aws_environment")
    private Optional<? extends AWSEnvironment> awsEnvironment;

    /**
     * Your Login with Amazon Client ID.
     */
    @JsonProperty("lwa_app_id")
    private String lwaAppId;

    /**
     * Your Login with Amazon Client Secret.
     */
    @JsonProperty("lwa_client_secret")
    private String lwaClientSecret;

    /**
     * For syncs spanning a large date range, this option is used to request data in a smaller fixed window to improve sync reliability. This time window can be configured granularly by day.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("period_in_days")
    private Optional<? extends Long> periodInDays;

    /**
     * The Refresh Token obtained via OAuth flow authorization.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * Select the AWS Region.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<? extends AWSRegion> region;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data after this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication_end_date")
    private Optional<? extends OffsetDateTime> replicationEndDate;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If start date is not provided or older than 2 years ago from today, the date 2 years ago from today will be used.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication_start_date")
    private Optional<? extends OffsetDateTime> replicationStartDate;

    /**
     * Additional information passed to reports. This varies by report type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_options_list")
    private Optional<? extends java.util.List<ReportOptions>> reportOptionsList;

    @JsonProperty("sourceType")
    private SourceAmazonSellerPartnerAmazonSellerPartner sourceType;

    @JsonCreator
    public SourceAmazonSellerPartner(
            @JsonProperty("account_type") Optional<? extends AWSSellerPartnerAccountType> accountType,
            @JsonProperty("aws_environment") Optional<? extends AWSEnvironment> awsEnvironment,
            @JsonProperty("lwa_app_id") String lwaAppId,
            @JsonProperty("lwa_client_secret") String lwaClientSecret,
            @JsonProperty("period_in_days") Optional<? extends Long> periodInDays,
            @JsonProperty("refresh_token") String refreshToken,
            @JsonProperty("region") Optional<? extends AWSRegion> region,
            @JsonProperty("replication_end_date") Optional<? extends OffsetDateTime> replicationEndDate,
            @JsonProperty("replication_start_date") Optional<? extends OffsetDateTime> replicationStartDate,
            @JsonProperty("report_options_list") Optional<? extends java.util.List<ReportOptions>> reportOptionsList) {
        Utils.checkNotNull(accountType, "accountType");
        Utils.checkNotNull(awsEnvironment, "awsEnvironment");
        Utils.checkNotNull(lwaAppId, "lwaAppId");
        Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
        Utils.checkNotNull(periodInDays, "periodInDays");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(replicationEndDate, "replicationEndDate");
        Utils.checkNotNull(replicationStartDate, "replicationStartDate");
        Utils.checkNotNull(reportOptionsList, "reportOptionsList");
        this.accountType = accountType;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.awsEnvironment = awsEnvironment;
        this.lwaAppId = lwaAppId;
        this.lwaClientSecret = lwaClientSecret;
        this.periodInDays = periodInDays;
        this.refreshToken = refreshToken;
        this.region = region;
        this.replicationEndDate = replicationEndDate;
        this.replicationStartDate = replicationStartDate;
        this.reportOptionsList = reportOptionsList;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceAmazonSellerPartner(
            String lwaAppId,
            String lwaClientSecret,
            String refreshToken) {
        this(Optional.empty(), Optional.empty(), lwaAppId, lwaClientSecret, Optional.empty(), refreshToken, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Type of the Account you're going to authorize the Airbyte application by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AWSSellerPartnerAccountType> accountType() {
        return (Optional<AWSSellerPartnerAccountType>) accountType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceAmazonSellerPartnerAuthType> authType() {
        return (Optional<SourceAmazonSellerPartnerAuthType>) authType;
    }

    /**
     * Select the AWS Environment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AWSEnvironment> awsEnvironment() {
        return (Optional<AWSEnvironment>) awsEnvironment;
    }

    /**
     * Your Login with Amazon Client ID.
     */
    @JsonIgnore
    public String lwaAppId() {
        return lwaAppId;
    }

    /**
     * Your Login with Amazon Client Secret.
     */
    @JsonIgnore
    public String lwaClientSecret() {
        return lwaClientSecret;
    }

    /**
     * For syncs spanning a large date range, this option is used to request data in a smaller fixed window to improve sync reliability. This time window can be configured granularly by day.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> periodInDays() {
        return (Optional<Long>) periodInDays;
    }

    /**
     * The Refresh Token obtained via OAuth flow authorization.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    /**
     * Select the AWS Region.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AWSRegion> region() {
        return (Optional<AWSRegion>) region;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data after this date will not be replicated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> replicationEndDate() {
        return (Optional<OffsetDateTime>) replicationEndDate;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If start date is not provided or older than 2 years ago from today, the date 2 years ago from today will be used.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> replicationStartDate() {
        return (Optional<OffsetDateTime>) replicationStartDate;
    }

    /**
     * Additional information passed to reports. This varies by report type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<ReportOptions>> reportOptionsList() {
        return (Optional<java.util.List<ReportOptions>>) reportOptionsList;
    }

    @JsonIgnore
    public SourceAmazonSellerPartnerAmazonSellerPartner sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Type of the Account you're going to authorize the Airbyte application by
     */
    public SourceAmazonSellerPartner withAccountType(AWSSellerPartnerAccountType accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = Optional.ofNullable(accountType);
        return this;
    }

    /**
     * Type of the Account you're going to authorize the Airbyte application by
     */
    public SourceAmazonSellerPartner withAccountType(Optional<? extends AWSSellerPartnerAccountType> accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = accountType;
        return this;
    }

    /**
     * Select the AWS Environment.
     */
    public SourceAmazonSellerPartner withAwsEnvironment(AWSEnvironment awsEnvironment) {
        Utils.checkNotNull(awsEnvironment, "awsEnvironment");
        this.awsEnvironment = Optional.ofNullable(awsEnvironment);
        return this;
    }

    /**
     * Select the AWS Environment.
     */
    public SourceAmazonSellerPartner withAwsEnvironment(Optional<? extends AWSEnvironment> awsEnvironment) {
        Utils.checkNotNull(awsEnvironment, "awsEnvironment");
        this.awsEnvironment = awsEnvironment;
        return this;
    }

    /**
     * Your Login with Amazon Client ID.
     */
    public SourceAmazonSellerPartner withLwaAppId(String lwaAppId) {
        Utils.checkNotNull(lwaAppId, "lwaAppId");
        this.lwaAppId = lwaAppId;
        return this;
    }

    /**
     * Your Login with Amazon Client Secret.
     */
    public SourceAmazonSellerPartner withLwaClientSecret(String lwaClientSecret) {
        Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
        this.lwaClientSecret = lwaClientSecret;
        return this;
    }

    /**
     * For syncs spanning a large date range, this option is used to request data in a smaller fixed window to improve sync reliability. This time window can be configured granularly by day.
     */
    public SourceAmazonSellerPartner withPeriodInDays(long periodInDays) {
        Utils.checkNotNull(periodInDays, "periodInDays");
        this.periodInDays = Optional.ofNullable(periodInDays);
        return this;
    }

    /**
     * For syncs spanning a large date range, this option is used to request data in a smaller fixed window to improve sync reliability. This time window can be configured granularly by day.
     */
    public SourceAmazonSellerPartner withPeriodInDays(Optional<? extends Long> periodInDays) {
        Utils.checkNotNull(periodInDays, "periodInDays");
        this.periodInDays = periodInDays;
        return this;
    }

    /**
     * The Refresh Token obtained via OAuth flow authorization.
     */
    public SourceAmazonSellerPartner withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Select the AWS Region.
     */
    public SourceAmazonSellerPartner withRegion(AWSRegion region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    /**
     * Select the AWS Region.
     */
    public SourceAmazonSellerPartner withRegion(Optional<? extends AWSRegion> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data after this date will not be replicated.
     */
    public SourceAmazonSellerPartner withReplicationEndDate(OffsetDateTime replicationEndDate) {
        Utils.checkNotNull(replicationEndDate, "replicationEndDate");
        this.replicationEndDate = Optional.ofNullable(replicationEndDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data after this date will not be replicated.
     */
    public SourceAmazonSellerPartner withReplicationEndDate(Optional<? extends OffsetDateTime> replicationEndDate) {
        Utils.checkNotNull(replicationEndDate, "replicationEndDate");
        this.replicationEndDate = replicationEndDate;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If start date is not provided or older than 2 years ago from today, the date 2 years ago from today will be used.
     */
    public SourceAmazonSellerPartner withReplicationStartDate(OffsetDateTime replicationStartDate) {
        Utils.checkNotNull(replicationStartDate, "replicationStartDate");
        this.replicationStartDate = Optional.ofNullable(replicationStartDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If start date is not provided or older than 2 years ago from today, the date 2 years ago from today will be used.
     */
    public SourceAmazonSellerPartner withReplicationStartDate(Optional<? extends OffsetDateTime> replicationStartDate) {
        Utils.checkNotNull(replicationStartDate, "replicationStartDate");
        this.replicationStartDate = replicationStartDate;
        return this;
    }

    /**
     * Additional information passed to reports. This varies by report type.
     */
    public SourceAmazonSellerPartner withReportOptionsList(java.util.List<ReportOptions> reportOptionsList) {
        Utils.checkNotNull(reportOptionsList, "reportOptionsList");
        this.reportOptionsList = Optional.ofNullable(reportOptionsList);
        return this;
    }

    /**
     * Additional information passed to reports. This varies by report type.
     */
    public SourceAmazonSellerPartner withReportOptionsList(Optional<? extends java.util.List<ReportOptions>> reportOptionsList) {
        Utils.checkNotNull(reportOptionsList, "reportOptionsList");
        this.reportOptionsList = reportOptionsList;
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
        SourceAmazonSellerPartner other = (SourceAmazonSellerPartner) o;
        return 
            java.util.Objects.deepEquals(this.accountType, other.accountType) &&
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.awsEnvironment, other.awsEnvironment) &&
            java.util.Objects.deepEquals(this.lwaAppId, other.lwaAppId) &&
            java.util.Objects.deepEquals(this.lwaClientSecret, other.lwaClientSecret) &&
            java.util.Objects.deepEquals(this.periodInDays, other.periodInDays) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            java.util.Objects.deepEquals(this.region, other.region) &&
            java.util.Objects.deepEquals(this.replicationEndDate, other.replicationEndDate) &&
            java.util.Objects.deepEquals(this.replicationStartDate, other.replicationStartDate) &&
            java.util.Objects.deepEquals(this.reportOptionsList, other.reportOptionsList) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountType,
            authType,
            awsEnvironment,
            lwaAppId,
            lwaClientSecret,
            periodInDays,
            refreshToken,
            region,
            replicationEndDate,
            replicationStartDate,
            reportOptionsList,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAmazonSellerPartner.class,
                "accountType", accountType,
                "authType", authType,
                "awsEnvironment", awsEnvironment,
                "lwaAppId", lwaAppId,
                "lwaClientSecret", lwaClientSecret,
                "periodInDays", periodInDays,
                "refreshToken", refreshToken,
                "region", region,
                "replicationEndDate", replicationEndDate,
                "replicationStartDate", replicationStartDate,
                "reportOptionsList", reportOptionsList,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends AWSSellerPartnerAccountType> accountType;
 
        private Optional<? extends AWSEnvironment> awsEnvironment;
 
        private String lwaAppId;
 
        private String lwaClientSecret;
 
        private Optional<? extends Long> periodInDays;
 
        private String refreshToken;
 
        private Optional<? extends AWSRegion> region;
 
        private Optional<? extends OffsetDateTime> replicationEndDate = Optional.empty();
 
        private Optional<? extends OffsetDateTime> replicationStartDate = Optional.empty();
 
        private Optional<? extends java.util.List<ReportOptions>> reportOptionsList = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Type of the Account you're going to authorize the Airbyte application by
         */
        public Builder accountType(AWSSellerPartnerAccountType accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = Optional.ofNullable(accountType);
            return this;
        }

        /**
         * Type of the Account you're going to authorize the Airbyte application by
         */
        public Builder accountType(Optional<? extends AWSSellerPartnerAccountType> accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = accountType;
            return this;
        }

        /**
         * Select the AWS Environment.
         */
        public Builder awsEnvironment(AWSEnvironment awsEnvironment) {
            Utils.checkNotNull(awsEnvironment, "awsEnvironment");
            this.awsEnvironment = Optional.ofNullable(awsEnvironment);
            return this;
        }

        /**
         * Select the AWS Environment.
         */
        public Builder awsEnvironment(Optional<? extends AWSEnvironment> awsEnvironment) {
            Utils.checkNotNull(awsEnvironment, "awsEnvironment");
            this.awsEnvironment = awsEnvironment;
            return this;
        }

        /**
         * Your Login with Amazon Client ID.
         */
        public Builder lwaAppId(String lwaAppId) {
            Utils.checkNotNull(lwaAppId, "lwaAppId");
            this.lwaAppId = lwaAppId;
            return this;
        }

        /**
         * Your Login with Amazon Client Secret.
         */
        public Builder lwaClientSecret(String lwaClientSecret) {
            Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
            this.lwaClientSecret = lwaClientSecret;
            return this;
        }

        /**
         * For syncs spanning a large date range, this option is used to request data in a smaller fixed window to improve sync reliability. This time window can be configured granularly by day.
         */
        public Builder periodInDays(long periodInDays) {
            Utils.checkNotNull(periodInDays, "periodInDays");
            this.periodInDays = Optional.ofNullable(periodInDays);
            return this;
        }

        /**
         * For syncs spanning a large date range, this option is used to request data in a smaller fixed window to improve sync reliability. This time window can be configured granularly by day.
         */
        public Builder periodInDays(Optional<? extends Long> periodInDays) {
            Utils.checkNotNull(periodInDays, "periodInDays");
            this.periodInDays = periodInDays;
            return this;
        }

        /**
         * The Refresh Token obtained via OAuth flow authorization.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * Select the AWS Region.
         */
        public Builder region(AWSRegion region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        /**
         * Select the AWS Region.
         */
        public Builder region(Optional<? extends AWSRegion> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data after this date will not be replicated.
         */
        public Builder replicationEndDate(OffsetDateTime replicationEndDate) {
            Utils.checkNotNull(replicationEndDate, "replicationEndDate");
            this.replicationEndDate = Optional.ofNullable(replicationEndDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data after this date will not be replicated.
         */
        public Builder replicationEndDate(Optional<? extends OffsetDateTime> replicationEndDate) {
            Utils.checkNotNull(replicationEndDate, "replicationEndDate");
            this.replicationEndDate = replicationEndDate;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If start date is not provided or older than 2 years ago from today, the date 2 years ago from today will be used.
         */
        public Builder replicationStartDate(OffsetDateTime replicationStartDate) {
            Utils.checkNotNull(replicationStartDate, "replicationStartDate");
            this.replicationStartDate = Optional.ofNullable(replicationStartDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. If start date is not provided or older than 2 years ago from today, the date 2 years ago from today will be used.
         */
        public Builder replicationStartDate(Optional<? extends OffsetDateTime> replicationStartDate) {
            Utils.checkNotNull(replicationStartDate, "replicationStartDate");
            this.replicationStartDate = replicationStartDate;
            return this;
        }

        /**
         * Additional information passed to reports. This varies by report type.
         */
        public Builder reportOptionsList(java.util.List<ReportOptions> reportOptionsList) {
            Utils.checkNotNull(reportOptionsList, "reportOptionsList");
            this.reportOptionsList = Optional.ofNullable(reportOptionsList);
            return this;
        }

        /**
         * Additional information passed to reports. This varies by report type.
         */
        public Builder reportOptionsList(Optional<? extends java.util.List<ReportOptions>> reportOptionsList) {
            Utils.checkNotNull(reportOptionsList, "reportOptionsList");
            this.reportOptionsList = reportOptionsList;
            return this;
        }
        
        public SourceAmazonSellerPartner build() {
            if (accountType == null) {
                accountType = _SINGLETON_VALUE_AccountType.value();
            }
            if (awsEnvironment == null) {
                awsEnvironment = _SINGLETON_VALUE_AwsEnvironment.value();
            }
            if (periodInDays == null) {
                periodInDays = _SINGLETON_VALUE_PeriodInDays.value();
            }
            if (region == null) {
                region = _SINGLETON_VALUE_Region.value();
            }
            return new SourceAmazonSellerPartner(
                accountType,
                awsEnvironment,
                lwaAppId,
                lwaClientSecret,
                periodInDays,
                refreshToken,
                region,
                replicationEndDate,
                replicationStartDate,
                reportOptionsList);
        }

        private static final LazySingletonValue<Optional<? extends AWSSellerPartnerAccountType>> _SINGLETON_VALUE_AccountType =
                new LazySingletonValue<>(
                        "account_type",
                        "\"Seller\"",
                        new TypeReference<Optional<? extends AWSSellerPartnerAccountType>>() {});

        private static final LazySingletonValue<Optional<? extends SourceAmazonSellerPartnerAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"oauth2.0\"",
                        new TypeReference<Optional<? extends SourceAmazonSellerPartnerAuthType>>() {});

        private static final LazySingletonValue<Optional<? extends AWSEnvironment>> _SINGLETON_VALUE_AwsEnvironment =
                new LazySingletonValue<>(
                        "aws_environment",
                        "\"PRODUCTION\"",
                        new TypeReference<Optional<? extends AWSEnvironment>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PeriodInDays =
                new LazySingletonValue<>(
                        "period_in_days",
                        "90",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends AWSRegion>> _SINGLETON_VALUE_Region =
                new LazySingletonValue<>(
                        "region",
                        "\"US\"",
                        new TypeReference<Optional<? extends AWSRegion>>() {});

        private static final LazySingletonValue<SourceAmazonSellerPartnerAmazonSellerPartner> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"amazon-seller-partner\"",
                        new TypeReference<SourceAmazonSellerPartnerAmazonSellerPartner>() {});
    }
}

