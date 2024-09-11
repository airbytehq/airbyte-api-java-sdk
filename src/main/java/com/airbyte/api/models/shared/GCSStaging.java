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
/**
 * GCSStaging - Writes large batches of records to a file, uploads the file to GCS, then uses COPY INTO to load your data into BigQuery.
 */

public class GCSStaging {

    /**
     * An HMAC key is a type of credential and can be associated with a service account or a user account in Cloud Storage. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("credential")
    private Credential credential;

    /**
     * The name of the GCS bucket. Read more &lt;a href="https://cloud.google.com/storage/docs/naming-buckets"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("gcs_bucket_name")
    private String gcsBucketName;

    /**
     * Directory under the GCS bucket where data will be written.
     */
    @JsonProperty("gcs_bucket_path")
    private String gcsBucketPath;

    /**
     * This upload method is supposed to temporary store records in GCS bucket. By this select you can chose if these records should be removed from GCS when migration has finished. The default "Delete all tmp files from GCS" value is used if not set explicitly.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keep_files_in_gcs-bucket")
    private Optional<? extends GCSTmpFilesAfterwardProcessing> keepFilesInGcsBucket;

    @JsonProperty("method")
    private DestinationBigqueryMethod method;

    @JsonCreator
    public GCSStaging(
            @JsonProperty("credential") Credential credential,
            @JsonProperty("gcs_bucket_name") String gcsBucketName,
            @JsonProperty("gcs_bucket_path") String gcsBucketPath,
            @JsonProperty("keep_files_in_gcs-bucket") Optional<? extends GCSTmpFilesAfterwardProcessing> keepFilesInGcsBucket) {
        Utils.checkNotNull(credential, "credential");
        Utils.checkNotNull(gcsBucketName, "gcsBucketName");
        Utils.checkNotNull(gcsBucketPath, "gcsBucketPath");
        Utils.checkNotNull(keepFilesInGcsBucket, "keepFilesInGcsBucket");
        this.credential = credential;
        this.gcsBucketName = gcsBucketName;
        this.gcsBucketPath = gcsBucketPath;
        this.keepFilesInGcsBucket = keepFilesInGcsBucket;
        this.method = Builder._SINGLETON_VALUE_Method.value();
    }
    
    public GCSStaging(
            Credential credential,
            String gcsBucketName,
            String gcsBucketPath) {
        this(credential, gcsBucketName, gcsBucketPath, Optional.empty());
    }

    /**
     * An HMAC key is a type of credential and can be associated with a service account or a user account in Cloud Storage. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public Credential credential() {
        return credential;
    }

    /**
     * The name of the GCS bucket. Read more &lt;a href="https://cloud.google.com/storage/docs/naming-buckets"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String gcsBucketName() {
        return gcsBucketName;
    }

    /**
     * Directory under the GCS bucket where data will be written.
     */
    @JsonIgnore
    public String gcsBucketPath() {
        return gcsBucketPath;
    }

    /**
     * This upload method is supposed to temporary store records in GCS bucket. By this select you can chose if these records should be removed from GCS when migration has finished. The default "Delete all tmp files from GCS" value is used if not set explicitly.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GCSTmpFilesAfterwardProcessing> keepFilesInGcsBucket() {
        return (Optional<GCSTmpFilesAfterwardProcessing>) keepFilesInGcsBucket;
    }

    @JsonIgnore
    public DestinationBigqueryMethod method() {
        return method;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An HMAC key is a type of credential and can be associated with a service account or a user account in Cloud Storage. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys"&gt;here&lt;/a&gt;.
     */
    public GCSStaging withCredential(Credential credential) {
        Utils.checkNotNull(credential, "credential");
        this.credential = credential;
        return this;
    }

    /**
     * The name of the GCS bucket. Read more &lt;a href="https://cloud.google.com/storage/docs/naming-buckets"&gt;here&lt;/a&gt;.
     */
    public GCSStaging withGcsBucketName(String gcsBucketName) {
        Utils.checkNotNull(gcsBucketName, "gcsBucketName");
        this.gcsBucketName = gcsBucketName;
        return this;
    }

    /**
     * Directory under the GCS bucket where data will be written.
     */
    public GCSStaging withGcsBucketPath(String gcsBucketPath) {
        Utils.checkNotNull(gcsBucketPath, "gcsBucketPath");
        this.gcsBucketPath = gcsBucketPath;
        return this;
    }

    /**
     * This upload method is supposed to temporary store records in GCS bucket. By this select you can chose if these records should be removed from GCS when migration has finished. The default "Delete all tmp files from GCS" value is used if not set explicitly.
     */
    public GCSStaging withKeepFilesInGcsBucket(GCSTmpFilesAfterwardProcessing keepFilesInGcsBucket) {
        Utils.checkNotNull(keepFilesInGcsBucket, "keepFilesInGcsBucket");
        this.keepFilesInGcsBucket = Optional.ofNullable(keepFilesInGcsBucket);
        return this;
    }

    /**
     * This upload method is supposed to temporary store records in GCS bucket. By this select you can chose if these records should be removed from GCS when migration has finished. The default "Delete all tmp files from GCS" value is used if not set explicitly.
     */
    public GCSStaging withKeepFilesInGcsBucket(Optional<? extends GCSTmpFilesAfterwardProcessing> keepFilesInGcsBucket) {
        Utils.checkNotNull(keepFilesInGcsBucket, "keepFilesInGcsBucket");
        this.keepFilesInGcsBucket = keepFilesInGcsBucket;
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
        GCSStaging other = (GCSStaging) o;
        return 
            java.util.Objects.deepEquals(this.credential, other.credential) &&
            java.util.Objects.deepEquals(this.gcsBucketName, other.gcsBucketName) &&
            java.util.Objects.deepEquals(this.gcsBucketPath, other.gcsBucketPath) &&
            java.util.Objects.deepEquals(this.keepFilesInGcsBucket, other.keepFilesInGcsBucket) &&
            java.util.Objects.deepEquals(this.method, other.method);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credential,
            gcsBucketName,
            gcsBucketPath,
            keepFilesInGcsBucket,
            method);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GCSStaging.class,
                "credential", credential,
                "gcsBucketName", gcsBucketName,
                "gcsBucketPath", gcsBucketPath,
                "keepFilesInGcsBucket", keepFilesInGcsBucket,
                "method", method);
    }
    
    public final static class Builder {
 
        private Credential credential;
 
        private String gcsBucketName;
 
        private String gcsBucketPath;
 
        private Optional<? extends GCSTmpFilesAfterwardProcessing> keepFilesInGcsBucket;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An HMAC key is a type of credential and can be associated with a service account or a user account in Cloud Storage. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys"&gt;here&lt;/a&gt;.
         */
        public Builder credential(Credential credential) {
            Utils.checkNotNull(credential, "credential");
            this.credential = credential;
            return this;
        }

        /**
         * The name of the GCS bucket. Read more &lt;a href="https://cloud.google.com/storage/docs/naming-buckets"&gt;here&lt;/a&gt;.
         */
        public Builder gcsBucketName(String gcsBucketName) {
            Utils.checkNotNull(gcsBucketName, "gcsBucketName");
            this.gcsBucketName = gcsBucketName;
            return this;
        }

        /**
         * Directory under the GCS bucket where data will be written.
         */
        public Builder gcsBucketPath(String gcsBucketPath) {
            Utils.checkNotNull(gcsBucketPath, "gcsBucketPath");
            this.gcsBucketPath = gcsBucketPath;
            return this;
        }

        /**
         * This upload method is supposed to temporary store records in GCS bucket. By this select you can chose if these records should be removed from GCS when migration has finished. The default "Delete all tmp files from GCS" value is used if not set explicitly.
         */
        public Builder keepFilesInGcsBucket(GCSTmpFilesAfterwardProcessing keepFilesInGcsBucket) {
            Utils.checkNotNull(keepFilesInGcsBucket, "keepFilesInGcsBucket");
            this.keepFilesInGcsBucket = Optional.ofNullable(keepFilesInGcsBucket);
            return this;
        }

        /**
         * This upload method is supposed to temporary store records in GCS bucket. By this select you can chose if these records should be removed from GCS when migration has finished. The default "Delete all tmp files from GCS" value is used if not set explicitly.
         */
        public Builder keepFilesInGcsBucket(Optional<? extends GCSTmpFilesAfterwardProcessing> keepFilesInGcsBucket) {
            Utils.checkNotNull(keepFilesInGcsBucket, "keepFilesInGcsBucket");
            this.keepFilesInGcsBucket = keepFilesInGcsBucket;
            return this;
        }
        
        public GCSStaging build() {
            if (keepFilesInGcsBucket == null) {
                keepFilesInGcsBucket = _SINGLETON_VALUE_KeepFilesInGcsBucket.value();
            }
            return new GCSStaging(
                credential,
                gcsBucketName,
                gcsBucketPath,
                keepFilesInGcsBucket);
        }

        private static final LazySingletonValue<Optional<? extends GCSTmpFilesAfterwardProcessing>> _SINGLETON_VALUE_KeepFilesInGcsBucket =
                new LazySingletonValue<>(
                        "keep_files_in_gcs-bucket",
                        "\"Delete all tmp files from GCS\"",
                        new TypeReference<Optional<? extends GCSTmpFilesAfterwardProcessing>>() {});

        private static final LazySingletonValue<DestinationBigqueryMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"GCS Staging\"",
                        new TypeReference<DestinationBigqueryMethod>() {});
    }
}

