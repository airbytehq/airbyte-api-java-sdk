/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRockset - The values required to configure the destination.
 */
public class DestinationRockset {
    /**
     * Rockset api key
     */
    @JsonProperty("api_key")
    public String apiKey;
    public DestinationRockset withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * Rockset api URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_server")
    public String apiServer;
    public DestinationRockset withApiServer(String apiServer) {
        this.apiServer = apiServer;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationRocksetRocksetEnum destinationType;
    public DestinationRockset withDestinationType(DestinationRocksetRocksetEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * The Rockset workspace in which collections will be created + written to.
     */
    @JsonProperty("workspace")
    public String workspace;
    public DestinationRockset withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    
}
