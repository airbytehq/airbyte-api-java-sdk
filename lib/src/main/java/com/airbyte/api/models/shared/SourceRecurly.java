/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRecurly - The values required to configure the source.
 */

public class SourceRecurly {
    /**
     * Recurly API Key. See the  &lt;a href="https://docs.airbyte.com/integrations/sources/recurly"&gt;docs&lt;/a&gt; for more information on how to generate this key.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceRecurly withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * ISO8601 timestamp from which the replication from Recurly API will start from.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("begin_time")
    public String beginTime;

    public SourceRecurly withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    
    /**
     * ISO8601 timestamp to which the replication from Recurly API will stop. Records after that date won't be imported.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_time")
    public String endTime;

    public SourceRecurly withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceRecurlyRecurly sourceType;

    public SourceRecurly withSourceType(SourceRecurlyRecurly sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceRecurly(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourceRecurlyRecurly sourceType) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
  }
}
