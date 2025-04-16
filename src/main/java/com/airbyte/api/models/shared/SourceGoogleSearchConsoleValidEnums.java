/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceGoogleSearchConsoleValidEnums
 * 
 * <p>An enumeration of dimensions.
 */
public enum SourceGoogleSearchConsoleValidEnums {
    COUNTRY("country"),
    DATE("date"),
    DEVICE("device"),
    PAGE("page"),
    QUERY("query");

    @JsonValue
    private final String value;

    private SourceGoogleSearchConsoleValidEnums(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceGoogleSearchConsoleValidEnums> fromValue(String value) {
        for (SourceGoogleSearchConsoleValidEnums o: SourceGoogleSearchConsoleValidEnums.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

