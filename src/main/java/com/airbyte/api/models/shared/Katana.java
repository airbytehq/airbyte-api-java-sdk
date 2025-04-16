/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Katana {
    KATANA("katana");

    @JsonValue
    private final String value;

    private Katana(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Katana> fromValue(String value) {
        for (Katana o: Katana.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

