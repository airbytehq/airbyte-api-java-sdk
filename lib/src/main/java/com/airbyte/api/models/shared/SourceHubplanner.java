/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceHubplanner - The values required to configure the source.
 */
public class SourceHubplanner {
    /**
     * Hubplanner API key. See https://github.com/hubplanner/API#authentication for more details.
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceHubplanner withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceHubplannerHubplannerEnum sourceType;
    public SourceHubplanner withSourceType(SourceHubplannerHubplannerEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}
