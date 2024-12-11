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
import java.util.List;
import java.util.Objects;

/**
 * OrGroup - The FilterExpressions in orGroup have an OR relationship.
 */

public class OrGroup {

    @JsonProperty("expressions")
    private List<SourceGoogleAnalyticsDataApiExpression> expressions;

    @JsonProperty("filter_type")
    private SourceGoogleAnalyticsDataApiFilterType filterType;

    @JsonCreator
    public OrGroup(
            @JsonProperty("expressions") List<SourceGoogleAnalyticsDataApiExpression> expressions) {
        Utils.checkNotNull(expressions, "expressions");
        this.expressions = expressions;
        this.filterType = Builder._SINGLETON_VALUE_FilterType.value();
    }

    @JsonIgnore
    public List<SourceGoogleAnalyticsDataApiExpression> expressions() {
        return expressions;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiFilterType filterType() {
        return filterType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrGroup withExpressions(List<SourceGoogleAnalyticsDataApiExpression> expressions) {
        Utils.checkNotNull(expressions, "expressions");
        this.expressions = expressions;
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
        OrGroup other = (OrGroup) o;
        return 
            Objects.deepEquals(this.expressions, other.expressions) &&
            Objects.deepEquals(this.filterType, other.filterType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            expressions,
            filterType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrGroup.class,
                "expressions", expressions,
                "filterType", filterType);
    }
    
    public final static class Builder {
 
        private List<SourceGoogleAnalyticsDataApiExpression> expressions;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder expressions(List<SourceGoogleAnalyticsDataApiExpression> expressions) {
            Utils.checkNotNull(expressions, "expressions");
            this.expressions = expressions;
            return this;
        }
        
        public OrGroup build() {
            return new OrGroup(
                expressions);
        }

        private static final LazySingletonValue<SourceGoogleAnalyticsDataApiFilterType> _SINGLETON_VALUE_FilterType =
                new LazySingletonValue<>(
                        "filter_type",
                        "\"orGroup\"",
                        new TypeReference<SourceGoogleAnalyticsDataApiFilterType>() {});
    }
}

