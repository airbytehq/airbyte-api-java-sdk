/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvro - Format of the data output. See &lt;a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema"&gt;here&lt;/a&gt; for more details
 */

public class DestinationS3FormatAvroApacheAvro {
    /**
     * The compression algorithm used to compress data. Default to no compression.
     */
    @JsonProperty("compression_codec")
    public Object compressionCodec;

    public DestinationS3FormatAvroApacheAvro withCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationS3FormatAvroApacheAvroFormatType formatType;

    public DestinationS3FormatAvroApacheAvro withFormatType(DestinationS3FormatAvroApacheAvroFormatType formatType) {
        this.formatType = formatType;
        return this;
    }
    
    public DestinationS3FormatAvroApacheAvro(@JsonProperty("compression_codec") Object compressionCodec, @JsonProperty("format_type") DestinationS3FormatAvroApacheAvroFormatType formatType) {
        this.compressionCodec = compressionCodec;
        this.formatType = formatType;
  }
}
