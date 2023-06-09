/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationKeen - The values required to configure the destination.
 */

public class DestinationKeen {
    /**
     * To get Keen Master API Key, navigate to the Access tab from the left-hand, side panel and check the Project Details section.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public DestinationKeen withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationKeenKeen destinationType;

    public DestinationKeen withDestinationType(DestinationKeenKeen destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Allow connector to guess keen.timestamp value based on the streamed data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("infer_timestamp")
    public Boolean inferTimestamp;

    public DestinationKeen withInferTimestamp(Boolean inferTimestamp) {
        this.inferTimestamp = inferTimestamp;
        return this;
    }
    
    /**
     * To get Keen Project ID, navigate to the Access tab from the left-hand, side panel and check the Project Details section.
     */
    @JsonProperty("project_id")
    public String projectId;

    public DestinationKeen withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    public DestinationKeen(@JsonProperty("api_key") String apiKey, @JsonProperty("destinationType") DestinationKeenKeen destinationType, @JsonProperty("project_id") String projectId) {
        this.apiKey = apiKey;
        this.destinationType = destinationType;
        this.projectId = projectId;
  }
}
