/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionTypeEnum {
    GZIP("GZIP");

    @JsonValue
    public final String value;

    private DestinationS3FormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionTypeEnum(String value) {
        this.value = value;
    }
}
