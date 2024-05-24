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

public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterBetweenFilter {

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter2ExpressionsFilterName filterName;

    @JsonProperty("fromValue")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterFromValue fromValue;

    @JsonProperty("toValue")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterToValue toValue;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterBetweenFilter(
            @JsonProperty("fromValue") SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterFromValue fromValue,
            @JsonProperty("toValue") SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterToValue toValue) {
        Utils.checkNotNull(fromValue, "fromValue");
        Utils.checkNotNull(toValue, "toValue");
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.fromValue = fromValue;
        this.toValue = toValue;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter2ExpressionsFilterName filterName() {
        return filterName;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterFromValue fromValue() {
        return fromValue;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterToValue toValue() {
        return toValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterBetweenFilter withFromValue(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterFromValue fromValue) {
        Utils.checkNotNull(fromValue, "fromValue");
        this.fromValue = fromValue;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterBetweenFilter withToValue(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterToValue toValue) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterBetweenFilter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterBetweenFilter) o;
        return 
            java.util.Objects.deepEquals(this.filterName, other.filterName) &&
            java.util.Objects.deepEquals(this.fromValue, other.fromValue) &&
            java.util.Objects.deepEquals(this.toValue, other.toValue);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            filterName,
            fromValue,
            toValue);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterBetweenFilter.class,
                "filterName", filterName,
                "fromValue", fromValue,
                "toValue", toValue);
    }
    
    public final static class Builder {
 
        private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterFromValue fromValue;
 
        private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterToValue toValue;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fromValue(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterFromValue fromValue) {
            Utils.checkNotNull(fromValue, "fromValue");
            this.fromValue = fromValue;
            return this;
        }

        public Builder toValue(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterToValue toValue) {
            Utils.checkNotNull(toValue, "toValue");
            this.toValue = toValue;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterBetweenFilter build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterBetweenFilter(
                fromValue,
                toValue);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter2ExpressionsFilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"betweenFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter2ExpressionsFilterName>() {});
    }
}

