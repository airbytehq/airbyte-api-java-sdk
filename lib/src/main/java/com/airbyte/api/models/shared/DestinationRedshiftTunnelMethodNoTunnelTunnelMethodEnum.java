/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationRedshiftTunnelMethodNoTunnelTunnelMethodEnum - No ssh tunnel needed to connect to database
 */
public enum DestinationRedshiftTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private DestinationRedshiftTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
