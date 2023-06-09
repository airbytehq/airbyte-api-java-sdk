/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlReplicationMethodStandard - Standard replication requires no setup on the DB side but will not be able to represent deletions incrementally.
 */

public class SourceMysqlReplicationMethodStandard {
    @JsonProperty("method")
    public SourceMysqlReplicationMethodStandardMethod method;

    public SourceMysqlReplicationMethodStandard withMethod(SourceMysqlReplicationMethodStandardMethod method) {
        this.method = method;
        return this;
    }
    
    public SourceMysqlReplicationMethodStandard(@JsonProperty("method") SourceMysqlReplicationMethodStandardMethod method) {
        this.method = method;
  }
}
