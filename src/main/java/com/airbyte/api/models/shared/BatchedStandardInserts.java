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
 * BatchedStandardInserts - Direct loading using batched SQL INSERT statements. This method uses the BigQuery driver to convert large INSERT statements into file uploads automatically.
 */

public class BatchedStandardInserts {

    @JsonProperty("method")
    private Method method;

    @JsonCreator
    public BatchedStandardInserts() {
        
        this.method = Builder._SINGLETON_VALUE_Method.value();
    }

    @JsonIgnore
    public Method method() {
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
        BatchedStandardInserts other = (BatchedStandardInserts) o;
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
        return Utils.toString(BatchedStandardInserts.class,
                "method", method);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public BatchedStandardInserts build() {
            return new BatchedStandardInserts(
                );
        }

        private static final LazySingletonValue<Method> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"Standard\"",
                        new TypeReference<Method>() {});
    }
}
