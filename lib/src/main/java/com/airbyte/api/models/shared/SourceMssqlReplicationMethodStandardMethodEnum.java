/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceMssqlReplicationMethodStandardMethodEnum {
    STANDARD("STANDARD");

    @JsonValue
    public final String value;

    private SourceMssqlReplicationMethodStandardMethodEnum(String value) {
        this.value = value;
    }
}
