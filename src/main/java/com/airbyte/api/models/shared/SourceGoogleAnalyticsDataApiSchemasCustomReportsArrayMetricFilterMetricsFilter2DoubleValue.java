/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2DoubleValue {

    @JsonProperty("value")
    private double value;

    @JsonProperty("value_type")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ExpressionsValueType valueType;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2DoubleValue(
            @JsonProperty("value") double value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        this.valueType = Builder._SINGLETON_VALUE_ValueType.value();
    }

    @JsonIgnore
    public double value() {
        return value;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ExpressionsValueType valueType() {
        return valueType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2DoubleValue withValue(double value) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2DoubleValue other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2DoubleValue) o;
        return 
            java.util.Objects.deepEquals(this.value, other.value) &&
            java.util.Objects.deepEquals(this.valueType, other.valueType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            value,
            valueType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2DoubleValue.class,
                "value", value,
                "valueType", valueType);
    }
    
    public final static class Builder {
 
        private Double value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(double value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2DoubleValue build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2DoubleValue(
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ExpressionsValueType> _SINGLETON_VALUE_ValueType =
                new LazySingletonValue<>(
                        "value_type",
                        "\"doubleValue\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ExpressionsValueType>() {});
    }
}

