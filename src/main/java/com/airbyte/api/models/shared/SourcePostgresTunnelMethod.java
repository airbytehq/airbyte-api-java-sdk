/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SourcePostgresTunnelMethod - No ssh tunnel needed to connect to database
 */
public enum SourcePostgresTunnelMethod {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    private final String value;

    private SourcePostgresTunnelMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
