/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth - Credentials for the service
 */
public class SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth {
    /**
     * Access Token for making authenticated requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthTypeEnum authType;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withAuthType(SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauthAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Client ID of your Google Analytics developer application.
     */
    @JsonProperty("client_id")
    public String clientId;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your Google Analytics developer application.
     */
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The token for obtaining a new access token.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    

    public SourceGoogleAnalyticsV4CredentialsAuthenticateViaGoogleOauth(@JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken) {
    this.clientId = clientId;
this.clientSecret = clientSecret;
this.refreshToken = refreshToken;
  }
}
