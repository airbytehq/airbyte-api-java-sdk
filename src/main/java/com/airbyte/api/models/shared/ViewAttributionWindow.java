/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ViewAttributionWindow
 * 
 * <p>Attribution window for views.
 */
public enum ViewAttributionWindow {
    ONE_HOUR("1_HOUR"),
    THREE_HOUR("3_HOUR"),
    SIX_HOUR("6_HOUR"),
    ONE_DAY("1_DAY"),
    SEVEN_DAY("7_DAY");

    @JsonValue
    private final String value;

    private ViewAttributionWindow(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ViewAttributionWindow> fromValue(String value) {
        for (ViewAttributionWindow o: ViewAttributionWindow.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

