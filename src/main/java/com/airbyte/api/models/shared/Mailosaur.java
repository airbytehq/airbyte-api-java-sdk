/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Mailosaur {
    MAILOSAUR("mailosaur");

    @JsonValue
    private final String value;

    private Mailosaur(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Mailosaur> fromValue(String value) {
        for (Mailosaur o: Mailosaur.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

