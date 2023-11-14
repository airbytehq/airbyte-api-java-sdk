/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetSourceRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sourceId")
    public String sourceId;

    public GetSourceRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    
    public GetSourceRequest(@JsonProperty("sourceId") String sourceId) {
        this.sourceId = sourceId;
  }
}
