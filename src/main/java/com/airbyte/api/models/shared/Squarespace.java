/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Squarespace {
    SQUARESPACE("squarespace");

    @JsonValue
    private final String value;

    private Squarespace(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Squarespace> fromValue(String value) {
        for (Squarespace o: Squarespace.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

