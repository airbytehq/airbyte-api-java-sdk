/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DingConnect {
    DING_CONNECT("ding-connect");

    @JsonValue
    private final String value;

    private DingConnect(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DingConnect> fromValue(String value) {
        for (DingConnect o: DingConnect.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

