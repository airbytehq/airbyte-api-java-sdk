/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceGoogleSearchConsoleAuthorizationOAuth {
    /**
     * Access token for making authenticated requests. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;

    public SourceGoogleSearchConsoleAuthorizationOAuth withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceGoogleSearchConsoleAuthorizationOAuthAuthType authType;

    public SourceGoogleSearchConsoleAuthorizationOAuth withAuthType(SourceGoogleSearchConsoleAuthorizationOAuthAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The client ID of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceGoogleSearchConsoleAuthorizationOAuth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The client secret of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceGoogleSearchConsoleAuthorizationOAuth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The token for obtaining a new access token. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceGoogleSearchConsoleAuthorizationOAuth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public SourceGoogleSearchConsoleAuthorizationOAuth(@JsonProperty("auth_type") SourceGoogleSearchConsoleAuthorizationOAuthAuthType authType, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken) {
        this.authType = authType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
  }
}
