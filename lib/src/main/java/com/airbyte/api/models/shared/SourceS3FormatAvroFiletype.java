/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceS3FormatAvroFiletype {
    AVRO("avro");

    @JsonValue
    public final String value;

    private SourceS3FormatAvroFiletype(String value) {
        this.value = value;
    }
}
