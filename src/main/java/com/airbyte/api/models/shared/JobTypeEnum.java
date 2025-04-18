/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * JobTypeEnum
 * 
 * <p>Enum that describes the different types of jobs that the platform runs.
 */
public enum JobTypeEnum {
    SYNC("sync"),
    RESET("reset"),
    REFRESH("refresh"),
    CLEAR("clear");

    @JsonValue
    private final String value;

    private JobTypeEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<JobTypeEnum> fromValue(String value) {
        for (JobTypeEnum o: JobTypeEnum.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

