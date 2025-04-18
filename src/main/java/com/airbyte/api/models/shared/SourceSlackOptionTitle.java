/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceSlackOptionTitle {
    DEFAULT_O_AUTH20_AUTHORIZATION("Default OAuth2.0 authorization");

    @JsonValue
    private final String value;

    private SourceSlackOptionTitle(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceSlackOptionTitle> fromValue(String value) {
        for (SourceSlackOptionTitle o: SourceSlackOptionTitle.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

