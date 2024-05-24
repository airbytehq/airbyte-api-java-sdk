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
 * DestinationWeaviate - The configuration model for the Vector DB based destinations. This model is used to generate the UI for the destination configuration,
 * as well as to provide type safety for the configuration passed to the destination.
 * 
 * The configuration model is composed of four parts:
 * * Processing configuration
 * * Embedding configuration
 * * Indexing configuration
 * * Advanced configuration
 * 
 * Processing, embedding and advanced configuration are provided by this base class, while the indexing configuration is provided by the destination connector in the sub class.
 */

public class DestinationWeaviate {

    @JsonProperty("destinationType")
    private Weaviate destinationType;

    /**
     * Embedding configuration
     */
    @JsonProperty("embedding")
    private DestinationWeaviateEmbedding embedding;

    /**
     * Indexing configuration
     */
    @JsonProperty("indexing")
    private DestinationWeaviateIndexing indexing;

    /**
     * Do not store the text that gets embedded along with the vector and the metadata in the destination. If set to true, only the vector and the metadata will be stored - in this case raw text for LLM use cases needs to be retrieved from another source.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("omit_raw_text")
    private Optional<? extends Boolean> omitRawText;

    @JsonProperty("processing")
    private DestinationWeaviateProcessingConfigModel processing;

    @JsonCreator
    public DestinationWeaviate(
            @JsonProperty("embedding") DestinationWeaviateEmbedding embedding,
            @JsonProperty("indexing") DestinationWeaviateIndexing indexing,
            @JsonProperty("omit_raw_text") Optional<? extends Boolean> omitRawText,
            @JsonProperty("processing") DestinationWeaviateProcessingConfigModel processing) {
        Utils.checkNotNull(embedding, "embedding");
        Utils.checkNotNull(indexing, "indexing");
        Utils.checkNotNull(omitRawText, "omitRawText");
        Utils.checkNotNull(processing, "processing");
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.embedding = embedding;
        this.indexing = indexing;
        this.omitRawText = omitRawText;
        this.processing = processing;
    }
    
    public DestinationWeaviate(
            DestinationWeaviateEmbedding embedding,
            DestinationWeaviateIndexing indexing,
            DestinationWeaviateProcessingConfigModel processing) {
        this(embedding, indexing, Optional.empty(), processing);
    }

    @JsonIgnore
    public Weaviate destinationType() {
        return destinationType;
    }

    /**
     * Embedding configuration
     */
    @JsonIgnore
    public DestinationWeaviateEmbedding embedding() {
        return embedding;
    }

    /**
     * Indexing configuration
     */
    @JsonIgnore
    public DestinationWeaviateIndexing indexing() {
        return indexing;
    }

    /**
     * Do not store the text that gets embedded along with the vector and the metadata in the destination. If set to true, only the vector and the metadata will be stored - in this case raw text for LLM use cases needs to be retrieved from another source.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> omitRawText() {
        return (Optional<Boolean>) omitRawText;
    }

    @JsonIgnore
    public DestinationWeaviateProcessingConfigModel processing() {
        return processing;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Embedding configuration
     */
    public DestinationWeaviate withEmbedding(DestinationWeaviateEmbedding embedding) {
        Utils.checkNotNull(embedding, "embedding");
        this.embedding = embedding;
        return this;
    }

    /**
     * Indexing configuration
     */
    public DestinationWeaviate withIndexing(DestinationWeaviateIndexing indexing) {
        Utils.checkNotNull(indexing, "indexing");
        this.indexing = indexing;
        return this;
    }

    /**
     * Do not store the text that gets embedded along with the vector and the metadata in the destination. If set to true, only the vector and the metadata will be stored - in this case raw text for LLM use cases needs to be retrieved from another source.
     */
    public DestinationWeaviate withOmitRawText(boolean omitRawText) {
        Utils.checkNotNull(omitRawText, "omitRawText");
        this.omitRawText = Optional.ofNullable(omitRawText);
        return this;
    }

    /**
     * Do not store the text that gets embedded along with the vector and the metadata in the destination. If set to true, only the vector and the metadata will be stored - in this case raw text for LLM use cases needs to be retrieved from another source.
     */
    public DestinationWeaviate withOmitRawText(Optional<? extends Boolean> omitRawText) {
        Utils.checkNotNull(omitRawText, "omitRawText");
        this.omitRawText = omitRawText;
        return this;
    }

    public DestinationWeaviate withProcessing(DestinationWeaviateProcessingConfigModel processing) {
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
        DestinationWeaviate other = (DestinationWeaviate) o;
        return 
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.embedding, other.embedding) &&
            java.util.Objects.deepEquals(this.indexing, other.indexing) &&
            java.util.Objects.deepEquals(this.omitRawText, other.omitRawText) &&
            java.util.Objects.deepEquals(this.processing, other.processing);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            destinationType,
            embedding,
            indexing,
            omitRawText,
            processing);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationWeaviate.class,
                "destinationType", destinationType,
                "embedding", embedding,
                "indexing", indexing,
                "omitRawText", omitRawText,
                "processing", processing);
    }
    
    public final static class Builder {
 
        private DestinationWeaviateEmbedding embedding;
 
        private DestinationWeaviateIndexing indexing;
 
        private Optional<? extends Boolean> omitRawText;
 
        private DestinationWeaviateProcessingConfigModel processing;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Embedding configuration
         */
        public Builder embedding(DestinationWeaviateEmbedding embedding) {
            Utils.checkNotNull(embedding, "embedding");
            this.embedding = embedding;
            return this;
        }

        /**
         * Indexing configuration
         */
        public Builder indexing(DestinationWeaviateIndexing indexing) {
            Utils.checkNotNull(indexing, "indexing");
            this.indexing = indexing;
            return this;
        }

        /**
         * Do not store the text that gets embedded along with the vector and the metadata in the destination. If set to true, only the vector and the metadata will be stored - in this case raw text for LLM use cases needs to be retrieved from another source.
         */
        public Builder omitRawText(boolean omitRawText) {
            Utils.checkNotNull(omitRawText, "omitRawText");
            this.omitRawText = Optional.ofNullable(omitRawText);
            return this;
        }

        /**
         * Do not store the text that gets embedded along with the vector and the metadata in the destination. If set to true, only the vector and the metadata will be stored - in this case raw text for LLM use cases needs to be retrieved from another source.
         */
        public Builder omitRawText(Optional<? extends Boolean> omitRawText) {
            Utils.checkNotNull(omitRawText, "omitRawText");
            this.omitRawText = omitRawText;
            return this;
        }

        public Builder processing(DestinationWeaviateProcessingConfigModel processing) {
            Utils.checkNotNull(processing, "processing");
            this.processing = processing;
            return this;
        }
        
        public DestinationWeaviate build() {
            if (omitRawText == null) {
                omitRawText = _SINGLETON_VALUE_OmitRawText.value();
            }
            return new DestinationWeaviate(
                embedding,
                indexing,
                omitRawText,
                processing);
        }

        private static final LazySingletonValue<Weaviate> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"weaviate\"",
                        new TypeReference<Weaviate>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_OmitRawText =
                new LazySingletonValue<>(
                        "omit_raw_text",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

