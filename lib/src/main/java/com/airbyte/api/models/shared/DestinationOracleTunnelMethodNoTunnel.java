/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationOracleTunnelMethodNoTunnel - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
public class DestinationOracleTunnelMethodNoTunnel {
    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonProperty("tunnel_method")
    public DestinationOracleTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod;
    public DestinationOracleTunnelMethodNoTunnel withTunnelMethod(DestinationOracleTunnelMethodNoTunnelTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
}
