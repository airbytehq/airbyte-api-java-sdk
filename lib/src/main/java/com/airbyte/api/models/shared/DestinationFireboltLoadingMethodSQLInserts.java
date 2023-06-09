/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationFireboltLoadingMethodSQLInserts - Loading method used to select the way data will be uploaded to Firebolt
 */

public class DestinationFireboltLoadingMethodSQLInserts {
    @JsonProperty("method")
    public DestinationFireboltLoadingMethodSQLInsertsMethod method;

    public DestinationFireboltLoadingMethodSQLInserts withMethod(DestinationFireboltLoadingMethodSQLInsertsMethod method) {
        this.method = method;
        return this;
    }
    
    public DestinationFireboltLoadingMethodSQLInserts(@JsonProperty("method") DestinationFireboltLoadingMethodSQLInsertsMethod method) {
        this.method = method;
  }
}
