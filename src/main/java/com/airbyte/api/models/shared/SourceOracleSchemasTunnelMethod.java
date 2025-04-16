/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceOracleSchemasTunnelMethod
 * 
 * <p>Connect through a jump server tunnel host using username and ssh key
 */
public enum SourceOracleSchemasTunnelMethod {
    SSH_KEY_AUTH("SSH_KEY_AUTH");

    @JsonValue
    private final String value;

    private SourceOracleSchemasTunnelMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceOracleSchemasTunnelMethod> fromValue(String value) {
        for (SourceOracleSchemasTunnelMethod o: SourceOracleSchemasTunnelMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

