/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceSalesloftAuthType {
    OAUTH20("oauth2.0");

    @JsonValue
    private final String value;

    private SourceSalesloftAuthType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceSalesloftAuthType> fromValue(String value) {
        for (SourceSalesloftAuthType o: SourceSalesloftAuthType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

