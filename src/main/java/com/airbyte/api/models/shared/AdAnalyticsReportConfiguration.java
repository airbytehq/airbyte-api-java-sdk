/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * AdAnalyticsReportConfiguration - Config for custom ad Analytics Report
 */

public class AdAnalyticsReportConfiguration {

    /**
     * The name for the custom report.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Choose a category to pivot your analytics report around. This selection will organize your data based on the chosen attribute, allowing you to analyze trends and performance from different perspectives.
     */
    @JsonProperty("pivot_by")
    private PivotCategory pivotBy;

    /**
     * Choose how to group the data in your report by time. The options are:&lt;br&gt;- 'ALL': A single result summarizing the entire time range.&lt;br&gt;- 'DAILY': Group results by each day.&lt;br&gt;- 'MONTHLY': Group results by each month.&lt;br&gt;- 'YEARLY': Group results by each year.&lt;br&gt;Selecting a time grouping helps you analyze trends and patterns over different time periods.
     */
    @JsonProperty("time_granularity")
    private TimeGranularity timeGranularity;

    public AdAnalyticsReportConfiguration(
            @JsonProperty("name") String name,
            @JsonProperty("pivot_by") PivotCategory pivotBy,
            @JsonProperty("time_granularity") TimeGranularity timeGranularity) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pivotBy, "pivotBy");
        Utils.checkNotNull(timeGranularity, "timeGranularity");
        this.name = name;
        this.pivotBy = pivotBy;
        this.timeGranularity = timeGranularity;
    }

    /**
     * The name for the custom report.
     */
    public String name() {
        return name;
    }

    /**
     * Choose a category to pivot your analytics report around. This selection will organize your data based on the chosen attribute, allowing you to analyze trends and performance from different perspectives.
     */
    public PivotCategory pivotBy() {
        return pivotBy;
    }

    /**
     * Choose how to group the data in your report by time. The options are:&lt;br&gt;- 'ALL': A single result summarizing the entire time range.&lt;br&gt;- 'DAILY': Group results by each day.&lt;br&gt;- 'MONTHLY': Group results by each month.&lt;br&gt;- 'YEARLY': Group results by each year.&lt;br&gt;Selecting a time grouping helps you analyze trends and patterns over different time periods.
     */
    public TimeGranularity timeGranularity() {
        return timeGranularity;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name for the custom report.
     */
    public AdAnalyticsReportConfiguration withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Choose a category to pivot your analytics report around. This selection will organize your data based on the chosen attribute, allowing you to analyze trends and performance from different perspectives.
     */
    public AdAnalyticsReportConfiguration withPivotBy(PivotCategory pivotBy) {
        Utils.checkNotNull(pivotBy, "pivotBy");
        this.pivotBy = pivotBy;
        return this;
    }

    /**
     * Choose how to group the data in your report by time. The options are:&lt;br&gt;- 'ALL': A single result summarizing the entire time range.&lt;br&gt;- 'DAILY': Group results by each day.&lt;br&gt;- 'MONTHLY': Group results by each month.&lt;br&gt;- 'YEARLY': Group results by each year.&lt;br&gt;Selecting a time grouping helps you analyze trends and patterns over different time periods.
     */
    public AdAnalyticsReportConfiguration withTimeGranularity(TimeGranularity timeGranularity) {
        Utils.checkNotNull(timeGranularity, "timeGranularity");
        this.timeGranularity = timeGranularity;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdAnalyticsReportConfiguration other = (AdAnalyticsReportConfiguration) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.pivotBy, other.pivotBy) &&
            java.util.Objects.deepEquals(this.timeGranularity, other.timeGranularity);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            pivotBy,
            timeGranularity);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AdAnalyticsReportConfiguration.class,
                "name", name,
                "pivotBy", pivotBy,
                "timeGranularity", timeGranularity);
    }
    
    public final static class Builder {
 
        private String name;
 
        private PivotCategory pivotBy;
 
        private TimeGranularity timeGranularity;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name for the custom report.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Choose a category to pivot your analytics report around. This selection will organize your data based on the chosen attribute, allowing you to analyze trends and performance from different perspectives.
         */
        public Builder pivotBy(PivotCategory pivotBy) {
            Utils.checkNotNull(pivotBy, "pivotBy");
            this.pivotBy = pivotBy;
            return this;
        }

        /**
         * Choose how to group the data in your report by time. The options are:&lt;br&gt;- 'ALL': A single result summarizing the entire time range.&lt;br&gt;- 'DAILY': Group results by each day.&lt;br&gt;- 'MONTHLY': Group results by each month.&lt;br&gt;- 'YEARLY': Group results by each year.&lt;br&gt;Selecting a time grouping helps you analyze trends and patterns over different time periods.
         */
        public Builder timeGranularity(TimeGranularity timeGranularity) {
            Utils.checkNotNull(timeGranularity, "timeGranularity");
            this.timeGranularity = timeGranularity;
            return this;
        }
        
        public AdAnalyticsReportConfiguration build() {
            return new AdAnalyticsReportConfiguration(
                name,
                pivotBy,
                timeGranularity);
        }
    }
}

