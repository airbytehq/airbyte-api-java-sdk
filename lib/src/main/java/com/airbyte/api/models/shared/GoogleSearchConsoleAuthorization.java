/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GoogleSearchConsoleAuthorization {
    /**
     * Access token for making authenticated requests. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    public String accessToken;

    public GoogleSearchConsoleAuthorization withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * The client ID of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;

    public GoogleSearchConsoleAuthorization withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The client secret of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;

    public GoogleSearchConsoleAuthorization withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The token for obtaining a new access token. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    public String refreshToken;

    public GoogleSearchConsoleAuthorization withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public GoogleSearchConsoleAuthorization(){}
}
