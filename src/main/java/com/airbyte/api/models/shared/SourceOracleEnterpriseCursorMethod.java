/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceOracleEnterpriseCursorMethod {
    USER_DEFINED("user_defined");

    @JsonValue
    private final String value;

    private SourceOracleEnterpriseCursorMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceOracleEnterpriseCursorMethod> fromValue(String value) {
        for (SourceOracleEnterpriseCursorMethod o: SourceOracleEnterpriseCursorMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

