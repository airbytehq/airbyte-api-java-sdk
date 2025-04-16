/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * TimePeriod
 * 
 * <p>Time Period for cash flow stmts
 */
public enum TimePeriod {
    ANNUAL("annual"),
    QUARTER("quarter");

    @JsonValue
    private final String value;

    private TimePeriod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TimePeriod> fromValue(String value) {
        for (TimePeriod o: TimePeriod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

