/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationFireboltLoadingMethodExternalTableViaS3Method {
    S3("S3");

    @JsonValue
    public final String value;

    private DestinationFireboltLoadingMethodExternalTableViaS3Method(String value) {
        this.value = value;
    }
}
