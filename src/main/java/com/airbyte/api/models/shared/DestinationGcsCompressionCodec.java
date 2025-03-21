/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DestinationGcsCompressionCodec - The compression algorithm used to compress data pages.
 */
public enum DestinationGcsCompressionCodec {
    UNCOMPRESSED("UNCOMPRESSED"),
    SNAPPY("SNAPPY"),
    GZIP("GZIP"),
    LZO("LZO"),
    BROTLI("BROTLI"),
    LZ4("LZ4"),
    ZSTD("ZSTD");

    @JsonValue
    private final String value;

    private DestinationGcsCompressionCodec(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
