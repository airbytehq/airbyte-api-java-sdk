/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleAnalyticsV4 - The values required to configure the source.
 */

public class SourceGoogleAnalyticsV4 {
    /**
     * Credentials for the service
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;

    public SourceGoogleAnalyticsV4 withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * A JSON array describing the custom reports you want to sync from Google Analytics. See &lt;a href="https://docs.airbyte.com/integrations/sources/google-analytics-v4#data-processing-latency"&gt;the docs&lt;/a&gt; for more information about the exact format you can use to fill out this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports")
    public String customReports;

    public SourceGoogleAnalyticsV4 withCustomReports(String customReports) {
        this.customReports = customReports;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceGoogleAnalyticsV4GoogleAnalyticsV4 sourceType;

    public SourceGoogleAnalyticsV4 withSourceType(SourceGoogleAnalyticsV4GoogleAnalyticsV4 sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date in the format YYYY-MM-DD. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    public String startDate;

    public SourceGoogleAnalyticsV4 withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * The ID for the Google Analytics View you want to fetch data from. This can be found from the &lt;a href="https://ga-dev-tools.appspot.com/account-explorer/"&gt;Google Analytics Account Explorer&lt;/a&gt;.
     */
    @JsonProperty("view_id")
    public String viewId;

    public SourceGoogleAnalyticsV4 withViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    
    /**
     * The time increment used by the connector when requesting data from the Google Analytics API. More information is available in the &lt;a href="https://docs.airbyte.com/integrations/sources/google-analytics-v4/#sampling-in-reports"&gt;the docs&lt;/a&gt;. The bigger this value is, the faster the sync will be, but the more likely that sampling will be applied to your data, potentially causing inaccuracies in the returned results. We recommend setting this to 1 unless you have a hard requirement to make the sync faster at the expense of accuracy. The minimum allowed value for this field is 1, and the maximum is 364. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("window_in_days")
    public Long windowInDays;

    public SourceGoogleAnalyticsV4 withWindowInDays(Long windowInDays) {
        this.windowInDays = windowInDays;
        return this;
    }
    
    public SourceGoogleAnalyticsV4(@JsonProperty("sourceType") SourceGoogleAnalyticsV4GoogleAnalyticsV4 sourceType, @JsonProperty("start_date") String startDate, @JsonProperty("view_id") String viewId) {
        this.sourceType = sourceType;
        this.startDate = startDate;
        this.viewId = viewId;
  }
}
