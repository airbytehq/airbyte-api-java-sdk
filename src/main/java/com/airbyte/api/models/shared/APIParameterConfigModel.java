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


public class APIParameterConfigModel {

    /**
     * The name of the unstructured API parameter to use
     */
    @JsonProperty("name")
    private String name;

    /**
     * The value of the parameter
     */
    @JsonProperty("value")
    private String value;

    @JsonCreator
    public APIParameterConfigModel(
            @JsonProperty("name") String name,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(value, "value");
        this.name = name;
        this.value = value;
    }

    /**
     * The name of the unstructured API parameter to use
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The value of the parameter
     */
    @JsonIgnore
    public String value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the unstructured API parameter to use
     */
    public APIParameterConfigModel withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The value of the parameter
     */
    public APIParameterConfigModel withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        APIParameterConfigModel other = (APIParameterConfigModel) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(APIParameterConfigModel.class,
                "name", name,
                "value", value);
    }
    
    public final static class Builder {
 
        private String name;
 
        private String value;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the unstructured API parameter to use
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The value of the parameter
         */
        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public APIParameterConfigModel build() {
            return new APIParameterConfigModel(
                name,
                value);
        }
    }
}

