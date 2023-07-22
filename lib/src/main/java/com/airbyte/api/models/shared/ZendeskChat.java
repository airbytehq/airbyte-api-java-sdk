/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ZendeskChat - The values required to configure the source.
 */

public class ZendeskChat {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public ZendeskChatCredentials credentials;

    public ZendeskChat withCredentials(ZendeskChatCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    
    public ZendeskChat(){}
}
