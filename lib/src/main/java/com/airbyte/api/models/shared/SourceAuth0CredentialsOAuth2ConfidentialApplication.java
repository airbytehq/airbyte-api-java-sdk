/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceAuth0CredentialsOAuth2ConfidentialApplication {
    /**
     * The audience for the token, which is your API. You can find this in the Identifier field on your  &lt;a href="https://manage.auth0.com/#/apis"&gt;API's settings tab&lt;/a&gt;
     */
    @JsonProperty("audience")
    public String audience;

    public SourceAuth0CredentialsOAuth2ConfidentialApplication withAudience(String audience) {
        this.audience = audience;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethod authType;

    public SourceAuth0CredentialsOAuth2ConfidentialApplication withAuthType(SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethod authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * Your application's Client ID. You can find this value on the &lt;a href="https://manage.auth0.com/#/applications"&gt;application's settings tab&lt;/a&gt; after you login the admin portal.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceAuth0CredentialsOAuth2ConfidentialApplication withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Your application's Client Secret. You can find this value on the &lt;a href="https://manage.auth0.com/#/applications"&gt;application's settings tab&lt;/a&gt; after you login the admin portal.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceAuth0CredentialsOAuth2ConfidentialApplication withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    public SourceAuth0CredentialsOAuth2ConfidentialApplication(@JsonProperty("audience") String audience, @JsonProperty("auth_type") SourceAuth0CredentialsOAuth2ConfidentialApplicationAuthenticationMethod authType, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret) {
        this.audience = audience;
        this.authType = authType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
  }
}
