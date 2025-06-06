/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Weatherstack {
    WEATHERSTACK("weatherstack");

    @JsonValue
    private final String value;

    private Weatherstack(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Weatherstack> fromValue(String value) {
        for (Weatherstack o: Weatherstack.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

