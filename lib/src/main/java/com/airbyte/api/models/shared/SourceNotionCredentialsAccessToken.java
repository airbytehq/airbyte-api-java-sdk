/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceNotionCredentialsAccessToken - Pick an authentication method.
 */
public class SourceNotionCredentialsAccessToken {
    @JsonProperty("auth_type")
    public SourceNotionCredentialsAccessTokenAuthTypeEnum authType;
    public SourceNotionCredentialsAccessToken withAuthType(SourceNotionCredentialsAccessTokenAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * Notion API access token, see the &lt;a href="https://developers.notion.com/docs/authorization"&gt;docs&lt;/a&gt; for more information on how to obtain this token.
     */
    @JsonProperty("token")
    public String token;
    public SourceNotionCredentialsAccessToken withToken(String token) {
        this.token = token;
        return this;
    }
    
}