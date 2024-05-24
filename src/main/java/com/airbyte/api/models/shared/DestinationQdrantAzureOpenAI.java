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
 * DestinationQdrantAzureOpenAI - Use the Azure-hosted OpenAI API to embed text. This option is using the text-embedding-ada-002 model with 1536 embedding dimensions.
 */

public class DestinationQdrantAzureOpenAI {

    /**
     * The base URL for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
     */
    @JsonProperty("api_base")
    private String apiBase;

    /**
     * The deployment for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
     */
    @JsonProperty("deployment")
    private String deployment;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationQdrantSchemasEmbeddingEmbeddingMode> mode;

    /**
     * The API key for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
     */
    @JsonProperty("openai_key")
    private String openaiKey;

    @JsonCreator
    public DestinationQdrantAzureOpenAI(
            @JsonProperty("api_base") String apiBase,
            @JsonProperty("deployment") String deployment,
            @JsonProperty("openai_key") String openaiKey) {
        Utils.checkNotNull(apiBase, "apiBase");
        Utils.checkNotNull(deployment, "deployment");
        Utils.checkNotNull(openaiKey, "openaiKey");
        this.apiBase = apiBase;
        this.deployment = deployment;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.openaiKey = openaiKey;
    }

    /**
     * The base URL for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
     */
    @JsonIgnore
    public String apiBase() {
        return apiBase;
    }

    /**
     * The deployment for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
     */
    @JsonIgnore
    public String deployment() {
        return deployment;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationQdrantSchemasEmbeddingEmbeddingMode> mode() {
        return (Optional<DestinationQdrantSchemasEmbeddingEmbeddingMode>) mode;
    }

    /**
     * The API key for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
     */
    @JsonIgnore
    public String openaiKey() {
        return openaiKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The base URL for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
     */
    public DestinationQdrantAzureOpenAI withApiBase(String apiBase) {
        Utils.checkNotNull(apiBase, "apiBase");
        this.apiBase = apiBase;
        return this;
    }

    /**
     * The deployment for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
     */
    public DestinationQdrantAzureOpenAI withDeployment(String deployment) {
        Utils.checkNotNull(deployment, "deployment");
        this.deployment = deployment;
        return this;
    }

    /**
     * The API key for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
     */
    public DestinationQdrantAzureOpenAI withOpenaiKey(String openaiKey) {
        Utils.checkNotNull(openaiKey, "openaiKey");
        this.openaiKey = openaiKey;
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
        DestinationQdrantAzureOpenAI other = (DestinationQdrantAzureOpenAI) o;
        return 
            java.util.Objects.deepEquals(this.apiBase, other.apiBase) &&
            java.util.Objects.deepEquals(this.deployment, other.deployment) &&
            java.util.Objects.deepEquals(this.mode, other.mode) &&
            java.util.Objects.deepEquals(this.openaiKey, other.openaiKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiBase,
            deployment,
            mode,
            openaiKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationQdrantAzureOpenAI.class,
                "apiBase", apiBase,
                "deployment", deployment,
                "mode", mode,
                "openaiKey", openaiKey);
    }
    
    public final static class Builder {
 
        private String apiBase;
 
        private String deployment;
 
        private String openaiKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The base URL for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
         */
        public Builder apiBase(String apiBase) {
            Utils.checkNotNull(apiBase, "apiBase");
            this.apiBase = apiBase;
            return this;
        }

        /**
         * The deployment for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
         */
        public Builder deployment(String deployment) {
            Utils.checkNotNull(deployment, "deployment");
            this.deployment = deployment;
            return this;
        }

        /**
         * The API key for your Azure OpenAI resource.  You can find this in the Azure portal under your Azure OpenAI resource
         */
        public Builder openaiKey(String openaiKey) {
            Utils.checkNotNull(openaiKey, "openaiKey");
            this.openaiKey = openaiKey;
            return this;
        }
        
        public DestinationQdrantAzureOpenAI build() {
            return new DestinationQdrantAzureOpenAI(
                apiBase,
                deployment,
                openaiKey);
        }

        private static final LazySingletonValue<Optional<? extends DestinationQdrantSchemasEmbeddingEmbeddingMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"azure_openai\"",
                        new TypeReference<Optional<? extends DestinationQdrantSchemasEmbeddingEmbeddingMode>>() {});
    }
}

