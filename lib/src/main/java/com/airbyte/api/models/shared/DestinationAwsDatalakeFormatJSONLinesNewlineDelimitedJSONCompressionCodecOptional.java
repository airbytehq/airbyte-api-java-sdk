/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONCompressionCodecOptional - The compression algorithm used to compress data.
 */
public enum DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONCompressionCodecOptional {
    UNCOMPRESSED("UNCOMPRESSED"),
    GZIP("GZIP");

    @JsonValue
    public final String value;

    private DestinationAwsDatalakeFormatJSONLinesNewlineDelimitedJSONCompressionCodecOptional(String value) {
        this.value = value;
    }
}
