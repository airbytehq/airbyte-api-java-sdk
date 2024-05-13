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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * SourceAzureBlobStorage - NOTE: When this Spec is changed, legacy_config_transformer.py must also be modified to uptake the changes
 * because it is responsible for converting legacy Azure Blob Storage v0 configs into v1 configs using the File-Based CDK.
 */

public class SourceAzureBlobStorage {

    /**
     * The account's name of the Azure Blob Storage.
     */
    @JsonProperty("azure_blob_storage_account_name")
    private String azureBlobStorageAccountName;

    /**
     * The name of the Azure blob storage container.
     */
    @JsonProperty("azure_blob_storage_container_name")
    private String azureBlobStorageContainerName;

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_endpoint")
    private Optional<? extends String> azureBlobStorageEndpoint;

    /**
     * Credentials for connecting to the Azure Blob Storage
     */
    @JsonProperty("credentials")
    private SourceAzureBlobStorageAuthentication credentials;

    @JsonProperty("sourceType")
    private SourceAzureBlobStorageAzureBlobStorage sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends OffsetDateTime> startDate;

    /**
     * Each instance of this configuration defines a &lt;a href="https://docs.airbyte.com/cloud/core-concepts#stream"&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
     */
    @JsonProperty("streams")
    private java.util.List<FileBasedStreamConfig> streams;

    @JsonCreator
    public SourceAzureBlobStorage(
            @JsonProperty("azure_blob_storage_account_name") String azureBlobStorageAccountName,
            @JsonProperty("azure_blob_storage_container_name") String azureBlobStorageContainerName,
            @JsonProperty("azure_blob_storage_endpoint") Optional<? extends String> azureBlobStorageEndpoint,
            @JsonProperty("credentials") SourceAzureBlobStorageAuthentication credentials,
            @JsonProperty("start_date") Optional<? extends OffsetDateTime> startDate,
            @JsonProperty("streams") java.util.List<FileBasedStreamConfig> streams) {
        Utils.checkNotNull(azureBlobStorageAccountName, "azureBlobStorageAccountName");
        Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
        Utils.checkNotNull(azureBlobStorageEndpoint, "azureBlobStorageEndpoint");
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(streams, "streams");
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        this.azureBlobStorageEndpoint = azureBlobStorageEndpoint;
        this.credentials = credentials;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.streams = streams;
    }
    
    public SourceAzureBlobStorage(
            String azureBlobStorageAccountName,
            String azureBlobStorageContainerName,
            SourceAzureBlobStorageAuthentication credentials,
            java.util.List<FileBasedStreamConfig> streams) {
        this(azureBlobStorageAccountName, azureBlobStorageContainerName, Optional.empty(), credentials, Optional.empty(), streams);
    }

    /**
     * The account's name of the Azure Blob Storage.
     */
    @JsonIgnore
    public String azureBlobStorageAccountName() {
        return azureBlobStorageAccountName;
    }

    /**
     * The name of the Azure blob storage container.
     */
    @JsonIgnore
    public String azureBlobStorageContainerName() {
        return azureBlobStorageContainerName;
    }

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> azureBlobStorageEndpoint() {
        return (Optional<String>) azureBlobStorageEndpoint;
    }

    /**
     * Credentials for connecting to the Azure Blob Storage
     */
    @JsonIgnore
    public SourceAzureBlobStorageAuthentication credentials() {
        return credentials;
    }

    @JsonIgnore
    public SourceAzureBlobStorageAzureBlobStorage sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return (Optional<OffsetDateTime>) startDate;
    }

    /**
     * Each instance of this configuration defines a &lt;a href="https://docs.airbyte.com/cloud/core-concepts#stream"&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
     */
    @JsonIgnore
    public java.util.List<FileBasedStreamConfig> streams() {
        return streams;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account's name of the Azure Blob Storage.
     */
    public SourceAzureBlobStorage withAzureBlobStorageAccountName(String azureBlobStorageAccountName) {
        Utils.checkNotNull(azureBlobStorageAccountName, "azureBlobStorageAccountName");
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        return this;
    }

    /**
     * The name of the Azure blob storage container.
     */
    public SourceAzureBlobStorage withAzureBlobStorageContainerName(String azureBlobStorageContainerName) {
        Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        return this;
    }

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    public SourceAzureBlobStorage withAzureBlobStorageEndpoint(String azureBlobStorageEndpoint) {
        Utils.checkNotNull(azureBlobStorageEndpoint, "azureBlobStorageEndpoint");
        this.azureBlobStorageEndpoint = Optional.ofNullable(azureBlobStorageEndpoint);
        return this;
    }

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    public SourceAzureBlobStorage withAzureBlobStorageEndpoint(Optional<? extends String> azureBlobStorageEndpoint) {
        Utils.checkNotNull(azureBlobStorageEndpoint, "azureBlobStorageEndpoint");
        this.azureBlobStorageEndpoint = azureBlobStorageEndpoint;
        return this;
    }

    /**
     * Credentials for connecting to the Azure Blob Storage
     */
    public SourceAzureBlobStorage withCredentials(SourceAzureBlobStorageAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    public SourceAzureBlobStorage withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    public SourceAzureBlobStorage withStartDate(Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Each instance of this configuration defines a &lt;a href="https://docs.airbyte.com/cloud/core-concepts#stream"&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
     */
    public SourceAzureBlobStorage withStreams(java.util.List<FileBasedStreamConfig> streams) {
        Utils.checkNotNull(streams, "streams");
        this.streams = streams;
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
        SourceAzureBlobStorage other = (SourceAzureBlobStorage) o;
        return 
            java.util.Objects.deepEquals(this.azureBlobStorageAccountName, other.azureBlobStorageAccountName) &&
            java.util.Objects.deepEquals(this.azureBlobStorageContainerName, other.azureBlobStorageContainerName) &&
            java.util.Objects.deepEquals(this.azureBlobStorageEndpoint, other.azureBlobStorageEndpoint) &&
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.streams, other.streams);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            azureBlobStorageAccountName,
            azureBlobStorageContainerName,
            azureBlobStorageEndpoint,
            credentials,
            sourceType,
            startDate,
            streams);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAzureBlobStorage.class,
                "azureBlobStorageAccountName", azureBlobStorageAccountName,
                "azureBlobStorageContainerName", azureBlobStorageContainerName,
                "azureBlobStorageEndpoint", azureBlobStorageEndpoint,
                "credentials", credentials,
                "sourceType", sourceType,
                "startDate", startDate,
                "streams", streams);
    }
    
    public final static class Builder {
 
        private String azureBlobStorageAccountName;
 
        private String azureBlobStorageContainerName;
 
        private Optional<? extends String> azureBlobStorageEndpoint = Optional.empty();
 
        private SourceAzureBlobStorageAuthentication credentials;
 
        private Optional<? extends OffsetDateTime> startDate = Optional.empty();
 
        private java.util.List<FileBasedStreamConfig> streams;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The account's name of the Azure Blob Storage.
         */
        public Builder azureBlobStorageAccountName(String azureBlobStorageAccountName) {
            Utils.checkNotNull(azureBlobStorageAccountName, "azureBlobStorageAccountName");
            this.azureBlobStorageAccountName = azureBlobStorageAccountName;
            return this;
        }

        /**
         * The name of the Azure blob storage container.
         */
        public Builder azureBlobStorageContainerName(String azureBlobStorageContainerName) {
            Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
            this.azureBlobStorageContainerName = azureBlobStorageContainerName;
            return this;
        }

        /**
         * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
         */
        public Builder azureBlobStorageEndpoint(String azureBlobStorageEndpoint) {
            Utils.checkNotNull(azureBlobStorageEndpoint, "azureBlobStorageEndpoint");
            this.azureBlobStorageEndpoint = Optional.ofNullable(azureBlobStorageEndpoint);
            return this;
        }

        /**
         * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
         */
        public Builder azureBlobStorageEndpoint(Optional<? extends String> azureBlobStorageEndpoint) {
            Utils.checkNotNull(azureBlobStorageEndpoint, "azureBlobStorageEndpoint");
            this.azureBlobStorageEndpoint = azureBlobStorageEndpoint;
            return this;
        }

        /**
         * Credentials for connecting to the Azure Blob Storage
         */
        public Builder credentials(SourceAzureBlobStorageAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
         */
        public Builder startDate(Optional<? extends OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Each instance of this configuration defines a &lt;a href="https://docs.airbyte.com/cloud/core-concepts#stream"&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
         */
        public Builder streams(java.util.List<FileBasedStreamConfig> streams) {
            Utils.checkNotNull(streams, "streams");
            this.streams = streams;
            return this;
        }
        
        public SourceAzureBlobStorage build() {
            return new SourceAzureBlobStorage(
                azureBlobStorageAccountName,
                azureBlobStorageContainerName,
                azureBlobStorageEndpoint,
                credentials,
                startDate,
                streams);
        }

        private static final LazySingletonValue<SourceAzureBlobStorageAzureBlobStorage> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"azure-blob-storage\"",
                        new TypeReference<SourceAzureBlobStorageAzureBlobStorage>() {});
    }
}

