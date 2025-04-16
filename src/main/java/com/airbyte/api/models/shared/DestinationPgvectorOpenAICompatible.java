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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationPgvectorOpenAICompatible
 * 
 * <p>Use a service that's compatible with the OpenAI API to embed text.
 */
public class DestinationPgvectorOpenAICompatible {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_key")
    private Optional<String> apiKey;

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
    private Optional<? extends DestinationPgvectorSchemasEmbeddingEmbedding5Mode> mode;

    /**
     * The name of the model to use for embedding
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model_name")
    private Optional<String> modelName;

    @JsonCreator
    public DestinationPgvectorOpenAICompatible(
            @JsonProperty("api_key") Optional<String> apiKey,
            @JsonProperty("base_url") String baseUrl,
            @JsonProperty("dimensions") long dimensions,
            @JsonProperty("model_name") Optional<String> modelName) {
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
    
    public DestinationPgvectorOpenAICompatible(
            String baseUrl,
            long dimensions) {
        this(Optional.empty(), baseUrl, dimensions, Optional.empty());
    }

    @JsonIgnore
    public Optional<String> apiKey() {
        return apiKey;
    }

    /**
     * The base URL for your OpenAI-compatible service
     */
    @JsonIgnore
    public String baseUrl() {
        return baseUrl;
    }

    /**
     * The number of dimensions the embedding model is generating
     */
    @JsonIgnore
    public long dimensions() {
        return dimensions;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationPgvectorSchemasEmbeddingEmbedding5Mode> mode() {
        return (Optional<DestinationPgvectorSchemasEmbeddingEmbedding5Mode>) mode;
    }

    /**
     * The name of the model to use for embedding
     */
    @JsonIgnore
    public Optional<String> modelName() {
        return modelName;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public DestinationPgvectorOpenAICompatible withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = Optional.ofNullable(apiKey);
        return this;
    }

    public DestinationPgvectorOpenAICompatible withApiKey(Optional<String> apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The base URL for your OpenAI-compatible service
     */
    public DestinationPgvectorOpenAICompatible withBaseUrl(String baseUrl) {
        Utils.checkNotNull(baseUrl, "baseUrl");
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * The number of dimensions the embedding model is generating
     */
    public DestinationPgvectorOpenAICompatible withDimensions(long dimensions) {
        Utils.checkNotNull(dimensions, "dimensions");
        this.dimensions = dimensions;
        return this;
    }

    /**
     * The name of the model to use for embedding
     */
    public DestinationPgvectorOpenAICompatible withModelName(String modelName) {
        Utils.checkNotNull(modelName, "modelName");
        this.modelName = Optional.ofNullable(modelName);
        return this;
    }

    /**
     * The name of the model to use for embedding
     */
    public DestinationPgvectorOpenAICompatible withModelName(Optional<String> modelName) {
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
        DestinationPgvectorOpenAICompatible other = (DestinationPgvectorOpenAICompatible) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.baseUrl, other.baseUrl) &&
            Objects.deepEquals(this.dimensions, other.dimensions) &&
            Objects.deepEquals(this.mode, other.mode) &&
            Objects.deepEquals(this.modelName, other.modelName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            baseUrl,
            dimensions,
            mode,
            modelName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationPgvectorOpenAICompatible.class,
                "apiKey", apiKey,
                "baseUrl", baseUrl,
                "dimensions", dimensions,
                "mode", mode,
                "modelName", modelName);
    }
    
    public final static class Builder {
 
        private Optional<String> apiKey;
 
        private String baseUrl;
 
        private Long dimensions;
 
        private Optional<String> modelName;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = Optional.ofNullable(apiKey);
            return this;
        }

        public Builder apiKey(Optional<String> apiKey) {
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
        public Builder modelName(Optional<String> modelName) {
            Utils.checkNotNull(modelName, "modelName");
            this.modelName = modelName;
            return this;
        }
        
        public DestinationPgvectorOpenAICompatible build() {
            if (apiKey == null) {
                apiKey = _SINGLETON_VALUE_ApiKey.value();
            }
            if (modelName == null) {
                modelName = _SINGLETON_VALUE_ModelName.value();
            }
            return new DestinationPgvectorOpenAICompatible(
                apiKey,
                baseUrl,
                dimensions,
                modelName);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_ApiKey =
                new LazySingletonValue<>(
                        "api_key",
                        "\"\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationPgvectorSchemasEmbeddingEmbedding5Mode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"openai_compatible\"",
                        new TypeReference<Optional<? extends DestinationPgvectorSchemasEmbeddingEmbedding5Mode>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_ModelName =
                new LazySingletonValue<>(
                        "model_name",
                        "\"text-embedding-ada-002\"",
                        new TypeReference<Optional<String>>() {});
    }
}
