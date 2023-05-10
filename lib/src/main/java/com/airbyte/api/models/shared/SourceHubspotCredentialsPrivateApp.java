/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceHubspotCredentialsPrivateApp - Choose how to authenticate to HubSpot.
 */
public class SourceHubspotCredentialsPrivateApp {
    /**
     * HubSpot Access token. See the &lt;a href="https://developers.hubspot.com/docs/api/private-apps"&gt;Hubspot docs&lt;/a&gt; if you need help finding this token.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceHubspotCredentialsPrivateApp withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * Name of the credentials set
     */
    @JsonProperty("credentials_title")
    public SourceHubspotCredentialsPrivateAppCredentialsEnum credentialsTitle;

    public SourceHubspotCredentialsPrivateApp withCredentialsTitle(SourceHubspotCredentialsPrivateAppCredentialsEnum credentialsTitle) {
        this.credentialsTitle = credentialsTitle;
        return this;
    }
    
    public SourceHubspotCredentialsPrivateApp(@JsonProperty("access_token") String accessToken, @JsonProperty("credentials_title") SourceHubspotCredentialsPrivateAppCredentialsEnum credentialsTitle) {
        this.accessToken = accessToken;
        this.credentialsTitle = credentialsTitle;
  }
}
