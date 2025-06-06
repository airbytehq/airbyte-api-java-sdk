/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationS3DataLake
 * 
 * <p>Defines the configurations required to connect to an Iceberg catalog, including warehouse location, main branch name, and catalog type specifics.
 */
public class DestinationS3DataLake {

    /**
     * The AWS Access Key ID with permissions for S3 and Glue operations.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_key_id")
    private Optional<String> accessKeyId;

    /**
     * Specifies the type of Iceberg catalog (e.g., NESSIE, GLUE, REST) and its associated configuration.
     */
    @JsonProperty("catalog_type")
    private CatalogType catalogType;

    @JsonProperty("destinationType")
    private S3DataLake destinationType;

    /**
     * The primary or default branch name in the catalog. Most query engines will use "main" by default. See &lt;a href="https://iceberg.apache.org/docs/latest/branching/"&gt;Iceberg documentation&lt;/a&gt; for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("main_branch_name")
    private Optional<String> mainBranchName;

    /**
     * The name of the S3 bucket that will host the Iceberg data.
     */
    @JsonProperty("s3_bucket_name")
    private String s3BucketName;

    /**
     * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
     */
    @JsonProperty("s3_bucket_region")
    private DestinationS3DataLakeS3BucketRegion s3BucketRegion;

    /**
     * Your S3 endpoint url. Read more &lt;a href="https://docs.aws.amazon.com/general/latest/gr/s3.html#:~:text=Service%20endpoints-,Amazon%20S3%20endpoints,-When%20you%20use"&gt;here&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("s3_endpoint")
    private Optional<String> s3Endpoint;

    /**
     * The AWS Secret Access Key paired with the Access Key ID for AWS authentication.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_access_key")
    private Optional<String> secretAccessKey;

    /**
     * The root location of the data warehouse used by the Iceberg catalog. Typically includes a bucket name and path within that bucket. For AWS Glue and Nessie, must include the storage protocol (such as "s3://" for Amazon S3).
     */
    @JsonProperty("warehouse_location")
    private String warehouseLocation;

    @JsonCreator
    public DestinationS3DataLake(
            @JsonProperty("access_key_id") Optional<String> accessKeyId,
            @JsonProperty("catalog_type") CatalogType catalogType,
            @JsonProperty("main_branch_name") Optional<String> mainBranchName,
            @JsonProperty("s3_bucket_name") String s3BucketName,
            @JsonProperty("s3_bucket_region") DestinationS3DataLakeS3BucketRegion s3BucketRegion,
            @JsonProperty("s3_endpoint") Optional<String> s3Endpoint,
            @JsonProperty("secret_access_key") Optional<String> secretAccessKey,
            @JsonProperty("warehouse_location") String warehouseLocation) {
        Utils.checkNotNull(accessKeyId, "accessKeyId");
        Utils.checkNotNull(catalogType, "catalogType");
        Utils.checkNotNull(mainBranchName, "mainBranchName");
        Utils.checkNotNull(s3BucketName, "s3BucketName");
        Utils.checkNotNull(s3BucketRegion, "s3BucketRegion");
        Utils.checkNotNull(s3Endpoint, "s3Endpoint");
        Utils.checkNotNull(secretAccessKey, "secretAccessKey");
        Utils.checkNotNull(warehouseLocation, "warehouseLocation");
        this.accessKeyId = accessKeyId;
        this.catalogType = catalogType;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.mainBranchName = mainBranchName;
        this.s3BucketName = s3BucketName;
        this.s3BucketRegion = s3BucketRegion;
        this.s3Endpoint = s3Endpoint;
        this.secretAccessKey = secretAccessKey;
        this.warehouseLocation = warehouseLocation;
    }
    
    public DestinationS3DataLake(
            CatalogType catalogType,
            String s3BucketName,
            DestinationS3DataLakeS3BucketRegion s3BucketRegion,
            String warehouseLocation) {
        this(Optional.empty(), catalogType, Optional.empty(), s3BucketName, s3BucketRegion, Optional.empty(), Optional.empty(), warehouseLocation);
    }

    /**
     * The AWS Access Key ID with permissions for S3 and Glue operations.
     */
    @JsonIgnore
    public Optional<String> accessKeyId() {
        return accessKeyId;
    }

    /**
     * Specifies the type of Iceberg catalog (e.g., NESSIE, GLUE, REST) and its associated configuration.
     */
    @JsonIgnore
    public CatalogType catalogType() {
        return catalogType;
    }

    @JsonIgnore
    public S3DataLake destinationType() {
        return destinationType;
    }

    /**
     * The primary or default branch name in the catalog. Most query engines will use "main" by default. See &lt;a href="https://iceberg.apache.org/docs/latest/branching/"&gt;Iceberg documentation&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public Optional<String> mainBranchName() {
        return mainBranchName;
    }

    /**
     * The name of the S3 bucket that will host the Iceberg data.
     */
    @JsonIgnore
    public String s3BucketName() {
        return s3BucketName;
    }

    /**
     * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
     */
    @JsonIgnore
    public DestinationS3DataLakeS3BucketRegion s3BucketRegion() {
        return s3BucketRegion;
    }

    /**
     * Your S3 endpoint url. Read more &lt;a href="https://docs.aws.amazon.com/general/latest/gr/s3.html#:~:text=Service%20endpoints-,Amazon%20S3%20endpoints,-When%20you%20use"&gt;here&lt;/a&gt;
     */
    @JsonIgnore
    public Optional<String> s3Endpoint() {
        return s3Endpoint;
    }

    /**
     * The AWS Secret Access Key paired with the Access Key ID for AWS authentication.
     */
    @JsonIgnore
    public Optional<String> secretAccessKey() {
        return secretAccessKey;
    }

    /**
     * The root location of the data warehouse used by the Iceberg catalog. Typically includes a bucket name and path within that bucket. For AWS Glue and Nessie, must include the storage protocol (such as "s3://" for Amazon S3).
     */
    @JsonIgnore
    public String warehouseLocation() {
        return warehouseLocation;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The AWS Access Key ID with permissions for S3 and Glue operations.
     */
    public DestinationS3DataLake withAccessKeyId(String accessKeyId) {
        Utils.checkNotNull(accessKeyId, "accessKeyId");
        this.accessKeyId = Optional.ofNullable(accessKeyId);
        return this;
    }

    /**
     * The AWS Access Key ID with permissions for S3 and Glue operations.
     */
    public DestinationS3DataLake withAccessKeyId(Optional<String> accessKeyId) {
        Utils.checkNotNull(accessKeyId, "accessKeyId");
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Specifies the type of Iceberg catalog (e.g., NESSIE, GLUE, REST) and its associated configuration.
     */
    public DestinationS3DataLake withCatalogType(CatalogType catalogType) {
        Utils.checkNotNull(catalogType, "catalogType");
        this.catalogType = catalogType;
        return this;
    }

    /**
     * The primary or default branch name in the catalog. Most query engines will use "main" by default. See &lt;a href="https://iceberg.apache.org/docs/latest/branching/"&gt;Iceberg documentation&lt;/a&gt; for more information.
     */
    public DestinationS3DataLake withMainBranchName(String mainBranchName) {
        Utils.checkNotNull(mainBranchName, "mainBranchName");
        this.mainBranchName = Optional.ofNullable(mainBranchName);
        return this;
    }

    /**
     * The primary or default branch name in the catalog. Most query engines will use "main" by default. See &lt;a href="https://iceberg.apache.org/docs/latest/branching/"&gt;Iceberg documentation&lt;/a&gt; for more information.
     */
    public DestinationS3DataLake withMainBranchName(Optional<String> mainBranchName) {
        Utils.checkNotNull(mainBranchName, "mainBranchName");
        this.mainBranchName = mainBranchName;
        return this;
    }

    /**
     * The name of the S3 bucket that will host the Iceberg data.
     */
    public DestinationS3DataLake withS3BucketName(String s3BucketName) {
        Utils.checkNotNull(s3BucketName, "s3BucketName");
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
     */
    public DestinationS3DataLake withS3BucketRegion(DestinationS3DataLakeS3BucketRegion s3BucketRegion) {
        Utils.checkNotNull(s3BucketRegion, "s3BucketRegion");
        this.s3BucketRegion = s3BucketRegion;
        return this;
    }

    /**
     * Your S3 endpoint url. Read more &lt;a href="https://docs.aws.amazon.com/general/latest/gr/s3.html#:~:text=Service%20endpoints-,Amazon%20S3%20endpoints,-When%20you%20use"&gt;here&lt;/a&gt;
     */
    public DestinationS3DataLake withS3Endpoint(String s3Endpoint) {
        Utils.checkNotNull(s3Endpoint, "s3Endpoint");
        this.s3Endpoint = Optional.ofNullable(s3Endpoint);
        return this;
    }

    /**
     * Your S3 endpoint url. Read more &lt;a href="https://docs.aws.amazon.com/general/latest/gr/s3.html#:~:text=Service%20endpoints-,Amazon%20S3%20endpoints,-When%20you%20use"&gt;here&lt;/a&gt;
     */
    public DestinationS3DataLake withS3Endpoint(Optional<String> s3Endpoint) {
        Utils.checkNotNull(s3Endpoint, "s3Endpoint");
        this.s3Endpoint = s3Endpoint;
        return this;
    }

    /**
     * The AWS Secret Access Key paired with the Access Key ID for AWS authentication.
     */
    public DestinationS3DataLake withSecretAccessKey(String secretAccessKey) {
        Utils.checkNotNull(secretAccessKey, "secretAccessKey");
        this.secretAccessKey = Optional.ofNullable(secretAccessKey);
        return this;
    }

    /**
     * The AWS Secret Access Key paired with the Access Key ID for AWS authentication.
     */
    public DestinationS3DataLake withSecretAccessKey(Optional<String> secretAccessKey) {
        Utils.checkNotNull(secretAccessKey, "secretAccessKey");
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * The root location of the data warehouse used by the Iceberg catalog. Typically includes a bucket name and path within that bucket. For AWS Glue and Nessie, must include the storage protocol (such as "s3://" for Amazon S3).
     */
    public DestinationS3DataLake withWarehouseLocation(String warehouseLocation) {
        Utils.checkNotNull(warehouseLocation, "warehouseLocation");
        this.warehouseLocation = warehouseLocation;
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
        DestinationS3DataLake other = (DestinationS3DataLake) o;
        return 
            Objects.deepEquals(this.accessKeyId, other.accessKeyId) &&
            Objects.deepEquals(this.catalogType, other.catalogType) &&
            Objects.deepEquals(this.destinationType, other.destinationType) &&
            Objects.deepEquals(this.mainBranchName, other.mainBranchName) &&
            Objects.deepEquals(this.s3BucketName, other.s3BucketName) &&
            Objects.deepEquals(this.s3BucketRegion, other.s3BucketRegion) &&
            Objects.deepEquals(this.s3Endpoint, other.s3Endpoint) &&
            Objects.deepEquals(this.secretAccessKey, other.secretAccessKey) &&
            Objects.deepEquals(this.warehouseLocation, other.warehouseLocation);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessKeyId,
            catalogType,
            destinationType,
            mainBranchName,
            s3BucketName,
            s3BucketRegion,
            s3Endpoint,
            secretAccessKey,
            warehouseLocation);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3DataLake.class,
                "accessKeyId", accessKeyId,
                "catalogType", catalogType,
                "destinationType", destinationType,
                "mainBranchName", mainBranchName,
                "s3BucketName", s3BucketName,
                "s3BucketRegion", s3BucketRegion,
                "s3Endpoint", s3Endpoint,
                "secretAccessKey", secretAccessKey,
                "warehouseLocation", warehouseLocation);
    }
    
    public final static class Builder {
 
        private Optional<String> accessKeyId = Optional.empty();
 
        private CatalogType catalogType;
 
        private Optional<String> mainBranchName;
 
        private String s3BucketName;
 
        private DestinationS3DataLakeS3BucketRegion s3BucketRegion;
 
        private Optional<String> s3Endpoint = Optional.empty();
 
        private Optional<String> secretAccessKey = Optional.empty();
 
        private String warehouseLocation;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The AWS Access Key ID with permissions for S3 and Glue operations.
         */
        public Builder accessKeyId(String accessKeyId) {
            Utils.checkNotNull(accessKeyId, "accessKeyId");
            this.accessKeyId = Optional.ofNullable(accessKeyId);
            return this;
        }

        /**
         * The AWS Access Key ID with permissions for S3 and Glue operations.
         */
        public Builder accessKeyId(Optional<String> accessKeyId) {
            Utils.checkNotNull(accessKeyId, "accessKeyId");
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * Specifies the type of Iceberg catalog (e.g., NESSIE, GLUE, REST) and its associated configuration.
         */
        public Builder catalogType(CatalogType catalogType) {
            Utils.checkNotNull(catalogType, "catalogType");
            this.catalogType = catalogType;
            return this;
        }

        /**
         * The primary or default branch name in the catalog. Most query engines will use "main" by default. See &lt;a href="https://iceberg.apache.org/docs/latest/branching/"&gt;Iceberg documentation&lt;/a&gt; for more information.
         */
        public Builder mainBranchName(String mainBranchName) {
            Utils.checkNotNull(mainBranchName, "mainBranchName");
            this.mainBranchName = Optional.ofNullable(mainBranchName);
            return this;
        }

        /**
         * The primary or default branch name in the catalog. Most query engines will use "main" by default. See &lt;a href="https://iceberg.apache.org/docs/latest/branching/"&gt;Iceberg documentation&lt;/a&gt; for more information.
         */
        public Builder mainBranchName(Optional<String> mainBranchName) {
            Utils.checkNotNull(mainBranchName, "mainBranchName");
            this.mainBranchName = mainBranchName;
            return this;
        }

        /**
         * The name of the S3 bucket that will host the Iceberg data.
         */
        public Builder s3BucketName(String s3BucketName) {
            Utils.checkNotNull(s3BucketName, "s3BucketName");
            this.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
         */
        public Builder s3BucketRegion(DestinationS3DataLakeS3BucketRegion s3BucketRegion) {
            Utils.checkNotNull(s3BucketRegion, "s3BucketRegion");
            this.s3BucketRegion = s3BucketRegion;
            return this;
        }

        /**
         * Your S3 endpoint url. Read more &lt;a href="https://docs.aws.amazon.com/general/latest/gr/s3.html#:~:text=Service%20endpoints-,Amazon%20S3%20endpoints,-When%20you%20use"&gt;here&lt;/a&gt;
         */
        public Builder s3Endpoint(String s3Endpoint) {
            Utils.checkNotNull(s3Endpoint, "s3Endpoint");
            this.s3Endpoint = Optional.ofNullable(s3Endpoint);
            return this;
        }

        /**
         * Your S3 endpoint url. Read more &lt;a href="https://docs.aws.amazon.com/general/latest/gr/s3.html#:~:text=Service%20endpoints-,Amazon%20S3%20endpoints,-When%20you%20use"&gt;here&lt;/a&gt;
         */
        public Builder s3Endpoint(Optional<String> s3Endpoint) {
            Utils.checkNotNull(s3Endpoint, "s3Endpoint");
            this.s3Endpoint = s3Endpoint;
            return this;
        }

        /**
         * The AWS Secret Access Key paired with the Access Key ID for AWS authentication.
         */
        public Builder secretAccessKey(String secretAccessKey) {
            Utils.checkNotNull(secretAccessKey, "secretAccessKey");
            this.secretAccessKey = Optional.ofNullable(secretAccessKey);
            return this;
        }

        /**
         * The AWS Secret Access Key paired with the Access Key ID for AWS authentication.
         */
        public Builder secretAccessKey(Optional<String> secretAccessKey) {
            Utils.checkNotNull(secretAccessKey, "secretAccessKey");
            this.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * The root location of the data warehouse used by the Iceberg catalog. Typically includes a bucket name and path within that bucket. For AWS Glue and Nessie, must include the storage protocol (such as "s3://" for Amazon S3).
         */
        public Builder warehouseLocation(String warehouseLocation) {
            Utils.checkNotNull(warehouseLocation, "warehouseLocation");
            this.warehouseLocation = warehouseLocation;
            return this;
        }
        
        public DestinationS3DataLake build() {
            if (mainBranchName == null) {
                mainBranchName = _SINGLETON_VALUE_MainBranchName.value();
            }
            return new DestinationS3DataLake(
                accessKeyId,
                catalogType,
                mainBranchName,
                s3BucketName,
                s3BucketRegion,
                s3Endpoint,
                secretAccessKey,
                warehouseLocation);
        }

        private static final LazySingletonValue<S3DataLake> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"s3-data-lake\"",
                        new TypeReference<S3DataLake>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_MainBranchName =
                new LazySingletonValue<>(
                        "main_branch_name",
                        "\"main\"",
                        new TypeReference<Optional<String>>() {});
    }
}
