/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DestinationPgvectorSchemasEmbeddingEmbedding5Mode {
    OPENAI_COMPATIBLE("openai_compatible");

    @JsonValue
    private final String value;

    private DestinationPgvectorSchemasEmbeddingEmbedding5Mode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationPgvectorSchemasEmbeddingEmbedding5Mode> fromValue(String value) {
        for (DestinationPgvectorSchemasEmbeddingEmbedding5Mode o: DestinationPgvectorSchemasEmbeddingEmbedding5Mode.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

