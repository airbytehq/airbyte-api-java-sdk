/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceDixa - The values required to configure the source.
 */

public class SourceDixa {
    /**
     * Dixa API token
     */
    @JsonProperty("api_token")
    public String apiToken;

    public SourceDixa withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    /**
     * Number of days to batch into one request. Max 31.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batch_size")
    public Long batchSize;

    public SourceDixa withBatchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceDixaDixa sourceType;

    public SourceDixa withSourceType(SourceDixaDixa sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The connector pulls records updated from this date onwards.
     */
    @JsonProperty("start_date")
    public String startDate;

    public SourceDixa withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceDixa(@JsonProperty("api_token") String apiToken, @JsonProperty("sourceType") SourceDixaDixa sourceType, @JsonProperty("start_date") String startDate) {
        this.apiToken = apiToken;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
