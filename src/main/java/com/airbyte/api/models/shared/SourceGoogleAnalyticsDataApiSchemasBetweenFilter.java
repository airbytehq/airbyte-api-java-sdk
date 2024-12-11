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


public class SourceGoogleAnalyticsDataApiSchemasBetweenFilter {

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3ExpressionFilterFilterFilterName filterName;

    @JsonProperty("fromValue")
    private SourceGoogleAnalyticsDataApiSchemasFromValue fromValue;

    @JsonProperty("toValue")
    private SourceGoogleAnalyticsDataApiSchemasToValue toValue;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasBetweenFilter(
            @JsonProperty("fromValue") SourceGoogleAnalyticsDataApiSchemasFromValue fromValue,
            @JsonProperty("toValue") SourceGoogleAnalyticsDataApiSchemasToValue toValue) {
        Utils.checkNotNull(fromValue, "fromValue");
        Utils.checkNotNull(toValue, "toValue");
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.fromValue = fromValue;
        this.toValue = toValue;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3ExpressionFilterFilterFilterName filterName() {
        return filterName;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasFromValue fromValue() {
        return fromValue;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasToValue toValue() {
        return toValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasBetweenFilter withFromValue(SourceGoogleAnalyticsDataApiSchemasFromValue fromValue) {
        Utils.checkNotNull(fromValue, "fromValue");
        this.fromValue = fromValue;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasBetweenFilter withToValue(SourceGoogleAnalyticsDataApiSchemasToValue toValue) {
        Utils.checkNotNull(toValue, "toValue");
        this.toValue = toValue;
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
        SourceGoogleAnalyticsDataApiSchemasBetweenFilter other = (SourceGoogleAnalyticsDataApiSchemasBetweenFilter) o;
        return 
            Objects.deepEquals(this.filterName, other.filterName) &&
            Objects.deepEquals(this.fromValue, other.fromValue) &&
            Objects.deepEquals(this.toValue, other.toValue);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            filterName,
            fromValue,
            toValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasBetweenFilter.class,
                "filterName", filterName,
                "fromValue", fromValue,
                "toValue", toValue);
    }
    
    public final static class Builder {
 
        private SourceGoogleAnalyticsDataApiSchemasFromValue fromValue;
 
        private SourceGoogleAnalyticsDataApiSchemasToValue toValue;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fromValue(SourceGoogleAnalyticsDataApiSchemasFromValue fromValue) {
            Utils.checkNotNull(fromValue, "fromValue");
            this.fromValue = fromValue;
            return this;
        }

        public Builder toValue(SourceGoogleAnalyticsDataApiSchemasToValue toValue) {
            Utils.checkNotNull(toValue, "toValue");
            this.toValue = toValue;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasBetweenFilter build() {
            return new SourceGoogleAnalyticsDataApiSchemasBetweenFilter(
                fromValue,
                toValue);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3ExpressionFilterFilterFilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"betweenFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3ExpressionFilterFilterFilterName>() {});
    }
}

