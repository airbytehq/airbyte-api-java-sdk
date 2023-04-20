/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceHubspot - The values required to configure the source.
 */
public class SourceHubspot {
    /**
     * Choose how to authenticate to HubSpot.
     */
    @JsonProperty("credentials")
    public Object credentials;
    public SourceHubspot withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceHubspotHubspotEnum sourceType;
    public SourceHubspot withSourceType(SourceHubspotHubspotEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceHubspot withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}