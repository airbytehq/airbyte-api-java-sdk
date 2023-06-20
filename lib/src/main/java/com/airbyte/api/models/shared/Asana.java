/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Asana - The values required to configure the source.
 */

public class Asana {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public AsanaCredentials credentials;

    public Asana withCredentials(AsanaCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    
    public Asana(){}
}