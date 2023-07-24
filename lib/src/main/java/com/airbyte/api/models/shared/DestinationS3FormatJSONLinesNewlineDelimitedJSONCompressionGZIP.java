/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIP - Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".jsonl.gz").
 */

public class DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIP {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    public DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType compressionType;

    public DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIP withCompressionType(DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    
    public DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIP(){}
}
