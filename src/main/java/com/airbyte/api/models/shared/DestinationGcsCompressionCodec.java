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
