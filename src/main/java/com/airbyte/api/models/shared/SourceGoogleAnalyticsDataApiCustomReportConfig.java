/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class SourceGoogleAnalyticsDataApiCustomReportConfig {

    /**
     * Cohort reports creates a time series of user retention for the cohort.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cohortSpec")
    private Optional<? extends CohortReports> cohortSpec;

    /**
     * Dimensions filter
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dimensionFilter")
    private Optional<? extends DimensionsFilter> dimensionFilter;

    /**
     * A list of dimensions.
     */
    @JsonProperty("dimensions")
    private java.util.List<String> dimensions;

    /**
     * Metrics filter
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metricFilter")
    private Optional<? extends MetricsFilter> metricFilter;

    /**
     * A list of metrics.
     */
    @JsonProperty("metrics")
    private java.util.List<String> metrics;

    /**
     * The name of the custom report, this name would be used as stream name.
     */
    @JsonProperty("name")
    private String name;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiCustomReportConfig(
            @JsonProperty("cohortSpec") Optional<? extends CohortReports> cohortSpec,
            @JsonProperty("dimensionFilter") Optional<? extends DimensionsFilter> dimensionFilter,
            @JsonProperty("dimensions") java.util.List<String> dimensions,
            @JsonProperty("metricFilter") Optional<? extends MetricsFilter> metricFilter,
            @JsonProperty("metrics") java.util.List<String> metrics,
            @JsonProperty("name") String name) {
        Utils.checkNotNull(cohortSpec, "cohortSpec");
        Utils.checkNotNull(dimensionFilter, "dimensionFilter");
        Utils.checkNotNull(dimensions, "dimensions");
        Utils.checkNotNull(metricFilter, "metricFilter");
        Utils.checkNotNull(metrics, "metrics");
        Utils.checkNotNull(name, "name");
        this.cohortSpec = cohortSpec;
        this.dimensionFilter = dimensionFilter;
        this.dimensions = dimensions;
        this.metricFilter = metricFilter;
        this.metrics = metrics;
        this.name = name;
    }
    
    public SourceGoogleAnalyticsDataApiCustomReportConfig(
            java.util.List<String> dimensions,
            java.util.List<String> metrics,
            String name) {
        this(Optional.empty(), Optional.empty(), dimensions, Optional.empty(), metrics, name);
    }

    /**
     * Cohort reports creates a time series of user retention for the cohort.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CohortReports> cohortSpec() {
        return (Optional<CohortReports>) cohortSpec;
    }

    /**
     * Dimensions filter
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DimensionsFilter> dimensionFilter() {
        return (Optional<DimensionsFilter>) dimensionFilter;
    }

    /**
     * A list of dimensions.
     */
    @JsonIgnore
    public java.util.List<String> dimensions() {
        return dimensions;
    }

    /**
     * Metrics filter
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MetricsFilter> metricFilter() {
        return (Optional<MetricsFilter>) metricFilter;
    }

    /**
     * A list of metrics.
     */
    @JsonIgnore
    public java.util.List<String> metrics() {
        return metrics;
    }

    /**
     * The name of the custom report, this name would be used as stream name.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Cohort reports creates a time series of user retention for the cohort.
     */
    public SourceGoogleAnalyticsDataApiCustomReportConfig withCohortSpec(CohortReports cohortSpec) {
        Utils.checkNotNull(cohortSpec, "cohortSpec");
        this.cohortSpec = Optional.ofNullable(cohortSpec);
        return this;
    }

    /**
     * Cohort reports creates a time series of user retention for the cohort.
     */
    public SourceGoogleAnalyticsDataApiCustomReportConfig withCohortSpec(Optional<? extends CohortReports> cohortSpec) {
        Utils.checkNotNull(cohortSpec, "cohortSpec");
        this.cohortSpec = cohortSpec;
        return this;
    }

    /**
     * Dimensions filter
     */
    public SourceGoogleAnalyticsDataApiCustomReportConfig withDimensionFilter(DimensionsFilter dimensionFilter) {
        Utils.checkNotNull(dimensionFilter, "dimensionFilter");
        this.dimensionFilter = Optional.ofNullable(dimensionFilter);
        return this;
    }

    /**
     * Dimensions filter
     */
    public SourceGoogleAnalyticsDataApiCustomReportConfig withDimensionFilter(Optional<? extends DimensionsFilter> dimensionFilter) {
        Utils.checkNotNull(dimensionFilter, "dimensionFilter");
        this.dimensionFilter = dimensionFilter;
        return this;
    }

    /**
     * A list of dimensions.
     */
    public SourceGoogleAnalyticsDataApiCustomReportConfig withDimensions(java.util.List<String> dimensions) {
        Utils.checkNotNull(dimensions, "dimensions");
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Metrics filter
     */
    public SourceGoogleAnalyticsDataApiCustomReportConfig withMetricFilter(MetricsFilter metricFilter) {
        Utils.checkNotNull(metricFilter, "metricFilter");
        this.metricFilter = Optional.ofNullable(metricFilter);
        return this;
    }

    /**
     * Metrics filter
     */
    public SourceGoogleAnalyticsDataApiCustomReportConfig withMetricFilter(Optional<? extends MetricsFilter> metricFilter) {
        Utils.checkNotNull(metricFilter, "metricFilter");
        this.metricFilter = metricFilter;
        return this;
    }

    /**
     * A list of metrics.
     */
    public SourceGoogleAnalyticsDataApiCustomReportConfig withMetrics(java.util.List<String> metrics) {
        Utils.checkNotNull(metrics, "metrics");
        this.metrics = metrics;
        return this;
    }

    /**
     * The name of the custom report, this name would be used as stream name.
     */
    public SourceGoogleAnalyticsDataApiCustomReportConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        SourceGoogleAnalyticsDataApiCustomReportConfig other = (SourceGoogleAnalyticsDataApiCustomReportConfig) o;
        return 
            java.util.Objects.deepEquals(this.cohortSpec, other.cohortSpec) &&
            java.util.Objects.deepEquals(this.dimensionFilter, other.dimensionFilter) &&
            java.util.Objects.deepEquals(this.dimensions, other.dimensions) &&
            java.util.Objects.deepEquals(this.metricFilter, other.metricFilter) &&
            java.util.Objects.deepEquals(this.metrics, other.metrics) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cohortSpec,
            dimensionFilter,
            dimensions,
            metricFilter,
            metrics,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiCustomReportConfig.class,
                "cohortSpec", cohortSpec,
                "dimensionFilter", dimensionFilter,
                "dimensions", dimensions,
                "metricFilter", metricFilter,
                "metrics", metrics,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<? extends CohortReports> cohortSpec = Optional.empty();
 
        private Optional<? extends DimensionsFilter> dimensionFilter = Optional.empty();
 
        private java.util.List<String> dimensions;
 
        private Optional<? extends MetricsFilter> metricFilter = Optional.empty();
 
        private java.util.List<String> metrics;
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Cohort reports creates a time series of user retention for the cohort.
         */
        public Builder cohortSpec(CohortReports cohortSpec) {
            Utils.checkNotNull(cohortSpec, "cohortSpec");
            this.cohortSpec = Optional.ofNullable(cohortSpec);
            return this;
        }

        /**
         * Cohort reports creates a time series of user retention for the cohort.
         */
        public Builder cohortSpec(Optional<? extends CohortReports> cohortSpec) {
            Utils.checkNotNull(cohortSpec, "cohortSpec");
            this.cohortSpec = cohortSpec;
            return this;
        }

        /**
         * Dimensions filter
         */
        public Builder dimensionFilter(DimensionsFilter dimensionFilter) {
            Utils.checkNotNull(dimensionFilter, "dimensionFilter");
            this.dimensionFilter = Optional.ofNullable(dimensionFilter);
            return this;
        }

        /**
         * Dimensions filter
         */
        public Builder dimensionFilter(Optional<? extends DimensionsFilter> dimensionFilter) {
            Utils.checkNotNull(dimensionFilter, "dimensionFilter");
            this.dimensionFilter = dimensionFilter;
            return this;
        }

        /**
         * A list of dimensions.
         */
        public Builder dimensions(java.util.List<String> dimensions) {
            Utils.checkNotNull(dimensions, "dimensions");
            this.dimensions = dimensions;
            return this;
        }

        /**
         * Metrics filter
         */
        public Builder metricFilter(MetricsFilter metricFilter) {
            Utils.checkNotNull(metricFilter, "metricFilter");
            this.metricFilter = Optional.ofNullable(metricFilter);
            return this;
        }

        /**
         * Metrics filter
         */
        public Builder metricFilter(Optional<? extends MetricsFilter> metricFilter) {
            Utils.checkNotNull(metricFilter, "metricFilter");
            this.metricFilter = metricFilter;
            return this;
        }

        /**
         * A list of metrics.
         */
        public Builder metrics(java.util.List<String> metrics) {
            Utils.checkNotNull(metrics, "metrics");
            this.metrics = metrics;
            return this;
        }

        /**
         * The name of the custom report, this name would be used as stream name.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiCustomReportConfig build() {
            return new SourceGoogleAnalyticsDataApiCustomReportConfig(
                cohortSpec,
                dimensionFilter,
                dimensions,
                metricFilter,
                metrics,
                name);
        }
    }
}

