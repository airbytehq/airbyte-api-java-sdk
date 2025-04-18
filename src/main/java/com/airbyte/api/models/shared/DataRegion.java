/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * DataRegion
 * 
 * <p>Amplitude data region server
 */
public enum DataRegion {
    STANDARD_SERVER("Standard Server"),
    EU_RESIDENCY_SERVER("EU Residency Server");

    @JsonValue
    private final String value;

    private DataRegion(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DataRegion> fromValue(String value) {
        for (DataRegion o: DataRegion.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

