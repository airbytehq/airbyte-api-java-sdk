/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationResponse - Provides details of a single destination.
 */
public class DestinationResponse {
    @JsonProperty("destinationId")
    public String destinationId;
    public DestinationResponse withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    @JsonProperty("destinationType")
    public String destinationType;
    public DestinationResponse withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public DestinationResponse withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("workspaceId")
    public String workspaceId;
    public DestinationResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    

    public DestinationResponse(@JsonProperty("destinationId") String destinationId, @JsonProperty("destinationType") String destinationType, @JsonProperty("name") String name, @JsonProperty("workspaceId") String workspaceId) {
    this.destinationId = destinationId;
this.destinationType = destinationType;
this.name = name;
this.workspaceId = workspaceId;
  }
}
