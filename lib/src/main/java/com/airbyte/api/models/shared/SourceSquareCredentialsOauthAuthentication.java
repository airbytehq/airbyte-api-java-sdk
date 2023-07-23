/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSquareCredentialsOauthAuthentication - Choose how to authenticate to Square.
 */

public class SourceSquareCredentialsOauthAuthentication {
    @JsonProperty("auth_type")
    public SourceSquareCredentialsOauthAuthenticationAuthType authType;

    public SourceSquareCredentialsOauthAuthentication withAuthType(SourceSquareCredentialsOauthAuthenticationAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Square-issued ID of your application
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceSquareCredentialsOauthAuthentication withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Square-issued application secret for your application
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceSquareCredentialsOauthAuthentication withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * A refresh token generated using the above client ID and secret
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceSquareCredentialsOauthAuthentication withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public SourceSquareCredentialsOauthAuthentication(@JsonProperty("auth_type") SourceSquareCredentialsOauthAuthenticationAuthType authType, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken) {
        this.authType = authType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
  }
}
