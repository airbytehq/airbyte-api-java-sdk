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


public class DoubleValue {

    @JsonProperty("value")
    private double value;

    @JsonProperty("value_type")
    private SourceGoogleAnalyticsDataApiValueType valueType;

    @JsonCreator
    public DoubleValue(
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
    public SourceGoogleAnalyticsDataApiValueType valueType() {
        return valueType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DoubleValue withValue(double value) {
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
        DoubleValue other = (DoubleValue) o;
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
        return Utils.toString(DoubleValue.class,
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
        
        public DoubleValue build() {
            return new DoubleValue(
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiValueType> _SINGLETON_VALUE_ValueType =
                new LazySingletonValue<>(
                        "value_type",
                        "\"doubleValue\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiValueType>() {});
    }
}

