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
 * DestinationTeradataDisable - Disable SSL.
 */

public class DestinationTeradataDisable {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationTeradataMode> mode;

    @JsonCreator
    public DestinationTeradataDisable() {
        
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationTeradataMode> mode() {
        return (Optional<DestinationTeradataMode>) mode;
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
        DestinationTeradataDisable other = (DestinationTeradataDisable) o;
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
        return Utils.toString(DestinationTeradataDisable.class,
                "mode", mode);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public DestinationTeradataDisable build() {
            return new DestinationTeradataDisable(
                );
        }

        private static final LazySingletonValue<Optional<? extends DestinationTeradataMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"disable\"",
                        new TypeReference<Optional<? extends DestinationTeradataMode>>() {});
    }
}

