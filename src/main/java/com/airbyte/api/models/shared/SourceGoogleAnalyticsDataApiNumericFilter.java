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

public class SourceGoogleAnalyticsDataApiNumericFilter {

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterName filterName;

    @JsonProperty("operation")
    private List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValidEnums> operation;

    @JsonProperty("value")
    private SourceGoogleAnalyticsDataApiValue value;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiNumericFilter(
            @JsonProperty("operation") List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValidEnums> operation,
            @JsonProperty("value") SourceGoogleAnalyticsDataApiValue value) {
        Utils.checkNotNull(operation, "operation");
        Utils.checkNotNull(value, "value");
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.operation = operation;
        this.value = value;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterName filterName() {
        return filterName;
    }

    @JsonIgnore
    public List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValidEnums> operation() {
        return operation;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiValue value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceGoogleAnalyticsDataApiNumericFilter withOperation(List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValidEnums> operation) {
        Utils.checkNotNull(operation, "operation");
        this.operation = operation;
        return this;
    }

    public SourceGoogleAnalyticsDataApiNumericFilter withValue(SourceGoogleAnalyticsDataApiValue value) {
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
        SourceGoogleAnalyticsDataApiNumericFilter other = (SourceGoogleAnalyticsDataApiNumericFilter) o;
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
        return Utils.toString(SourceGoogleAnalyticsDataApiNumericFilter.class,
                "filterName", filterName,
                "operation", operation,
                "value", value);
    }
    
    public final static class Builder {
 
        private List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValidEnums> operation;
 
        private SourceGoogleAnalyticsDataApiValue value;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder operation(List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterValidEnums> operation) {
            Utils.checkNotNull(operation, "operation");
            this.operation = operation;
            return this;
        }

        public Builder value(SourceGoogleAnalyticsDataApiValue value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiNumericFilter build() {
            return new SourceGoogleAnalyticsDataApiNumericFilter(
                operation,
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"numericFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterName>() {});
    }
}
