/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationS3GlueS3Glue {
    S3_GLUE("s3-glue");

    @JsonValue
    public final String value;

    private DestinationS3GlueS3Glue(String value) {
        this.value = value;
    }
}
