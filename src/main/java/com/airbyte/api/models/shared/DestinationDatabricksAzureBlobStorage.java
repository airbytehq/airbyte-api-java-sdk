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

public class DestinationDatabricksAzureBlobStorage {

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
    @JsonProperty("azure_blob_storage_endpoint_domain_name")
    private Optional<? extends String> azureBlobStorageEndpointDomainName;

    /**
     * Shared access signature (SAS) token to grant limited access to objects in your storage account.
     */
    @JsonProperty("azure_blob_storage_sas_token")
    private String azureBlobStorageSasToken;

    @JsonProperty("data_source_type")
    private DestinationDatabricksSchemasDataSourceType dataSourceType;

    @JsonCreator
    public DestinationDatabricksAzureBlobStorage(
            @JsonProperty("azure_blob_storage_account_name") String azureBlobStorageAccountName,
            @JsonProperty("azure_blob_storage_container_name") String azureBlobStorageContainerName,
            @JsonProperty("azure_blob_storage_endpoint_domain_name") Optional<? extends String> azureBlobStorageEndpointDomainName,
            @JsonProperty("azure_blob_storage_sas_token") String azureBlobStorageSasToken) {
        Utils.checkNotNull(azureBlobStorageAccountName, "azureBlobStorageAccountName");
        Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
        Utils.checkNotNull(azureBlobStorageEndpointDomainName, "azureBlobStorageEndpointDomainName");
        Utils.checkNotNull(azureBlobStorageSasToken, "azureBlobStorageSasToken");
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        this.azureBlobStorageEndpointDomainName = azureBlobStorageEndpointDomainName;
        this.azureBlobStorageSasToken = azureBlobStorageSasToken;
        this.dataSourceType = Builder._SINGLETON_VALUE_DataSourceType.value();
    }
    
    public DestinationDatabricksAzureBlobStorage(
            String azureBlobStorageAccountName,
            String azureBlobStorageContainerName,
            String azureBlobStorageSasToken) {
        this(azureBlobStorageAccountName, azureBlobStorageContainerName, Optional.empty(), azureBlobStorageSasToken);
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
    public Optional<String> azureBlobStorageEndpointDomainName() {
        return (Optional<String>) azureBlobStorageEndpointDomainName;
    }

    /**
     * Shared access signature (SAS) token to grant limited access to objects in your storage account.
     */
    @JsonIgnore
    public String azureBlobStorageSasToken() {
        return azureBlobStorageSasToken;
    }

    @JsonIgnore
    public DestinationDatabricksSchemasDataSourceType dataSourceType() {
        return dataSourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account's name of the Azure Blob Storage.
     */
    public DestinationDatabricksAzureBlobStorage withAzureBlobStorageAccountName(String azureBlobStorageAccountName) {
        Utils.checkNotNull(azureBlobStorageAccountName, "azureBlobStorageAccountName");
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        return this;
    }

    /**
     * The name of the Azure blob storage container.
     */
    public DestinationDatabricksAzureBlobStorage withAzureBlobStorageContainerName(String azureBlobStorageContainerName) {
        Utils.checkNotNull(azureBlobStorageContainerName, "azureBlobStorageContainerName");
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        return this;
    }

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    public DestinationDatabricksAzureBlobStorage withAzureBlobStorageEndpointDomainName(String azureBlobStorageEndpointDomainName) {
        Utils.checkNotNull(azureBlobStorageEndpointDomainName, "azureBlobStorageEndpointDomainName");
        this.azureBlobStorageEndpointDomainName = Optional.ofNullable(azureBlobStorageEndpointDomainName);
        return this;
    }

    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    public DestinationDatabricksAzureBlobStorage withAzureBlobStorageEndpointDomainName(Optional<? extends String> azureBlobStorageEndpointDomainName) {
        Utils.checkNotNull(azureBlobStorageEndpointDomainName, "azureBlobStorageEndpointDomainName");
        this.azureBlobStorageEndpointDomainName = azureBlobStorageEndpointDomainName;
        return this;
    }

    /**
     * Shared access signature (SAS) token to grant limited access to objects in your storage account.
     */
    public DestinationDatabricksAzureBlobStorage withAzureBlobStorageSasToken(String azureBlobStorageSasToken) {
        Utils.checkNotNull(azureBlobStorageSasToken, "azureBlobStorageSasToken");
        this.azureBlobStorageSasToken = azureBlobStorageSasToken;
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
        DestinationDatabricksAzureBlobStorage other = (DestinationDatabricksAzureBlobStorage) o;
        return 
            java.util.Objects.deepEquals(this.azureBlobStorageAccountName, other.azureBlobStorageAccountName) &&
            java.util.Objects.deepEquals(this.azureBlobStorageContainerName, other.azureBlobStorageContainerName) &&
            java.util.Objects.deepEquals(this.azureBlobStorageEndpointDomainName, other.azureBlobStorageEndpointDomainName) &&
            java.util.Objects.deepEquals(this.azureBlobStorageSasToken, other.azureBlobStorageSasToken) &&
            java.util.Objects.deepEquals(this.dataSourceType, other.dataSourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            azureBlobStorageAccountName,
            azureBlobStorageContainerName,
            azureBlobStorageEndpointDomainName,
            azureBlobStorageSasToken,
            dataSourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationDatabricksAzureBlobStorage.class,
                "azureBlobStorageAccountName", azureBlobStorageAccountName,
                "azureBlobStorageContainerName", azureBlobStorageContainerName,
                "azureBlobStorageEndpointDomainName", azureBlobStorageEndpointDomainName,
                "azureBlobStorageSasToken", azureBlobStorageSasToken,
                "dataSourceType", dataSourceType);
    }
    
    public final static class Builder {
 
        private String azureBlobStorageAccountName;
 
        private String azureBlobStorageContainerName;
 
        private Optional<? extends String> azureBlobStorageEndpointDomainName;
 
        private String azureBlobStorageSasToken;  
        
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
         * Shared access signature (SAS) token to grant limited access to objects in your storage account.
         */
        public Builder azureBlobStorageSasToken(String azureBlobStorageSasToken) {
            Utils.checkNotNull(azureBlobStorageSasToken, "azureBlobStorageSasToken");
            this.azureBlobStorageSasToken = azureBlobStorageSasToken;
            return this;
        }
        
        public DestinationDatabricksAzureBlobStorage build() {
            if (azureBlobStorageEndpointDomainName == null) {
                azureBlobStorageEndpointDomainName = _SINGLETON_VALUE_AzureBlobStorageEndpointDomainName.value();
            }
            return new DestinationDatabricksAzureBlobStorage(
                azureBlobStorageAccountName,
                azureBlobStorageContainerName,
                azureBlobStorageEndpointDomainName,
                azureBlobStorageSasToken);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_AzureBlobStorageEndpointDomainName =
                new LazySingletonValue<>(
                        "azure_blob_storage_endpoint_domain_name",
                        "\"blob.core.windows.net\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<DestinationDatabricksSchemasDataSourceType> _SINGLETON_VALUE_DataSourceType =
                new LazySingletonValue<>(
                        "data_source_type",
                        "\"AZURE_BLOB_STORAGE\"",
                        new TypeReference<DestinationDatabricksSchemasDataSourceType>() {});
    }
}

