/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DestinationCreateRequest {
    /**
     * The values required to configure the destination.
     */
    @JsonProperty("configuration")
    public java.lang.Object configuration;

    public DestinationCreateRequest withConfiguration(java.lang.Object configuration) {
        this.configuration = configuration;
        return this;
    }
    
    /**
     * The UUID of the connector definition. One of configuration.destinationType or definitionId must be provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("definitionId")
    public String definitionId;

    public DestinationCreateRequest withDefinitionId(String definitionId) {
        this.definitionId = definitionId;
        return this;
    }
    
    /**
     * Name of the destination e.g. dev-mysql-instance.
     */
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
    
    public DestinationCreateRequest(@JsonProperty("configuration") java.lang.Object configuration, @JsonProperty("name") String name, @JsonProperty("workspaceId") String workspaceId) {
        this.configuration = configuration;
        this.name = name;
        this.workspaceId = workspaceId;
  }
}
