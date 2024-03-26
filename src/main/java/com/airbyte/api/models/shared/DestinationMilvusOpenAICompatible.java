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
 * DestinationMilvusOpenAICompatible - Use a service that's compatible with the OpenAI API to embed text.
 */

public class DestinationMilvusOpenAICompatible {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_key")
    private Optional<? extends String> apiKey;

    /**
     * The base URL for your OpenAI-compatible service
     */
    @JsonProperty("base_url")
    private String baseUrl;

    /**
     * The number of dimensions the embedding model is generating
     */
    @JsonProperty("dimensions")
    private long dimensions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationMilvusSchemasEmbeddingEmbedding5Mode> mode;

    /**
     * The name of the model to use for embedding
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model_name")
    private Optional<? extends String> modelName;

    public DestinationMilvusOpenAICompatible(
            @JsonProperty("api_key") Optional<? extends String> apiKey,
            @JsonProperty("base_url") String baseUrl,
            @JsonProperty("dimensions") long dimensions,
            @JsonProperty("model_name") Optional<? extends String> modelName) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(baseUrl, "baseUrl");
        Utils.checkNotNull(dimensions, "dimensions");
        Utils.checkNotNull(modelName, "modelName");
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.dimensions = dimensions;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.modelName = modelName;
    }

    public Optional<? extends String> apiKey() {
        return apiKey;
    }

    /**
     * The base URL for your OpenAI-compatible service
     */
    public String baseUrl() {
        return baseUrl;
    }

    /**
     * The number of dimensions the embedding model is generating
     */
    public long dimensions() {
        return dimensions;
    }

    public Optional<? extends DestinationMilvusSchemasEmbeddingEmbedding5Mode> mode() {
        return mode;
    }

    /**
     * The name of the model to use for embedding
     */
    public Optional<? extends String> modelName() {
        return modelName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DestinationMilvusOpenAICompatible withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = Optional.ofNullable(apiKey);
        return this;
    }

    public DestinationMilvusOpenAICompatible withApiKey(Optional<? extends String> apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The base URL for your OpenAI-compatible service
     */
    public DestinationMilvusOpenAICompatible withBaseUrl(String baseUrl) {
        Utils.checkNotNull(baseUrl, "baseUrl");
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * The number of dimensions the embedding model is generating
     */
    public DestinationMilvusOpenAICompatible withDimensions(long dimensions) {
        Utils.checkNotNull(dimensions, "dimensions");
        this.dimensions = dimensions;
        return this;
    }

    /**
     * The name of the model to use for embedding
     */
    public DestinationMilvusOpenAICompatible withModelName(String modelName) {
        Utils.checkNotNull(modelName, "modelName");
        this.modelName = Optional.ofNullable(modelName);
        return this;
    }

    /**
     * The name of the model to use for embedding
     */
    public DestinationMilvusOpenAICompatible withModelName(Optional<? extends String> modelName) {
        Utils.checkNotNull(modelName, "modelName");
        this.modelName = modelName;
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
        DestinationMilvusOpenAICompatible other = (DestinationMilvusOpenAICompatible) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.baseUrl, other.baseUrl) &&
            java.util.Objects.deepEquals(this.dimensions, other.dimensions) &&
            java.util.Objects.deepEquals(this.mode, other.mode) &&
            java.util.Objects.deepEquals(this.modelName, other.modelName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            baseUrl,
            dimensions,
            mode,
            modelName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMilvusOpenAICompatible.class,
                "apiKey", apiKey,
                "baseUrl", baseUrl,
                "dimensions", dimensions,
                "mode", mode,
                "modelName", modelName);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> apiKey;
 
        private String baseUrl;
 
        private Long dimensions;
 
        private Optional<? extends String> modelName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = Optional.ofNullable(apiKey);
            return this;
        }

        public Builder apiKey(Optional<? extends String> apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The base URL for your OpenAI-compatible service
         */
        public Builder baseUrl(String baseUrl) {
            Utils.checkNotNull(baseUrl, "baseUrl");
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * The number of dimensions the embedding model is generating
         */
        public Builder dimensions(long dimensions) {
            Utils.checkNotNull(dimensions, "dimensions");
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The name of the model to use for embedding
         */
        public Builder modelName(String modelName) {
            Utils.checkNotNull(modelName, "modelName");
            this.modelName = Optional.ofNullable(modelName);
            return this;
        }

        /**
         * The name of the model to use for embedding
         */
        public Builder modelName(Optional<? extends String> modelName) {
            Utils.checkNotNull(modelName, "modelName");
            this.modelName = modelName;
            return this;
        }
        
        public DestinationMilvusOpenAICompatible build() {
            if (apiKey == null) {
                apiKey = _SINGLETON_VALUE_ApiKey.value();
            }
            if (mode == null) {
                mode = _SINGLETON_VALUE_Mode.value();
            }
            if (modelName == null) {
                modelName = _SINGLETON_VALUE_ModelName.value();
            }
            return new DestinationMilvusOpenAICompatible(
                apiKey,
                baseUrl,
                dimensions,
                modelName);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_ApiKey =
                new LazySingletonValue<>(
                        "api_key",
                        "\"\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationMilvusSchemasEmbeddingEmbedding5Mode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"openai_compatible\"",
                        new TypeReference<Optional<? extends DestinationMilvusSchemasEmbeddingEmbedding5Mode>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_ModelName =
                new LazySingletonValue<>(
                        "model_name",
                        "\"text-embedding-ada-002\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

