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
 * DestinationAstra - The configuration model for the Vector DB based destinations. This model is used to generate the UI for the destination configuration,
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

public class DestinationAstra {

    @JsonProperty("destinationType")
    private Astra destinationType;

    /**
     * Embedding configuration
     */
    @JsonProperty("embedding")
    private Embedding embedding;

    /**
     * Astra DB gives developers the APIs, real-time data and ecosystem integrations to put accurate RAG and Gen AI apps with fewer hallucinations in production.
     */
    @JsonProperty("indexing")
    private Indexing indexing;

    /**
     * Do not store the text that gets embedded along with the vector and the metadata in the destination. If set to true, only the vector and the metadata will be stored - in this case raw text for LLM use cases needs to be retrieved from another source.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("omit_raw_text")
    private Optional<? extends Boolean> omitRawText;

    @JsonProperty("processing")
    private ProcessingConfigModel processing;

    @JsonCreator
    public DestinationAstra(
            @JsonProperty("embedding") Embedding embedding,
            @JsonProperty("indexing") Indexing indexing,
            @JsonProperty("omit_raw_text") Optional<? extends Boolean> omitRawText,
            @JsonProperty("processing") ProcessingConfigModel processing) {
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
    
    public DestinationAstra(
            Embedding embedding,
            Indexing indexing,
            ProcessingConfigModel processing) {
        this(embedding, indexing, Optional.empty(), processing);
    }

    @JsonIgnore
    public Astra destinationType() {
        return destinationType;
    }

    /**
     * Embedding configuration
     */
    @JsonIgnore
    public Embedding embedding() {
        return embedding;
    }

    /**
     * Astra DB gives developers the APIs, real-time data and ecosystem integrations to put accurate RAG and Gen AI apps with fewer hallucinations in production.
     */
    @JsonIgnore
    public Indexing indexing() {
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
    public ProcessingConfigModel processing() {
        return processing;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Embedding configuration
     */
    public DestinationAstra withEmbedding(Embedding embedding) {
        Utils.checkNotNull(embedding, "embedding");
        this.embedding = embedding;
        return this;
    }

    /**
     * Astra DB gives developers the APIs, real-time data and ecosystem integrations to put accurate RAG and Gen AI apps with fewer hallucinations in production.
     */
    public DestinationAstra withIndexing(Indexing indexing) {
        Utils.checkNotNull(indexing, "indexing");
        this.indexing = indexing;
        return this;
    }

    /**
     * Do not store the text that gets embedded along with the vector and the metadata in the destination. If set to true, only the vector and the metadata will be stored - in this case raw text for LLM use cases needs to be retrieved from another source.
     */
    public DestinationAstra withOmitRawText(boolean omitRawText) {
        Utils.checkNotNull(omitRawText, "omitRawText");
        this.omitRawText = Optional.ofNullable(omitRawText);
        return this;
    }

    /**
     * Do not store the text that gets embedded along with the vector and the metadata in the destination. If set to true, only the vector and the metadata will be stored - in this case raw text for LLM use cases needs to be retrieved from another source.
     */
    public DestinationAstra withOmitRawText(Optional<? extends Boolean> omitRawText) {
        Utils.checkNotNull(omitRawText, "omitRawText");
        this.omitRawText = omitRawText;
        return this;
    }

    public DestinationAstra withProcessing(ProcessingConfigModel processing) {
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
        DestinationAstra other = (DestinationAstra) o;
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
        return Utils.toString(DestinationAstra.class,
                "destinationType", destinationType,
                "embedding", embedding,
                "indexing", indexing,
                "omitRawText", omitRawText,
                "processing", processing);
    }
    
    public final static class Builder {
 
        private Embedding embedding;
 
        private Indexing indexing;
 
        private Optional<? extends Boolean> omitRawText;
 
        private ProcessingConfigModel processing;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Embedding configuration
         */
        public Builder embedding(Embedding embedding) {
            Utils.checkNotNull(embedding, "embedding");
            this.embedding = embedding;
            return this;
        }

        /**
         * Astra DB gives developers the APIs, real-time data and ecosystem integrations to put accurate RAG and Gen AI apps with fewer hallucinations in production.
         */
        public Builder indexing(Indexing indexing) {
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

        public Builder processing(ProcessingConfigModel processing) {
            Utils.checkNotNull(processing, "processing");
            this.processing = processing;
            return this;
        }
        
        public DestinationAstra build() {
            if (omitRawText == null) {
                omitRawText = _SINGLETON_VALUE_OmitRawText.value();
            }
            return new DestinationAstra(
                embedding,
                indexing,
                omitRawText,
                processing);
        }

        private static final LazySingletonValue<Astra> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"astra\"",
                        new TypeReference<Astra>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_OmitRawText =
                new LazySingletonValue<>(
                        "omit_raw_text",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

