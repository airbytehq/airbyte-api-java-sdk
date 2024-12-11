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
 * DestinationSnowflakeCortexCohere - Use the Cohere API to embed text.
 */

public class DestinationSnowflakeCortexCohere {

    @JsonProperty("cohere_key")
    private String cohereKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationSnowflakeCortexSchemasMode> mode;

    @JsonCreator
    public DestinationSnowflakeCortexCohere(
            @JsonProperty("cohere_key") String cohereKey) {
        Utils.checkNotNull(cohereKey, "cohereKey");
        this.cohereKey = cohereKey;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    @JsonIgnore
    public String cohereKey() {
        return cohereKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationSnowflakeCortexSchemasMode> mode() {
        return (Optional<DestinationSnowflakeCortexSchemasMode>) mode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DestinationSnowflakeCortexCohere withCohereKey(String cohereKey) {
        Utils.checkNotNull(cohereKey, "cohereKey");
        this.cohereKey = cohereKey;
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
        DestinationSnowflakeCortexCohere other = (DestinationSnowflakeCortexCohere) o;
        return 
            Objects.deepEquals(this.cohereKey, other.cohereKey) &&
            Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cohereKey,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationSnowflakeCortexCohere.class,
                "cohereKey", cohereKey,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private String cohereKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cohereKey(String cohereKey) {
            Utils.checkNotNull(cohereKey, "cohereKey");
            this.cohereKey = cohereKey;
            return this;
        }
        
        public DestinationSnowflakeCortexCohere build() {
            return new DestinationSnowflakeCortexCohere(
                cohereKey);
        }

        private static final LazySingletonValue<Optional<? extends DestinationSnowflakeCortexSchemasMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"cohere\"",
                        new TypeReference<Optional<? extends DestinationSnowflakeCortexSchemasMode>>() {});
    }
}

