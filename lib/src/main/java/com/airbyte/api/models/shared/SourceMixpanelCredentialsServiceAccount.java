/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMixpanelCredentialsServiceAccount - Choose how to authenticate to Mixpanel
 */
public class SourceMixpanelCredentialsServiceAccount {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    public SourceMixpanelCredentialsServiceAccountOptionTitleEnum optionTitle;
    public SourceMixpanelCredentialsServiceAccount withOptionTitle(SourceMixpanelCredentialsServiceAccountOptionTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
    /**
     * Mixpanel Service Account Secret. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    @JsonProperty("secret")
    public String secret;
    public SourceMixpanelCredentialsServiceAccount withSecret(String secret) {
        this.secret = secret;
        return this;
    }
    
    /**
     * Mixpanel Service Account Username. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    @JsonProperty("username")
    public String username;
    public SourceMixpanelCredentialsServiceAccount withUsername(String username) {
        this.username = username;
        return this;
    }
    

    public SourceMixpanelCredentialsServiceAccount(@JsonProperty("secret") String secret, @JsonProperty("username") String username) {
    this.secret = secret;
this.username = username;
  }
}
