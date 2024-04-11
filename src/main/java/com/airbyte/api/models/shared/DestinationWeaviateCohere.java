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
 * DestinationWeaviateCohere - Use the Cohere API to embed text.
 */

public class DestinationWeaviateCohere {

    @JsonProperty("cohere_key")
    private String cohereKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationWeaviateSchemasEmbeddingEmbeddingMode> mode;

    public DestinationWeaviateCohere(
            @JsonProperty("cohere_key") String cohereKey) {
        Utils.checkNotNull(cohereKey, "cohereKey");
        this.cohereKey = cohereKey;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    public String cohereKey() {
        return cohereKey;
    }

    public Optional<? extends DestinationWeaviateSchemasEmbeddingEmbeddingMode> mode() {
        return mode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DestinationWeaviateCohere withCohereKey(String cohereKey) {
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
        DestinationWeaviateCohere other = (DestinationWeaviateCohere) o;
        return 
            java.util.Objects.deepEquals(this.cohereKey, other.cohereKey) &&
            java.util.Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cohereKey,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationWeaviateCohere.class,
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
        
        public DestinationWeaviateCohere build() {
            return new DestinationWeaviateCohere(
                cohereKey);
        }

        private static final LazySingletonValue<Optional<? extends DestinationWeaviateSchemasEmbeddingEmbeddingMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"cohere\"",
                        new TypeReference<Optional<? extends DestinationWeaviateSchemasEmbeddingEmbeddingMode>>() {});
    }
}

