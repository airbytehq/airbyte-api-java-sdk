/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ValidAdSetStatuses - An enumeration.
 */
public enum ValidAdSetStatuses {
    ACTIVE("ACTIVE"),
    ARCHIVED("ARCHIVED"),
    CAMPAIGN_PAUSED("CAMPAIGN_PAUSED"),
    DELETED("DELETED"),
    IN_PROCESS("IN_PROCESS"),
    PAUSED("PAUSED"),
    WITH_ISSUES("WITH_ISSUES");

    @JsonValue
    private final String value;

    private ValidAdSetStatuses(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
