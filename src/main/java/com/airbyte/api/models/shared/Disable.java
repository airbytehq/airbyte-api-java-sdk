/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
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
 * Disable - Disable SSL.
 */

public class Disable {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends Mode> mode;

    @JsonCreator
    public Disable() {
        
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Mode> mode() {
        return (Optional<Mode>) mode;
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
        Disable other = (Disable) o;
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
        return Utils.toString(Disable.class,
                "mode", mode);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public Disable build() {
            return new Disable(
                );
        }

        private static final LazySingletonValue<Optional<? extends Mode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"disable\"",
                        new TypeReference<Optional<? extends Mode>>() {});
    }
}

