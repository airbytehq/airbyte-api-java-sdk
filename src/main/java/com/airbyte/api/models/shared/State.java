/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * State
 * 
 * <p>Select the state of the items to retrieve.
 */
public enum State {
    UNREAD("unread"),
    ARCHIVE("archive"),
    ALL("all");

    @JsonValue
    private final String value;

    private State(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<State> fromValue(String value) {
        for (State o: State.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

