/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSmartengage - The values required to configure the source.
 */
public class SourceSmartengage {
    /**
     * API Key
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceSmartengage withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSmartengageSmartengageEnum sourceType;
    public SourceSmartengage withSourceType(SourceSmartengageSmartengageEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}
