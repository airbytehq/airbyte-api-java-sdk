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
import java.util.Optional;

public class SourceYahooFinancePrice {

    /**
     * The interval of between prices queried.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval")
    private Optional<? extends SourceYahooFinancePriceInterval> interval;

    /**
     * The range of prices to be queried.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("range")
    private Optional<? extends Range> range;

    @JsonProperty("sourceType")
    private YahooFinancePrice sourceType;

    /**
     * Comma-separated identifiers for the stocks to be queried. Whitespaces are allowed.
     */
    @JsonProperty("tickers")
    private String tickers;

    @JsonCreator
    public SourceYahooFinancePrice(
            @JsonProperty("interval") Optional<? extends SourceYahooFinancePriceInterval> interval,
            @JsonProperty("range") Optional<? extends Range> range,
            @JsonProperty("tickers") String tickers) {
        Utils.checkNotNull(interval, "interval");
        Utils.checkNotNull(range, "range");
        Utils.checkNotNull(tickers, "tickers");
        this.interval = interval;
        this.range = range;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.tickers = tickers;
    }
    
    public SourceYahooFinancePrice(
            String tickers) {
        this(Optional.empty(), Optional.empty(), tickers);
    }

    /**
     * The interval of between prices queried.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceYahooFinancePriceInterval> interval() {
        return (Optional<SourceYahooFinancePriceInterval>) interval;
    }

    /**
     * The range of prices to be queried.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Range> range() {
        return (Optional<Range>) range;
    }

    @JsonIgnore
    public YahooFinancePrice sourceType() {
        return sourceType;
    }

    /**
     * Comma-separated identifiers for the stocks to be queried. Whitespaces are allowed.
     */
    @JsonIgnore
    public String tickers() {
        return tickers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The interval of between prices queried.
     */
    public SourceYahooFinancePrice withInterval(SourceYahooFinancePriceInterval interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = Optional.ofNullable(interval);
        return this;
    }

    /**
     * The interval of between prices queried.
     */
    public SourceYahooFinancePrice withInterval(Optional<? extends SourceYahooFinancePriceInterval> interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = interval;
        return this;
    }

    /**
     * The range of prices to be queried.
     */
    public SourceYahooFinancePrice withRange(Range range) {
        Utils.checkNotNull(range, "range");
        this.range = Optional.ofNullable(range);
        return this;
    }

    /**
     * The range of prices to be queried.
     */
    public SourceYahooFinancePrice withRange(Optional<? extends Range> range) {
        Utils.checkNotNull(range, "range");
        this.range = range;
        return this;
    }

    /**
     * Comma-separated identifiers for the stocks to be queried. Whitespaces are allowed.
     */
    public SourceYahooFinancePrice withTickers(String tickers) {
        Utils.checkNotNull(tickers, "tickers");
        this.tickers = tickers;
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
        SourceYahooFinancePrice other = (SourceYahooFinancePrice) o;
        return 
            java.util.Objects.deepEquals(this.interval, other.interval) &&
            java.util.Objects.deepEquals(this.range, other.range) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.tickers, other.tickers);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            interval,
            range,
            sourceType,
            tickers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceYahooFinancePrice.class,
                "interval", interval,
                "range", range,
                "sourceType", sourceType,
                "tickers", tickers);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceYahooFinancePriceInterval> interval = Optional.empty();
 
        private Optional<? extends Range> range = Optional.empty();
 
        private String tickers;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The interval of between prices queried.
         */
        public Builder interval(SourceYahooFinancePriceInterval interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = Optional.ofNullable(interval);
            return this;
        }

        /**
         * The interval of between prices queried.
         */
        public Builder interval(Optional<? extends SourceYahooFinancePriceInterval> interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = interval;
            return this;
        }

        /**
         * The range of prices to be queried.
         */
        public Builder range(Range range) {
            Utils.checkNotNull(range, "range");
            this.range = Optional.ofNullable(range);
            return this;
        }

        /**
         * The range of prices to be queried.
         */
        public Builder range(Optional<? extends Range> range) {
            Utils.checkNotNull(range, "range");
            this.range = range;
            return this;
        }

        /**
         * Comma-separated identifiers for the stocks to be queried. Whitespaces are allowed.
         */
        public Builder tickers(String tickers) {
            Utils.checkNotNull(tickers, "tickers");
            this.tickers = tickers;
            return this;
        }
        
        public SourceYahooFinancePrice build() {
            return new SourceYahooFinancePrice(
                interval,
                range,
                tickers);
        }

        private static final LazySingletonValue<YahooFinancePrice> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"yahoo-finance-price\"",
                        new TypeReference<YahooFinancePrice>() {});
    }
}

