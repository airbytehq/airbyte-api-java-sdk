/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSalesforceSinger - The values required to configure the source.
 */
public class SourceSalesforceSinger {
    /**
     * Unless you know that you are transferring a very small amount of data, prefer using the BULK API. This will help avoid using up all of your API call quota with Salesforce. Valid values are BULK or REST.
     */
    @JsonProperty("api_type")
    public SourceSalesforceSingerApiTypeEnum apiType;
    public SourceSalesforceSinger withApiType(SourceSalesforceSingerApiTypeEnum apiType) {
        this.apiType = apiType;
        return this;
    }
    
    /**
     * The Consumer Key that can be found when viewing your app in Salesforce
     */
    @JsonProperty("client_id")
    public String clientId;
    public SourceSalesforceSinger withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Consumer Secret that can be found when viewing your app in Salesforce
     */
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceSalesforceSinger withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Whether or not the the app is in a Salesforce sandbox. If you do not know what this, assume it is false. We provide more info on this field in the &lt;a href="https://docs.airbyte.io/integrations/destinations/salesforce#is_sandbox"&gt;docs&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sandbox")
    public Boolean isSandbox;
    public SourceSalesforceSinger withIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
        return this;
    }
    
    /**
     * determines the maximum allowed API quota percentage the connector is allowed to consume per sync job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quota_percent_per_run")
    public Double quotaPercentPerRun;
    public SourceSalesforceSinger withQuotaPercentPerRun(Double quotaPercentPerRun) {
        this.quotaPercentPerRun = quotaPercentPerRun;
        return this;
    }
    
    /**
     * Determines the maximum allowed API quota percentage the connector is allowed to consume at any time
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quota_percent_total")
    public Double quotaPercentTotal;
    public SourceSalesforceSinger withQuotaPercentTotal(Double quotaPercentTotal) {
        this.quotaPercentTotal = quotaPercentTotal;
        return this;
    }
    
    /**
     * Salesforce Refresh Token used for Airbyte to access your Salesforce account. If you don't know what this is, follow this &lt;a href="https://medium.com/@bpmmendis94/obtain-access-refresh-tokens-from-salesforce-rest-api-a324fe4ccd9b"&gt;guide&lt;/a&gt; to retrieve it.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceSalesforceSinger withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSalesforceSingerSalesforceSingerEnum sourceType;
    public SourceSalesforceSinger withSourceType(SourceSalesforceSingerSalesforceSingerEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    public String startDate;
    public SourceSalesforceSinger withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    

    public SourceSalesforceSinger(@JsonProperty("api_type") SourceSalesforceSingerApiTypeEnum apiType, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken, @JsonProperty("sourceType") SourceSalesforceSingerSalesforceSingerEnum sourceType, @JsonProperty("start_date") String startDate) {
    this.apiType = apiType;
this.clientId = clientId;
this.clientSecret = clientSecret;
this.refreshToken = refreshToken;
this.sourceType = sourceType;
this.startDate = startDate;
  }
}
