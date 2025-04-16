/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ValidationPolicy
 * 
 * <p>The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
 */
public enum ValidationPolicy {
    EMIT_RECORD("Emit Record"),
    SKIP_RECORD("Skip Record"),
    WAIT_FOR_DISCOVER("Wait for Discover");

    @JsonValue
    private final String value;

    private ValidationPolicy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ValidationPolicy> fromValue(String value) {
        for (ValidationPolicy o: ValidationPolicy.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

