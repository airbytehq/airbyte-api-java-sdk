/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceAzureBlobStorageAzureBlobStorage {
    AZURE_BLOB_STORAGE("azure-blob-storage");

    @JsonValue
    public final String value;

    private SourceAzureBlobStorageAzureBlobStorage(String value) {
        this.value = value;
    }
}
