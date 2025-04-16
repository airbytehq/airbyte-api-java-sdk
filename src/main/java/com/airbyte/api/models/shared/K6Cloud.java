/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum K6Cloud {
    K6_CLOUD("k6-cloud");

    @JsonValue
    private final String value;

    private K6Cloud(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<K6Cloud> fromValue(String value) {
        for (K6Cloud o: K6Cloud.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

