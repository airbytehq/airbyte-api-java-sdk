/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum DestinationQdrantSchemasEmbeddingEmbedding5Mode {
    OPENAI_COMPATIBLE("openai_compatible");

    @JsonValue
    private final String value;

    private DestinationQdrantSchemasEmbeddingEmbedding5Mode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
