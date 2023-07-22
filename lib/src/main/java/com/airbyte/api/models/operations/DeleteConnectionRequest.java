/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteConnectionRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    public String connectionId;

    public DeleteConnectionRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public DeleteConnectionRequest(@JsonProperty("connectionId") String connectionId) {
        this.connectionId = connectionId;
  }
}
