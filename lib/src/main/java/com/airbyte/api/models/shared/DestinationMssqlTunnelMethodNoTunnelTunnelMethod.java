/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationMssqlTunnelMethodNoTunnelTunnelMethod - No ssh tunnel needed to connect to database
 */
public enum DestinationMssqlTunnelMethodNoTunnelTunnelMethod {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private DestinationMssqlTunnelMethodNoTunnelTunnelMethod(String value) {
        this.value = value;
    }
}
