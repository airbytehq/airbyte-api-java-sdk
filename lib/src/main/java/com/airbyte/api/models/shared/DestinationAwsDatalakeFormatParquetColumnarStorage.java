/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAwsDatalakeFormatParquetColumnarStorage - Format of the data output.
 */

public class DestinationAwsDatalakeFormatParquetColumnarStorage {
    /**
     * The compression algorithm used to compress data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_codec")
    public DestinationAwsDatalakeFormatParquetColumnarStorageCompressionCodecOptional compressionCodec;

    public DestinationAwsDatalakeFormatParquetColumnarStorage withCompressionCodec(DestinationAwsDatalakeFormatParquetColumnarStorageCompressionCodecOptional compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format_type")
    public DestinationAwsDatalakeFormatParquetColumnarStorageFormatTypeWildcard formatType;

    public DestinationAwsDatalakeFormatParquetColumnarStorage withFormatType(DestinationAwsDatalakeFormatParquetColumnarStorageFormatTypeWildcard formatType) {
        this.formatType = formatType;
        return this;
    }
    
    public DestinationAwsDatalakeFormatParquetColumnarStorage(){}
}
