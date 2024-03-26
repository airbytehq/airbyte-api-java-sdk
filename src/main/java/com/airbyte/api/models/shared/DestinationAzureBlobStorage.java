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


public class DestinationAzureBlobStorage {

    /**
     * The Azure blob storage account key.
     */
    @JsonProperty("azure_blob_storage_account_key")
    private String azureBlobStorageAccountKey;

    /**
     * The account's name of the Azure Blob Storage.
     */
    @JsonProperty("azure_blob_storage_account_name")
    private String azureBlobStorageAccountName;

    /**
     * The name of the Azure blob storage container. If not exists - will be created automatically. May be empty, then will be created automatically airbytecontainer+timestamp
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_container_name")
    private Optional<? extends String> azureBlobStorageContainerName;

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_endpoint_domain_name")
    private Optional<? extends String> azureBlobStorageEndpointDomainName;

    /**
     * The amount of megabytes to buffer for the output stream to Azure. This will impact memory footprint on workers, but may need adjustment for performance and appropriate block size in Azure.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_output_buffer_size")
    private Optional<? extends Long> azureBlobStorageOutputBufferSize;

    /**
     * The amount of megabytes after which the connector should spill the records in a new blob object. Make sure to configure size greater than individual records. Enter 0 if not applicable
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_spill_size")
    private Optional<? extends Long> azureBlobStorageSpillSize;

    @JsonProperty("destinationType")
    private AzureBlobStorage destinationType;

    /**
     * Output data format
     */
    @JsonProperty("format")
    private OutputFormat format;

    public DestinationAzureBlobStorage(
            @JsonProperty("azure_blob_storage_account_key") String azureBlobStorageAccountKey,
            @JsonProperty("azure_blob_storage_account_name") String azureBlobStorageAccountName,
            @JsonProperty("azure_blob_storage_container_name") Optional<? extends String> azureBlobStorageContainerName,
            @JsonProperty("azure_blob_storage_endpoint_domain_name") Optional<? extends String> azureBlobStorageEndpointDomainName,
            @JsonProperty("azure_blob_storage_output_buffer_size") Optional<? extends Long> azureBlobStorageOutputBufferSize,
            @JsonProperty("azure_blob_storage_spill_size") Optional<? extends Long> azureBlobStorageSpillSize,
            @JsonProperty("format") OutputFormat format) {
        Utils.checkNotNull(azureBlobStorageAccountKey, "azureBlobStorageAccountKey");
        Utils.checkNotNull(azureBlobStorageAccountName, "azureBlobStorageAccountName");
        Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
        Utils.checkNotNull(azureBlobStorageEndpointDomainName, "azureBlobStorageEndpointDomainName");
        Utils.checkNotNull(azureBlobStorageOutputBufferSize, "azureBlobStorageOutputBufferSize");
        Utils.checkNotNull(azureBlobStorageSpillSize, "azureBlobStorageSpillSize");
        Utils.checkNotNull(format, "format");
        this.azureBlobStorageAccountKey = azureBlobStorageAccountKey;
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        this.azureBlobStorageEndpointDomainName = azureBlobStorageEndpointDomainName;
        this.azureBlobStorageOutputBufferSize = azureBlobStorageOutputBufferSize;
        this.azureBlobStorageSpillSize = azureBlobStorageSpillSize;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.format = format;
    }

    /**
     * The Azure blob storage account key.
     */
    public String azureBlobStorageAccountKey() {
        return azureBlobStorageAccountKey;
    }

    /**
     * The account's name of the Azure Blob Storage.
     */
    public String azureBlobStorageAccountName() {
        return azureBlobStorageAccountName;
    }

    /**
     * The name of the Azure blob storage container. If not exists - will be created automatically. May be empty, then will be created automatically airbytecontainer+timestamp
     */
    public Optional<? extends String> azureBlobStorageContainerName() {
        return azureBlobStorageContainerName;
    }

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    public Optional<? extends String> azureBlobStorageEndpointDomainName() {
        return azureBlobStorageEndpointDomainName;
    }

    /**
     * The amount of megabytes to buffer for the output stream to Azure. This will impact memory footprint on workers, but may need adjustment for performance and appropriate block size in Azure.
     */
    public Optional<? extends Long> azureBlobStorageOutputBufferSize() {
        return azureBlobStorageOutputBufferSize;
    }

    /**
     * The amount of megabytes after which the connector should spill the records in a new blob object. Make sure to configure size greater than individual records. Enter 0 if not applicable
     */
    public Optional<? extends Long> azureBlobStorageSpillSize() {
        return azureBlobStorageSpillSize;
    }

    public AzureBlobStorage destinationType() {
        return destinationType;
    }

    /**
     * Output data format
     */
    public OutputFormat format() {
        return format;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Azure blob storage account key.
     */
    public DestinationAzureBlobStorage withAzureBlobStorageAccountKey(String azureBlobStorageAccountKey) {
        Utils.checkNotNull(azureBlobStorageAccountKey, "azureBlobStorageAccountKey");
        this.azureBlobStorageAccountKey = azureBlobStorageAccountKey;
        return this;
    }

    /**
     * The account's name of the Azure Blob Storage.
     */
    public DestinationAzureBlobStorage withAzureBlobStorageAccountName(String azureBlobStorageAccountName) {
        Utils.checkNotNull(azureBlobStorageAccountName, "azureBlobStorageAccountName");
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        return this;
    }

    /**
     * The name of the Azure blob storage container. If not exists - will be created automatically. May be empty, then will be created automatically airbytecontainer+timestamp
     */
    public DestinationAzureBlobStorage withAzureBlobStorageContainerName(String azureBlobStorageContainerName) {
        Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
        this.azureBlobStorageContainerName = Optional.ofNullable(azureBlobStorageContainerName);
        return this;
    }

    /**
     * The name of the Azure blob storage container. If not exists - will be created automatically. May be empty, then will be created automatically airbytecontainer+timestamp
     */
    public DestinationAzureBlobStorage withAzureBlobStorageContainerName(Optional<? extends String> azureBlobStorageContainerName) {
        Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        return this;
    }

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    public DestinationAzureBlobStorage withAzureBlobStorageEndpointDomainName(String azureBlobStorageEndpointDomainName) {
        Utils.checkNotNull(azureBlobStorageEndpointDomainName, "azureBlobStorageEndpointDomainName");
        this.azureBlobStorageEndpointDomainName = Optional.ofNullable(azureBlobStorageEndpointDomainName);
        return this;
    }

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    public DestinationAzureBlobStorage withAzureBlobStorageEndpointDomainName(Optional<? extends String> azureBlobStorageEndpointDomainName) {
        Utils.checkNotNull(azureBlobStorageEndpointDomainName, "azureBlobStorageEndpointDomainName");
        this.azureBlobStorageEndpointDomainName = azureBlobStorageEndpointDomainName;
        return this;
    }

    /**
     * The amount of megabytes to buffer for the output stream to Azure. This will impact memory footprint on workers, but may need adjustment for performance and appropriate block size in Azure.
     */
    public DestinationAzureBlobStorage withAzureBlobStorageOutputBufferSize(long azureBlobStorageOutputBufferSize) {
        Utils.checkNotNull(azureBlobStorageOutputBufferSize, "azureBlobStorageOutputBufferSize");
        this.azureBlobStorageOutputBufferSize = Optional.ofNullable(azureBlobStorageOutputBufferSize);
        return this;
    }

    /**
     * The amount of megabytes to buffer for the output stream to Azure. This will impact memory footprint on workers, but may need adjustment for performance and appropriate block size in Azure.
     */
    public DestinationAzureBlobStorage withAzureBlobStorageOutputBufferSize(Optional<? extends Long> azureBlobStorageOutputBufferSize) {
        Utils.checkNotNull(azureBlobStorageOutputBufferSize, "azureBlobStorageOutputBufferSize");
        this.azureBlobStorageOutputBufferSize = azureBlobStorageOutputBufferSize;
        return this;
    }

    /**
     * The amount of megabytes after which the connector should spill the records in a new blob object. Make sure to configure size greater than individual records. Enter 0 if not applicable
     */
    public DestinationAzureBlobStorage withAzureBlobStorageSpillSize(long azureBlobStorageSpillSize) {
        Utils.checkNotNull(azureBlobStorageSpillSize, "azureBlobStorageSpillSize");
        this.azureBlobStorageSpillSize = Optional.ofNullable(azureBlobStorageSpillSize);
        return this;
    }

    /**
     * The amount of megabytes after which the connector should spill the records in a new blob object. Make sure to configure size greater than individual records. Enter 0 if not applicable
     */
    public DestinationAzureBlobStorage withAzureBlobStorageSpillSize(Optional<? extends Long> azureBlobStorageSpillSize) {
        Utils.checkNotNull(azureBlobStorageSpillSize, "azureBlobStorageSpillSize");
        this.azureBlobStorageSpillSize = azureBlobStorageSpillSize;
        return this;
    }

    /**
     * Output data format
     */
    public DestinationAzureBlobStorage withFormat(OutputFormat format) {
        Utils.checkNotNull(format, "format");
        this.format = format;
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
        DestinationAzureBlobStorage other = (DestinationAzureBlobStorage) o;
        return 
            java.util.Objects.deepEquals(this.azureBlobStorageAccountKey, other.azureBlobStorageAccountKey) &&
            java.util.Objects.deepEquals(this.azureBlobStorageAccountName, other.azureBlobStorageAccountName) &&
            java.util.Objects.deepEquals(this.azureBlobStorageContainerName, other.azureBlobStorageContainerName) &&
            java.util.Objects.deepEquals(this.azureBlobStorageEndpointDomainName, other.azureBlobStorageEndpointDomainName) &&
            java.util.Objects.deepEquals(this.azureBlobStorageOutputBufferSize, other.azureBlobStorageOutputBufferSize) &&
            java.util.Objects.deepEquals(this.azureBlobStorageSpillSize, other.azureBlobStorageSpillSize) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.format, other.format);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            azureBlobStorageAccountKey,
            azureBlobStorageAccountName,
            azureBlobStorageContainerName,
            azureBlobStorageEndpointDomainName,
            azureBlobStorageOutputBufferSize,
            azureBlobStorageSpillSize,
            destinationType,
            format);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationAzureBlobStorage.class,
                "azureBlobStorageAccountKey", azureBlobStorageAccountKey,
                "azureBlobStorageAccountName", azureBlobStorageAccountName,
                "azureBlobStorageContainerName", azureBlobStorageContainerName,
                "azureBlobStorageEndpointDomainName", azureBlobStorageEndpointDomainName,
                "azureBlobStorageOutputBufferSize", azureBlobStorageOutputBufferSize,
                "azureBlobStorageSpillSize", azureBlobStorageSpillSize,
                "destinationType", destinationType,
                "format", format);
    }
    
    public final static class Builder {
 
        private String azureBlobStorageAccountKey;
 
        private String azureBlobStorageAccountName;
 
        private Optional<? extends String> azureBlobStorageContainerName = Optional.empty();
 
        private Optional<? extends String> azureBlobStorageEndpointDomainName;
 
        private Optional<? extends Long> azureBlobStorageOutputBufferSize;
 
        private Optional<? extends Long> azureBlobStorageSpillSize;
 
        private OutputFormat format;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Azure blob storage account key.
         */
        public Builder azureBlobStorageAccountKey(String azureBlobStorageAccountKey) {
            Utils.checkNotNull(azureBlobStorageAccountKey, "azureBlobStorageAccountKey");
            this.azureBlobStorageAccountKey = azureBlobStorageAccountKey;
            return this;
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
         * The name of the Azure blob storage container. If not exists - will be created automatically. May be empty, then will be created automatically airbytecontainer+timestamp
         */
        public Builder azureBlobStorageContainerName(String azureBlobStorageContainerName) {
            Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
            this.azureBlobStorageContainerName = Optional.ofNullable(azureBlobStorageContainerName);
            return this;
        }

        /**
         * The name of the Azure blob storage container. If not exists - will be created automatically. May be empty, then will be created automatically airbytecontainer+timestamp
         */
        public Builder azureBlobStorageContainerName(Optional<? extends String> azureBlobStorageContainerName) {
            Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
            this.azureBlobStorageContainerName = azureBlobStorageContainerName;
            return this;
        }

        /**
         * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
         */
        public Builder azureBlobStorageEndpointDomainName(String azureBlobStorageEndpointDomainName) {
            Utils.checkNotNull(azureBlobStorageEndpointDomainName, "azureBlobStorageEndpointDomainName");
            this.azureBlobStorageEndpointDomainName = Optional.ofNullable(azureBlobStorageEndpointDomainName);
            return this;
        }

        /**
         * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
         */
        public Builder azureBlobStorageEndpointDomainName(Optional<? extends String> azureBlobStorageEndpointDomainName) {
            Utils.checkNotNull(azureBlobStorageEndpointDomainName, "azureBlobStorageEndpointDomainName");
            this.azureBlobStorageEndpointDomainName = azureBlobStorageEndpointDomainName;
            return this;
        }

        /**
         * The amount of megabytes to buffer for the output stream to Azure. This will impact memory footprint on workers, but may need adjustment for performance and appropriate block size in Azure.
         */
        public Builder azureBlobStorageOutputBufferSize(long azureBlobStorageOutputBufferSize) {
            Utils.checkNotNull(azureBlobStorageOutputBufferSize, "azureBlobStorageOutputBufferSize");
            this.azureBlobStorageOutputBufferSize = Optional.ofNullable(azureBlobStorageOutputBufferSize);
            return this;
        }

        /**
         * The amount of megabytes to buffer for the output stream to Azure. This will impact memory footprint on workers, but may need adjustment for performance and appropriate block size in Azure.
         */
        public Builder azureBlobStorageOutputBufferSize(Optional<? extends Long> azureBlobStorageOutputBufferSize) {
            Utils.checkNotNull(azureBlobStorageOutputBufferSize, "azureBlobStorageOutputBufferSize");
            this.azureBlobStorageOutputBufferSize = azureBlobStorageOutputBufferSize;
            return this;
        }

        /**
         * The amount of megabytes after which the connector should spill the records in a new blob object. Make sure to configure size greater than individual records. Enter 0 if not applicable
         */
        public Builder azureBlobStorageSpillSize(long azureBlobStorageSpillSize) {
            Utils.checkNotNull(azureBlobStorageSpillSize, "azureBlobStorageSpillSize");
            this.azureBlobStorageSpillSize = Optional.ofNullable(azureBlobStorageSpillSize);
            return this;
        }

        /**
         * The amount of megabytes after which the connector should spill the records in a new blob object. Make sure to configure size greater than individual records. Enter 0 if not applicable
         */
        public Builder azureBlobStorageSpillSize(Optional<? extends Long> azureBlobStorageSpillSize) {
            Utils.checkNotNull(azureBlobStorageSpillSize, "azureBlobStorageSpillSize");
            this.azureBlobStorageSpillSize = azureBlobStorageSpillSize;
            return this;
        }

        /**
         * Output data format
         */
        public Builder format(OutputFormat format) {
            Utils.checkNotNull(format, "format");
            this.format = format;
            return this;
        }
        
        public DestinationAzureBlobStorage build() {
            if (azureBlobStorageEndpointDomainName == null) {
                azureBlobStorageEndpointDomainName = _SINGLETON_VALUE_AzureBlobStorageEndpointDomainName.value();
            }
            if (azureBlobStorageOutputBufferSize == null) {
                azureBlobStorageOutputBufferSize = _SINGLETON_VALUE_AzureBlobStorageOutputBufferSize.value();
            }
            if (azureBlobStorageSpillSize == null) {
                azureBlobStorageSpillSize = _SINGLETON_VALUE_AzureBlobStorageSpillSize.value();
            }
            return new DestinationAzureBlobStorage(
                azureBlobStorageAccountKey,
                azureBlobStorageAccountName,
                azureBlobStorageContainerName,
                azureBlobStorageEndpointDomainName,
                azureBlobStorageOutputBufferSize,
                azureBlobStorageSpillSize,
                format);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_AzureBlobStorageEndpointDomainName =
                new LazySingletonValue<>(
                        "azure_blob_storage_endpoint_domain_name",
                        "\"blob.core.windows.net\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_AzureBlobStorageOutputBufferSize =
                new LazySingletonValue<>(
                        "azure_blob_storage_output_buffer_size",
                        "5",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_AzureBlobStorageSpillSize =
                new LazySingletonValue<>(
                        "azure_blob_storage_spill_size",
                        "500",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<AzureBlobStorage> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"azure-blob-storage\"",
                        new TypeReference<AzureBlobStorage>() {});
    }
}

