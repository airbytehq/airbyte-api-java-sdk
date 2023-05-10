/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatJSONLinesNewlineDelimitedJSON - Output data format. One of the following formats must be selected - &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-avro#advantages_of_avro"&gt;AVRO&lt;/a&gt; format, &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-parquet#parquet_schemas"&gt;PARQUET&lt;/a&gt; format, &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-csv#loading_csv_data_into_a_table"&gt;CSV&lt;/a&gt; format, or &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-json#loading_json_data_into_a_new_table"&gt;JSONL&lt;/a&gt; format.
 */
public class DestinationGcsFormatJSONLinesNewlineDelimitedJSON {
    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".jsonl.gz").
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression")
    public Object compression;

    public DestinationGcsFormatJSONLinesNewlineDelimitedJSON withCompression(Object compression) {
        this.compression = compression;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationGcsFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType;

    public DestinationGcsFormatJSONLinesNewlineDelimitedJSON withFormatType(DestinationGcsFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
    public DestinationGcsFormatJSONLinesNewlineDelimitedJSON(@JsonProperty("format_type") DestinationGcsFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
  }
}
