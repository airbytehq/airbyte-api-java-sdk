/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * DataCenterID - The identifier for the data center, such as 'us1' or 'e' for EU.
 */
public enum DataCenterID {
    US1("us1"),
    E("e");

    @JsonValue
    private final String value;

    private DataCenterID(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DataCenterID> fromValue(String value) {
        for (DataCenterID o: DataCenterID.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}