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
import java.util.Objects;
import java.util.Optional;


public class SourceTwelveData {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Where instrument is traded
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    /**
     * Where instrument is traded
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exchange")
    private Optional<String> exchange;

    /**
     * Between two consecutive points in time series Supports: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 1day, 1week, 1month
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval")
    private Optional<? extends Interval> interval;

    @JsonProperty("sourceType")
    private TwelveData sourceType;

    /**
     * Ticker of the instrument
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("symbol")
    private Optional<String> symbol;

    @JsonCreator
    public SourceTwelveData(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("country") Optional<String> country,
            @JsonProperty("exchange") Optional<String> exchange,
            @JsonProperty("interval") Optional<? extends Interval> interval,
            @JsonProperty("symbol") Optional<String> symbol) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(exchange, "exchange");
        Utils.checkNotNull(interval, "interval");
        Utils.checkNotNull(symbol, "symbol");
        this.apiKey = apiKey;
        this.country = country;
        this.exchange = exchange;
        this.interval = interval;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.symbol = symbol;
    }
    
    public SourceTwelveData(
            String apiKey) {
        this(apiKey, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Where instrument is traded
     */
    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    /**
     * Where instrument is traded
     */
    @JsonIgnore
    public Optional<String> exchange() {
        return exchange;
    }

    /**
     * Between two consecutive points in time series Supports: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 1day, 1week, 1month
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Interval> interval() {
        return (Optional<Interval>) interval;
    }

    @JsonIgnore
    public TwelveData sourceType() {
        return sourceType;
    }

    /**
     * Ticker of the instrument
     */
    @JsonIgnore
    public Optional<String> symbol() {
        return symbol;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceTwelveData withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Where instrument is traded
     */
    public SourceTwelveData withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    /**
     * Where instrument is traded
     */
    public SourceTwelveData withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * Where instrument is traded
     */
    public SourceTwelveData withExchange(String exchange) {
        Utils.checkNotNull(exchange, "exchange");
        this.exchange = Optional.ofNullable(exchange);
        return this;
    }

    /**
     * Where instrument is traded
     */
    public SourceTwelveData withExchange(Optional<String> exchange) {
        Utils.checkNotNull(exchange, "exchange");
        this.exchange = exchange;
        return this;
    }

    /**
     * Between two consecutive points in time series Supports: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 1day, 1week, 1month
     */
    public SourceTwelveData withInterval(Interval interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = Optional.ofNullable(interval);
        return this;
    }

    /**
     * Between two consecutive points in time series Supports: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 1day, 1week, 1month
     */
    public SourceTwelveData withInterval(Optional<? extends Interval> interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = interval;
        return this;
    }

    /**
     * Ticker of the instrument
     */
    public SourceTwelveData withSymbol(String symbol) {
        Utils.checkNotNull(symbol, "symbol");
        this.symbol = Optional.ofNullable(symbol);
        return this;
    }

    /**
     * Ticker of the instrument
     */
    public SourceTwelveData withSymbol(Optional<String> symbol) {
        Utils.checkNotNull(symbol, "symbol");
        this.symbol = symbol;
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
        SourceTwelveData other = (SourceTwelveData) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.exchange, other.exchange) &&
            Objects.deepEquals(this.interval, other.interval) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.symbol, other.symbol);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            country,
            exchange,
            interval,
            sourceType,
            symbol);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTwelveData.class,
                "apiKey", apiKey,
                "country", country,
                "exchange", exchange,
                "interval", interval,
                "sourceType", sourceType,
                "symbol", symbol);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> country = Optional.empty();
 
        private Optional<String> exchange = Optional.empty();
 
        private Optional<? extends Interval> interval;
 
        private Optional<String> symbol = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Where instrument is traded
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        /**
         * Where instrument is traded
         */
        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * Where instrument is traded
         */
        public Builder exchange(String exchange) {
            Utils.checkNotNull(exchange, "exchange");
            this.exchange = Optional.ofNullable(exchange);
            return this;
        }

        /**
         * Where instrument is traded
         */
        public Builder exchange(Optional<String> exchange) {
            Utils.checkNotNull(exchange, "exchange");
            this.exchange = exchange;
            return this;
        }

        /**
         * Between two consecutive points in time series Supports: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 1day, 1week, 1month
         */
        public Builder interval(Interval interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = Optional.ofNullable(interval);
            return this;
        }

        /**
         * Between two consecutive points in time series Supports: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 1day, 1week, 1month
         */
        public Builder interval(Optional<? extends Interval> interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = interval;
            return this;
        }

        /**
         * Ticker of the instrument
         */
        public Builder symbol(String symbol) {
            Utils.checkNotNull(symbol, "symbol");
            this.symbol = Optional.ofNullable(symbol);
            return this;
        }

        /**
         * Ticker of the instrument
         */
        public Builder symbol(Optional<String> symbol) {
            Utils.checkNotNull(symbol, "symbol");
            this.symbol = symbol;
            return this;
        }
        
        public SourceTwelveData build() {
            if (interval == null) {
                interval = _SINGLETON_VALUE_Interval.value();
            }            return new SourceTwelveData(
                apiKey,
                country,
                exchange,
                interval,
                symbol);
        }

        private static final LazySingletonValue<Optional<? extends Interval>> _SINGLETON_VALUE_Interval =
                new LazySingletonValue<>(
                        "interval",
                        "\"1day\"",
                        new TypeReference<Optional<? extends Interval>>() {});

        private static final LazySingletonValue<TwelveData> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"twelve-data\"",
                        new TypeReference<TwelveData>() {});
    }
}
