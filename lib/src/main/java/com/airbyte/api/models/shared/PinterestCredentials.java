/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinterestCredentials {
    /**
     * The Client ID of your OAuth application
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;

    public PinterestCredentials withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your OAuth application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;

    public PinterestCredentials withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    public String refreshToken;

    public PinterestCredentials withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public PinterestCredentials(){}
}
