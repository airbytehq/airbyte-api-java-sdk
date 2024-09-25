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

public class SourceLinkedinAds {

    /**
     * Specify the account IDs to pull data from, separated by a space. Leave this field empty if you want to pull the data from all accounts accessible by the authenticated user. See the &lt;a href="https://www.linkedin.com/help/linkedin/answer/a424270/find-linkedin-ads-account-details?lang=en"&gt;LinkedIn docs&lt;/a&gt; to locate these IDs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_ids")
    private Optional<? extends java.util.List<Long>> accountIds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ad_analytics_reports")
    private Optional<? extends java.util.List<AdAnalyticsReportConfiguration>> adAnalyticsReports;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceLinkedinAdsAuthentication> credentials;

    /**
     * How far into the past to look for records. (in days)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window")
    private Optional<? extends Long> lookbackWindow;

    @JsonProperty("sourceType")
    private SourceLinkedinAdsLinkedinAds sourceType;

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private LocalDate startDate;

    @JsonCreator
    public SourceLinkedinAds(
            @JsonProperty("account_ids") Optional<? extends java.util.List<Long>> accountIds,
            @JsonProperty("ad_analytics_reports") Optional<? extends java.util.List<AdAnalyticsReportConfiguration>> adAnalyticsReports,
            @JsonProperty("credentials") Optional<? extends SourceLinkedinAdsAuthentication> credentials,
            @JsonProperty("lookback_window") Optional<? extends Long> lookbackWindow,
            @JsonProperty("start_date") LocalDate startDate) {
        Utils.checkNotNull(accountIds, "accountIds");
        Utils.checkNotNull(adAnalyticsReports, "adAnalyticsReports");
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(lookbackWindow, "lookbackWindow");
        Utils.checkNotNull(startDate, "startDate");
        this.accountIds = accountIds;
        this.adAnalyticsReports = adAnalyticsReports;
        this.credentials = credentials;
        this.lookbackWindow = lookbackWindow;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceLinkedinAds(
            LocalDate startDate) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), startDate);
    }

    /**
     * Specify the account IDs to pull data from, separated by a space. Leave this field empty if you want to pull the data from all accounts accessible by the authenticated user. See the &lt;a href="https://www.linkedin.com/help/linkedin/answer/a424270/find-linkedin-ads-account-details?lang=en"&gt;LinkedIn docs&lt;/a&gt; to locate these IDs.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<Long>> accountIds() {
        return (Optional<java.util.List<Long>>) accountIds;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<AdAnalyticsReportConfiguration>> adAnalyticsReports() {
        return (Optional<java.util.List<AdAnalyticsReportConfiguration>>) adAnalyticsReports;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceLinkedinAdsAuthentication> credentials() {
        return (Optional<SourceLinkedinAdsAuthentication>) credentials;
    }

    /**
     * How far into the past to look for records. (in days)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> lookbackWindow() {
        return (Optional<Long>) lookbackWindow;
    }

    @JsonIgnore
    public SourceLinkedinAdsLinkedinAds sourceType() {
        return sourceType;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated.
     */
    @JsonIgnore
    public LocalDate startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify the account IDs to pull data from, separated by a space. Leave this field empty if you want to pull the data from all accounts accessible by the authenticated user. See the &lt;a href="https://www.linkedin.com/help/linkedin/answer/a424270/find-linkedin-ads-account-details?lang=en"&gt;LinkedIn docs&lt;/a&gt; to locate these IDs.
     */
    public SourceLinkedinAds withAccountIds(java.util.List<Long> accountIds) {
        Utils.checkNotNull(accountIds, "accountIds");
        this.accountIds = Optional.ofNullable(accountIds);
        return this;
    }

    /**
     * Specify the account IDs to pull data from, separated by a space. Leave this field empty if you want to pull the data from all accounts accessible by the authenticated user. See the &lt;a href="https://www.linkedin.com/help/linkedin/answer/a424270/find-linkedin-ads-account-details?lang=en"&gt;LinkedIn docs&lt;/a&gt; to locate these IDs.
     */
    public SourceLinkedinAds withAccountIds(Optional<? extends java.util.List<Long>> accountIds) {
        Utils.checkNotNull(accountIds, "accountIds");
        this.accountIds = accountIds;
        return this;
    }

    public SourceLinkedinAds withAdAnalyticsReports(java.util.List<AdAnalyticsReportConfiguration> adAnalyticsReports) {
        Utils.checkNotNull(adAnalyticsReports, "adAnalyticsReports");
        this.adAnalyticsReports = Optional.ofNullable(adAnalyticsReports);
        return this;
    }

    public SourceLinkedinAds withAdAnalyticsReports(Optional<? extends java.util.List<AdAnalyticsReportConfiguration>> adAnalyticsReports) {
        Utils.checkNotNull(adAnalyticsReports, "adAnalyticsReports");
        this.adAnalyticsReports = adAnalyticsReports;
        return this;
    }

    public SourceLinkedinAds withCredentials(SourceLinkedinAdsAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public SourceLinkedinAds withCredentials(Optional<? extends SourceLinkedinAdsAuthentication> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * How far into the past to look for records. (in days)
     */
    public SourceLinkedinAds withLookbackWindow(long lookbackWindow) {
        Utils.checkNotNull(lookbackWindow, "lookbackWindow");
        this.lookbackWindow = Optional.ofNullable(lookbackWindow);
        return this;
    }

    /**
     * How far into the past to look for records. (in days)
     */
    public SourceLinkedinAds withLookbackWindow(Optional<? extends Long> lookbackWindow) {
        Utils.checkNotNull(lookbackWindow, "lookbackWindow");
        this.lookbackWindow = lookbackWindow;
        return this;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated.
     */
    public SourceLinkedinAds withStartDate(LocalDate startDate) {
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
        SourceLinkedinAds other = (SourceLinkedinAds) o;
        return 
            java.util.Objects.deepEquals(this.accountIds, other.accountIds) &&
            java.util.Objects.deepEquals(this.adAnalyticsReports, other.adAnalyticsReports) &&
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.lookbackWindow, other.lookbackWindow) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountIds,
            adAnalyticsReports,
            credentials,
            lookbackWindow,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceLinkedinAds.class,
                "accountIds", accountIds,
                "adAnalyticsReports", adAnalyticsReports,
                "credentials", credentials,
                "lookbackWindow", lookbackWindow,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<Long>> accountIds = Optional.empty();
 
        private Optional<? extends java.util.List<AdAnalyticsReportConfiguration>> adAnalyticsReports = Optional.empty();
 
        private Optional<? extends SourceLinkedinAdsAuthentication> credentials = Optional.empty();
 
        private Optional<? extends Long> lookbackWindow;
 
        private LocalDate startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specify the account IDs to pull data from, separated by a space. Leave this field empty if you want to pull the data from all accounts accessible by the authenticated user. See the &lt;a href="https://www.linkedin.com/help/linkedin/answer/a424270/find-linkedin-ads-account-details?lang=en"&gt;LinkedIn docs&lt;/a&gt; to locate these IDs.
         */
        public Builder accountIds(java.util.List<Long> accountIds) {
            Utils.checkNotNull(accountIds, "accountIds");
            this.accountIds = Optional.ofNullable(accountIds);
            return this;
        }

        /**
         * Specify the account IDs to pull data from, separated by a space. Leave this field empty if you want to pull the data from all accounts accessible by the authenticated user. See the &lt;a href="https://www.linkedin.com/help/linkedin/answer/a424270/find-linkedin-ads-account-details?lang=en"&gt;LinkedIn docs&lt;/a&gt; to locate these IDs.
         */
        public Builder accountIds(Optional<? extends java.util.List<Long>> accountIds) {
            Utils.checkNotNull(accountIds, "accountIds");
            this.accountIds = accountIds;
            return this;
        }

        public Builder adAnalyticsReports(java.util.List<AdAnalyticsReportConfiguration> adAnalyticsReports) {
            Utils.checkNotNull(adAnalyticsReports, "adAnalyticsReports");
            this.adAnalyticsReports = Optional.ofNullable(adAnalyticsReports);
            return this;
        }

        public Builder adAnalyticsReports(Optional<? extends java.util.List<AdAnalyticsReportConfiguration>> adAnalyticsReports) {
            Utils.checkNotNull(adAnalyticsReports, "adAnalyticsReports");
            this.adAnalyticsReports = adAnalyticsReports;
            return this;
        }

        public Builder credentials(SourceLinkedinAdsAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends SourceLinkedinAdsAuthentication> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * How far into the past to look for records. (in days)
         */
        public Builder lookbackWindow(long lookbackWindow) {
            Utils.checkNotNull(lookbackWindow, "lookbackWindow");
            this.lookbackWindow = Optional.ofNullable(lookbackWindow);
            return this;
        }

        /**
         * How far into the past to look for records. (in days)
         */
        public Builder lookbackWindow(Optional<? extends Long> lookbackWindow) {
            Utils.checkNotNull(lookbackWindow, "lookbackWindow");
            this.lookbackWindow = lookbackWindow;
            return this;
        }

        /**
         * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated.
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceLinkedinAds build() {
            if (lookbackWindow == null) {
                lookbackWindow = _SINGLETON_VALUE_LookbackWindow.value();
            }
            return new SourceLinkedinAds(
                accountIds,
                adAnalyticsReports,
                credentials,
                lookbackWindow,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_LookbackWindow =
                new LazySingletonValue<>(
                        "lookback_window",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<SourceLinkedinAdsLinkedinAds> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"linkedin-ads\"",
                        new TypeReference<SourceLinkedinAdsLinkedinAds>() {});
    }
}

