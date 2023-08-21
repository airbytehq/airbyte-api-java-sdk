/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationLangchainEmbeddingFake - Use a fake embedding made out of random vectors with 1536 embedding dimensions. This is useful for testing the data pipeline without incurring any costs.
 */

public class DestinationLangchainEmbeddingFake {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    public DestinationLangchainEmbeddingFakeMode mode;

    public DestinationLangchainEmbeddingFake withMode(DestinationLangchainEmbeddingFakeMode mode) {
        this.mode = mode;
        return this;
    }
    
    public DestinationLangchainEmbeddingFake(){}
}
