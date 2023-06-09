/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationGcsFormatCSVCommaSeparatedValuesNormalization - Whether the input JSON data should be normalized (flattened) in the output CSV. Please refer to docs for details.
 */
public enum DestinationGcsFormatCSVCommaSeparatedValuesNormalization {
    NO_FLATTENING("No flattening"),
    ROOT_LEVEL_FLATTENING("Root level flattening");

    @JsonValue
    public final String value;

    private DestinationGcsFormatCSVCommaSeparatedValuesNormalization(String value) {
        this.value = value;
    }
}
