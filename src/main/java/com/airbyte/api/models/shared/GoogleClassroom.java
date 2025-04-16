/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum GoogleClassroom {
    GOOGLE_CLASSROOM("google-classroom");

    @JsonValue
    private final String value;

    private GoogleClassroom(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GoogleClassroom> fromValue(String value) {
        for (GoogleClassroom o: GoogleClassroom.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

