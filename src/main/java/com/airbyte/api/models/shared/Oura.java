/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Oura {
    OURA("oura");

    @JsonValue
    private final String value;

    private Oura(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Oura> fromValue(String value) {
        for (Oura o: Oura.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}