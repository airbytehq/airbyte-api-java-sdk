/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatAvroApacheAvro - Output data format. One of the following formats must be selected - &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-avro#advantages_of_avro"&gt;AVRO&lt;/a&gt; format, &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-parquet#parquet_schemas"&gt;PARQUET&lt;/a&gt; format, &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-csv#loading_csv_data_into_a_table"&gt;CSV&lt;/a&gt; format, or &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-json#loading_json_data_into_a_new_table"&gt;JSONL&lt;/a&gt; format.
 */

public class DestinationGcsFormatAvroApacheAvro {
    /**
     * The compression algorithm used to compress data. Default to no compression.
     */
    @JsonProperty("compression_codec")
    public Object compressionCodec;

    public DestinationGcsFormatAvroApacheAvro withCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationGcsFormatAvroApacheAvroFormatType formatType;

    public DestinationGcsFormatAvroApacheAvro withFormatType(DestinationGcsFormatAvroApacheAvroFormatType formatType) {
        this.formatType = formatType;
        return this;
    }
    
    public DestinationGcsFormatAvroApacheAvro(@JsonProperty("compression_codec") Object compressionCodec, @JsonProperty("format_type") DestinationGcsFormatAvroApacheAvroFormatType formatType) {
        this.compressionCodec = compressionCodec;
        this.formatType = formatType;
  }
}
