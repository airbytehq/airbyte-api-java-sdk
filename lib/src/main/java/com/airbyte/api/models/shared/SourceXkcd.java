/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceXkcd - The values required to configure the source.
 */

public class SourceXkcd {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceType")
    public SourceXkcdXkcd sourceType;

    public SourceXkcd withSourceType(SourceXkcdXkcd sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceXkcd(){}
}
