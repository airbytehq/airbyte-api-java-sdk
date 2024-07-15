/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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
 * SelectedFieldInfo - Path to a field/column/property in a stream to be selected. For example, if the field to be selected is a database column called "foo", this will be ["foo"]. Use multiple path elements for nested schemas.
 */

public class SelectedFieldInfo {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fieldPath")
    private Optional<? extends java.util.List<String>> fieldPath;

    @JsonCreator
    public SelectedFieldInfo(
            @JsonProperty("fieldPath") Optional<? extends java.util.List<String>> fieldPath) {
        Utils.checkNotNull(fieldPath, "fieldPath");
        this.fieldPath = fieldPath;
    }
    
    public SelectedFieldInfo() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> fieldPath() {
        return (Optional<java.util.List<String>>) fieldPath;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SelectedFieldInfo withFieldPath(java.util.List<String> fieldPath) {
        Utils.checkNotNull(fieldPath, "fieldPath");
        this.fieldPath = Optional.ofNullable(fieldPath);
        return this;
    }

    public SelectedFieldInfo withFieldPath(Optional<? extends java.util.List<String>> fieldPath) {
        Utils.checkNotNull(fieldPath, "fieldPath");
        this.fieldPath = fieldPath;
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
        SelectedFieldInfo other = (SelectedFieldInfo) o;
        return 
            java.util.Objects.deepEquals(this.fieldPath, other.fieldPath);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            fieldPath);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SelectedFieldInfo.class,
                "fieldPath", fieldPath);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> fieldPath = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fieldPath(java.util.List<String> fieldPath) {
            Utils.checkNotNull(fieldPath, "fieldPath");
            this.fieldPath = Optional.ofNullable(fieldPath);
            return this;
        }

        public Builder fieldPath(Optional<? extends java.util.List<String>> fieldPath) {
            Utils.checkNotNull(fieldPath, "fieldPath");
            this.fieldPath = fieldPath;
            return this;
        }
        
        public SelectedFieldInfo build() {
            return new SelectedFieldInfo(
                fieldPath);
        }
    }
}

