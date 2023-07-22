/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JobStatusEnum {
    PENDING("pending"),
    RUNNING("running"),
    INCOMPLETE("incomplete"),
    FAILED("failed"),
    SUCCEEDED("succeeded"),
    CANCELLED("cancelled");

    @JsonValue
    public final String value;

    private JobStatusEnum(String value) {
        this.value = value;
    }
}
