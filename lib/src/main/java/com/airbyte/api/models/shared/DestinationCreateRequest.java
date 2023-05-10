/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationCreateRequest {
    /**
     * The values required to configure the destination.
     */
    @JsonProperty("configuration")
    public Object configuration;

    public DestinationCreateRequest withConfiguration(Object configuration) {
        this.configuration = configuration;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public DestinationCreateRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("workspaceId")
    public String workspaceId;

    public DestinationCreateRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public DestinationCreateRequest(@JsonProperty("configuration") Object configuration, @JsonProperty("name") String name, @JsonProperty("workspaceId") String workspaceId) {
        this.configuration = configuration;
        this.name = name;
        this.workspaceId = workspaceId;
  }
}
