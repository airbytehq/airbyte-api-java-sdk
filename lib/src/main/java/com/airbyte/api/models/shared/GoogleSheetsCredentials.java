/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GoogleSheetsCredentials {
    /**
     * Enter your Google application's Client ID. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;

    public GoogleSheetsCredentials withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Enter your Google application's Client Secret. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;

    public GoogleSheetsCredentials withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    public GoogleSheetsCredentials(){}
}
