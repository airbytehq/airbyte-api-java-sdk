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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class SourceKlaviyo {

    /**
     * Klaviyo API Key. See our &lt;a href="https://docs.airbyte.com/integrations/sources/klaviyo"&gt;docs&lt;/a&gt; if you need help finding this key.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Certain streams like the profiles stream can retrieve predictive analytics data from Klaviyo's API. However, at high volume, this can lead to service availability issues on the API which can be improved by not fetching this field. WARNING: Enabling this setting will stop the  "predictive_analytics" column from being populated in your downstream destination.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disable_fetching_predictive_analytics")
    private Optional<Boolean> disableFetchingPredictiveAnalytics;

    /**
     * The number of worker threads to use for the sync. The performance upper boundary is based on the limit of your Klaviyo plan. More info about the rate limit plan tiers can be found on Klaviyo's API &lt;a href="https://developers.klaviyo.com/en/docs/rate_limits_and_error_handling"&gt;docs&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("num_workers")
    private Optional<Long> numWorkers;

    @JsonProperty("sourceType")
    private Klaviyo sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This field is optional - if not provided, all data will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<OffsetDateTime> startDate;

    @JsonCreator
    public SourceKlaviyo(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("disable_fetching_predictive_analytics") Optional<Boolean> disableFetchingPredictiveAnalytics,
            @JsonProperty("num_workers") Optional<Long> numWorkers,
            @JsonProperty("start_date") Optional<OffsetDateTime> startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(disableFetchingPredictiveAnalytics, "disableFetchingPredictiveAnalytics");
        Utils.checkNotNull(numWorkers, "numWorkers");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.disableFetchingPredictiveAnalytics = disableFetchingPredictiveAnalytics;
        this.numWorkers = numWorkers;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceKlaviyo(
            String apiKey) {
        this(apiKey, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Klaviyo API Key. See our &lt;a href="https://docs.airbyte.com/integrations/sources/klaviyo"&gt;docs&lt;/a&gt; if you need help finding this key.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Certain streams like the profiles stream can retrieve predictive analytics data from Klaviyo's API. However, at high volume, this can lead to service availability issues on the API which can be improved by not fetching this field. WARNING: Enabling this setting will stop the  "predictive_analytics" column from being populated in your downstream destination.
     */
    @JsonIgnore
    public Optional<Boolean> disableFetchingPredictiveAnalytics() {
        return disableFetchingPredictiveAnalytics;
    }

    /**
     * The number of worker threads to use for the sync. The performance upper boundary is based on the limit of your Klaviyo plan. More info about the rate limit plan tiers can be found on Klaviyo's API &lt;a href="https://developers.klaviyo.com/en/docs/rate_limits_and_error_handling"&gt;docs&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<Long> numWorkers() {
        return numWorkers;
    }

    @JsonIgnore
    public Klaviyo sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This field is optional - if not provided, all data will be replicated.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Klaviyo API Key. See our &lt;a href="https://docs.airbyte.com/integrations/sources/klaviyo"&gt;docs&lt;/a&gt; if you need help finding this key.
     */
    public SourceKlaviyo withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Certain streams like the profiles stream can retrieve predictive analytics data from Klaviyo's API. However, at high volume, this can lead to service availability issues on the API which can be improved by not fetching this field. WARNING: Enabling this setting will stop the  "predictive_analytics" column from being populated in your downstream destination.
     */
    public SourceKlaviyo withDisableFetchingPredictiveAnalytics(boolean disableFetchingPredictiveAnalytics) {
        Utils.checkNotNull(disableFetchingPredictiveAnalytics, "disableFetchingPredictiveAnalytics");
        this.disableFetchingPredictiveAnalytics = Optional.ofNullable(disableFetchingPredictiveAnalytics);
        return this;
    }

    /**
     * Certain streams like the profiles stream can retrieve predictive analytics data from Klaviyo's API. However, at high volume, this can lead to service availability issues on the API which can be improved by not fetching this field. WARNING: Enabling this setting will stop the  "predictive_analytics" column from being populated in your downstream destination.
     */
    public SourceKlaviyo withDisableFetchingPredictiveAnalytics(Optional<Boolean> disableFetchingPredictiveAnalytics) {
        Utils.checkNotNull(disableFetchingPredictiveAnalytics, "disableFetchingPredictiveAnalytics");
        this.disableFetchingPredictiveAnalytics = disableFetchingPredictiveAnalytics;
        return this;
    }

    /**
     * The number of worker threads to use for the sync. The performance upper boundary is based on the limit of your Klaviyo plan. More info about the rate limit plan tiers can be found on Klaviyo's API &lt;a href="https://developers.klaviyo.com/en/docs/rate_limits_and_error_handling"&gt;docs&lt;/a&gt;.
     */
    public SourceKlaviyo withNumWorkers(long numWorkers) {
        Utils.checkNotNull(numWorkers, "numWorkers");
        this.numWorkers = Optional.ofNullable(numWorkers);
        return this;
    }

    /**
     * The number of worker threads to use for the sync. The performance upper boundary is based on the limit of your Klaviyo plan. More info about the rate limit plan tiers can be found on Klaviyo's API &lt;a href="https://developers.klaviyo.com/en/docs/rate_limits_and_error_handling"&gt;docs&lt;/a&gt;.
     */
    public SourceKlaviyo withNumWorkers(Optional<Long> numWorkers) {
        Utils.checkNotNull(numWorkers, "numWorkers");
        this.numWorkers = numWorkers;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This field is optional - if not provided, all data will be replicated.
     */
    public SourceKlaviyo withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This field is optional - if not provided, all data will be replicated.
     */
    public SourceKlaviyo withStartDate(Optional<OffsetDateTime> startDate) {
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
        SourceKlaviyo other = (SourceKlaviyo) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.disableFetchingPredictiveAnalytics, other.disableFetchingPredictiveAnalytics) &&
            Objects.deepEquals(this.numWorkers, other.numWorkers) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            disableFetchingPredictiveAnalytics,
            numWorkers,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceKlaviyo.class,
                "apiKey", apiKey,
                "disableFetchingPredictiveAnalytics", disableFetchingPredictiveAnalytics,
                "numWorkers", numWorkers,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<Boolean> disableFetchingPredictiveAnalytics = Optional.empty();
 
        private Optional<Long> numWorkers;
 
        private Optional<OffsetDateTime> startDate = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Klaviyo API Key. See our &lt;a href="https://docs.airbyte.com/integrations/sources/klaviyo"&gt;docs&lt;/a&gt; if you need help finding this key.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Certain streams like the profiles stream can retrieve predictive analytics data from Klaviyo's API. However, at high volume, this can lead to service availability issues on the API which can be improved by not fetching this field. WARNING: Enabling this setting will stop the  "predictive_analytics" column from being populated in your downstream destination.
         */
        public Builder disableFetchingPredictiveAnalytics(boolean disableFetchingPredictiveAnalytics) {
            Utils.checkNotNull(disableFetchingPredictiveAnalytics, "disableFetchingPredictiveAnalytics");
            this.disableFetchingPredictiveAnalytics = Optional.ofNullable(disableFetchingPredictiveAnalytics);
            return this;
        }

        /**
         * Certain streams like the profiles stream can retrieve predictive analytics data from Klaviyo's API. However, at high volume, this can lead to service availability issues on the API which can be improved by not fetching this field. WARNING: Enabling this setting will stop the  "predictive_analytics" column from being populated in your downstream destination.
         */
        public Builder disableFetchingPredictiveAnalytics(Optional<Boolean> disableFetchingPredictiveAnalytics) {
            Utils.checkNotNull(disableFetchingPredictiveAnalytics, "disableFetchingPredictiveAnalytics");
            this.disableFetchingPredictiveAnalytics = disableFetchingPredictiveAnalytics;
            return this;
        }

        /**
         * The number of worker threads to use for the sync. The performance upper boundary is based on the limit of your Klaviyo plan. More info about the rate limit plan tiers can be found on Klaviyo's API &lt;a href="https://developers.klaviyo.com/en/docs/rate_limits_and_error_handling"&gt;docs&lt;/a&gt;.
         */
        public Builder numWorkers(long numWorkers) {
            Utils.checkNotNull(numWorkers, "numWorkers");
            this.numWorkers = Optional.ofNullable(numWorkers);
            return this;
        }

        /**
         * The number of worker threads to use for the sync. The performance upper boundary is based on the limit of your Klaviyo plan. More info about the rate limit plan tiers can be found on Klaviyo's API &lt;a href="https://developers.klaviyo.com/en/docs/rate_limits_and_error_handling"&gt;docs&lt;/a&gt;.
         */
        public Builder numWorkers(Optional<Long> numWorkers) {
            Utils.checkNotNull(numWorkers, "numWorkers");
            this.numWorkers = numWorkers;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This field is optional - if not provided, all data will be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This field is optional - if not provided, all data will be replicated.
         */
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceKlaviyo build() {
            if (numWorkers == null) {
                numWorkers = _SINGLETON_VALUE_NumWorkers.value();
            }
            return new SourceKlaviyo(
                apiKey,
                disableFetchingPredictiveAnalytics,
                numWorkers,
                startDate);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_NumWorkers =
                new LazySingletonValue<>(
                        "num_workers",
                        "10",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Klaviyo> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"klaviyo\"",
                        new TypeReference<Klaviyo>() {});
    }
}
