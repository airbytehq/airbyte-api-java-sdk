/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DestinationS3Flattening - Whether the input json data should be normalized (flattened) in the output CSV. Please refer to docs for details.
 */
public enum DestinationS3Flattening {
    NO_FLATTENING("No flattening"),
    ROOT_LEVEL_FLATTENING("Root level flattening");

    @JsonValue
    private final String value;

    private DestinationS3Flattening(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
