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
import java.util.Objects;


public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2Int64Value {

    @JsonProperty("value")
    private String value;

    @JsonProperty("value_type")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValueType valueType;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2Int64Value(
            @JsonProperty("value") String value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        this.valueType = Builder._SINGLETON_VALUE_ValueType.value();
    }

    @JsonIgnore
    public String value() {
        return value;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValueType valueType() {
        return valueType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2Int64Value withValue(String value) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2Int64Value other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2Int64Value) o;
        return 
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.valueType, other.valueType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            value,
            valueType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2Int64Value.class,
                "value", value,
                "valueType", valueType);
    }
    
    public final static class Builder {
 
        private String value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2Int64Value build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2Int64Value(
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValueType> _SINGLETON_VALUE_ValueType =
                new LazySingletonValue<>(
                        "value_type",
                        "\"int64Value\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValueType>() {});
    }
}

