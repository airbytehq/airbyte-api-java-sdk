/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * JobTypeEnum - Enum that describes the different types of jobs that the platform runs.
 */
public enum JobTypeEnum {
    SYNC("sync"),
    RESET("reset");

    @JsonValue
    public final String value;

    private JobTypeEnum(String value) {
        this.value = value;
    }
}
