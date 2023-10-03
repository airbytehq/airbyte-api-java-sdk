/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationDatabricksDataSourceAmazonS3 - Storage on which the delta lake is built.
 */

public class DestinationDatabricksDataSourceAmazonS3 {
    @JsonProperty("data_source_type")
    public DestinationDatabricksDataSourceAmazonS3DataSourceType dataSourceType;

    public DestinationDatabricksDataSourceAmazonS3 withDataSourceType(DestinationDatabricksDataSourceAmazonS3DataSourceType dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    
    /**
     * The pattern allows you to set the file-name format for the S3 staging file(s)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name_pattern")
    public String fileNamePattern;

    public DestinationDatabricksDataSourceAmazonS3 withFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
        return this;
    }
    
    /**
     * The Access Key Id granting allow one to access the above S3 staging bucket. Airbyte requires Read and Write permissions to the given bucket.
     */
    @JsonProperty("s3_access_key_id")
    public String s3AccessKeyId;

    public DestinationDatabricksDataSourceAmazonS3 withS3AccessKeyId(String s3AccessKeyId) {
        this.s3AccessKeyId = s3AccessKeyId;
        return this;
    }
    
    /**
     * The name of the S3 bucket to use for intermittent staging of the data.
     */
    @JsonProperty("s3_bucket_name")
    public String s3BucketName;

    public DestinationDatabricksDataSourceAmazonS3 withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }
    
    /**
     * The directory under the S3 bucket where data will be written.
     */
    @JsonProperty("s3_bucket_path")
    public String s3BucketPath;

    public DestinationDatabricksDataSourceAmazonS3 withS3BucketPath(String s3BucketPath) {
        this.s3BucketPath = s3BucketPath;
        return this;
    }
    
    /**
     * The region of the S3 staging bucket to use if utilising a copy strategy.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_bucket_region")
    public DestinationDatabricksDataSourceAmazonS3S3BucketRegion s3BucketRegion;

    public DestinationDatabricksDataSourceAmazonS3 withS3BucketRegion(DestinationDatabricksDataSourceAmazonS3S3BucketRegion s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion;
        return this;
    }
    
    /**
     * The corresponding secret to the above access key id.
     */
    @JsonProperty("s3_secret_access_key")
    public String s3SecretAccessKey;

    public DestinationDatabricksDataSourceAmazonS3 withS3SecretAccessKey(String s3SecretAccessKey) {
        this.s3SecretAccessKey = s3SecretAccessKey;
        return this;
    }
    
    public DestinationDatabricksDataSourceAmazonS3(@JsonProperty("data_source_type") DestinationDatabricksDataSourceAmazonS3DataSourceType dataSourceType, @JsonProperty("s3_access_key_id") String s3AccessKeyId, @JsonProperty("s3_bucket_name") String s3BucketName, @JsonProperty("s3_bucket_path") String s3BucketPath, @JsonProperty("s3_secret_access_key") String s3SecretAccessKey) {
        this.dataSourceType = dataSourceType;
        this.s3AccessKeyId = s3AccessKeyId;
        this.s3BucketName = s3BucketName;
        this.s3BucketPath = s3BucketPath;
        this.s3SecretAccessKey = s3SecretAccessKey;
  }
}
