/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("caseSensitive")
    private Optional<? extends Boolean> caseSensitive;

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2FilterName filterName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matchType")
    private Optional<? extends java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValidEnums>> matchType;

    @JsonProperty("value")
    private String value;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter(
            @JsonProperty("caseSensitive") Optional<? extends Boolean> caseSensitive,
            @JsonProperty("matchType") Optional<? extends java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValidEnums>> matchType,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        Utils.checkNotNull(matchType, "matchType");
        Utils.checkNotNull(value, "value");
        this.caseSensitive = caseSensitive;
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.matchType = matchType;
        this.value = value;
    }
    
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter(
            String value) {
        this(Optional.empty(), Optional.empty(), value);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> caseSensitive() {
        return (Optional<Boolean>) caseSensitive;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2FilterName filterName() {
        return filterName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValidEnums>> matchType() {
        return (Optional<java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValidEnums>>) matchType;
    }

    @JsonIgnore
    public String value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter withCaseSensitive(boolean caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = Optional.ofNullable(caseSensitive);
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter withCaseSensitive(Optional<? extends Boolean> caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = caseSensitive;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter withMatchType(java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValidEnums> matchType) {
        Utils.checkNotNull(matchType, "matchType");
        this.matchType = Optional.ofNullable(matchType);
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter withMatchType(Optional<? extends java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValidEnums>> matchType) {
        Utils.checkNotNull(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter withValue(String value) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter) o;
        return 
            java.util.Objects.deepEquals(this.caseSensitive, other.caseSensitive) &&
            java.util.Objects.deepEquals(this.filterName, other.filterName) &&
            java.util.Objects.deepEquals(this.matchType, other.matchType) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            caseSensitive,
            filterName,
            matchType,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter.class,
                "caseSensitive", caseSensitive,
                "filterName", filterName,
                "matchType", matchType,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> caseSensitive = Optional.empty();
 
        private Optional<? extends java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValidEnums>> matchType = Optional.empty();
 
        private String value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder caseSensitive(boolean caseSensitive) {
            Utils.checkNotNull(caseSensitive, "caseSensitive");
            this.caseSensitive = Optional.ofNullable(caseSensitive);
            return this;
        }

        public Builder caseSensitive(Optional<? extends Boolean> caseSensitive) {
            Utils.checkNotNull(caseSensitive, "caseSensitive");
            this.caseSensitive = caseSensitive;
            return this;
        }

        public Builder matchType(java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValidEnums> matchType) {
            Utils.checkNotNull(matchType, "matchType");
            this.matchType = Optional.ofNullable(matchType);
            return this;
        }

        public Builder matchType(Optional<? extends java.util.List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValidEnums>> matchType) {
            Utils.checkNotNull(matchType, "matchType");
            this.matchType = matchType;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilterStringFilter(
                caseSensitive,
                matchType,
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2FilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"stringFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2FilterName>() {});
    }
}

