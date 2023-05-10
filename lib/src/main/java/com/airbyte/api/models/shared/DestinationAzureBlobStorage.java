/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAzureBlobStorage - The values required to configure the destination.
 */
public class DestinationAzureBlobStorage {
    /**
     * The Azure blob storage account key.
     */
    @JsonProperty("azure_blob_storage_account_key")
    public String azureBlobStorageAccountKey;

    public DestinationAzureBlobStorage withAzureBlobStorageAccountKey(String azureBlobStorageAccountKey) {
        this.azureBlobStorageAccountKey = azureBlobStorageAccountKey;
        return this;
    }
    
    /**
     * The account's name of the Azure Blob Storage.
     */
    @JsonProperty("azure_blob_storage_account_name")
    public String azureBlobStorageAccountName;

    public DestinationAzureBlobStorage withAzureBlobStorageAccountName(String azureBlobStorageAccountName) {
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        return this;
    }
    
    /**
     * The name of the Azure blob storage container. If not exists - will be created automatically. May be empty, then will be created automatically airbytecontainer+timestamp
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_container_name")
    public String azureBlobStorageContainerName;

    public DestinationAzureBlobStorage withAzureBlobStorageContainerName(String azureBlobStorageContainerName) {
        this.azureBlobStorageContainerName = azureBlobStorageContainerName;
        return this;
    }
    
    /**
     * This is Azure Blob Storage endpoint domain name. Leave default value (or leave it empty if run container from command line) to use Microsoft native from example.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_endpoint_domain_name")
    public String azureBlobStorageEndpointDomainName;

    public DestinationAzureBlobStorage withAzureBlobStorageEndpointDomainName(String azureBlobStorageEndpointDomainName) {
        this.azureBlobStorageEndpointDomainName = azureBlobStorageEndpointDomainName;
        return this;
    }
    
    /**
     * The amount of megabytes to buffer for the output stream to Azure. This will impact memory footprint on workers, but may need adjustment for performance and appropriate block size in Azure.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_output_buffer_size")
    public Long azureBlobStorageOutputBufferSize;

    public DestinationAzureBlobStorage withAzureBlobStorageOutputBufferSize(Long azureBlobStorageOutputBufferSize) {
        this.azureBlobStorageOutputBufferSize = azureBlobStorageOutputBufferSize;
        return this;
    }
    
    /**
     * The amount of megabytes after which the connector should spill the records in a new blob object. Make sure to configure size greater than individual records. Enter 0 if not applicable
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("azure_blob_storage_spill_size")
    public Long azureBlobStorageSpillSize;

    public DestinationAzureBlobStorage withAzureBlobStorageSpillSize(Long azureBlobStorageSpillSize) {
        this.azureBlobStorageSpillSize = azureBlobStorageSpillSize;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationAzureBlobStorageAzureBlobStorageEnum destinationType;

    public DestinationAzureBlobStorage withDestinationType(DestinationAzureBlobStorageAzureBlobStorageEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Output data format
     */
    @JsonProperty("format")
    public Object format;

    public DestinationAzureBlobStorage withFormat(Object format) {
        this.format = format;
        return this;
    }
    
    public DestinationAzureBlobStorage(@JsonProperty("azure_blob_storage_account_key") String azureBlobStorageAccountKey, @JsonProperty("azure_blob_storage_account_name") String azureBlobStorageAccountName, @JsonProperty("destinationType") DestinationAzureBlobStorageAzureBlobStorageEnum destinationType, @JsonProperty("format") Object format) {
        this.azureBlobStorageAccountKey = azureBlobStorageAccountKey;
        this.azureBlobStorageAccountName = azureBlobStorageAccountName;
        this.destinationType = destinationType;
        this.format = format;
  }
}
