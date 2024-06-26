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

public class DestinationLangchain {

    @JsonProperty("destinationType")
    private Langchain destinationType;

    /**
     * Embedding configuration
     */
    @JsonProperty("embedding")
    private DestinationLangchainEmbedding embedding;

    /**
     * Indexing configuration
     */
    @JsonProperty("indexing")
    private DestinationLangchainIndexing indexing;

    @JsonProperty("processing")
    private DestinationLangchainProcessingConfigModel processing;

    @JsonCreator
    public DestinationLangchain(
            @JsonProperty("embedding") DestinationLangchainEmbedding embedding,
            @JsonProperty("indexing") DestinationLangchainIndexing indexing,
            @JsonProperty("processing") DestinationLangchainProcessingConfigModel processing) {
        Utils.checkNotNull(embedding, "embedding");
        Utils.checkNotNull(indexing, "indexing");
        Utils.checkNotNull(processing, "processing");
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.embedding = embedding;
        this.indexing = indexing;
        this.processing = processing;
    }

    @JsonIgnore
    public Langchain destinationType() {
        return destinationType;
    }

    /**
     * Embedding configuration
     */
    @JsonIgnore
    public DestinationLangchainEmbedding embedding() {
        return embedding;
    }

    /**
     * Indexing configuration
     */
    @JsonIgnore
    public DestinationLangchainIndexing indexing() {
        return indexing;
    }

    @JsonIgnore
    public DestinationLangchainProcessingConfigModel processing() {
        return processing;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Embedding configuration
     */
    public DestinationLangchain withEmbedding(DestinationLangchainEmbedding embedding) {
        Utils.checkNotNull(embedding, "embedding");
        this.embedding = embedding;
        return this;
    }

    /**
     * Indexing configuration
     */
    public DestinationLangchain withIndexing(DestinationLangchainIndexing indexing) {
        Utils.checkNotNull(indexing, "indexing");
        this.indexing = indexing;
        return this;
    }

    public DestinationLangchain withProcessing(DestinationLangchainProcessingConfigModel processing) {
        Utils.checkNotNull(processing, "processing");
        this.processing = processing;
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
        DestinationLangchain other = (DestinationLangchain) o;
        return 
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.embedding, other.embedding) &&
            java.util.Objects.deepEquals(this.indexing, other.indexing) &&
            java.util.Objects.deepEquals(this.processing, other.processing);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            destinationType,
            embedding,
            indexing,
            processing);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationLangchain.class,
                "destinationType", destinationType,
                "embedding", embedding,
                "indexing", indexing,
                "processing", processing);
    }
    
    public final static class Builder {
 
        private DestinationLangchainEmbedding embedding;
 
        private DestinationLangchainIndexing indexing;
 
        private DestinationLangchainProcessingConfigModel processing;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Embedding configuration
         */
        public Builder embedding(DestinationLangchainEmbedding embedding) {
            Utils.checkNotNull(embedding, "embedding");
            this.embedding = embedding;
            return this;
        }

        /**
         * Indexing configuration
         */
        public Builder indexing(DestinationLangchainIndexing indexing) {
            Utils.checkNotNull(indexing, "indexing");
            this.indexing = indexing;
            return this;
        }

        public Builder processing(DestinationLangchainProcessingConfigModel processing) {
            Utils.checkNotNull(processing, "processing");
            this.processing = processing;
            return this;
        }
        
        public DestinationLangchain build() {
            return new DestinationLangchain(
                embedding,
                indexing,
                processing);
        }

        private static final LazySingletonValue<Langchain> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"langchain\"",
                        new TypeReference<Langchain>() {});
    }
}

