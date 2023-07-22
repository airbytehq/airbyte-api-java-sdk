/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePostgresReplicationMethodStandard - Standard replication requires no setup on the DB side but will not be able to represent deletions incrementally.
 */

public class SourcePostgresReplicationMethodStandard {
    @JsonProperty("method")
    public SourcePostgresReplicationMethodStandardMethod method;

    public SourcePostgresReplicationMethodStandard withMethod(SourcePostgresReplicationMethodStandardMethod method) {
        this.method = method;
        return this;
    }
    
    public SourcePostgresReplicationMethodStandard(@JsonProperty("method") SourcePostgresReplicationMethodStandardMethod method) {
        this.method = method;
  }
}
