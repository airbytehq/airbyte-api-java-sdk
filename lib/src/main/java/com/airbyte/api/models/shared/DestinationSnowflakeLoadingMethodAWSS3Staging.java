/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodAWSS3Staging - Recommended for large production workloads for better speed and scalability.
 */
public class DestinationSnowflakeLoadingMethodAWSS3Staging {
    /**
     * Enter your &lt;a href="https://docs.aws.amazon.com/powershell/latest/userguide/pstools-appendix-sign-up.html"&gt;AWS access key ID&lt;/a&gt;. Airbyte requires Read and Write permissions on your S3 bucket 
     */
    @JsonProperty("access_key_id")
    public String accessKeyId;
    public DestinationSnowflakeLoadingMethodAWSS3Staging withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    /**
     * Choose a data encryption method for the staging data
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encryption")
    public Object encryption;
    public DestinationSnowflakeLoadingMethodAWSS3Staging withEncryption(Object encryption) {
        this.encryption = encryption;
        return this;
    }
    
    /**
     * The pattern allows you to set the file-name format for the S3 staging file(s)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name_pattern")
    public String fileNamePattern;
    public DestinationSnowflakeLoadingMethodAWSS3Staging withFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
        return this;
    }
    
    @JsonProperty("method")
    public DestinationSnowflakeLoadingMethodAWSS3StagingMethodEnum method;
    public DestinationSnowflakeLoadingMethodAWSS3Staging withMethod(DestinationSnowflakeLoadingMethodAWSS3StagingMethodEnum method) {
        this.method = method;
        return this;
    }
    
    /**
     * Toggle to delete staging files from the S3 bucket after a successful sync
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purge_staging_data")
    public Boolean purgeStagingData;
    public DestinationSnowflakeLoadingMethodAWSS3Staging withPurgeStagingData(Boolean purgeStagingData) {
        this.purgeStagingData = purgeStagingData;
        return this;
    }
    
    /**
     * Enter your S3 bucket name
     */
    @JsonProperty("s3_bucket_name")
    public String s3BucketName;
    public DestinationSnowflakeLoadingMethodAWSS3Staging withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }
    
    /**
     * Enter the region where your S3 bucket resides
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_bucket_region")
    public DestinationSnowflakeLoadingMethodAWSS3StagingS3BucketRegionEnum s3BucketRegion;
    public DestinationSnowflakeLoadingMethodAWSS3Staging withS3BucketRegion(DestinationSnowflakeLoadingMethodAWSS3StagingS3BucketRegionEnum s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion;
        return this;
    }
    
    /**
     * Enter your &lt;a href="https://docs.aws.amazon.com/powershell/latest/userguide/pstools-appendix-sign-up.html"&gt;AWS secret access key&lt;/a&gt;
     */
    @JsonProperty("secret_access_key")
    public String secretAccessKey;
    public DestinationSnowflakeLoadingMethodAWSS3Staging withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    

    public DestinationSnowflakeLoadingMethodAWSS3Staging(@JsonProperty("access_key_id") String accessKeyId, @JsonProperty("method") DestinationSnowflakeLoadingMethodAWSS3StagingMethodEnum method, @JsonProperty("s3_bucket_name") String s3BucketName, @JsonProperty("secret_access_key") String secretAccessKey) {
    this.accessKeyId = accessKeyId;
this.method = method;
this.s3BucketName = s3BucketName;
this.secretAccessKey = secretAccessKey;
  }
}
