/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceSnowflakeCredentialsOAuth20 {
    /**
     * Access Token for making authenticated requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;

    public SourceSnowflakeCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceSnowflakeCredentialsOAuth20AuthType authType;

    public SourceSnowflakeCredentialsOAuth20 withAuthType(SourceSnowflakeCredentialsOAuth20AuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Client ID of your Snowflake developer application.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceSnowflakeCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your Snowflake developer application.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceSnowflakeCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Refresh Token for making authenticated requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceSnowflakeCredentialsOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public SourceSnowflakeCredentialsOAuth20(@JsonProperty("auth_type") SourceSnowflakeCredentialsOAuth20AuthType authType, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret) {
        this.authType = authType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
  }
}
