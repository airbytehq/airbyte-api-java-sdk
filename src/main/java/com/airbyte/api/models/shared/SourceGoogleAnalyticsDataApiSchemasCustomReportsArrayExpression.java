/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayExpression {

    @JsonProperty("field_name")
    private String fieldName;

    @JsonProperty("filter")
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterFilter filter;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayExpression(
            @JsonProperty("field_name") String fieldName,
            @JsonProperty("filter") SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterFilter filter) {
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
    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterFilter filter() {
        return filter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayExpression withFieldName(String fieldName) {
        Utils.checkNotNull(fieldName, "fieldName");
        this.fieldName = fieldName;
        return this;
    }

    public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayExpression withFilter(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterFilter filter) {
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayExpression other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayExpression) o;
        return 
            Objects.deepEquals(this.fieldName, other.fieldName) &&
            Objects.deepEquals(this.filter, other.filter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fieldName,
            filter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayExpression.class,
                "fieldName", fieldName,
                "filter", filter);
    }
    
    public final static class Builder {
 
        private String fieldName;
 
        private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterFilter filter;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fieldName(String fieldName) {
            Utils.checkNotNull(fieldName, "fieldName");
            this.fieldName = fieldName;
            return this;
        }

        public Builder filter(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayExpression build() {
            return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayExpression(
                fieldName,
                filter);
        }
    }
}

