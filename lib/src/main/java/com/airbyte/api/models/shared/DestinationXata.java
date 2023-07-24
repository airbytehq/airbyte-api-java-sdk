/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationXata - The values required to configure the destination.
 */

public class DestinationXata {
    /**
     * API Key to connect.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public DestinationXata withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * URL pointing to your workspace.
     */
    @JsonProperty("db_url")
    public String dbUrl;

    public DestinationXata withDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationXataXata destinationType;

    public DestinationXata withDestinationType(DestinationXataXata destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    public DestinationXata(@JsonProperty("api_key") String apiKey, @JsonProperty("db_url") String dbUrl, @JsonProperty("destinationType") DestinationXataXata destinationType) {
        this.apiKey = apiKey;
        this.dbUrl = dbUrl;
        this.destinationType = destinationType;
  }
}
