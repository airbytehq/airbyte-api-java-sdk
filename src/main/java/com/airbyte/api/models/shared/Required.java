/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Required - Always connect with SSL. If the MySQL server doesn’t support SSL, the connection will not be established. Certificate Authority (CA) and Hostname are not verified.
 */

public class Required {

    @JsonProperty("mode")
    private SourceMysqlSchemasMode mode;

    @JsonCreator
    public Required() {
        
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    @JsonIgnore
    public SourceMysqlSchemasMode mode() {
        return mode;
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
        Required other = (Required) o;
        return 
            Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Required.class,
                "mode", mode);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public Required build() {
            return new Required(
                );
        }

        private static final LazySingletonValue<SourceMysqlSchemasMode> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"required\"",
                        new TypeReference<SourceMysqlSchemasMode>() {});
    }
}

