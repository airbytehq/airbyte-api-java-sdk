/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceSalesloftCredentialsAuthenticateViaAPIKey {
    /**
     * API Key for making authenticated requests. More instruction on how to find this value in our &lt;a href="https://docs.airbyte.com/integrations/sources/salesloft#setup-guide"&gt;docs&lt;/a&gt;
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceSalesloftCredentialsAuthenticateViaAPIKey withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceSalesloftCredentialsAuthenticateViaAPIKeyAuthType authType;

    public SourceSalesloftCredentialsAuthenticateViaAPIKey withAuthType(SourceSalesloftCredentialsAuthenticateViaAPIKeyAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    public SourceSalesloftCredentialsAuthenticateViaAPIKey(@JsonProperty("api_key") String apiKey, @JsonProperty("auth_type") SourceSalesloftCredentialsAuthenticateViaAPIKeyAuthType authType) {
        this.apiKey = apiKey;
        this.authType = authType;
  }
}
