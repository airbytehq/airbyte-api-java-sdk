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
 * Unencrypted - Data transfer will not be encrypted.
 */

public class Unencrypted {

    @JsonProperty("ssl_method")
    private SourceMssqlSchemasSslMethod sslMethod;

    @JsonCreator
    public Unencrypted() {
        
        this.sslMethod = Builder._SINGLETON_VALUE_SslMethod.value();
    }

    @JsonIgnore
    public SourceMssqlSchemasSslMethod sslMethod() {
        return sslMethod;
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
        Unencrypted other = (Unencrypted) o;
        return 
            java.util.Objects.deepEquals(this.sslMethod, other.sslMethod);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sslMethod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Unencrypted.class,
                "sslMethod", sslMethod);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public Unencrypted build() {
            return new Unencrypted(
                );
        }

        private static final LazySingletonValue<SourceMssqlSchemasSslMethod> _SINGLETON_VALUE_SslMethod =
                new LazySingletonValue<>(
                        "ssl_method",
                        "\"unencrypted\"",
                        new TypeReference<SourceMssqlSchemasSslMethod>() {});
    }
}
