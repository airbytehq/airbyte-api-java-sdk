/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Eventzilla {
    EVENTZILLA("eventzilla");

    @JsonValue
    private final String value;

    private Eventzilla(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Eventzilla> fromValue(String value) {
        for (Eventzilla o: Eventzilla.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}