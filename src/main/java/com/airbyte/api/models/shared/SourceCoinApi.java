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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class SourceCoinApi {

    /**
     * API Key
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * The end date in ISO 8601 format. If not supplied, data will be returned
     * from the start date to the current time, or when the count of result
     * elements reaches its limit.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<String> endDate;

    /**
     * The environment to use. Either sandbox or production.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("environment")
    private Optional<? extends Environment> environment;

    /**
     * The maximum number of elements to return. If not supplied, the default
     * is 100. For numbers larger than 100, each 100 items is counted as one
     * request for pricing purposes. Maximum value is 100000.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    private Optional<Long> limit;

    /**
     * The period to use. See the documentation for a list. https://docs.coinapi.io/#list-all-periods-get
     */
    @JsonProperty("period")
    private String period;

    @JsonProperty("sourceType")
    private CoinApi sourceType;

    /**
     * The start date in ISO 8601 format.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * The symbol ID to use. See the documentation for a list.
     * https://docs.coinapi.io/#list-all-symbols-get
     * 
     */
    @JsonProperty("symbol_id")
    private String symbolId;

    @JsonCreator
    public SourceCoinApi(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("end_date") Optional<String> endDate,
            @JsonProperty("environment") Optional<? extends Environment> environment,
            @JsonProperty("limit") Optional<Long> limit,
            @JsonProperty("period") String period,
            @JsonProperty("start_date") String startDate,
            @JsonProperty("symbol_id") String symbolId) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(environment, "environment");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(period, "period");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(symbolId, "symbolId");
        this.apiKey = apiKey;
        this.endDate = endDate;
        this.environment = environment;
        this.limit = limit;
        this.period = period;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.symbolId = symbolId;
    }
    
    public SourceCoinApi(
            String apiKey,
            String period,
            String startDate,
            String symbolId) {
        this(apiKey, Optional.empty(), Optional.empty(), Optional.empty(), period, startDate, symbolId);
    }

    /**
     * API Key
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * The end date in ISO 8601 format. If not supplied, data will be returned
     * from the start date to the current time, or when the count of result
     * elements reaches its limit.
     * 
     */
    @JsonIgnore
    public Optional<String> endDate() {
        return endDate;
    }

    /**
     * The environment to use. Either sandbox or production.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Environment> environment() {
        return (Optional<Environment>) environment;
    }

    /**
     * The maximum number of elements to return. If not supplied, the default
     * is 100. For numbers larger than 100, each 100 items is counted as one
     * request for pricing purposes. Maximum value is 100000.
     * 
     */
    @JsonIgnore
    public Optional<Long> limit() {
        return limit;
    }

    /**
     * The period to use. See the documentation for a list. https://docs.coinapi.io/#list-all-periods-get
     */
    @JsonIgnore
    public String period() {
        return period;
    }

    @JsonIgnore
    public CoinApi sourceType() {
        return sourceType;
    }

    /**
     * The start date in ISO 8601 format.
     */
    @JsonIgnore
    public String startDate() {
        return startDate;
    }

    /**
     * The symbol ID to use. See the documentation for a list.
     * https://docs.coinapi.io/#list-all-symbols-get
     * 
     */
    @JsonIgnore
    public String symbolId() {
        return symbolId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API Key
     */
    public SourceCoinApi withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The end date in ISO 8601 format. If not supplied, data will be returned
     * from the start date to the current time, or when the count of result
     * elements reaches its limit.
     * 
     */
    public SourceCoinApi withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * The end date in ISO 8601 format. If not supplied, data will be returned
     * from the start date to the current time, or when the count of result
     * elements reaches its limit.
     * 
     */
    public SourceCoinApi withEndDate(Optional<String> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * The environment to use. Either sandbox or production.
     * 
     */
    public SourceCoinApi withEnvironment(Environment environment) {
        Utils.checkNotNull(environment, "environment");
        this.environment = Optional.ofNullable(environment);
        return this;
    }

    /**
     * The environment to use. Either sandbox or production.
     * 
     */
    public SourceCoinApi withEnvironment(Optional<? extends Environment> environment) {
        Utils.checkNotNull(environment, "environment");
        this.environment = environment;
        return this;
    }

    /**
     * The maximum number of elements to return. If not supplied, the default
     * is 100. For numbers larger than 100, each 100 items is counted as one
     * request for pricing purposes. Maximum value is 100000.
     * 
     */
    public SourceCoinApi withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * The maximum number of elements to return. If not supplied, the default
     * is 100. For numbers larger than 100, each 100 items is counted as one
     * request for pricing purposes. Maximum value is 100000.
     * 
     */
    public SourceCoinApi withLimit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * The period to use. See the documentation for a list. https://docs.coinapi.io/#list-all-periods-get
     */
    public SourceCoinApi withPeriod(String period) {
        Utils.checkNotNull(period, "period");
        this.period = period;
        return this;
    }

    /**
     * The start date in ISO 8601 format.
     */
    public SourceCoinApi withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The symbol ID to use. See the documentation for a list.
     * https://docs.coinapi.io/#list-all-symbols-get
     * 
     */
    public SourceCoinApi withSymbolId(String symbolId) {
        Utils.checkNotNull(symbolId, "symbolId");
        this.symbolId = symbolId;
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
        SourceCoinApi other = (SourceCoinApi) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.environment, other.environment) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.period, other.period) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.symbolId, other.symbolId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            endDate,
            environment,
            limit,
            period,
            sourceType,
            startDate,
            symbolId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceCoinApi.class,
                "apiKey", apiKey,
                "endDate", endDate,
                "environment", environment,
                "limit", limit,
                "period", period,
                "sourceType", sourceType,
                "startDate", startDate,
                "symbolId", symbolId);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> endDate = Optional.empty();
 
        private Optional<? extends Environment> environment;
 
        private Optional<Long> limit;
 
        private String period;
 
        private String startDate;
 
        private String symbolId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Key
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The end date in ISO 8601 format. If not supplied, data will be returned
         * from the start date to the current time, or when the count of result
         * elements reaches its limit.
         * 
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * The end date in ISO 8601 format. If not supplied, data will be returned
         * from the start date to the current time, or when the count of result
         * elements reaches its limit.
         * 
         */
        public Builder endDate(Optional<String> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * The environment to use. Either sandbox or production.
         * 
         */
        public Builder environment(Environment environment) {
            Utils.checkNotNull(environment, "environment");
            this.environment = Optional.ofNullable(environment);
            return this;
        }

        /**
         * The environment to use. Either sandbox or production.
         * 
         */
        public Builder environment(Optional<? extends Environment> environment) {
            Utils.checkNotNull(environment, "environment");
            this.environment = environment;
            return this;
        }

        /**
         * The maximum number of elements to return. If not supplied, the default
         * is 100. For numbers larger than 100, each 100 items is counted as one
         * request for pricing purposes. Maximum value is 100000.
         * 
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * The maximum number of elements to return. If not supplied, the default
         * is 100. For numbers larger than 100, each 100 items is counted as one
         * request for pricing purposes. Maximum value is 100000.
         * 
         */
        public Builder limit(Optional<Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * The period to use. See the documentation for a list. https://docs.coinapi.io/#list-all-periods-get
         */
        public Builder period(String period) {
            Utils.checkNotNull(period, "period");
            this.period = period;
            return this;
        }

        /**
         * The start date in ISO 8601 format.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The symbol ID to use. See the documentation for a list.
         * https://docs.coinapi.io/#list-all-symbols-get
         * 
         */
        public Builder symbolId(String symbolId) {
            Utils.checkNotNull(symbolId, "symbolId");
            this.symbolId = symbolId;
            return this;
        }
        
        public SourceCoinApi build() {
            if (environment == null) {
                environment = _SINGLETON_VALUE_Environment.value();
            }
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }            return new SourceCoinApi(
                apiKey,
                endDate,
                environment,
                limit,
                period,
                startDate,
                symbolId);
        }

        private static final LazySingletonValue<Optional<? extends Environment>> _SINGLETON_VALUE_Environment =
                new LazySingletonValue<>(
                        "environment",
                        "\"sandbox\"",
                        new TypeReference<Optional<? extends Environment>>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "100",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<CoinApi> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"coin-api\"",
                        new TypeReference<CoinApi>() {});
    }
}

