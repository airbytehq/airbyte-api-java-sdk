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
    @JsonProperty("airbyte-destination-name")
    public DestinationKeenKeenEnum airbyteDestinationName;
    public DestinationKeen withAirbyteDestinationName(DestinationKeenKeenEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * To get Keen Master API Key, navigate to the Access tab from the left-hand, side panel and check the Project Details section.
     */
    @JsonProperty("api_key")
    public String apiKey;
    public DestinationKeen withApiKey(String apiKey) {
        this.apiKey = apiKey;
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
    
}