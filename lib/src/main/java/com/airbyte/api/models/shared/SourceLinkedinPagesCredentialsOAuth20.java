/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceLinkedinPagesCredentialsOAuth20 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    public SourceLinkedinPagesCredentialsOAuth20AuthMethod authMethod;

    public SourceLinkedinPagesCredentialsOAuth20 withAuthMethod(SourceLinkedinPagesCredentialsOAuth20AuthMethod authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    /**
     * The client ID of the LinkedIn developer application.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceLinkedinPagesCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The client secret of the LinkedIn developer application.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceLinkedinPagesCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The token value generated using the LinkedIn Developers OAuth Token Tools. See the &lt;a href="https://docs.airbyte.com/integrations/sources/linkedin-pages/"&gt;docs&lt;/a&gt; to obtain yours.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceLinkedinPagesCredentialsOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public SourceLinkedinPagesCredentialsOAuth20(@JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
  }
}
