/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMssqlReplicationMethodStandard - Standard replication requires no setup on the DB side but will not be able to represent deletions incrementally.
 */

public class SourceMssqlReplicationMethodStandard {
    @JsonProperty("method")
    public SourceMssqlReplicationMethodStandardMethod method;

    public SourceMssqlReplicationMethodStandard withMethod(SourceMssqlReplicationMethodStandardMethod method) {
        this.method = method;
        return this;
    }
    
    public SourceMssqlReplicationMethodStandard(@JsonProperty("method") SourceMssqlReplicationMethodStandardMethod method) {
        this.method = method;
  }
}
