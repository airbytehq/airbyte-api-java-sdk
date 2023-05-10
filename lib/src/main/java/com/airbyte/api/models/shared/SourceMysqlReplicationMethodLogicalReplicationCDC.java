/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlReplicationMethodLogicalReplicationCDC - CDC uses the Binlog to detect inserts, updates, and deletes. This needs to be configured on the source database itself.
 */
public class SourceMysqlReplicationMethodLogicalReplicationCDC {
    /**
     * The amount of time the connector will wait when it launches to determine if there is new data to sync or not. Defaults to 300 seconds. Valid range: 120 seconds to 1200 seconds. Read about &lt;a href="https://docs.airbyte.com/integrations/sources/mysql/#change-data-capture-cdc"&gt;initial waiting time&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initial_waiting_seconds")
    public Long initialWaitingSeconds;

    public SourceMysqlReplicationMethodLogicalReplicationCDC withInitialWaitingSeconds(Long initialWaitingSeconds) {
        this.initialWaitingSeconds = initialWaitingSeconds;
        return this;
    }
    
    @JsonProperty("method")
    public SourceMysqlReplicationMethodLogicalReplicationCDCMethodEnum method;

    public SourceMysqlReplicationMethodLogicalReplicationCDC withMethod(SourceMysqlReplicationMethodLogicalReplicationCDCMethodEnum method) {
        this.method = method;
        return this;
    }
    
    /**
     * Enter the configured MySQL server timezone. This should only be done if the configured timezone in your MySQL instance does not conform to IANNA standard.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("server_time_zone")
    public String serverTimeZone;

    public SourceMysqlReplicationMethodLogicalReplicationCDC withServerTimeZone(String serverTimeZone) {
        this.serverTimeZone = serverTimeZone;
        return this;
    }
    
    public SourceMysqlReplicationMethodLogicalReplicationCDC(@JsonProperty("method") SourceMysqlReplicationMethodLogicalReplicationCDCMethodEnum method) {
        this.method = method;
  }
}
