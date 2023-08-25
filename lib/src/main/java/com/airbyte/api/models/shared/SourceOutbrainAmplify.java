/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOutbrainAmplify - The values required to configure the source.
 */

public class SourceOutbrainAmplify {
    /**
     * Credentials for making authenticated requests requires either username/password or access_token.
     */
    @JsonProperty("credentials")
    public Object credentials;

    public SourceOutbrainAmplify withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Date in the format YYYY-MM-DD.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;

    public SourceOutbrainAmplify withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * The granularity used for geo location data in reports.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("geo_location_breakdown")
    public SourceOutbrainAmplifyGranularityForGeoLocationRegion geoLocationBreakdown;

    public SourceOutbrainAmplify withGeoLocationBreakdown(SourceOutbrainAmplifyGranularityForGeoLocationRegion geoLocationBreakdown) {
        this.geoLocationBreakdown = geoLocationBreakdown;
        return this;
    }
    
    /**
     * The granularity used for periodic data in reports. See &lt;a href="https://amplifyv01.docs.apiary.io/#reference/performance-reporting/periodic/retrieve-performance-statistics-for-all-marketer-campaigns-by-periodic-breakdown"&gt;the docs&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_granularity")
    public SourceOutbrainAmplifyGranularityForPeriodicReports reportGranularity;

    public SourceOutbrainAmplify withReportGranularity(SourceOutbrainAmplifyGranularityForPeriodicReports reportGranularity) {
        this.reportGranularity = reportGranularity;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceOutbrainAmplifyOutbrainAmplify sourceType;

    public SourceOutbrainAmplify withSourceType(SourceOutbrainAmplifyOutbrainAmplify sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Date in the format YYYY-MM-DD eg. 2017-01-25. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    public String startDate;

    public SourceOutbrainAmplify withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceOutbrainAmplify(@JsonProperty("credentials") Object credentials, @JsonProperty("sourceType") SourceOutbrainAmplifyOutbrainAmplify sourceType, @JsonProperty("start_date") String startDate) {
        this.credentials = credentials;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}