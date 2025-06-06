/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Plugin
 * 
 * <p>A logical decoding plugin installed on the PostgreSQL server.
 */
public enum Plugin {
    PGOUTPUT("pgoutput");

    @JsonValue
    private final String value;

    private Plugin(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Plugin> fromValue(String value) {
        for (Plugin o: Plugin.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

