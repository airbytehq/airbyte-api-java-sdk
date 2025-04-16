/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationClickhouseSchemasTunnelMethod
 * 
 * <p>Connect through a jump server tunnel host using username and password authentication
 */
public enum DestinationClickhouseSchemasTunnelMethod {
    SSH_PASSWORD_AUTH("SSH_PASSWORD_AUTH");

    @JsonValue
    private final String value;

    private DestinationClickhouseSchemasTunnelMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationClickhouseSchemasTunnelMethod> fromValue(String value) {
        for (DestinationClickhouseSchemasTunnelMethod o: DestinationClickhouseSchemasTunnelMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

