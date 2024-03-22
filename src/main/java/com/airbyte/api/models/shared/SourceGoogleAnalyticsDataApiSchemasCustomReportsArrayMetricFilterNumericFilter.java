/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter {

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1FilterName filterName;

    @JsonProperty("operation")
    private java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation;

    @JsonProperty("value")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value;

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter(
            @JsonProperty("operation") java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation,
            @JsonProperty("value") SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value) {
        Utils.checkNotNull(operation, "operation");
        Utils.checkNotNull(value, "value");
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.operation = operation;
        this.value = value;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1FilterName filterName() {
        return filterName;
    }

    public java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation() {
        return operation;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter withOperation(java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation) {
        Utils.checkNotNull(operation, "operation");
        this.operation = operation;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter withValue(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter) o;
        return 
            java.util.Objects.deepEquals(this.filterName, other.filterName) &&
            java.util.Objects.deepEquals(this.operation, other.operation) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            filterName,
            operation,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter.class,
                "filterName", filterName,
                "operation", operation,
                "value", value);
    }
    
    public final static class Builder {
 
        private java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation;
 
        private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder operation(java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation) {
            Utils.checkNotNull(operation, "operation");
            this.operation = operation;
            return this;
        }

        public Builder value(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter(
                operation,
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1FilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"numericFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1FilterName>() {});
    }
}

