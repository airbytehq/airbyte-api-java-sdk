/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DestinationMssqlV2Name {
    UNENCRYPTED("unencrypted");

    @JsonValue
    private final String value;

    private DestinationMssqlV2Name(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationMssqlV2Name> fromValue(String value) {
        for (DestinationMssqlV2Name o: DestinationMssqlV2Name.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

