/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSlackCredentialsSignInViaSlackOAuth - Choose how to authenticate into Slack
 */

public class SourceSlackCredentialsSignInViaSlackOAuth {
    /**
     * Slack access_token. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help generating the token.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceSlackCredentialsSignInViaSlackOAuth withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * Slack client_id. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this id.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceSlackCredentialsSignInViaSlackOAuth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Slack client_secret. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this secret.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceSlackCredentialsSignInViaSlackOAuth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    @JsonProperty("option_title")
    public SourceSlackCredentialsSignInViaSlackOAuthOptionTitle optionTitle;

    public SourceSlackCredentialsSignInViaSlackOAuth withOptionTitle(SourceSlackCredentialsSignInViaSlackOAuthOptionTitle optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
    public SourceSlackCredentialsSignInViaSlackOAuth(@JsonProperty("access_token") String accessToken, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("option_title") SourceSlackCredentialsSignInViaSlackOAuthOptionTitle optionTitle) {
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.optionTitle = optionTitle;
  }
}
