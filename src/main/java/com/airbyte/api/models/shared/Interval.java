/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Interval - Between two consecutive points in time series Supports: 1min, 5min, 15min, 30min, 45min, 1h, 2h, 4h, 1day, 1week, 1month
 */
public enum Interval {
    ONEMIN("1min"),
    FIVEMIN("5min"),
    FIFTEENMIN("15min"),
    THIRTYMIN("30min"),
    FORTY_FIVEMIN("45min"),
    ONEH("1h"),
    TWOH("2h"),
    FOURH("4h"),
    ONEDAY("1day"),
    ONEWEEK("1week"),
    ONEMONTH("1month");

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