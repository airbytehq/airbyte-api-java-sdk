/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAmazonAds - The values required to configure the source.
 */

public class SourceAmazonAds {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceAmazonAdsAuthType authType;

    public SourceAmazonAds withAuthType(SourceAmazonAdsAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The client ID of your Amazon Ads developer application. See the &lt;a href="https://advertising.amazon.com/API/docs/en-us/get-started/generate-api-tokens#retrieve-your-client-id-and-client-secret"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceAmazonAds withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The client secret of your Amazon Ads developer application. See the &lt;a href="https://advertising.amazon.com/API/docs/en-us/get-started/generate-api-tokens#retrieve-your-client-id-and-client-secret"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceAmazonAds withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The amount of days to go back in time to get the updated data from Amazon Ads
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("look_back_window")
    public Long lookBackWindow;

    public SourceAmazonAds withLookBackWindow(Long lookBackWindow) {
        this.lookBackWindow = lookBackWindow;
        return this;
    }
    
    /**
     * Profile IDs you want to fetch data for. See &lt;a href="https://advertising.amazon.com/API/docs/en-us/concepts/authorization/profiles"&gt;docs&lt;/a&gt; for more details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    public Long[] profiles;

    public SourceAmazonAds withProfiles(Long[] profiles) {
        this.profiles = profiles;
        return this;
    }
    
    /**
     * Amazon Ads refresh token. See the &lt;a href="https://advertising.amazon.com/API/docs/en-us/get-started/generate-api-tokens"&gt;docs&lt;/a&gt; for more information on how to obtain this token.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceAmazonAds withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    /**
     * Region to pull data from (EU/NA/FE). See &lt;a href="https://advertising.amazon.com/API/docs/en-us/info/api-overview#api-endpoints"&gt;docs&lt;/a&gt; for more details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public SourceAmazonAdsRegion region;

    public SourceAmazonAds withRegion(SourceAmazonAdsRegion region) {
        this.region = region;
        return this;
    }
    
    /**
     * Optional configuration which accepts an array of string of record types. Leave blank for default behaviour to pull all report types. Use this config option only if you want to pull specific report type(s). See &lt;a href="https://advertising.amazon.com/API/docs/en-us/reporting/v2/report-types"&gt;docs&lt;/a&gt; for more details
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_record_types")
    public SourceAmazonAdsReportRecordTypes[] reportRecordTypes;

    public SourceAmazonAds withReportRecordTypes(SourceAmazonAdsReportRecordTypes[] reportRecordTypes) {
        this.reportRecordTypes = reportRecordTypes;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceAmazonAdsAmazonAds sourceType;

    public SourceAmazonAds withSourceType(SourceAmazonAdsAmazonAds sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The Start date for collecting reports, should not be more than 60 days in the past. In YYYY-MM-DD format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;

    public SourceAmazonAds withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Reflects the state of the Display, Product, and Brand Campaign streams as enabled, paused, or archived. If you do not populate this field, it will be ignored completely.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state_filter")
    public SourceAmazonAdsStateFilter[] stateFilter;

    public SourceAmazonAds withStateFilter(SourceAmazonAdsStateFilter[] stateFilter) {
        this.stateFilter = stateFilter;
        return this;
    }
    
    public SourceAmazonAds(@JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken, @JsonProperty("sourceType") SourceAmazonAdsAmazonAds sourceType) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.sourceType = sourceType;
  }
}
