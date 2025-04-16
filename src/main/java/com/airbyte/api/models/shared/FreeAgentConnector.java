/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum FreeAgentConnector {
    FREE_AGENT_CONNECTOR("free-agent-connector");

    @JsonValue
    private final String value;

    private FreeAgentConnector(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<FreeAgentConnector> fromValue(String value) {
        for (FreeAgentConnector o: FreeAgentConnector.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

