/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodbAuthTypeNone - None.
 */

public class DestinationMongodbAuthTypeNone {
    @JsonProperty("authorization")
    public DestinationMongodbAuthTypeNoneAuthorization authorization;

    public DestinationMongodbAuthTypeNone withAuthorization(DestinationMongodbAuthTypeNoneAuthorization authorization) {
        this.authorization = authorization;
        return this;
    }
    
    public DestinationMongodbAuthTypeNone(@JsonProperty("authorization") DestinationMongodbAuthTypeNoneAuthorization authorization) {
        this.authorization = authorization;
  }
}
