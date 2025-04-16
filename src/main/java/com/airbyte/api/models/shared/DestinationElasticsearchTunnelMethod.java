/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationElasticsearchTunnelMethod
 * 
 * <p>No ssh tunnel needed to connect to database
 */
public enum DestinationElasticsearchTunnelMethod {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    private final String value;

    private DestinationElasticsearchTunnelMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationElasticsearchTunnelMethod> fromValue(String value) {
        for (DestinationElasticsearchTunnelMethod o: DestinationElasticsearchTunnelMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

