/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceNewsdataCategory {
    BUSINESS("business"),
    ENTERTAINMENT("entertainment"),
    ENVIRONMENT("environment"),
    FOOD("food"),
    HEALTH("health"),
    POLITICS("politics"),
    SCIENCE("science"),
    SPORTS("sports"),
    TECHNOLOGY("technology"),
    TOP("top"),
    WORLD("world");

    @JsonValue
    private final String value;

    private SourceNewsdataCategory(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceNewsdataCategory> fromValue(String value) {
        for (SourceNewsdataCategory o: SourceNewsdataCategory.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

