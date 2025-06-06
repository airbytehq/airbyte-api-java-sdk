/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Interval
 * 
 * <p>Time-series data point interval. Required for intraday endpoints.
 */
public enum Interval {
    ONEMIN("1min"),
    FIVEMIN("5min"),
    FIFTEENMIN("15min"),
    THIRTYMIN("30min"),
    SIXTYMIN("60min");

    @JsonValue
    private final String value;

    private Interval(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Interval> fromValue(String value) {
        for (Interval o: Interval.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

