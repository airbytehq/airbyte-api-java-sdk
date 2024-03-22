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


public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter {

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterFilterFilterName filterName;

    @JsonProperty("fromValue")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3FromValue fromValue;

    @JsonProperty("toValue")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ToValue toValue;

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter(
            @JsonProperty("fromValue") SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3FromValue fromValue,
            @JsonProperty("toValue") SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ToValue toValue) {
        Utils.checkNotNull(fromValue, "fromValue");
        Utils.checkNotNull(toValue, "toValue");
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.fromValue = fromValue;
        this.toValue = toValue;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterFilterFilterName filterName() {
        return filterName;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3FromValue fromValue() {
        return fromValue;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ToValue toValue() {
        return toValue;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter withFromValue(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3FromValue fromValue) {
        Utils.checkNotNull(fromValue, "fromValue");
        this.fromValue = fromValue;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter withToValue(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ToValue toValue) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter) o;
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
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter.class,
                "filterName", filterName,
                "fromValue", fromValue,
                "toValue", toValue);
    }
    
    public final static class Builder {
 
        private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3FromValue fromValue;
 
        private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ToValue toValue;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fromValue(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3FromValue fromValue) {
            Utils.checkNotNull(fromValue, "fromValue");
            this.fromValue = fromValue;
            return this;
        }

        public Builder toValue(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ToValue toValue) {
            Utils.checkNotNull(toValue, "toValue");
            this.toValue = toValue;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter(
                fromValue,
                toValue);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterFilterFilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"betweenFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterFilterFilterName>() {});
    }
}

