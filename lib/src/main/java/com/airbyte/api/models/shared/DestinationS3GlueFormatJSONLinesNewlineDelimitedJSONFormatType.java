/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatType {
    JSONL("JSONL");

    @JsonValue
    public final String value;

    private DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatType(String value) {
        this.value = value;
    }
}
