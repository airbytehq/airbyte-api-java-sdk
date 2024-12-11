/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * State - Select the state of the items to retrieve.
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
}
