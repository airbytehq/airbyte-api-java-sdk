/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceYahooFinancePriceInterval
 * 
 * <p>The interval of between prices queried.
 */
public enum SourceYahooFinancePriceInterval {
    ONEM("1m"),
    FIVEM("5m"),
    FIFTEENM("15m"),
    THIRTYM("30m"),
    NINETYM("90m"),
    ONEH("1h"),
    ONED("1d"),
    FIVED("5d"),
    ONEWK("1wk"),
    ONEMO("1mo"),
    THREEMO("3mo");

    @JsonValue
    private final String value;

    private SourceYahooFinancePriceInterval(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceYahooFinancePriceInterval> fromValue(String value) {
        for (SourceYahooFinancePriceInterval o: SourceYahooFinancePriceInterval.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

