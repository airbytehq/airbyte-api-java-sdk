/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard - The compression algorithm used to compress data. Default to no compression.
 */

public class DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard {
    @JsonProperty("codec")
    public DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodec codec;

    public DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard withCodec(DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodec codec) {
        this.codec = codec;
        return this;
    }
    
    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_level")
    public Long compressionLevel;

    public DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard withCompressionLevel(Long compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }
    
    /**
     * If true, include a checksum with each data block.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_checksum")
    public Boolean includeChecksum;

    public DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard withIncludeChecksum(Boolean includeChecksum) {
        this.includeChecksum = includeChecksum;
        return this;
    }
    
    public DestinationGcsFormatAvroApacheAvroCompressionCodecZstandard(@JsonProperty("codec") DestinationGcsFormatAvroApacheAvroCompressionCodecZstandardCodec codec) {
        this.codec = codec;
  }
}
