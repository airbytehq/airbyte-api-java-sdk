/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceMysqlSslModePreferredMode {
    PREFERRED("preferred");

    @JsonValue
    public final String value;

    private SourceMysqlSslModePreferredMode(String value) {
        this.value = value;
    }
}
