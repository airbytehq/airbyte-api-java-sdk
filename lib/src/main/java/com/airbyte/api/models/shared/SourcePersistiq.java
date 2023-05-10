/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePersistiq - The values required to configure the source.
 */
public class SourcePersistiq {
    /**
     * PersistIq API Key. See the &lt;a href="https://apidocs.persistiq.com/#authentication"&gt;docs&lt;/a&gt; for more information on where to find that key.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourcePersistiq withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourcePersistiqPersistiqEnum sourceType;

    public SourcePersistiq withSourceType(SourcePersistiqPersistiqEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourcePersistiq(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourcePersistiqPersistiqEnum sourceType) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
  }
}
