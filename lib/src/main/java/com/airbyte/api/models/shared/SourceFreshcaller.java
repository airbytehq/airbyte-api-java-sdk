/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFreshcaller - The values required to configure the source.
 */
public class SourceFreshcaller {
    /**
     * Freshcaller API Key. See the &lt;a href="https://docs.airbyte.io/integrations/sources/freshcaller"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceFreshcaller withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * Used to construct Base URL for the Freshcaller APIs
     */
    @JsonProperty("domain")
    public String domain;
    public SourceFreshcaller withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    /**
     * The number of requests per minute that this source allowed to use. There is a rate limit of 50 requests per minute per app per account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requests_per_minute")
    public Long requestsPerMinute;
    public SourceFreshcaller withRequestsPerMinute(Long requestsPerMinute) {
        this.requestsPerMinute = requestsPerMinute;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceFreshcallerFreshcallerEnum sourceType;
    public SourceFreshcaller withSourceType(SourceFreshcallerFreshcallerEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time. Any data created after this date will be replicated.
     */
    @JsonProperty("start_date")
    public Object startDate;
    public SourceFreshcaller withStartDate(Object startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Lag in minutes for each sync, i.e., at time T, data for the time range [prev_sync_time, T-30] will be fetched
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sync_lag_minutes")
    public Long syncLagMinutes;
    public SourceFreshcaller withSyncLagMinutes(Long syncLagMinutes) {
        this.syncLagMinutes = syncLagMinutes;
        return this;
    }
    

    public SourceFreshcaller(@JsonProperty("api_key") String apiKey, @JsonProperty("domain") String domain, @JsonProperty("sourceType") SourceFreshcallerFreshcallerEnum sourceType, @JsonProperty("start_date") Object startDate) {
    this.apiKey = apiKey;
this.domain = domain;
this.sourceType = sourceType;
this.startDate = startDate;
  }
}
