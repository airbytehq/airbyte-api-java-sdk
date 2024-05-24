/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class AmazonS3 {

    @JsonProperty("data_source_type")
    private DestinationDatabricksDataSourceType dataSourceType;

    /**
     * The pattern allows you to set the file-name format for the S3 staging file(s)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name_pattern")
    private Optional<? extends String> fileNamePattern;

    /**
     * The Access Key Id granting allow one to access the above S3 staging bucket. Airbyte requires Read and Write permissions to the given bucket.
     */
    @JsonProperty("s3_access_key_id")
    private String s3AccessKeyId;

    /**
     * The name of the S3 bucket to use for intermittent staging of the data.
     */
    @JsonProperty("s3_bucket_name")
    private String s3BucketName;

    /**
     * The directory under the S3 bucket where data will be written.
     */
    @JsonProperty("s3_bucket_path")
    private String s3BucketPath;

    /**
     * The region of the S3 staging bucket to use if utilising a copy strategy.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_bucket_region")
    private Optional<? extends DestinationDatabricksS3BucketRegion> s3BucketRegion;

    /**
     * The corresponding secret to the above access key id.
     */
    @JsonProperty("s3_secret_access_key")
    private String s3SecretAccessKey;

    @JsonCreator
    public AmazonS3(
            @JsonProperty("file_name_pattern") Optional<? extends String> fileNamePattern,
            @JsonProperty("s3_access_key_id") String s3AccessKeyId,
            @JsonProperty("s3_bucket_name") String s3BucketName,
            @JsonProperty("s3_bucket_path") String s3BucketPath,
            @JsonProperty("s3_bucket_region") Optional<? extends DestinationDatabricksS3BucketRegion> s3BucketRegion,
            @JsonProperty("s3_secret_access_key") String s3SecretAccessKey) {
        Utils.checkNotNull(fileNamePattern, "fileNamePattern");
        Utils.checkNotNull(s3AccessKeyId, "s3AccessKeyId");
        Utils.checkNotNull(s3BucketName, "s3BucketName");
        Utils.checkNotNull(s3BucketPath, "s3BucketPath");
        Utils.checkNotNull(s3BucketRegion, "s3BucketRegion");
        Utils.checkNotNull(s3SecretAccessKey, "s3SecretAccessKey");
        this.dataSourceType = Builder._SINGLETON_VALUE_DataSourceType.value();
        this.fileNamePattern = fileNamePattern;
        this.s3AccessKeyId = s3AccessKeyId;
        this.s3BucketName = s3BucketName;
        this.s3BucketPath = s3BucketPath;
        this.s3BucketRegion = s3BucketRegion;
        this.s3SecretAccessKey = s3SecretAccessKey;
    }
    
    public AmazonS3(
            String s3AccessKeyId,
            String s3BucketName,
            String s3BucketPath,
            String s3SecretAccessKey) {
        this(Optional.empty(), s3AccessKeyId, s3BucketName, s3BucketPath, Optional.empty(), s3SecretAccessKey);
    }

    @JsonIgnore
    public DestinationDatabricksDataSourceType dataSourceType() {
        return dataSourceType;
    }

    /**
     * The pattern allows you to set the file-name format for the S3 staging file(s)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> fileNamePattern() {
        return (Optional<String>) fileNamePattern;
    }

    /**
     * The Access Key Id granting allow one to access the above S3 staging bucket. Airbyte requires Read and Write permissions to the given bucket.
     */
    @JsonIgnore
    public String s3AccessKeyId() {
        return s3AccessKeyId;
    }

    /**
     * The name of the S3 bucket to use for intermittent staging of the data.
     */
    @JsonIgnore
    public String s3BucketName() {
        return s3BucketName;
    }

    /**
     * The directory under the S3 bucket where data will be written.
     */
    @JsonIgnore
    public String s3BucketPath() {
        return s3BucketPath;
    }

    /**
     * The region of the S3 staging bucket to use if utilising a copy strategy.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationDatabricksS3BucketRegion> s3BucketRegion() {
        return (Optional<DestinationDatabricksS3BucketRegion>) s3BucketRegion;
    }

    /**
     * The corresponding secret to the above access key id.
     */
    @JsonIgnore
    public String s3SecretAccessKey() {
        return s3SecretAccessKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The pattern allows you to set the file-name format for the S3 staging file(s)
     */
    public AmazonS3 withFileNamePattern(String fileNamePattern) {
        Utils.checkNotNull(fileNamePattern, "fileNamePattern");
        this.fileNamePattern = Optional.ofNullable(fileNamePattern);
        return this;
    }

    /**
     * The pattern allows you to set the file-name format for the S3 staging file(s)
     */
    public AmazonS3 withFileNamePattern(Optional<? extends String> fileNamePattern) {
        Utils.checkNotNull(fileNamePattern, "fileNamePattern");
        this.fileNamePattern = fileNamePattern;
        return this;
    }

    /**
     * The Access Key Id granting allow one to access the above S3 staging bucket. Airbyte requires Read and Write permissions to the given bucket.
     */
    public AmazonS3 withS3AccessKeyId(String s3AccessKeyId) {
        Utils.checkNotNull(s3AccessKeyId, "s3AccessKeyId");
        this.s3AccessKeyId = s3AccessKeyId;
        return this;
    }

    /**
     * The name of the S3 bucket to use for intermittent staging of the data.
     */
    public AmazonS3 withS3BucketName(String s3BucketName) {
        Utils.checkNotNull(s3BucketName, "s3BucketName");
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * The directory under the S3 bucket where data will be written.
     */
    public AmazonS3 withS3BucketPath(String s3BucketPath) {
        Utils.checkNotNull(s3BucketPath, "s3BucketPath");
        this.s3BucketPath = s3BucketPath;
        return this;
    }

    /**
     * The region of the S3 staging bucket to use if utilising a copy strategy.
     */
    public AmazonS3 withS3BucketRegion(DestinationDatabricksS3BucketRegion s3BucketRegion) {
        Utils.checkNotNull(s3BucketRegion, "s3BucketRegion");
        this.s3BucketRegion = Optional.ofNullable(s3BucketRegion);
        return this;
    }

    /**
     * The region of the S3 staging bucket to use if utilising a copy strategy.
     */
    public AmazonS3 withS3BucketRegion(Optional<? extends DestinationDatabricksS3BucketRegion> s3BucketRegion) {
        Utils.checkNotNull(s3BucketRegion, "s3BucketRegion");
        this.s3BucketRegion = s3BucketRegion;
        return this;
    }

    /**
     * The corresponding secret to the above access key id.
     */
    public AmazonS3 withS3SecretAccessKey(String s3SecretAccessKey) {
        Utils.checkNotNull(s3SecretAccessKey, "s3SecretAccessKey");
        this.s3SecretAccessKey = s3SecretAccessKey;
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
        AmazonS3 other = (AmazonS3) o;
        return 
            java.util.Objects.deepEquals(this.dataSourceType, other.dataSourceType) &&
            java.util.Objects.deepEquals(this.fileNamePattern, other.fileNamePattern) &&
            java.util.Objects.deepEquals(this.s3AccessKeyId, other.s3AccessKeyId) &&
            java.util.Objects.deepEquals(this.s3BucketName, other.s3BucketName) &&
            java.util.Objects.deepEquals(this.s3BucketPath, other.s3BucketPath) &&
            java.util.Objects.deepEquals(this.s3BucketRegion, other.s3BucketRegion) &&
            java.util.Objects.deepEquals(this.s3SecretAccessKey, other.s3SecretAccessKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataSourceType,
            fileNamePattern,
            s3AccessKeyId,
            s3BucketName,
            s3BucketPath,
            s3BucketRegion,
            s3SecretAccessKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AmazonS3.class,
                "dataSourceType", dataSourceType,
                "fileNamePattern", fileNamePattern,
                "s3AccessKeyId", s3AccessKeyId,
                "s3BucketName", s3BucketName,
                "s3BucketPath", s3BucketPath,
                "s3BucketRegion", s3BucketRegion,
                "s3SecretAccessKey", s3SecretAccessKey);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> fileNamePattern = Optional.empty();
 
        private String s3AccessKeyId;
 
        private String s3BucketName;
 
        private String s3BucketPath;
 
        private Optional<? extends DestinationDatabricksS3BucketRegion> s3BucketRegion;
 
        private String s3SecretAccessKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The pattern allows you to set the file-name format for the S3 staging file(s)
         */
        public Builder fileNamePattern(String fileNamePattern) {
            Utils.checkNotNull(fileNamePattern, "fileNamePattern");
            this.fileNamePattern = Optional.ofNullable(fileNamePattern);
            return this;
        }

        /**
         * The pattern allows you to set the file-name format for the S3 staging file(s)
         */
        public Builder fileNamePattern(Optional<? extends String> fileNamePattern) {
            Utils.checkNotNull(fileNamePattern, "fileNamePattern");
            this.fileNamePattern = fileNamePattern;
            return this;
        }

        /**
         * The Access Key Id granting allow one to access the above S3 staging bucket. Airbyte requires Read and Write permissions to the given bucket.
         */
        public Builder s3AccessKeyId(String s3AccessKeyId) {
            Utils.checkNotNull(s3AccessKeyId, "s3AccessKeyId");
            this.s3AccessKeyId = s3AccessKeyId;
            return this;
        }

        /**
         * The name of the S3 bucket to use for intermittent staging of the data.
         */
        public Builder s3BucketName(String s3BucketName) {
            Utils.checkNotNull(s3BucketName, "s3BucketName");
            this.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * The directory under the S3 bucket where data will be written.
         */
        public Builder s3BucketPath(String s3BucketPath) {
            Utils.checkNotNull(s3BucketPath, "s3BucketPath");
            this.s3BucketPath = s3BucketPath;
            return this;
        }

        /**
         * The region of the S3 staging bucket to use if utilising a copy strategy.
         */
        public Builder s3BucketRegion(DestinationDatabricksS3BucketRegion s3BucketRegion) {
            Utils.checkNotNull(s3BucketRegion, "s3BucketRegion");
            this.s3BucketRegion = Optional.ofNullable(s3BucketRegion);
            return this;
        }

        /**
         * The region of the S3 staging bucket to use if utilising a copy strategy.
         */
        public Builder s3BucketRegion(Optional<? extends DestinationDatabricksS3BucketRegion> s3BucketRegion) {
            Utils.checkNotNull(s3BucketRegion, "s3BucketRegion");
            this.s3BucketRegion = s3BucketRegion;
            return this;
        }

        /**
         * The corresponding secret to the above access key id.
         */
        public Builder s3SecretAccessKey(String s3SecretAccessKey) {
            Utils.checkNotNull(s3SecretAccessKey, "s3SecretAccessKey");
            this.s3SecretAccessKey = s3SecretAccessKey;
            return this;
        }
        
        public AmazonS3 build() {
            if (s3BucketRegion == null) {
                s3BucketRegion = _SINGLETON_VALUE_S3BucketRegion.value();
            }
            return new AmazonS3(
                fileNamePattern,
                s3AccessKeyId,
                s3BucketName,
                s3BucketPath,
                s3BucketRegion,
                s3SecretAccessKey);
        }

        private static final LazySingletonValue<DestinationDatabricksDataSourceType> _SINGLETON_VALUE_DataSourceType =
                new LazySingletonValue<>(
                        "data_source_type",
                        "\"S3_STORAGE\"",
                        new TypeReference<DestinationDatabricksDataSourceType>() {});

        private static final LazySingletonValue<Optional<? extends DestinationDatabricksS3BucketRegion>> _SINGLETON_VALUE_S3BucketRegion =
                new LazySingletonValue<>(
                        "s3_bucket_region",
                        "\"\"",
                        new TypeReference<Optional<? extends DestinationDatabricksS3BucketRegion>>() {});
    }
}

