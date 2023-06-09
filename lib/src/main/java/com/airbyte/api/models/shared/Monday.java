/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Monday - The values required to configure the source.
 */

public class Monday {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public MondayCredentials credentials;

    public Monday withCredentials(MondayCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    
    public Monday(){}
}
