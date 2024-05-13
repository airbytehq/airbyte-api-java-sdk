/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * AndGroup - The FilterExpressions in andGroup have an AND relationship.
 */

public class AndGroup {

    @JsonProperty("expressions")
    private java.util.List<Expression> expressions;

    @JsonProperty("filter_type")
    private FilterType filterType;

    @JsonCreator
    public AndGroup(
            @JsonProperty("expressions") java.util.List<Expression> expressions) {
        Utils.checkNotNull(expressions, "expressions");
        this.expressions = expressions;
        this.filterType = Builder._SINGLETON_VALUE_FilterType.value();
    }

    @JsonIgnore
    public java.util.List<Expression> expressions() {
        return expressions;
    }

    @JsonIgnore
    public FilterType filterType() {
        return filterType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AndGroup withExpressions(java.util.List<Expression> expressions) {
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
            java.util.Objects.deepEquals(this.expressions, other.expressions) &&
            java.util.Objects.deepEquals(this.filterType, other.filterType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private java.util.List<Expression> expressions;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder expressions(java.util.List<Expression> expressions) {
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

