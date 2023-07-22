/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceLemlist - The values required to configure the source.
 */

public class SourceLemlist {
    /**
     * Lemlist API key.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceLemlist withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceLemlistLemlist sourceType;

    public SourceLemlist withSourceType(SourceLemlistLemlist sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceLemlist(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourceLemlistLemlist sourceType) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
  }
}
