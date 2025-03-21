/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SwipeUpAttributionWindow - Attribution window for swipe ups.
 */
public enum SwipeUpAttributionWindow {
    ONE_DAY("1_DAY"),
    SEVEN_DAY("7_DAY"),
    TWENTY_EIGHT_DAY("28_DAY");

    @JsonValue
    private final String value;

    private SwipeUpAttributionWindow(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
