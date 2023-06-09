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
 * SourceIterable - The values required to configure the source.
 */

public class SourceIterable {
    /**
     * Iterable API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/iterable"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceIterable withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceIterableIterable sourceType;

    public SourceIterable withSourceType(SourceIterableIterable sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data for Iterable, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceIterable withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceIterable(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourceIterableIterable sourceType, @JsonProperty("start_date") OffsetDateTime startDate) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
