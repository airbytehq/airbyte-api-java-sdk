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
 * AndGroup
 * 
 * <p>The FilterExpressions in andGroup have an AND relationship.
 */
public class AndGroup {

    @JsonProperty("expressions")
    private List<Expression> expressions;

    @JsonProperty("filter_type")
    private FilterType filterType;

    @JsonCreator
    public AndGroup(
            @JsonProperty("expressions") List<Expression> expressions) {
        Utils.checkNotNull(expressions, "expressions");
        this.expressions = expressions;
        this.filterType = Builder._SINGLETON_VALUE_FilterType.value();
    }

    @JsonIgnore
    public List<Expression> expressions() {
        return expressions;
    }

    @JsonIgnore
    public FilterType filterType() {
        return filterType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public AndGroup withExpressions(List<Expression> expressions) {
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
        AndGroup other = (AndGroup) o;
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
        return Utils.toString(AndGroup.class,
                "expressions", expressions,
                "filterType", filterType);
    }
    
    public final static class Builder {
 
        private List<Expression> expressions;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder expressions(List<Expression> expressions) {
            Utils.checkNotNull(expressions, "expressions");
            this.expressions = expressions;
            return this;
        }
        
        public AndGroup build() {
            return new AndGroup(
                expressions);
        }

        private static final LazySingletonValue<FilterType> _SINGLETON_VALUE_FilterType =
                new LazySingletonValue<>(
                        "filter_type",
                        "\"andGroup\"",
                        new TypeReference<FilterType>() {});
    }
}
