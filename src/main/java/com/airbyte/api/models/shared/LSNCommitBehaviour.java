/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * LSNCommitBehaviour
 * 
 * <p>Determines when Airbyte should flush the LSN of processed WAL logs in the source database. `After loading Data in the destination` is default. If `While reading Data` is selected, in case of a downstream failure (while loading data into the destination), next sync would result in a full sync.
 */
public enum LSNCommitBehaviour {
    WHILE_READING_DATA("While reading Data"),
    AFTER_LOADING_DATA_IN_THE_DESTINATION("After loading Data in the destination");

    @JsonValue
    private final String value;

    private LSNCommitBehaviour(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<LSNCommitBehaviour> fromValue(String value) {
        for (LSNCommitBehaviour o: LSNCommitBehaviour.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

