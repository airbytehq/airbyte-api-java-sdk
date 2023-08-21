/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationLangchainIndexingPinecone - Pinecone is a popular vector store that can be used to store and retrieve embeddings. It is a managed service and can also be queried from outside of langchain.
 */

public class DestinationLangchainIndexingPinecone {
    /**
     * Pinecone index to use
     */
    @JsonProperty("index")
    public String index;

    public DestinationLangchainIndexingPinecone withIndex(String index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    public DestinationLangchainIndexingPineconeMode mode;

    public DestinationLangchainIndexingPinecone withMode(DestinationLangchainIndexingPineconeMode mode) {
        this.mode = mode;
        return this;
    }
    
    /**
     * Pinecone environment to use
     */
    @JsonProperty("pinecone_environment")
    public String pineconeEnvironment;

    public DestinationLangchainIndexingPinecone withPineconeEnvironment(String pineconeEnvironment) {
        this.pineconeEnvironment = pineconeEnvironment;
        return this;
    }
    
    @JsonProperty("pinecone_key")
    public String pineconeKey;

    public DestinationLangchainIndexingPinecone withPineconeKey(String pineconeKey) {
        this.pineconeKey = pineconeKey;
        return this;
    }
    
    public DestinationLangchainIndexingPinecone(@JsonProperty("index") String index, @JsonProperty("pinecone_environment") String pineconeEnvironment, @JsonProperty("pinecone_key") String pineconeKey) {
        this.index = index;
        this.pineconeEnvironment = pineconeEnvironment;
        this.pineconeKey = pineconeKey;
  }
}
