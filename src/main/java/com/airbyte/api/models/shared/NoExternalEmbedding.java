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
 * NoExternalEmbedding - Do not calculate and pass embeddings to Weaviate. Suitable for clusters with configured vectorizers to calculate embeddings within Weaviate or for classes that should only support regular text search.
 */

public class NoExternalEmbedding {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationWeaviateMode> mode;

    public NoExternalEmbedding() {
        
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    public Optional<? extends DestinationWeaviateMode> mode() {
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
        NoExternalEmbedding other = (NoExternalEmbedding) o;
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
        return Utils.toString(NoExternalEmbedding.class,
                "mode", mode);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public NoExternalEmbedding build() {
            return new NoExternalEmbedding(
                );
        }

        private static final LazySingletonValue<Optional<? extends DestinationWeaviateMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"no_embedding\"",
                        new TypeReference<Optional<? extends DestinationWeaviateMode>>() {});
    }
}

