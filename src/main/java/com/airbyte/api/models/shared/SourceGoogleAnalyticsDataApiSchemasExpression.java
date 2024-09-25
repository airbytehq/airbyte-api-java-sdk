/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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

public class SourceGoogleAnalyticsDataApiSchemasExpression {

    @JsonProperty("field_name")
    private String fieldName;

    @JsonProperty("filter")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3Filter filter;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasExpression(
            @JsonProperty("field_name") String fieldName,
            @JsonProperty("filter") SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3Filter filter) {
        Utils.checkNotNull(fieldName, "fieldName");
        Utils.checkNotNull(filter, "filter");
        this.fieldName = fieldName;
        this.filter = filter;
    }

    @JsonIgnore
    public String fieldName() {
        return fieldName;
    }

    @JsonIgnore
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3Filter filter() {
        return filter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasExpression withFieldName(String fieldName) {
        Utils.checkNotNull(fieldName, "fieldName");
        this.fieldName = fieldName;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasExpression withFilter(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3Filter filter) {
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
        SourceGoogleAnalyticsDataApiSchemasExpression other = (SourceGoogleAnalyticsDataApiSchemasExpression) o;
        return 
            java.util.Objects.deepEquals(this.fieldName, other.fieldName) &&
            java.util.Objects.deepEquals(this.filter, other.filter);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            fieldName,
            filter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasExpression.class,
                "fieldName", fieldName,
                "filter", filter);
    }
    
    public final static class Builder {
 
        private String fieldName;
 
        private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3Filter filter;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fieldName(String fieldName) {
            Utils.checkNotNull(fieldName, "fieldName");
            this.fieldName = fieldName;
            return this;
        }

        public Builder filter(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter3Filter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasExpression build() {
            return new SourceGoogleAnalyticsDataApiSchemasExpression(
                fieldName,
                filter);
        }
    }
}

