/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Fillout {
    FILLOUT("fillout");

    @JsonValue
    private final String value;

    private Fillout(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Fillout> fromValue(String value) {
        for (Fillout o: Fillout.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}