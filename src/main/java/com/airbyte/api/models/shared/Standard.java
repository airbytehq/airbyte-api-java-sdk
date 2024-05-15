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
 * Standard - &lt;i&gt;(not recommended)&lt;/i&gt; Direct loading using SQL INSERT statements. This method is extremely inefficient and provided only for quick testing. In all other cases, you should use S3 uploading.
 */

public class Standard {

    @JsonProperty("method")
    private DestinationRedshiftSchemasMethod method;

    @JsonCreator
    public Standard() {
        
        this.method = Builder._SINGLETON_VALUE_Method.value();
    }

    @JsonIgnore
    public DestinationRedshiftSchemasMethod method() {
        return method;
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Standard other = (Standard) o;
        return 
            java.util.Objects.deepEquals(this.method, other.method);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            method);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Standard.class,
                "method", method);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public Standard build() {
            return new Standard(
                );
        }

        private static final LazySingletonValue<DestinationRedshiftSchemasMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"Standard\"",
                        new TypeReference<DestinationRedshiftSchemasMethod>() {});
    }
}

