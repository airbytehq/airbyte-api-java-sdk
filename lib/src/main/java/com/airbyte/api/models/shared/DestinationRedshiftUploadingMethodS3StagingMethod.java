/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationRedshiftUploadingMethodS3StagingMethod {
    S3_STAGING("S3 Staging");

    @JsonValue
    public final String value;

    private DestinationRedshiftUploadingMethodS3StagingMethod(String value) {
        this.value = value;
    }
}
