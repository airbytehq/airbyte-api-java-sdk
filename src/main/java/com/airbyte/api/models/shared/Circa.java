/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Circa {
    CIRCA("circa");

    @JsonValue
    private final String value;

    private Circa(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Circa> fromValue(String value) {
        for (Circa o: Circa.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}