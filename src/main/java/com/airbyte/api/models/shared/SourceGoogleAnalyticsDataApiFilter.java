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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceGoogleAnalyticsDataApiFilter - A primitive filter. In the same FilterExpression, all of the filter's field names need to be either all dimensions.
 */

public class SourceGoogleAnalyticsDataApiFilter {

    @JsonProperty("field_name")
    private String fieldName;

    @JsonProperty("filter")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter filter;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter_type")
    private Optional<? extends SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilterType> filterType;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiFilter(
            @JsonProperty("field_name") String fieldName,
            @JsonProperty("filter") SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter filter) {
        Utils.checkNotNull(fieldName, "fieldName");
        Utils.checkNotNull(filter, "filter");
        this.fieldName = fieldName;
        this.filter = filter;
        this.filterType = Builder._SINGLETON_VALUE_FilterType.value();
    }

    @JsonIgnore
    public String fieldName() {
        return fieldName;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter filter() {
        return filter;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilterType> filterType() {
        return (Optional<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilterType>) filterType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiFilter withFieldName(String fieldName) {
        Utils.checkNotNull(fieldName, "fieldName");
        this.fieldName = fieldName;
        return this;
    }

    public SourceGoogleAnalyticsDataApiFilter withFilter(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
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
        SourceGoogleAnalyticsDataApiFilter other = (SourceGoogleAnalyticsDataApiFilter) o;
        return 
            Objects.deepEquals(this.fieldName, other.fieldName) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.filterType, other.filterType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fieldName,
            filter,
            filterType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiFilter.class,
                "fieldName", fieldName,
                "filter", filter,
                "filterType", filterType);
    }
    
    public final static class Builder {
 
        private String fieldName;
 
        private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter filter;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fieldName(String fieldName) {
            Utils.checkNotNull(fieldName, "fieldName");
            this.fieldName = fieldName;
            return this;
        }

        public Builder filter(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiFilter build() {
            return new SourceGoogleAnalyticsDataApiFilter(
                fieldName,
                filter);
        }

        private static final LazySingletonValue<Optional<? extends SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilterType>> _SINGLETON_VALUE_FilterType =
                new LazySingletonValue<>(
                        "filter_type",
                        "\"filter\"",
                        new TypeReference<Optional<? extends SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilterType>>() {});
    }
}

