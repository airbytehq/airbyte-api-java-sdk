/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationAwsDatalakeFormatParquetColumnarStorageFormatTypeWildcard {
    PARQUET("Parquet");

    @JsonValue
    public final String value;

    private DestinationAwsDatalakeFormatParquetColumnarStorageFormatTypeWildcard(String value) {
        this.value = value;
    }
}
