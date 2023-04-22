/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRetently - The values required to configure the source.
 */
public class SourceRetently {
    /**
     * Choose how to authenticate to Retently
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceRetently withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceRetentlyRetentlyEnum sourceType;
    public SourceRetently withSourceType(SourceRetentlyRetentlyEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    

    public SourceRetently(@JsonProperty("sourceType") SourceRetentlyRetentlyEnum sourceType) {
    this.sourceType = sourceType;
  }
}
