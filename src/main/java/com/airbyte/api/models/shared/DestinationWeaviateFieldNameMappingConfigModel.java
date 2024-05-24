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

public class DestinationWeaviateFieldNameMappingConfigModel {

    /**
     * The field name in the source
     */
    @JsonProperty("from_field")
    private String fromField;

    /**
     * The field name to use in the destination
     */
    @JsonProperty("to_field")
    private String toField;

    @JsonCreator
    public DestinationWeaviateFieldNameMappingConfigModel(
            @JsonProperty("from_field") String fromField,
            @JsonProperty("to_field") String toField) {
        Utils.checkNotNull(fromField, "fromField");
        Utils.checkNotNull(toField, "toField");
        this.fromField = fromField;
        this.toField = toField;
    }

    /**
     * The field name in the source
     */
    @JsonIgnore
    public String fromField() {
        return fromField;
    }

    /**
     * The field name to use in the destination
     */
    @JsonIgnore
    public String toField() {
        return toField;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The field name in the source
     */
    public DestinationWeaviateFieldNameMappingConfigModel withFromField(String fromField) {
        Utils.checkNotNull(fromField, "fromField");
        this.fromField = fromField;
        return this;
    }

    /**
     * The field name to use in the destination
     */
    public DestinationWeaviateFieldNameMappingConfigModel withToField(String toField) {
        Utils.checkNotNull(toField, "toField");
        this.toField = toField;
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
        DestinationWeaviateFieldNameMappingConfigModel other = (DestinationWeaviateFieldNameMappingConfigModel) o;
        return 
            java.util.Objects.deepEquals(this.fromField, other.fromField) &&
            java.util.Objects.deepEquals(this.toField, other.toField);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            fromField,
            toField);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationWeaviateFieldNameMappingConfigModel.class,
                "fromField", fromField,
                "toField", toField);
    }
    
    public final static class Builder {
 
        private String fromField;
 
        private String toField;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The field name in the source
         */
        public Builder fromField(String fromField) {
            Utils.checkNotNull(fromField, "fromField");
            this.fromField = fromField;
            return this;
        }

        /**
         * The field name to use in the destination
         */
        public Builder toField(String toField) {
            Utils.checkNotNull(toField, "toField");
            this.toField = toField;
            return this;
        }
        
        public DestinationWeaviateFieldNameMappingConfigModel build() {
            return new DestinationWeaviateFieldNameMappingConfigModel(
                fromField,
                toField);
        }
    }
}

