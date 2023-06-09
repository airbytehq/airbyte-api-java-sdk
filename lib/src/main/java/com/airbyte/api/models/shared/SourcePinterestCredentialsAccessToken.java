/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SourcePinterestCredentialsAccessToken {
    /**
     * The Access Token to make authenticated requests.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourcePinterestCredentialsAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourcePinterestCredentialsAccessTokenAuthMethod authMethod;

    public SourcePinterestCredentialsAccessToken withAuthMethod(SourcePinterestCredentialsAccessTokenAuthMethod authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    public SourcePinterestCredentialsAccessToken(@JsonProperty("access_token") String accessToken, @JsonProperty("auth_method") SourcePinterestCredentialsAccessTokenAuthMethod authMethod) {
        this.accessToken = accessToken;
        this.authMethod = authMethod;
  }
}
