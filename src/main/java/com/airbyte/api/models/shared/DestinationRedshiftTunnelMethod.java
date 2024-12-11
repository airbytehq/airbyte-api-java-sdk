/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DestinationRedshiftTunnelMethod - No ssh tunnel needed to connect to database
 */
public enum DestinationRedshiftTunnelMethod {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    private final String value;

    private DestinationRedshiftTunnelMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
