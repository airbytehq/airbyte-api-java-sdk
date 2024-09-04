/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Prefer - Prefer SSL mode.
 */

public class Prefer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationPostgresSchemasMode> mode;

    @JsonCreator
    public Prefer() {
        
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationPostgresSchemasMode> mode() {
        return (Optional<DestinationPostgresSchemasMode>) mode;
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
        Prefer other = (Prefer) o;
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
        return Utils.toString(Prefer.class,
                "mode", mode);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public Prefer build() {
            return new Prefer(
                );
        }

        private static final LazySingletonValue<Optional<? extends DestinationPostgresSchemasMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"prefer\"",
                        new TypeReference<Optional<? extends DestinationPostgresSchemasMode>>() {});
    }
}

