/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ZendeskTalk - The values required to configure the source.
 */

public class ZendeskTalk {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public ZendeskTalkCredentials credentials;

    public ZendeskTalk withCredentials(ZendeskTalkCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    
    public ZendeskTalk(){}
}
