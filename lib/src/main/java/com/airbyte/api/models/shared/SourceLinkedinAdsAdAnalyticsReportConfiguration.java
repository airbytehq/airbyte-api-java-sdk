/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceLinkedinAdsAdAnalyticsReportConfiguration - Config for custom ad Analytics Report
 */

public class SourceLinkedinAdsAdAnalyticsReportConfiguration {
    /**
     * The name for the custom report.
     */
    @JsonProperty("name")
    public String name;

    public SourceLinkedinAdsAdAnalyticsReportConfiguration withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Choose a category to pivot your analytics report around. This selection will organize your data based on the chosen attribute, allowing you to analyze trends and performance from different perspectives.
     */
    @JsonProperty("pivot_by")
    public SourceLinkedinAdsAdAnalyticsReportConfigurationPivotCategory pivotBy;

    public SourceLinkedinAdsAdAnalyticsReportConfiguration withPivotBy(SourceLinkedinAdsAdAnalyticsReportConfigurationPivotCategory pivotBy) {
        this.pivotBy = pivotBy;
        return this;
    }
    
    /**
     * Choose how to group the data in your report by time. The options are:&lt;br&gt;- 'ALL': A single result summarizing the entire time range.&lt;br&gt;- 'DAILY': Group results by each day.&lt;br&gt;- 'MONTHLY': Group results by each month.&lt;br&gt;- 'YEARLY': Group results by each year.&lt;br&gt;Selecting a time grouping helps you analyze trends and patterns over different time periods.
     */
    @JsonProperty("time_granularity")
    public SourceLinkedinAdsAdAnalyticsReportConfigurationTimeGranularity timeGranularity;

    public SourceLinkedinAdsAdAnalyticsReportConfiguration withTimeGranularity(SourceLinkedinAdsAdAnalyticsReportConfigurationTimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity;
        return this;
    }
    
    public SourceLinkedinAdsAdAnalyticsReportConfiguration(@JsonProperty("name") String name, @JsonProperty("pivot_by") SourceLinkedinAdsAdAnalyticsReportConfigurationPivotCategory pivotBy, @JsonProperty("time_granularity") SourceLinkedinAdsAdAnalyticsReportConfigurationTimeGranularity timeGranularity) {
        this.name = name;
        this.pivotBy = pivotBy;
        this.timeGranularity = timeGranularity;
  }
}
