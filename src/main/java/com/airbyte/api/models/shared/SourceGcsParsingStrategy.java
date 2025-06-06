/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceGcsParsingStrategy
 * 
 * <p>The strategy used to parse documents. `fast` extracts text directly from the document which doesn't work for all files. `ocr_only` is more reliable, but slower. `hi_res` is the most reliable, but requires an API key and a hosted instance of unstructured and can't be used with local mode. See the unstructured.io documentation for more details: https://unstructured-io.github.io/unstructured/core/partition.html#partition-pdf
 */
public enum SourceGcsParsingStrategy {
    AUTO("auto"),
    FAST("fast"),
    OCR_ONLY("ocr_only"),
    HI_RES("hi_res");

    @JsonValue
    private final String value;

    private SourceGcsParsingStrategy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceGcsParsingStrategy> fromValue(String value) {
        for (SourceGcsParsingStrategy o: SourceGcsParsingStrategy.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

