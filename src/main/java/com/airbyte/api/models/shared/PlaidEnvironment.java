/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PlaidEnvironment
 * 
 * <p>The Plaid environment.
 */
public enum PlaidEnvironment {
    SANDBOX("sandbox"),
    DEVELOPMENT("development"),
    PRODUCTION("production");

    @JsonValue
    private final String value;

    private PlaidEnvironment(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PlaidEnvironment> fromValue(String value) {
        for (PlaidEnvironment o: PlaidEnvironment.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

