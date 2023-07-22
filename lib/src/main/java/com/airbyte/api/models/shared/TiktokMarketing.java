/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TiktokMarketing - The values required to configure the source.
 */

public class TiktokMarketing {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public TiktokMarketingCredentials credentials;

    public TiktokMarketing withCredentials(TiktokMarketingCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    
    public TiktokMarketing(){}
}
