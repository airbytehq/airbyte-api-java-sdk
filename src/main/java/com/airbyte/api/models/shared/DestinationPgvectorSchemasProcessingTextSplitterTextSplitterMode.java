/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DestinationPgvectorSchemasProcessingTextSplitterTextSplitterMode {
    CODE("code");

    @JsonValue
    private final String value;

    private DestinationPgvectorSchemasProcessingTextSplitterTextSplitterMode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationPgvectorSchemasProcessingTextSplitterTextSplitterMode> fromValue(String value) {
        for (DestinationPgvectorSchemasProcessingTextSplitterTextSplitterMode o: DestinationPgvectorSchemasProcessingTextSplitterTextSplitterMode.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

