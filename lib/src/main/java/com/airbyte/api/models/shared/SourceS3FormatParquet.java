/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceS3FormatParquet - This connector utilises &lt;a href="https://arrow.apache.org/docs/python/generated/pyarrow.parquet.ParquetFile.html" target="_blank"&gt;PyArrow (Apache Arrow)&lt;/a&gt; for Parquet parsing.
 */

public class SourceS3FormatParquet {
    /**
     * Maximum number of records per batch read from the input files. Batches may be smaller if there aren’t enough rows in the file. This option can help avoid out-of-memory errors if your data is particularly wide.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batch_size")
    public Long batchSize;

    public SourceS3FormatParquet withBatchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    
    /**
     * Perform read buffering when deserializing individual column chunks. By default every group column will be loaded fully to memory. This option can help avoid out-of-memory errors if your data is particularly wide.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("buffer_size")
    public Long bufferSize;

    public SourceS3FormatParquet withBufferSize(Long bufferSize) {
        this.bufferSize = bufferSize;
        return this;
    }
    
    /**
     * If you only want to sync a subset of the columns from the file(s), add the columns you want here as a comma-delimited list. Leave it empty to sync all columns.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("columns")
    public String[] columns;

    public SourceS3FormatParquet withColumns(String[] columns) {
        this.columns = columns;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    public SourceS3FormatParquetFiletype filetype;

    public SourceS3FormatParquet withFiletype(SourceS3FormatParquetFiletype filetype) {
        this.filetype = filetype;
        return this;
    }
    
    public SourceS3FormatParquet(){}
}
