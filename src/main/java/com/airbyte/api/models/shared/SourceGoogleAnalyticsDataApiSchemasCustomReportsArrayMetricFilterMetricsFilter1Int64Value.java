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

public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1Int64Value {

    @JsonProperty("value")
    private String value;

    @JsonProperty("value_type")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ExpressionsFilterValueType valueType;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1Int64Value(
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
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ExpressionsFilterValueType valueType() {
        return valueType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1Int64Value withValue(String value) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1Int64Value other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1Int64Value) o;
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
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1Int64Value.class,
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
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1Int64Value build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1Int64Value(
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ExpressionsFilterValueType> _SINGLETON_VALUE_ValueType =
                new LazySingletonValue<>(
                        "value_type",
                        "\"int64Value\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ExpressionsFilterValueType>() {});
    }
}

