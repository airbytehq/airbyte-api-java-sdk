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
 * DestinationTeradataPrefer
 * 
 * <p>Prefer SSL mode.
 */
public class DestinationTeradataPrefer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationTeradataSchemasSslModeMode> mode;

    @JsonCreator
    public DestinationTeradataPrefer() {
        
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationTeradataSchemasSslModeMode> mode() {
        return (Optional<DestinationTeradataSchemasSslModeMode>) mode;
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
        DestinationTeradataPrefer other = (DestinationTeradataPrefer) o;
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
        return Utils.toString(DestinationTeradataPrefer.class,
                "mode", mode);
    }
    
    public final static class Builder {
        
        private Builder() {
          // force use of static builder() method
        }
        
        public DestinationTeradataPrefer build() {
            return new DestinationTeradataPrefer(
                );
        }

        private static final LazySingletonValue<Optional<? extends DestinationTeradataSchemasSslModeMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"prefer\"",
                        new TypeReference<Optional<? extends DestinationTeradataSchemasSslModeMode>>() {});
    }
}
