/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SourcePutRequest {
    /**
     * The values required to configure the source.
     */
    @JsonProperty("configuration")
    public Object configuration;

    public SourcePutRequest withConfiguration(Object configuration) {
        this.configuration = configuration;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public SourcePutRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    public SourcePutRequest(@JsonProperty("configuration") Object configuration, @JsonProperty("name") String name) {
        this.configuration = configuration;
        this.name = name;
  }
}
