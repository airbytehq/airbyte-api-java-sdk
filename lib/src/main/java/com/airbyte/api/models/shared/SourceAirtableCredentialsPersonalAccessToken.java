/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceAirtableCredentialsPersonalAccessToken {
    /**
     * The Personal Access Token for the Airtable account. See the &lt;a href="https://airtable.com/developers/web/guides/personal-access-tokens"&gt;Support Guide&lt;/a&gt; for more information on how to obtain this token.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceAirtableCredentialsPersonalAccessToken withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    public SourceAirtableCredentialsPersonalAccessTokenAuthMethod authMethod;

    public SourceAirtableCredentialsPersonalAccessToken withAuthMethod(SourceAirtableCredentialsPersonalAccessTokenAuthMethod authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    public SourceAirtableCredentialsPersonalAccessToken(@JsonProperty("api_key") String apiKey) {
        this.apiKey = apiKey;
  }
}
