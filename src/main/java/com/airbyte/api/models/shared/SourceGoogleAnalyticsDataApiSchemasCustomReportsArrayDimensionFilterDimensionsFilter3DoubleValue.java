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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3DoubleValue {

    @JsonProperty("value")
    private double value;

    @JsonProperty("value_type")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3ExpressionValueType valueType;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3DoubleValue(
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
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3ExpressionValueType valueType() {
        return valueType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3DoubleValue withValue(double value) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3DoubleValue other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3DoubleValue) o;
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
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3DoubleValue.class,
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
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3DoubleValue build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3DoubleValue(
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3ExpressionValueType> _SINGLETON_VALUE_ValueType =
                new LazySingletonValue<>(
                        "value_type",
                        "\"doubleValue\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3ExpressionValueType>() {});
    }
}

