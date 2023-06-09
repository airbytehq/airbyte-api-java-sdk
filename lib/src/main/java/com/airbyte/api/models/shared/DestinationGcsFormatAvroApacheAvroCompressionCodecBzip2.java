/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2 - The compression algorithm used to compress data. Default to no compression.
 */

public class DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2 {
    @JsonProperty("codec")
    public DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2Codec codec;

    public DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2 withCodec(DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2Codec codec) {
        this.codec = codec;
        return this;
    }
    
    public DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2(@JsonProperty("codec") DestinationGcsFormatAvroApacheAvroCompressionCodecBzip2Codec codec) {
        this.codec = codec;
  }
}
