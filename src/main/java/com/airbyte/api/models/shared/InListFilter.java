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

public class InListFilter {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("caseSensitive")
    private Optional<? extends Boolean> caseSensitive;

    @JsonProperty("filter_name")
    private SourceGoogleAnalyticsDataApiFilterName filterName;

    @JsonProperty("values")
    private java.util.List<String> values;

    @JsonCreator
    public InListFilter(
            @JsonProperty("caseSensitive") Optional<? extends Boolean> caseSensitive,
            @JsonProperty("values") java.util.List<String> values) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        Utils.checkNotNull(values, "values");
        this.caseSensitive = caseSensitive;
        this.filterName = Builder._SINGLETON_VALUE_FilterName.value();
        this.values = values;
    }
    
    public InListFilter(
            java.util.List<String> values) {
        this(Optional.empty(), values);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> caseSensitive() {
        return (Optional<Boolean>) caseSensitive;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiFilterName filterName() {
        return filterName;
    }

    @JsonIgnore
    public java.util.List<String> values() {
        return values;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public InListFilter withCaseSensitive(boolean caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = Optional.ofNullable(caseSensitive);
        return this;
    }

    public InListFilter withCaseSensitive(Optional<? extends Boolean> caseSensitive) {
        Utils.checkNotNull(caseSensitive, "caseSensitive");
        this.caseSensitive = caseSensitive;
        return this;
    }

    public InListFilter withValues(java.util.List<String> values) {
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
        InListFilter other = (InListFilter) o;
        return 
            java.util.Objects.deepEquals(this.caseSensitive, other.caseSensitive) &&
            java.util.Objects.deepEquals(this.filterName, other.filterName) &&
            java.util.Objects.deepEquals(this.values, other.values);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            caseSensitive,
            filterName,
            values);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InListFilter.class,
                "caseSensitive", caseSensitive,
                "filterName", filterName,
                "values", values);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> caseSensitive = Optional.empty();
 
        private java.util.List<String> values;  
        
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

        public Builder values(java.util.List<String> values) {
            Utils.checkNotNull(values, "values");
            this.values = values;
            return this;
        }
        
        public InListFilter build() {
            return new InListFilter(
                caseSensitive,
                values);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiFilterName> _SINGLETON_VALUE_FilterName =
                new LazySingletonValue<>(
                        "filter_name",
                        "\"inListFilter\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiFilterName>() {});
    }
}

