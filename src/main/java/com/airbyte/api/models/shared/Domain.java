/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Domain - The domain suffix for the Zoho Inventory API based on your data center location (e.g., 'com', 'eu', 'in', etc.)
 */
public enum Domain {
    COM("com"),
    IN("in"),
    JP("jp"),
    EU("eu"),
    COM_AU("com.au"),
    CA("ca"),
    COM_CN("com.cn"),
    SA("sa");

    @JsonValue
    private final String value;

    private Domain(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Domain> fromValue(String value) {
        for (Domain o: Domain.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}