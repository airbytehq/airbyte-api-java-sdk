/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceOktaCredentialsOAuth20 {
    @JsonProperty("auth_type")
    public SourceOktaCredentialsOAuth20AuthType authType;

    public SourceOktaCredentialsOAuth20 withAuthType(SourceOktaCredentialsOAuth20AuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Client ID of your OAuth application.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceOktaCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your OAuth application.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceOktaCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceOktaCredentialsOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public SourceOktaCredentialsOAuth20(@JsonProperty("auth_type") SourceOktaCredentialsOAuth20AuthType authType, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken) {
        this.authType = authType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
  }
}
