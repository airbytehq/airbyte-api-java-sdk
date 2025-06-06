/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationClickhouseTunnelMethod
 * 
 * <p>Connect through a jump server tunnel host using username and ssh key
 */
public enum DestinationClickhouseTunnelMethod {
    SSH_KEY_AUTH("SSH_KEY_AUTH");

    @JsonValue
    private final String value;

    private DestinationClickhouseTunnelMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationClickhouseTunnelMethod> fromValue(String value) {
        for (DestinationClickhouseTunnelMethod o: DestinationClickhouseTunnelMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

