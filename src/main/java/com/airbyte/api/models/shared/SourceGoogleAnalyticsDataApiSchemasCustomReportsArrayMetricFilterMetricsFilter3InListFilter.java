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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("caseSensitive")
    private Optional<Boolean> caseSensitive;

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterName filterName;

    @JsonProperty("values")
    private List<String> values;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter(
            @JsonProperty("caseSensitive") Optional<Boolean> caseSensitive,
            @JsonProperty("values") List<String> values) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        Utils.checkNotNull(values, "values");
        this.caseSensitive = caseSensitive;
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.values = values;
    }
    
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter(
            List<String> values) {
        this(Optional.empty(), values);
    }

    @JsonIgnore
    public Optional<Boolean> caseSensitive() {
        return caseSensitive;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterName filterName() {
        return filterName;
    }

    @JsonIgnore
    public List<String> values() {
        return values;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter withCaseSensitive(boolean caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = Optional.ofNullable(caseSensitive);
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter withCaseSensitive(Optional<Boolean> caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = caseSensitive;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter withValues(List<String> values) {
        Utils.checkNotNull(values, "values");
        this.values = values;
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter) o;
        return 
            Objects.deepEquals(this.caseSensitive, other.caseSensitive) &&
            Objects.deepEquals(this.filterName, other.filterName) &&
            Objects.deepEquals(this.values, other.values);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            caseSensitive,
            filterName,
            values);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter.class,
                "caseSensitive", caseSensitive,
                "filterName", filterName,
                "values", values);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> caseSensitive = Optional.empty();
 
        private List<String> values;
        
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

        public Builder values(List<String> values) {
            Utils.checkNotNull(values, "values");
            this.values = values;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter(
                caseSensitive,
                values);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"inListFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterName>() {});
    }
}
