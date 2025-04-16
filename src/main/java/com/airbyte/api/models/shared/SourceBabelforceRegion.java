/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceBabelforceRegion
 * 
 * <p>Babelforce region
 */
public enum SourceBabelforceRegion {
    SERVICES("services"),
    US_EAST("us-east"),
    AP_SOUTHEAST("ap-southeast");

    @JsonValue
    private final String value;

    private SourceBabelforceRegion(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceBabelforceRegion> fromValue(String value) {
        for (SourceBabelforceRegion o: SourceBabelforceRegion.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

