/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DestinationAstraSchemasEmbeddingEmbeddingMode {
    AZURE_OPENAI("azure_openai");

    @JsonValue
    private final String value;

    private DestinationAstraSchemasEmbeddingEmbeddingMode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationAstraSchemasEmbeddingEmbeddingMode> fromValue(String value) {
        for (DestinationAstraSchemasEmbeddingEmbeddingMode o: DestinationAstraSchemasEmbeddingEmbeddingMode.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

