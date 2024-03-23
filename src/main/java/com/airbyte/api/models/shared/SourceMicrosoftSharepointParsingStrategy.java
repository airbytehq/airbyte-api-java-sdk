/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * SourceMicrosoftSharepointParsingStrategy - The strategy used to parse documents. `fast` extracts text directly from the document which doesn't work for all files. `ocr_only` is more reliable, but slower. `hi_res` is the most reliable, but requires an API key and a hosted instance of unstructured and can't be used with local mode. See the unstructured.io documentation for more details: https://unstructured-io.github.io/unstructured/core/partition.html#partition-pdf
 */
public enum SourceMicrosoftSharepointParsingStrategy {
    AUTO("auto"),
    FAST("fast"),
    OCR_ONLY("ocr_only"),
    HI_RES("hi_res");

    @JsonValue
    private final String value;

    private SourceMicrosoftSharepointParsingStrategy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
