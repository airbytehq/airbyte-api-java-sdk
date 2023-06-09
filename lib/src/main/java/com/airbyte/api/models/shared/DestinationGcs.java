/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcs - The values required to configure the destination.
 */

public class DestinationGcs {
    /**
     * An HMAC key is a type of credential and can be associated with a service account or a user account in Cloud Storage. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("credential")
    public Object credential;

    public DestinationGcs withCredential(Object credential) {
        this.credential = credential;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationGcsGcs destinationType;

    public DestinationGcs withDestinationType(DestinationGcsGcs destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Output data format. One of the following formats must be selected - &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-avro#advantages_of_avro"&gt;AVRO&lt;/a&gt; format, &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-parquet#parquet_schemas"&gt;PARQUET&lt;/a&gt; format, &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-csv#loading_csv_data_into_a_table"&gt;CSV&lt;/a&gt; format, or &lt;a href="https://cloud.google.com/bigquery/docs/loading-data-cloud-storage-json#loading_json_data_into_a_new_table"&gt;JSONL&lt;/a&gt; format.
     */
    @JsonProperty("format")
    public Object format;

    public DestinationGcs withFormat(Object format) {
        this.format = format;
        return this;
    }
    
    /**
     * You can find the bucket name in the App Engine Admin console Application Settings page, under the label Google Cloud Storage Bucket. Read more &lt;a href="https://cloud.google.com/storage/docs/naming-buckets"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("gcs_bucket_name")
    public String gcsBucketName;

    public DestinationGcs withGcsBucketName(String gcsBucketName) {
        this.gcsBucketName = gcsBucketName;
        return this;
    }
    
    /**
     * GCS Bucket Path string Subdirectory under the above bucket to sync the data into.
     */
    @JsonProperty("gcs_bucket_path")
    public String gcsBucketPath;

    public DestinationGcs withGcsBucketPath(String gcsBucketPath) {
        this.gcsBucketPath = gcsBucketPath;
        return this;
    }
    
    /**
     * Select a Region of the GCS Bucket. Read more &lt;a href="https://cloud.google.com/storage/docs/locations"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gcs_bucket_region")
    public DestinationGCSGCSBucketRegion gcsBucketRegion;

    public DestinationGcs withGcsBucketRegion(DestinationGCSGCSBucketRegion gcsBucketRegion) {
        this.gcsBucketRegion = gcsBucketRegion;
        return this;
    }
    
    public DestinationGcs(@JsonProperty("credential") Object credential, @JsonProperty("destinationType") DestinationGcsGcs destinationType, @JsonProperty("format") Object format, @JsonProperty("gcs_bucket_name") String gcsBucketName, @JsonProperty("gcs_bucket_path") String gcsBucketPath) {
        this.credential = credential;
        this.destinationType = destinationType;
        this.format = format;
        this.gcsBucketName = gcsBucketName;
        this.gcsBucketPath = gcsBucketPath;
  }
}
