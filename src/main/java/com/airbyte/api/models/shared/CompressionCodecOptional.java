/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * CompressionCodecOptional - The compression algorithm used to compress data.
 */
public enum CompressionCodecOptional {
    UNCOMPRESSED("UNCOMPRESSED"),
    GZIP("GZIP");

    @JsonValue
    private final String value;

    private CompressionCodecOptional(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
