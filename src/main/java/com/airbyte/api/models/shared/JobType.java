/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * JobType
 * 
 * <p>enum that describes the different types of jobs that the platform runs.
 */
public enum JobType {
    GET_SPEC("get_spec"),
    CHECK_CONNECTION("check_connection"),
    DISCOVER_SCHEMA("discover_schema"),
    SYNC("sync"),
    RESET_CONNECTION("reset_connection"),
    CONNECTION_UPDATER("connection_updater"),
    REPLICATE("replicate");

    @JsonValue
    private final String value;

    private JobType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<JobType> fromValue(String value) {
        for (JobType o: JobType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

