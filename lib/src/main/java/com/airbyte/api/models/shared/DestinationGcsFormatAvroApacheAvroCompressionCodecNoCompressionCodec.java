/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodec {
    NO_COMPRESSION("no compression");

    @JsonValue
    public final String value;

    private DestinationGcsFormatAvroApacheAvroCompressionCodecNoCompressionCodec(String value) {
        this.value = value;
    }
}
