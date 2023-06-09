/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAsanaCredentialsAuthenticateViaAsanaOauth - Choose how to authenticate to Github
 */

public class SourceAsanaCredentialsAuthenticateViaAsanaOauth {
    @JsonProperty("client_id")
    public String clientId;

    public SourceAsanaCredentialsAuthenticateViaAsanaOauth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceAsanaCredentialsAuthenticateViaAsanaOauth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * OAuth Credentials
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    public SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitle optionTitle;

    public SourceAsanaCredentialsAuthenticateViaAsanaOauth withOptionTitle(SourceAsanaCredentialsAuthenticateViaAsanaOauthCredentialsTitle optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceAsanaCredentialsAuthenticateViaAsanaOauth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public SourceAsanaCredentialsAuthenticateViaAsanaOauth(@JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
  }
}
