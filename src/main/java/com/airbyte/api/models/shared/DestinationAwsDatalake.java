/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class DestinationAwsDatalake {

    /**
     * target aws account id
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aws_account_id")
    private Optional<? extends String> awsAccountId;

    /**
     * The name of the S3 bucket. Read more &lt;a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("bucket_name")
    private String bucketName;

    /**
     * S3 prefix
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bucket_prefix")
    private Optional<? extends String> bucketPrefix;

    /**
     * Choose How to Authenticate to AWS.
     */
    @JsonProperty("credentials")
    private AuthenticationMode credentials;

    @JsonProperty("destinationType")
    private AwsDatalake destinationType;

    /**
     * Format of the data output.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format")
    private Optional<? extends OutputFormatWildcard> format;

    /**
     * Cast float/double as decimal(38,18). This can help achieve higher accuracy and represent numbers correctly as received from the source.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("glue_catalog_float_as_decimal")
    private Optional<? extends Boolean> glueCatalogFloatAsDecimal;

    /**
     * Add a default tag key to databases created by this destination
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lakeformation_database_default_tag_key")
    private Optional<? extends String> lakeformationDatabaseDefaultTagKey;

    /**
     * Add default values for the `Tag Key` to databases created by this destination. Comma separate for multiple values.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lakeformation_database_default_tag_values")
    private Optional<? extends String> lakeformationDatabaseDefaultTagValues;

    /**
     * The default database this destination will use to create tables in per stream. Can be changed per connection by customizing the namespace.
     */
    @JsonProperty("lakeformation_database_name")
    private String lakeformationDatabaseName;

    /**
     * Whether to create tables as LF governed tables.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lakeformation_governed_tables")
    private Optional<? extends Boolean> lakeformationGovernedTables;

    /**
     * Partition data by cursor fields when a cursor field is a date
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("partitioning")
    private Optional<? extends ChooseHowToPartitionData> partitioning;

    /**
     * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<? extends S3BucketRegion> region;

    public DestinationAwsDatalake(
            @JsonProperty("aws_account_id") Optional<? extends String> awsAccountId,
            @JsonProperty("bucket_name") String bucketName,
            @JsonProperty("bucket_prefix") Optional<? extends String> bucketPrefix,
            @JsonProperty("credentials") AuthenticationMode credentials,
            @JsonProperty("format") Optional<? extends OutputFormatWildcard> format,
            @JsonProperty("glue_catalog_float_as_decimal") Optional<? extends Boolean> glueCatalogFloatAsDecimal,
            @JsonProperty("lakeformation_database_default_tag_key") Optional<? extends String> lakeformationDatabaseDefaultTagKey,
            @JsonProperty("lakeformation_database_default_tag_values") Optional<? extends String> lakeformationDatabaseDefaultTagValues,
            @JsonProperty("lakeformation_database_name") String lakeformationDatabaseName,
            @JsonProperty("lakeformation_governed_tables") Optional<? extends Boolean> lakeformationGovernedTables,
            @JsonProperty("partitioning") Optional<? extends ChooseHowToPartitionData> partitioning,
            @JsonProperty("region") Optional<? extends S3BucketRegion> region) {
        Utils.checkNotNull(awsAccountId, "awsAccountId");
        Utils.checkNotNull(bucketName, "bucketName");
        Utils.checkNotNull(bucketPrefix, "bucketPrefix");
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(format, "format");
        Utils.checkNotNull(glueCatalogFloatAsDecimal, "glueCatalogFloatAsDecimal");
        Utils.checkNotNull(lakeformationDatabaseDefaultTagKey, "lakeformationDatabaseDefaultTagKey");
        Utils.checkNotNull(lakeformationDatabaseDefaultTagValues, "lakeformationDatabaseDefaultTagValues");
        Utils.checkNotNull(lakeformationDatabaseName, "lakeformationDatabaseName");
        Utils.checkNotNull(lakeformationGovernedTables, "lakeformationGovernedTables");
        Utils.checkNotNull(partitioning, "partitioning");
        Utils.checkNotNull(region, "region");
        this.awsAccountId = awsAccountId;
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.credentials = credentials;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.format = format;
        this.glueCatalogFloatAsDecimal = glueCatalogFloatAsDecimal;
        this.lakeformationDatabaseDefaultTagKey = lakeformationDatabaseDefaultTagKey;
        this.lakeformationDatabaseDefaultTagValues = lakeformationDatabaseDefaultTagValues;
        this.lakeformationDatabaseName = lakeformationDatabaseName;
        this.lakeformationGovernedTables = lakeformationGovernedTables;
        this.partitioning = partitioning;
        this.region = region;
    }

    /**
     * target aws account id
     */
    public Optional<? extends String> awsAccountId() {
        return awsAccountId;
    }

    /**
     * The name of the S3 bucket. Read more &lt;a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html"&gt;here&lt;/a&gt;.
     */
    public String bucketName() {
        return bucketName;
    }

    /**
     * S3 prefix
     */
    public Optional<? extends String> bucketPrefix() {
        return bucketPrefix;
    }

    /**
     * Choose How to Authenticate to AWS.
     */
    public AuthenticationMode credentials() {
        return credentials;
    }

    public AwsDatalake destinationType() {
        return destinationType;
    }

    /**
     * Format of the data output.
     */
    public Optional<? extends OutputFormatWildcard> format() {
        return format;
    }

    /**
     * Cast float/double as decimal(38,18). This can help achieve higher accuracy and represent numbers correctly as received from the source.
     */
    public Optional<? extends Boolean> glueCatalogFloatAsDecimal() {
        return glueCatalogFloatAsDecimal;
    }

    /**
     * Add a default tag key to databases created by this destination
     */
    public Optional<? extends String> lakeformationDatabaseDefaultTagKey() {
        return lakeformationDatabaseDefaultTagKey;
    }

    /**
     * Add default values for the `Tag Key` to databases created by this destination. Comma separate for multiple values.
     */
    public Optional<? extends String> lakeformationDatabaseDefaultTagValues() {
        return lakeformationDatabaseDefaultTagValues;
    }

    /**
     * The default database this destination will use to create tables in per stream. Can be changed per connection by customizing the namespace.
     */
    public String lakeformationDatabaseName() {
        return lakeformationDatabaseName;
    }

    /**
     * Whether to create tables as LF governed tables.
     */
    public Optional<? extends Boolean> lakeformationGovernedTables() {
        return lakeformationGovernedTables;
    }

    /**
     * Partition data by cursor fields when a cursor field is a date
     */
    public Optional<? extends ChooseHowToPartitionData> partitioning() {
        return partitioning;
    }

    /**
     * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
     */
    public Optional<? extends S3BucketRegion> region() {
        return region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * target aws account id
     */
    public DestinationAwsDatalake withAwsAccountId(String awsAccountId) {
        Utils.checkNotNull(awsAccountId, "awsAccountId");
        this.awsAccountId = Optional.ofNullable(awsAccountId);
        return this;
    }

    /**
     * target aws account id
     */
    public DestinationAwsDatalake withAwsAccountId(Optional<? extends String> awsAccountId) {
        Utils.checkNotNull(awsAccountId, "awsAccountId");
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * The name of the S3 bucket. Read more &lt;a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html"&gt;here&lt;/a&gt;.
     */
    public DestinationAwsDatalake withBucketName(String bucketName) {
        Utils.checkNotNull(bucketName, "bucketName");
        this.bucketName = bucketName;
        return this;
    }

    /**
     * S3 prefix
     */
    public DestinationAwsDatalake withBucketPrefix(String bucketPrefix) {
        Utils.checkNotNull(bucketPrefix, "bucketPrefix");
        this.bucketPrefix = Optional.ofNullable(bucketPrefix);
        return this;
    }

    /**
     * S3 prefix
     */
    public DestinationAwsDatalake withBucketPrefix(Optional<? extends String> bucketPrefix) {
        Utils.checkNotNull(bucketPrefix, "bucketPrefix");
        this.bucketPrefix = bucketPrefix;
        return this;
    }

    /**
     * Choose How to Authenticate to AWS.
     */
    public DestinationAwsDatalake withCredentials(AuthenticationMode credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Format of the data output.
     */
    public DestinationAwsDatalake withFormat(OutputFormatWildcard format) {
        Utils.checkNotNull(format, "format");
        this.format = Optional.ofNullable(format);
        return this;
    }

    /**
     * Format of the data output.
     */
    public DestinationAwsDatalake withFormat(Optional<? extends OutputFormatWildcard> format) {
        Utils.checkNotNull(format, "format");
        this.format = format;
        return this;
    }

    /**
     * Cast float/double as decimal(38,18). This can help achieve higher accuracy and represent numbers correctly as received from the source.
     */
    public DestinationAwsDatalake withGlueCatalogFloatAsDecimal(boolean glueCatalogFloatAsDecimal) {
        Utils.checkNotNull(glueCatalogFloatAsDecimal, "glueCatalogFloatAsDecimal");
        this.glueCatalogFloatAsDecimal = Optional.ofNullable(glueCatalogFloatAsDecimal);
        return this;
    }

    /**
     * Cast float/double as decimal(38,18). This can help achieve higher accuracy and represent numbers correctly as received from the source.
     */
    public DestinationAwsDatalake withGlueCatalogFloatAsDecimal(Optional<? extends Boolean> glueCatalogFloatAsDecimal) {
        Utils.checkNotNull(glueCatalogFloatAsDecimal, "glueCatalogFloatAsDecimal");
        this.glueCatalogFloatAsDecimal = glueCatalogFloatAsDecimal;
        return this;
    }

    /**
     * Add a default tag key to databases created by this destination
     */
    public DestinationAwsDatalake withLakeformationDatabaseDefaultTagKey(String lakeformationDatabaseDefaultTagKey) {
        Utils.checkNotNull(lakeformationDatabaseDefaultTagKey, "lakeformationDatabaseDefaultTagKey");
        this.lakeformationDatabaseDefaultTagKey = Optional.ofNullable(lakeformationDatabaseDefaultTagKey);
        return this;
    }

    /**
     * Add a default tag key to databases created by this destination
     */
    public DestinationAwsDatalake withLakeformationDatabaseDefaultTagKey(Optional<? extends String> lakeformationDatabaseDefaultTagKey) {
        Utils.checkNotNull(lakeformationDatabaseDefaultTagKey, "lakeformationDatabaseDefaultTagKey");
        this.lakeformationDatabaseDefaultTagKey = lakeformationDatabaseDefaultTagKey;
        return this;
    }

    /**
     * Add default values for the `Tag Key` to databases created by this destination. Comma separate for multiple values.
     */
    public DestinationAwsDatalake withLakeformationDatabaseDefaultTagValues(String lakeformationDatabaseDefaultTagValues) {
        Utils.checkNotNull(lakeformationDatabaseDefaultTagValues, "lakeformationDatabaseDefaultTagValues");
        this.lakeformationDatabaseDefaultTagValues = Optional.ofNullable(lakeformationDatabaseDefaultTagValues);
        return this;
    }

    /**
     * Add default values for the `Tag Key` to databases created by this destination. Comma separate for multiple values.
     */
    public DestinationAwsDatalake withLakeformationDatabaseDefaultTagValues(Optional<? extends String> lakeformationDatabaseDefaultTagValues) {
        Utils.checkNotNull(lakeformationDatabaseDefaultTagValues, "lakeformationDatabaseDefaultTagValues");
        this.lakeformationDatabaseDefaultTagValues = lakeformationDatabaseDefaultTagValues;
        return this;
    }

    /**
     * The default database this destination will use to create tables in per stream. Can be changed per connection by customizing the namespace.
     */
    public DestinationAwsDatalake withLakeformationDatabaseName(String lakeformationDatabaseName) {
        Utils.checkNotNull(lakeformationDatabaseName, "lakeformationDatabaseName");
        this.lakeformationDatabaseName = lakeformationDatabaseName;
        return this;
    }

    /**
     * Whether to create tables as LF governed tables.
     */
    public DestinationAwsDatalake withLakeformationGovernedTables(boolean lakeformationGovernedTables) {
        Utils.checkNotNull(lakeformationGovernedTables, "lakeformationGovernedTables");
        this.lakeformationGovernedTables = Optional.ofNullable(lakeformationGovernedTables);
        return this;
    }

    /**
     * Whether to create tables as LF governed tables.
     */
    public DestinationAwsDatalake withLakeformationGovernedTables(Optional<? extends Boolean> lakeformationGovernedTables) {
        Utils.checkNotNull(lakeformationGovernedTables, "lakeformationGovernedTables");
        this.lakeformationGovernedTables = lakeformationGovernedTables;
        return this;
    }

    /**
     * Partition data by cursor fields when a cursor field is a date
     */
    public DestinationAwsDatalake withPartitioning(ChooseHowToPartitionData partitioning) {
        Utils.checkNotNull(partitioning, "partitioning");
        this.partitioning = Optional.ofNullable(partitioning);
        return this;
    }

    /**
     * Partition data by cursor fields when a cursor field is a date
     */
    public DestinationAwsDatalake withPartitioning(Optional<? extends ChooseHowToPartitionData> partitioning) {
        Utils.checkNotNull(partitioning, "partitioning");
        this.partitioning = partitioning;
        return this;
    }

    /**
     * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
     */
    public DestinationAwsDatalake withRegion(S3BucketRegion region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    /**
     * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
     */
    public DestinationAwsDatalake withRegion(Optional<? extends S3BucketRegion> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
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
        DestinationAwsDatalake other = (DestinationAwsDatalake) o;
        return 
            java.util.Objects.deepEquals(this.awsAccountId, other.awsAccountId) &&
            java.util.Objects.deepEquals(this.bucketName, other.bucketName) &&
            java.util.Objects.deepEquals(this.bucketPrefix, other.bucketPrefix) &&
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.format, other.format) &&
            java.util.Objects.deepEquals(this.glueCatalogFloatAsDecimal, other.glueCatalogFloatAsDecimal) &&
            java.util.Objects.deepEquals(this.lakeformationDatabaseDefaultTagKey, other.lakeformationDatabaseDefaultTagKey) &&
            java.util.Objects.deepEquals(this.lakeformationDatabaseDefaultTagValues, other.lakeformationDatabaseDefaultTagValues) &&
            java.util.Objects.deepEquals(this.lakeformationDatabaseName, other.lakeformationDatabaseName) &&
            java.util.Objects.deepEquals(this.lakeformationGovernedTables, other.lakeformationGovernedTables) &&
            java.util.Objects.deepEquals(this.partitioning, other.partitioning) &&
            java.util.Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            awsAccountId,
            bucketName,
            bucketPrefix,
            credentials,
            destinationType,
            format,
            glueCatalogFloatAsDecimal,
            lakeformationDatabaseDefaultTagKey,
            lakeformationDatabaseDefaultTagValues,
            lakeformationDatabaseName,
            lakeformationGovernedTables,
            partitioning,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationAwsDatalake.class,
                "awsAccountId", awsAccountId,
                "bucketName", bucketName,
                "bucketPrefix", bucketPrefix,
                "credentials", credentials,
                "destinationType", destinationType,
                "format", format,
                "glueCatalogFloatAsDecimal", glueCatalogFloatAsDecimal,
                "lakeformationDatabaseDefaultTagKey", lakeformationDatabaseDefaultTagKey,
                "lakeformationDatabaseDefaultTagValues", lakeformationDatabaseDefaultTagValues,
                "lakeformationDatabaseName", lakeformationDatabaseName,
                "lakeformationGovernedTables", lakeformationGovernedTables,
                "partitioning", partitioning,
                "region", region);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> awsAccountId = Optional.empty();
 
        private String bucketName;
 
        private Optional<? extends String> bucketPrefix = Optional.empty();
 
        private AuthenticationMode credentials;
 
        private Optional<? extends OutputFormatWildcard> format = Optional.empty();
 
        private Optional<? extends Boolean> glueCatalogFloatAsDecimal;
 
        private Optional<? extends String> lakeformationDatabaseDefaultTagKey = Optional.empty();
 
        private Optional<? extends String> lakeformationDatabaseDefaultTagValues = Optional.empty();
 
        private String lakeformationDatabaseName;
 
        private Optional<? extends Boolean> lakeformationGovernedTables;
 
        private Optional<? extends ChooseHowToPartitionData> partitioning;
 
        private Optional<? extends S3BucketRegion> region;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * target aws account id
         */
        public Builder awsAccountId(String awsAccountId) {
            Utils.checkNotNull(awsAccountId, "awsAccountId");
            this.awsAccountId = Optional.ofNullable(awsAccountId);
            return this;
        }

        /**
         * target aws account id
         */
        public Builder awsAccountId(Optional<? extends String> awsAccountId) {
            Utils.checkNotNull(awsAccountId, "awsAccountId");
            this.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * The name of the S3 bucket. Read more &lt;a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html"&gt;here&lt;/a&gt;.
         */
        public Builder bucketName(String bucketName) {
            Utils.checkNotNull(bucketName, "bucketName");
            this.bucketName = bucketName;
            return this;
        }

        /**
         * S3 prefix
         */
        public Builder bucketPrefix(String bucketPrefix) {
            Utils.checkNotNull(bucketPrefix, "bucketPrefix");
            this.bucketPrefix = Optional.ofNullable(bucketPrefix);
            return this;
        }

        /**
         * S3 prefix
         */
        public Builder bucketPrefix(Optional<? extends String> bucketPrefix) {
            Utils.checkNotNull(bucketPrefix, "bucketPrefix");
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * Choose How to Authenticate to AWS.
         */
        public Builder credentials(AuthenticationMode credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Format of the data output.
         */
        public Builder format(OutputFormatWildcard format) {
            Utils.checkNotNull(format, "format");
            this.format = Optional.ofNullable(format);
            return this;
        }

        /**
         * Format of the data output.
         */
        public Builder format(Optional<? extends OutputFormatWildcard> format) {
            Utils.checkNotNull(format, "format");
            this.format = format;
            return this;
        }

        /**
         * Cast float/double as decimal(38,18). This can help achieve higher accuracy and represent numbers correctly as received from the source.
         */
        public Builder glueCatalogFloatAsDecimal(boolean glueCatalogFloatAsDecimal) {
            Utils.checkNotNull(glueCatalogFloatAsDecimal, "glueCatalogFloatAsDecimal");
            this.glueCatalogFloatAsDecimal = Optional.ofNullable(glueCatalogFloatAsDecimal);
            return this;
        }

        /**
         * Cast float/double as decimal(38,18). This can help achieve higher accuracy and represent numbers correctly as received from the source.
         */
        public Builder glueCatalogFloatAsDecimal(Optional<? extends Boolean> glueCatalogFloatAsDecimal) {
            Utils.checkNotNull(glueCatalogFloatAsDecimal, "glueCatalogFloatAsDecimal");
            this.glueCatalogFloatAsDecimal = glueCatalogFloatAsDecimal;
            return this;
        }

        /**
         * Add a default tag key to databases created by this destination
         */
        public Builder lakeformationDatabaseDefaultTagKey(String lakeformationDatabaseDefaultTagKey) {
            Utils.checkNotNull(lakeformationDatabaseDefaultTagKey, "lakeformationDatabaseDefaultTagKey");
            this.lakeformationDatabaseDefaultTagKey = Optional.ofNullable(lakeformationDatabaseDefaultTagKey);
            return this;
        }

        /**
         * Add a default tag key to databases created by this destination
         */
        public Builder lakeformationDatabaseDefaultTagKey(Optional<? extends String> lakeformationDatabaseDefaultTagKey) {
            Utils.checkNotNull(lakeformationDatabaseDefaultTagKey, "lakeformationDatabaseDefaultTagKey");
            this.lakeformationDatabaseDefaultTagKey = lakeformationDatabaseDefaultTagKey;
            return this;
        }

        /**
         * Add default values for the `Tag Key` to databases created by this destination. Comma separate for multiple values.
         */
        public Builder lakeformationDatabaseDefaultTagValues(String lakeformationDatabaseDefaultTagValues) {
            Utils.checkNotNull(lakeformationDatabaseDefaultTagValues, "lakeformationDatabaseDefaultTagValues");
            this.lakeformationDatabaseDefaultTagValues = Optional.ofNullable(lakeformationDatabaseDefaultTagValues);
            return this;
        }

        /**
         * Add default values for the `Tag Key` to databases created by this destination. Comma separate for multiple values.
         */
        public Builder lakeformationDatabaseDefaultTagValues(Optional<? extends String> lakeformationDatabaseDefaultTagValues) {
            Utils.checkNotNull(lakeformationDatabaseDefaultTagValues, "lakeformationDatabaseDefaultTagValues");
            this.lakeformationDatabaseDefaultTagValues = lakeformationDatabaseDefaultTagValues;
            return this;
        }

        /**
         * The default database this destination will use to create tables in per stream. Can be changed per connection by customizing the namespace.
         */
        public Builder lakeformationDatabaseName(String lakeformationDatabaseName) {
            Utils.checkNotNull(lakeformationDatabaseName, "lakeformationDatabaseName");
            this.lakeformationDatabaseName = lakeformationDatabaseName;
            return this;
        }

        /**
         * Whether to create tables as LF governed tables.
         */
        public Builder lakeformationGovernedTables(boolean lakeformationGovernedTables) {
            Utils.checkNotNull(lakeformationGovernedTables, "lakeformationGovernedTables");
            this.lakeformationGovernedTables = Optional.ofNullable(lakeformationGovernedTables);
            return this;
        }

        /**
         * Whether to create tables as LF governed tables.
         */
        public Builder lakeformationGovernedTables(Optional<? extends Boolean> lakeformationGovernedTables) {
            Utils.checkNotNull(lakeformationGovernedTables, "lakeformationGovernedTables");
            this.lakeformationGovernedTables = lakeformationGovernedTables;
            return this;
        }

        /**
         * Partition data by cursor fields when a cursor field is a date
         */
        public Builder partitioning(ChooseHowToPartitionData partitioning) {
            Utils.checkNotNull(partitioning, "partitioning");
            this.partitioning = Optional.ofNullable(partitioning);
            return this;
        }

        /**
         * Partition data by cursor fields when a cursor field is a date
         */
        public Builder partitioning(Optional<? extends ChooseHowToPartitionData> partitioning) {
            Utils.checkNotNull(partitioning, "partitioning");
            this.partitioning = partitioning;
            return this;
        }

        /**
         * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
         */
        public Builder region(S3BucketRegion region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        /**
         * The region of the S3 bucket. See &lt;a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"&gt;here&lt;/a&gt; for all region codes.
         */
        public Builder region(Optional<? extends S3BucketRegion> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public DestinationAwsDatalake build() {
            if (glueCatalogFloatAsDecimal == null) {
                glueCatalogFloatAsDecimal = _SINGLETON_VALUE_GlueCatalogFloatAsDecimal.value();
            }
            if (lakeformationGovernedTables == null) {
                lakeformationGovernedTables = _SINGLETON_VALUE_LakeformationGovernedTables.value();
            }
            if (partitioning == null) {
                partitioning = _SINGLETON_VALUE_Partitioning.value();
            }
            if (region == null) {
                region = _SINGLETON_VALUE_Region.value();
            }
            return new DestinationAwsDatalake(
                awsAccountId,
                bucketName,
                bucketPrefix,
                credentials,
                format,
                glueCatalogFloatAsDecimal,
                lakeformationDatabaseDefaultTagKey,
                lakeformationDatabaseDefaultTagValues,
                lakeformationDatabaseName,
                lakeformationGovernedTables,
                partitioning,
                region);
        }

        private static final LazySingletonValue<AwsDatalake> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"aws-datalake\"",
                        new TypeReference<AwsDatalake>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_GlueCatalogFloatAsDecimal =
                new LazySingletonValue<>(
                        "glue_catalog_float_as_decimal",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_LakeformationGovernedTables =
                new LazySingletonValue<>(
                        "lakeformation_governed_tables",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends ChooseHowToPartitionData>> _SINGLETON_VALUE_Partitioning =
                new LazySingletonValue<>(
                        "partitioning",
                        "\"NO PARTITIONING\"",
                        new TypeReference<Optional<? extends ChooseHowToPartitionData>>() {});

        private static final LazySingletonValue<Optional<? extends S3BucketRegion>> _SINGLETON_VALUE_Region =
                new LazySingletonValue<>(
                        "region",
                        "\"\"",
                        new TypeReference<Optional<? extends S3BucketRegion>>() {});
    }
}

