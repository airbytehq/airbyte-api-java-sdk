/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourcePostgresReplicationMethodStandardMethod {
    STANDARD("Standard");

    @JsonValue
    public final String value;

    private SourcePostgresReplicationMethodStandardMethod(String value) {
        this.value = value;
    }
}
