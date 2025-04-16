/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter {

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1FilterName filterName;

    @JsonProperty("operation")
    private List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation;

    @JsonProperty("value")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter(
            @JsonProperty("operation") List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation,
            @JsonProperty("value") SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value) {
        Utils.checkNotNull(operation, "operation");
        Utils.checkNotNull(value, "value");
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.operation = operation;
        this.value = value;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1FilterName filterName() {
        return filterName;
    }

    @JsonIgnore
    public List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation() {
        return operation;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterNumericFilter withOperation(List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation) {
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
            Objects.deepEquals(this.filterName, other.filterName) &&
            Objects.deepEquals(this.operation, other.operation) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation;
 
        private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValue value;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder operation(List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterValidEnums> operation) {
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
