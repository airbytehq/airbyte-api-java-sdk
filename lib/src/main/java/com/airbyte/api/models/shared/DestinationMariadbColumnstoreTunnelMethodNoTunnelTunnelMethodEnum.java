/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethodEnum - No ssh tunnel needed to connect to database
 */
public enum DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethodEnum {
    NO_TUNNEL("NO_TUNNEL");

    @JsonValue
    public final String value;

    private DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethodEnum(String value) {
        this.value = value;
    }
}
