/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum DestinationS3GlueFormatType {
    JSONL("JSONL");

    @JsonValue
    private final String value;

    private DestinationS3GlueFormatType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
