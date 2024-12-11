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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class SourceFreshcaller {

    /**
     * Freshcaller API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/freshcaller"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Used to construct Base URL for the Freshcaller APIs
     */
    @JsonProperty("domain")
    private String domain;

    /**
     * The number of requests per minute that this source allowed to use. There is a rate limit of 50 requests per minute per app per account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requests_per_minute")
    private Optional<Long> requestsPerMinute;

    @JsonProperty("sourceType")
    private Freshcaller sourceType;

    /**
     * UTC date and time. Any data created after this date will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<OffsetDateTime> startDate;

    /**
     * Lag in minutes for each sync, i.e., at time T, data for the time range [prev_sync_time, T-30] will be fetched
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sync_lag_minutes")
    private Optional<Long> syncLagMinutes;

    @JsonCreator
    public SourceFreshcaller(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("domain") String domain,
            @JsonProperty("requests_per_minute") Optional<Long> requestsPerMinute,
            @JsonProperty("start_date") Optional<OffsetDateTime> startDate,
            @JsonProperty("sync_lag_minutes") Optional<Long> syncLagMinutes) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(domain, "domain");
        Utils.checkNotNull(requestsPerMinute, "requestsPerMinute");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(syncLagMinutes, "syncLagMinutes");
        this.apiKey = apiKey;
        this.domain = domain;
        this.requestsPerMinute = requestsPerMinute;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.syncLagMinutes = syncLagMinutes;
    }
    
    public SourceFreshcaller(
            String apiKey,
            String domain) {
        this(apiKey, domain, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Freshcaller API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/freshcaller"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Used to construct Base URL for the Freshcaller APIs
     */
    @JsonIgnore
    public String domain() {
        return domain;
    }

    /**
     * The number of requests per minute that this source allowed to use. There is a rate limit of 50 requests per minute per app per account.
     */
    @JsonIgnore
    public Optional<Long> requestsPerMinute() {
        return requestsPerMinute;
    }

    @JsonIgnore
    public Freshcaller sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time. Any data created after this date will be replicated.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return startDate;
    }

    /**
     * Lag in minutes for each sync, i.e., at time T, data for the time range [prev_sync_time, T-30] will be fetched
     */
    @JsonIgnore
    public Optional<Long> syncLagMinutes() {
        return syncLagMinutes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Freshcaller API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/freshcaller"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    public SourceFreshcaller withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Used to construct Base URL for the Freshcaller APIs
     */
    public SourceFreshcaller withDomain(String domain) {
        Utils.checkNotNull(domain, "domain");
        this.domain = domain;
        return this;
    }

    /**
     * The number of requests per minute that this source allowed to use. There is a rate limit of 50 requests per minute per app per account.
     */
    public SourceFreshcaller withRequestsPerMinute(long requestsPerMinute) {
        Utils.checkNotNull(requestsPerMinute, "requestsPerMinute");
        this.requestsPerMinute = Optional.ofNullable(requestsPerMinute);
        return this;
    }

    /**
     * The number of requests per minute that this source allowed to use. There is a rate limit of 50 requests per minute per app per account.
     */
    public SourceFreshcaller withRequestsPerMinute(Optional<Long> requestsPerMinute) {
        Utils.checkNotNull(requestsPerMinute, "requestsPerMinute");
        this.requestsPerMinute = requestsPerMinute;
        return this;
    }

    /**
     * UTC date and time. Any data created after this date will be replicated.
     */
    public SourceFreshcaller withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date and time. Any data created after this date will be replicated.
     */
    public SourceFreshcaller withStartDate(Optional<OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Lag in minutes for each sync, i.e., at time T, data for the time range [prev_sync_time, T-30] will be fetched
     */
    public SourceFreshcaller withSyncLagMinutes(long syncLagMinutes) {
        Utils.checkNotNull(syncLagMinutes, "syncLagMinutes");
        this.syncLagMinutes = Optional.ofNullable(syncLagMinutes);
        return this;
    }

    /**
     * Lag in minutes for each sync, i.e., at time T, data for the time range [prev_sync_time, T-30] will be fetched
     */
    public SourceFreshcaller withSyncLagMinutes(Optional<Long> syncLagMinutes) {
        Utils.checkNotNull(syncLagMinutes, "syncLagMinutes");
        this.syncLagMinutes = syncLagMinutes;
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
        SourceFreshcaller other = (SourceFreshcaller) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.domain, other.domain) &&
            Objects.deepEquals(this.requestsPerMinute, other.requestsPerMinute) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.syncLagMinutes, other.syncLagMinutes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            domain,
            requestsPerMinute,
            sourceType,
            startDate,
            syncLagMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceFreshcaller.class,
                "apiKey", apiKey,
                "domain", domain,
                "requestsPerMinute", requestsPerMinute,
                "sourceType", sourceType,
                "startDate", startDate,
                "syncLagMinutes", syncLagMinutes);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String domain;
 
        private Optional<Long> requestsPerMinute = Optional.empty();
 
        private Optional<OffsetDateTime> startDate = Optional.empty();
 
        private Optional<Long> syncLagMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Freshcaller API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/freshcaller"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Used to construct Base URL for the Freshcaller APIs
         */
        public Builder domain(String domain) {
            Utils.checkNotNull(domain, "domain");
            this.domain = domain;
            return this;
        }

        /**
         * The number of requests per minute that this source allowed to use. There is a rate limit of 50 requests per minute per app per account.
         */
        public Builder requestsPerMinute(long requestsPerMinute) {
            Utils.checkNotNull(requestsPerMinute, "requestsPerMinute");
            this.requestsPerMinute = Optional.ofNullable(requestsPerMinute);
            return this;
        }

        /**
         * The number of requests per minute that this source allowed to use. There is a rate limit of 50 requests per minute per app per account.
         */
        public Builder requestsPerMinute(Optional<Long> requestsPerMinute) {
            Utils.checkNotNull(requestsPerMinute, "requestsPerMinute");
            this.requestsPerMinute = requestsPerMinute;
            return this;
        }

        /**
         * UTC date and time. Any data created after this date will be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date and time. Any data created after this date will be replicated.
         */
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Lag in minutes for each sync, i.e., at time T, data for the time range [prev_sync_time, T-30] will be fetched
         */
        public Builder syncLagMinutes(long syncLagMinutes) {
            Utils.checkNotNull(syncLagMinutes, "syncLagMinutes");
            this.syncLagMinutes = Optional.ofNullable(syncLagMinutes);
            return this;
        }

        /**
         * Lag in minutes for each sync, i.e., at time T, data for the time range [prev_sync_time, T-30] will be fetched
         */
        public Builder syncLagMinutes(Optional<Long> syncLagMinutes) {
            Utils.checkNotNull(syncLagMinutes, "syncLagMinutes");
            this.syncLagMinutes = syncLagMinutes;
            return this;
        }
        
        public SourceFreshcaller build() {
            return new SourceFreshcaller(
                apiKey,
                domain,
                requestsPerMinute,
                startDate,
                syncLagMinutes);
        }

        private static final LazySingletonValue<Freshcaller> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"freshcaller\"",
                        new TypeReference<Freshcaller>() {});
    }
}

