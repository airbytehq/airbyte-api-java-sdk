/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationDatabricksDataSourceAzureBlobStorageDataSourceType {
    AZURE_BLOB_STORAGE("AZURE_BLOB_STORAGE");

    @JsonValue
    public final String value;

    private DestinationDatabricksDataSourceAzureBlobStorageDataSourceType(String value) {
        this.value = value;
    }
}
