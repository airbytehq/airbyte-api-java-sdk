/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFlattening - Whether the input json data should be normalized (flattened) in the output JSON Lines. Please refer to docs for details.
 */
public enum DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFlattening {
    NO_FLATTENING("No flattening"),
    ROOT_LEVEL_FLATTENING("Root level flattening");

    @JsonValue
    public final String value;

    private DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFlattening(String value) {
        this.value = value;
    }
}
