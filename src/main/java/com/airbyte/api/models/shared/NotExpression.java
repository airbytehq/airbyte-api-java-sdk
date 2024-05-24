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
/**
 * NotExpression - The FilterExpression is NOT of notExpression.
 */

public class NotExpression {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expression")
    private Optional<? extends SourceGoogleAnalyticsDataApiSchemasExpression> expression;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter_type")
    private Optional<? extends SourceGoogleAnalyticsDataApiSchemasFilterType> filterType;

    @JsonCreator
    public NotExpression(
            @JsonProperty("expression") Optional<? extends SourceGoogleAnalyticsDataApiSchemasExpression> expression) {
        Utils.checkNotNull(expression, "expression");
        this.expression = expression;
        this.filterType = Builder._SINGLETON_VALUE_FilterType.value();
    }
    
    public NotExpression() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGoogleAnalyticsDataApiSchemasExpression> expression() {
        return (Optional<SourceGoogleAnalyticsDataApiSchemasExpression>) expression;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGoogleAnalyticsDataApiSchemasFilterType> filterType() {
        return (Optional<SourceGoogleAnalyticsDataApiSchemasFilterType>) filterType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public NotExpression withExpression(SourceGoogleAnalyticsDataApiSchemasExpression expression) {
        Utils.checkNotNull(expression, "expression");
        this.expression = Optional.ofNullable(expression);
        return this;
    }

    public NotExpression withExpression(Optional<? extends SourceGoogleAnalyticsDataApiSchemasExpression> expression) {
        Utils.checkNotNull(expression, "expression");
        this.expression = expression;
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
        NotExpression other = (NotExpression) o;
        return 
            java.util.Objects.deepEquals(this.expression, other.expression) &&
            java.util.Objects.deepEquals(this.filterType, other.filterType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            expression,
            filterType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NotExpression.class,
                "expression", expression,
                "filterType", filterType);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceGoogleAnalyticsDataApiSchemasExpression> expression = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder expression(SourceGoogleAnalyticsDataApiSchemasExpression expression) {
            Utils.checkNotNull(expression, "expression");
            this.expression = Optional.ofNullable(expression);
            return this;
        }

        public Builder expression(Optional<? extends SourceGoogleAnalyticsDataApiSchemasExpression> expression) {
            Utils.checkNotNull(expression, "expression");
            this.expression = expression;
            return this;
        }
        
        public NotExpression build() {
            return new NotExpression(
                expression);
        }

        private static final LazySingletonValue<Optional<? extends SourceGoogleAnalyticsDataApiSchemasFilterType>> _SINGLETON_VALUE_FilterType =
                new LazySingletonValue<>(
                        "filter_type",
                        "\"notExpression\"",
                        new TypeReference<Optional<? extends SourceGoogleAnalyticsDataApiSchemasFilterType>>() {});
    }
}

