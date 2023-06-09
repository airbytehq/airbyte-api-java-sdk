/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceHarvest - The values required to configure the source.
 */

public class SourceHarvest {
    /**
     * Harvest account ID. Required for all Harvest requests in pair with Personal Access Token
     */
    @JsonProperty("account_id")
    public String accountId;

    public SourceHarvest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    /**
     * Choose how to authenticate to Harvest.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;

    public SourceHarvest withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data after this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("replication_end_date")
    public OffsetDateTime replicationEndDate;

    public SourceHarvest withReplicationEndDate(OffsetDateTime replicationEndDate) {
        this.replicationEndDate = replicationEndDate;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("replication_start_date")
    public OffsetDateTime replicationStartDate;

    public SourceHarvest withReplicationStartDate(OffsetDateTime replicationStartDate) {
        this.replicationStartDate = replicationStartDate;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceHarvestHarvest sourceType;

    public SourceHarvest withSourceType(SourceHarvestHarvest sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceHarvest(@JsonProperty("account_id") String accountId, @JsonProperty("replication_start_date") OffsetDateTime replicationStartDate, @JsonProperty("sourceType") SourceHarvestHarvest sourceType) {
        this.accountId = accountId;
        this.replicationStartDate = replicationStartDate;
        this.sourceType = sourceType;
  }
}
