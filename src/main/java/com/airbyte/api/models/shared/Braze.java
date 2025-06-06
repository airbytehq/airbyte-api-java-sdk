/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Braze {
    BRAZE("braze");

    @JsonValue
    private final String value;

    private Braze(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Braze> fromValue(String value) {
        for (Braze o: Braze.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

