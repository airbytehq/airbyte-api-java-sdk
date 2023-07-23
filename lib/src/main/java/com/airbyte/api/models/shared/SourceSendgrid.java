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
 * SourceSendgrid - The values required to configure the source.
 */

public class SourceSendgrid {
    /**
     * API Key, use &lt;a href="https://app.sendgrid.com/settings/api_keys/"&gt;admin&lt;/a&gt; to generate this key.
     */
    @JsonProperty("apikey")
    public String apikey;

    public SourceSendgrid withApikey(String apikey) {
        this.apikey = apikey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSendgridSendgrid sourceType;

    public SourceSendgrid withSourceType(SourceSendgridSendgrid sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Start time in ISO8601 format. Any data before this time point will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_time")
    public OffsetDateTime startTime;

    public SourceSendgrid withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    
    public SourceSendgrid(@JsonProperty("apikey") String apikey, @JsonProperty("sourceType") SourceSendgridSendgrid sourceType) {
        this.apikey = apikey;
        this.sourceType = sourceType;
  }
}
