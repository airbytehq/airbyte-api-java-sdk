/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String bearerAuth;

    public Security withBearerAuth(String bearerAuth) {
        this.bearerAuth = bearerAuth;
        return this;
    }
    
    public Security(@JsonProperty("bearerAuth") String bearerAuth) {
        this.bearerAuth = bearerAuth;
  }
}
