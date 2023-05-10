/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePendo - The values required to configure the source.
 */
public class SourcePendo {
    @JsonProperty("api_key")
    public String apiKey;

    public SourcePendo withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourcePendoPendoEnum sourceType;

    public SourcePendo withSourceType(SourcePendoPendoEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourcePendo(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourcePendoPendoEnum sourceType) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
  }
}
