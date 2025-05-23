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

public class SourceGoogleAnalyticsDataApiBetweenFilter {

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterFilterName filterName;

    @JsonProperty("fromValue")
    private SourceGoogleAnalyticsDataApiFromValue fromValue;

    @JsonProperty("toValue")
    private SourceGoogleAnalyticsDataApiToValue toValue;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiBetweenFilter(
            @JsonProperty("fromValue") SourceGoogleAnalyticsDataApiFromValue fromValue,
            @JsonProperty("toValue") SourceGoogleAnalyticsDataApiToValue toValue) {
        Utils.checkNotNull(fromValue, "fromValue");
        Utils.checkNotNull(toValue, "toValue");
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.fromValue = fromValue;
        this.toValue = toValue;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterFilterName filterName() {
        return filterName;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiFromValue fromValue() {
        return fromValue;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiToValue toValue() {
        return toValue;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceGoogleAnalyticsDataApiBetweenFilter withFromValue(SourceGoogleAnalyticsDataApiFromValue fromValue) {
        Utils.checkNotNull(fromValue, "fromValue");
        this.fromValue = fromValue;
        return this;
    }

    public SourceGoogleAnalyticsDataApiBetweenFilter withToValue(SourceGoogleAnalyticsDataApiToValue toValue) {
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
        SourceGoogleAnalyticsDataApiBetweenFilter other = (SourceGoogleAnalyticsDataApiBetweenFilter) o;
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
        return Utils.toString(SourceGoogleAnalyticsDataApiBetweenFilter.class,
                "filterName", filterName,
                "fromValue", fromValue,
                "toValue", toValue);
    }
    
    public final static class Builder {
 
        private SourceGoogleAnalyticsDataApiFromValue fromValue;
 
        private SourceGoogleAnalyticsDataApiToValue toValue;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fromValue(SourceGoogleAnalyticsDataApiFromValue fromValue) {
            Utils.checkNotNull(fromValue, "fromValue");
            this.fromValue = fromValue;
            return this;
        }

        public Builder toValue(SourceGoogleAnalyticsDataApiToValue toValue) {
            Utils.checkNotNull(toValue, "toValue");
            this.toValue = toValue;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiBetweenFilter build() {
            return new SourceGoogleAnalyticsDataApiBetweenFilter(
                fromValue,
                toValue);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterFilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"betweenFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterFilterName>() {});
    }
}
