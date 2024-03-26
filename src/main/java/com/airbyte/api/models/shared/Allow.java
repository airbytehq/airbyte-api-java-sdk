/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 * Allow - Allow SSL mode.
 */

public class Allow {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationPostgresMode> mode;

    public Allow() {
        
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    public Optional<? extends DestinationPostgresMode> mode() {
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
        Allow other = (Allow) o;
        return 
            java.util.Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Allow.class,
                "mode", mode);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public Allow build() {
            if (mode == null) {
                mode = _SINGLETON_VALUE_Mode.value();
            }
            return new Allow(
                );
        }

        private static final LazySingletonValue<Optional<? extends DestinationPostgresMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"allow\"",
                        new TypeReference<Optional<? extends DestinationPostgresMode>>() {});
    }
}

