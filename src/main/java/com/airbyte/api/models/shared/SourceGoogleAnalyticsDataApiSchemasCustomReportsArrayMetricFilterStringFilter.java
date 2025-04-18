/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("caseSensitive")
    private Optional<Boolean> caseSensitive;

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ExpressionsFilterFilterName filterName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matchType")
    private Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ValidEnums>> matchType;

    @JsonProperty("value")
    private String value;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter(
            @JsonProperty("caseSensitive") Optional<Boolean> caseSensitive,
            @JsonProperty("matchType") Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ValidEnums>> matchType,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        Utils.checkNotNull(matchType, "matchType");
        Utils.checkNotNull(value, "value");
        this.caseSensitive = caseSensitive;
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.matchType = matchType;
        this.value = value;
    }
    
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter(
            String value) {
        this(Optional.empty(), Optional.empty(), value);
    }

    @JsonIgnore
    public Optional<Boolean> caseSensitive() {
        return caseSensitive;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ExpressionsFilterFilterName filterName() {
        return filterName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ValidEnums>> matchType() {
        return (Optional<List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ValidEnums>>) matchType;
    }

    @JsonIgnore
    public String value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter withCaseSensitive(boolean caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = Optional.ofNullable(caseSensitive);
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter withCaseSensitive(Optional<Boolean> caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = caseSensitive;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter withMatchType(List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ValidEnums> matchType) {
        Utils.checkNotNull(matchType, "matchType");
        this.matchType = Optional.ofNullable(matchType);
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter withMatchType(Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ValidEnums>> matchType) {
        Utils.checkNotNull(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter withValue(String value) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter) o;
        return 
            Objects.deepEquals(this.caseSensitive, other.caseSensitive) &&
            Objects.deepEquals(this.filterName, other.filterName) &&
            Objects.deepEquals(this.matchType, other.matchType) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            caseSensitive,
            filterName,
            matchType,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter.class,
                "caseSensitive", caseSensitive,
                "filterName", filterName,
                "matchType", matchType,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> caseSensitive = Optional.empty();
 
        private Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ValidEnums>> matchType = Optional.empty();
 
        private String value;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder caseSensitive(boolean caseSensitive) {
            Utils.checkNotNull(caseSensitive, "caseSensitive");
            this.caseSensitive = Optional.ofNullable(caseSensitive);
            return this;
        }

        public Builder caseSensitive(Optional<Boolean> caseSensitive) {
            Utils.checkNotNull(caseSensitive, "caseSensitive");
            this.caseSensitive = caseSensitive;
            return this;
        }

        public Builder matchType(List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ValidEnums> matchType) {
            Utils.checkNotNull(matchType, "matchType");
            this.matchType = Optional.ofNullable(matchType);
            return this;
        }

        public Builder matchType(Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ValidEnums>> matchType) {
            Utils.checkNotNull(matchType, "matchType");
            this.matchType = matchType;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterStringFilter(
                caseSensitive,
                matchType,
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ExpressionsFilterFilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"stringFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter1ExpressionsFilterFilterName>() {});
    }
}
