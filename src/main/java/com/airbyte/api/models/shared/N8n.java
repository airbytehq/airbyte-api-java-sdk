/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum N8n {
    N8N("n8n");

    @JsonValue
    private final String value;

    private N8n(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<N8n> fromValue(String value) {
        for (N8n o: N8n.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

