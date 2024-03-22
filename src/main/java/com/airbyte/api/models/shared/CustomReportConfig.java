/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class CustomReportConfig {

    /**
     * The name of the custom report, this name would be used as stream name
     */
    @JsonProperty("name")
    private String name;

    /**
     * A list of available aggregations.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_aggregation")
    private Optional<? extends String> reportAggregation;

    /**
     * A list of available report object columns. You can find it in description of reporting object that you want to add to custom report.
     */
    @JsonProperty("report_columns")
    private java.util.List<String> reportColumns;

    /**
     * The name of the the object derives from the ReportRequest object. You can find it in Bing Ads Api docs - Reporting API - Reporting Data Objects.
     */
    @JsonProperty("reporting_object")
    private ReportingDataObject reportingObject;

    public CustomReportConfig(
            @JsonProperty("name") String name,
            @JsonProperty("report_aggregation") Optional<? extends String> reportAggregation,
            @JsonProperty("report_columns") java.util.List<String> reportColumns,
            @JsonProperty("reporting_object") ReportingDataObject reportingObject) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(reportAggregation, "reportAggregation");
        Utils.checkNotNull(reportColumns, "reportColumns");
        Utils.checkNotNull(reportingObject, "reportingObject");
        this.name = name;
        this.reportAggregation = reportAggregation;
        this.reportColumns = reportColumns;
        this.reportingObject = reportingObject;
    }

    /**
     * The name of the custom report, this name would be used as stream name
     */
    public String name() {
        return name;
    }

    /**
     * A list of available aggregations.
     */
    public Optional<? extends String> reportAggregation() {
        return reportAggregation;
    }

    /**
     * A list of available report object columns. You can find it in description of reporting object that you want to add to custom report.
     */
    public java.util.List<String> reportColumns() {
        return reportColumns;
    }

    /**
     * The name of the the object derives from the ReportRequest object. You can find it in Bing Ads Api docs - Reporting API - Reporting Data Objects.
     */
    public ReportingDataObject reportingObject() {
        return reportingObject;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the custom report, this name would be used as stream name
     */
    public CustomReportConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * A list of available aggregations.
     */
    public CustomReportConfig withReportAggregation(String reportAggregation) {
        Utils.checkNotNull(reportAggregation, "reportAggregation");
        this.reportAggregation = Optional.ofNullable(reportAggregation);
        return this;
    }

    /**
     * A list of available aggregations.
     */
    public CustomReportConfig withReportAggregation(Optional<? extends String> reportAggregation) {
        Utils.checkNotNull(reportAggregation, "reportAggregation");
        this.reportAggregation = reportAggregation;
        return this;
    }

    /**
     * A list of available report object columns. You can find it in description of reporting object that you want to add to custom report.
     */
    public CustomReportConfig withReportColumns(java.util.List<String> reportColumns) {
        Utils.checkNotNull(reportColumns, "reportColumns");
        this.reportColumns = reportColumns;
        return this;
    }

    /**
     * The name of the the object derives from the ReportRequest object. You can find it in Bing Ads Api docs - Reporting API - Reporting Data Objects.
     */
    public CustomReportConfig withReportingObject(ReportingDataObject reportingObject) {
        Utils.checkNotNull(reportingObject, "reportingObject");
        this.reportingObject = reportingObject;
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
        CustomReportConfig other = (CustomReportConfig) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.reportAggregation, other.reportAggregation) &&
            java.util.Objects.deepEquals(this.reportColumns, other.reportColumns) &&
            java.util.Objects.deepEquals(this.reportingObject, other.reportingObject);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            reportAggregation,
            reportColumns,
            reportingObject);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomReportConfig.class,
                "name", name,
                "reportAggregation", reportAggregation,
                "reportColumns", reportColumns,
                "reportingObject", reportingObject);
    }
    
    public final static class Builder {
 
        private String name;
 
        private Optional<? extends String> reportAggregation;
 
        private java.util.List<String> reportColumns;
 
        private ReportingDataObject reportingObject;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the custom report, this name would be used as stream name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * A list of available aggregations.
         */
        public Builder reportAggregation(String reportAggregation) {
            Utils.checkNotNull(reportAggregation, "reportAggregation");
            this.reportAggregation = Optional.ofNullable(reportAggregation);
            return this;
        }

        /**
         * A list of available aggregations.
         */
        public Builder reportAggregation(Optional<? extends String> reportAggregation) {
            Utils.checkNotNull(reportAggregation, "reportAggregation");
            this.reportAggregation = reportAggregation;
            return this;
        }

        /**
         * A list of available report object columns. You can find it in description of reporting object that you want to add to custom report.
         */
        public Builder reportColumns(java.util.List<String> reportColumns) {
            Utils.checkNotNull(reportColumns, "reportColumns");
            this.reportColumns = reportColumns;
            return this;
        }

        /**
         * The name of the the object derives from the ReportRequest object. You can find it in Bing Ads Api docs - Reporting API - Reporting Data Objects.
         */
        public Builder reportingObject(ReportingDataObject reportingObject) {
            Utils.checkNotNull(reportingObject, "reportingObject");
            this.reportingObject = reportingObject;
            return this;
        }
        
        public CustomReportConfig build() {
            if (reportAggregation == null) {
                reportAggregation = _SINGLETON_VALUE_ReportAggregation.value();
            }
            return new CustomReportConfig(
                name,
                reportAggregation,
                reportColumns,
                reportingObject);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_ReportAggregation =
                new LazySingletonValue<>(
                        "report_aggregation",
                        "\"[Hourly]\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

