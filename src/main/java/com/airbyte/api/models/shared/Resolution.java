/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Resolution {
    HOUR("hour"),
    DAY("day"),
    WEEK("week");

    @JsonValue
    private final String value;

    private Resolution(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Resolution> fromValue(String value) {
        for (Resolution o: Resolution.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

