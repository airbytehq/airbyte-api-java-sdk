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

public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("caseSensitive")
    private Optional<Boolean> caseSensitive;

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1FilterName filterName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("matchType")
    private Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1ValidEnums>> matchType;

    @JsonProperty("value")
    private String value;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter(
            @JsonProperty("caseSensitive") Optional<Boolean> caseSensitive,
            @JsonProperty("matchType") Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1ValidEnums>> matchType,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        Utils.checkNotNull(matchType, "matchType");
        Utils.checkNotNull(value, "value");
        this.caseSensitive = caseSensitive;
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.matchType = matchType;
        this.value = value;
    }
    
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter(
            String value) {
        this(Optional.empty(), Optional.empty(), value);
    }

    @JsonIgnore
    public Optional<Boolean> caseSensitive() {
        return caseSensitive;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1FilterName filterName() {
        return filterName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1ValidEnums>> matchType() {
        return (Optional<List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1ValidEnums>>) matchType;
    }

    @JsonIgnore
    public String value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter withCaseSensitive(boolean caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = Optional.ofNullable(caseSensitive);
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter withCaseSensitive(Optional<Boolean> caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = caseSensitive;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter withMatchType(List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1ValidEnums> matchType) {
        Utils.checkNotNull(matchType, "matchType");
        this.matchType = Optional.ofNullable(matchType);
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter withMatchType(Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1ValidEnums>> matchType) {
        Utils.checkNotNull(matchType, "matchType");
        this.matchType = matchType;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter withValue(String value) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter) o;
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
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter.class,
                "caseSensitive", caseSensitive,
                "filterName", filterName,
                "matchType", matchType,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> caseSensitive = Optional.empty();
 
        private Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1ValidEnums>> matchType = Optional.empty();
 
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

        public Builder matchType(List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1ValidEnums> matchType) {
            Utils.checkNotNull(matchType, "matchType");
            this.matchType = Optional.ofNullable(matchType);
            return this;
        }

        public Builder matchType(Optional<? extends List<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1ValidEnums>> matchType) {
            Utils.checkNotNull(matchType, "matchType");
            this.matchType = matchType;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter(
                caseSensitive,
                matchType,
                value);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1FilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"stringFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1FilterName>() {});
    }
}
