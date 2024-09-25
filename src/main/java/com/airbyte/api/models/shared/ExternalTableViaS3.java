/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ExternalTableViaS3 {

    /**
     * AWS access key granting read and write access to S3.
     */
    @JsonProperty("aws_key_id")
    private String awsKeyId;

    /**
     * Corresponding secret part of the AWS Key
     */
    @JsonProperty("aws_key_secret")
    private String awsKeySecret;

    @JsonProperty("method")
    private DestinationFireboltSchemasMethod method;

    /**
     * The name of the S3 bucket.
     */
    @JsonProperty("s3_bucket")
    private String s3Bucket;

    /**
     * Region name of the S3 bucket.
     */
    @JsonProperty("s3_region")
    private String s3Region;

    @JsonCreator
    public ExternalTableViaS3(
            @JsonProperty("aws_key_id") String awsKeyId,
            @JsonProperty("aws_key_secret") String awsKeySecret,
            @JsonProperty("s3_bucket") String s3Bucket,
            @JsonProperty("s3_region") String s3Region) {
        Utils.checkNotNull(awsKeyId, "awsKeyId");
        Utils.checkNotNull(awsKeySecret, "awsKeySecret");
        Utils.checkNotNull(s3Bucket, "s3Bucket");
        Utils.checkNotNull(s3Region, "s3Region");
        this.awsKeyId = awsKeyId;
        this.awsKeySecret = awsKeySecret;
        this.method = Builder._SINGLETON_VALUE_Method.value();
        this.s3Bucket = s3Bucket;
        this.s3Region = s3Region;
    }

    /**
     * AWS access key granting read and write access to S3.
     */
    @JsonIgnore
    public String awsKeyId() {
        return awsKeyId;
    }

    /**
     * Corresponding secret part of the AWS Key
     */
    @JsonIgnore
    public String awsKeySecret() {
        return awsKeySecret;
    }

    @JsonIgnore
    public DestinationFireboltSchemasMethod method() {
        return method;
    }

    /**
     * The name of the S3 bucket.
     */
    @JsonIgnore
    public String s3Bucket() {
        return s3Bucket;
    }

    /**
     * Region name of the S3 bucket.
     */
    @JsonIgnore
    public String s3Region() {
        return s3Region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * AWS access key granting read and write access to S3.
     */
    public ExternalTableViaS3 withAwsKeyId(String awsKeyId) {
        Utils.checkNotNull(awsKeyId, "awsKeyId");
        this.awsKeyId = awsKeyId;
        return this;
    }

    /**
     * Corresponding secret part of the AWS Key
     */
    public ExternalTableViaS3 withAwsKeySecret(String awsKeySecret) {
        Utils.checkNotNull(awsKeySecret, "awsKeySecret");
        this.awsKeySecret = awsKeySecret;
        return this;
    }

    /**
     * The name of the S3 bucket.
     */
    public ExternalTableViaS3 withS3Bucket(String s3Bucket) {
        Utils.checkNotNull(s3Bucket, "s3Bucket");
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * Region name of the S3 bucket.
     */
    public ExternalTableViaS3 withS3Region(String s3Region) {
        Utils.checkNotNull(s3Region, "s3Region");
        this.s3Region = s3Region;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalTableViaS3 other = (ExternalTableViaS3) o;
        return 
            java.util.Objects.deepEquals(this.awsKeyId, other.awsKeyId) &&
            java.util.Objects.deepEquals(this.awsKeySecret, other.awsKeySecret) &&
            java.util.Objects.deepEquals(this.method, other.method) &&
            java.util.Objects.deepEquals(this.s3Bucket, other.s3Bucket) &&
            java.util.Objects.deepEquals(this.s3Region, other.s3Region);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            awsKeyId,
            awsKeySecret,
            method,
            s3Bucket,
            s3Region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExternalTableViaS3.class,
                "awsKeyId", awsKeyId,
                "awsKeySecret", awsKeySecret,
                "method", method,
                "s3Bucket", s3Bucket,
                "s3Region", s3Region);
    }
    
    public final static class Builder {
 
        private String awsKeyId;
 
        private String awsKeySecret;
 
        private String s3Bucket;
 
        private String s3Region;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * AWS access key granting read and write access to S3.
         */
        public Builder awsKeyId(String awsKeyId) {
            Utils.checkNotNull(awsKeyId, "awsKeyId");
            this.awsKeyId = awsKeyId;
            return this;
        }

        /**
         * Corresponding secret part of the AWS Key
         */
        public Builder awsKeySecret(String awsKeySecret) {
            Utils.checkNotNull(awsKeySecret, "awsKeySecret");
            this.awsKeySecret = awsKeySecret;
            return this;
        }

        /**
         * The name of the S3 bucket.
         */
        public Builder s3Bucket(String s3Bucket) {
            Utils.checkNotNull(s3Bucket, "s3Bucket");
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * Region name of the S3 bucket.
         */
        public Builder s3Region(String s3Region) {
            Utils.checkNotNull(s3Region, "s3Region");
            this.s3Region = s3Region;
            return this;
        }
        
        public ExternalTableViaS3 build() {
            return new ExternalTableViaS3(
                awsKeyId,
                awsKeySecret,
                s3Bucket,
                s3Region);
        }

        private static final LazySingletonValue<DestinationFireboltSchemasMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"S3\"",
                        new TypeReference<DestinationFireboltSchemasMethod>() {});
    }
}
