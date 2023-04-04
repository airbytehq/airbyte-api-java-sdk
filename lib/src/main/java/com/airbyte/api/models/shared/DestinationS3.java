/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3 - The values required to configure the destination.
 */
public class DestinationS3 {
    /**
     * The access key ID to access the S3 bucket. Airbyte requires Read and Write permissions to the given bucket. Read more &lt;a href="https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_key_id")
    public String accessKeyId;
    public DestinationS3 withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationS3S3Enum airbyteDestinationName;
    public DestinationS3 withAirbyteDestinationName(DestinationS3S3Enum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * The pattern allows you to set the file-name format for the S3 staging file(s)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name_pattern")
    public String fileNamePattern;
    public DestinationS3 withFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
        return this;
    }
    
    /**
     * Format of the data output. See &lt;a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema"&gt;here&lt;/a&gt; for more details
     */
    @JsonProperty("format")
    public Object format;
    public DestinationS3 withFormat(Object format) {
        this.format = format;
        return this;
    }
    
    /**
     * The name of the S3 bucket. Read more &lt;a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("s3_bucket_name")
    public String s3BucketName;
    public DestinationS3 withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }
    
    /**
     * Directory under the S3 bucket where data will be written. Read more &lt;a href="https://docs.airbyte.com/integrations/destinations/s3#:~:text=to%20format%20the-,bucket%20path,-%3A"&gt;here&lt;/a&gt;
     */
    @JsonProperty("s3_bucket_path")
    public String s3BucketPath;
    public DestinationS3 withS3BucketPath(String s3BucketPath) {
        this.s3BucketPath = s3BucketPath;
        return this;
    }
    
    /**
     * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
     */
    @JsonProperty("s3_bucket_region")
    public DestinationS3S3BucketRegionEnum s3BucketRegion;
    public DestinationS3 withS3BucketRegion(DestinationS3S3BucketRegionEnum s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion;
        return this;
    }
    
    /**
     * Your S3 endpoint url. Read more &lt;a href="https://docs.aws.amazon.com/general/latest/gr/s3.html#:~:text=Service%20endpoints-,Amazon%20S3%20endpoints,-When%20you%20use"&gt;here&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_endpoint")
    public String s3Endpoint;
    public DestinationS3 withS3Endpoint(String s3Endpoint) {
        this.s3Endpoint = s3Endpoint;
        return this;
    }
    
    /**
     * Format string on how data will be organized inside the S3 bucket directory. Read more &lt;a href="https://docs.airbyte.com/integrations/destinations/s3#:~:text=The%20full%20path%20of%20the%20output%20data%20with%20the%20default%20S3%20path%20format"&gt;here&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_path_format")
    public String s3PathFormat;
    public DestinationS3 withS3PathFormat(String s3PathFormat) {
        this.s3PathFormat = s3PathFormat;
        return this;
    }
    
    /**
     * The corresponding secret to the access key ID. Read more &lt;a href="https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys"&gt;here&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_access_key")
    public String secretAccessKey;
    public DestinationS3 withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    
}