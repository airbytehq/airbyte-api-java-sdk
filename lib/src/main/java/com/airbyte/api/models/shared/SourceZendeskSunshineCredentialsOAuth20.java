/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceZendeskSunshineCredentialsOAuth20 {
    /**
     * Long-term access Token for making authenticated requests.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceZendeskSunshineCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourceZendeskSunshineCredentialsOAuth20AuthMethod authMethod;

    public SourceZendeskSunshineCredentialsOAuth20 withAuthMethod(SourceZendeskSunshineCredentialsOAuth20AuthMethod authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    /**
     * The Client ID of your OAuth application.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceZendeskSunshineCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your OAuth application.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceZendeskSunshineCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    public SourceZendeskSunshineCredentialsOAuth20(@JsonProperty("access_token") String accessToken, @JsonProperty("auth_method") SourceZendeskSunshineCredentialsOAuth20AuthMethod authMethod, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret) {
        this.accessToken = accessToken;
        this.authMethod = authMethod;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
  }
}
