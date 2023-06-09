/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceInsightly - The values required to configure the source.
 */

public class SourceInsightly {
    @JsonProperty("sourceType")
    public SourceInsightlyInsightly sourceType;

    public SourceInsightly withSourceType(SourceInsightlyInsightly sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data for Insightly in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only for incremental streams.
     */
    @JsonProperty("start_date")
    public String startDate;

    public SourceInsightly withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Your Insightly API token.
     */
    @JsonProperty("token")
    public String token;

    public SourceInsightly withToken(String token) {
        this.token = token;
        return this;
    }
    
    public SourceInsightly(@JsonProperty("sourceType") SourceInsightlyInsightly sourceType, @JsonProperty("start_date") String startDate, @JsonProperty("token") String token) {
        this.sourceType = sourceType;
        this.startDate = startDate;
        this.token = token;
  }
}
