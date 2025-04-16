/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Toggl {
    TOGGL("toggl");

    @JsonValue
    private final String value;

    private Toggl(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Toggl> fromValue(String value) {
        for (Toggl o: Toggl.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

