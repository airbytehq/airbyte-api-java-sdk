/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceGoogleSearchConsoleDataState - If "final" or if this parameter is omitted, the returned data will include only finalized data. Setting this parameter to "all" should not be used with Incremental Sync mode as it may cause data loss. If "all", data will include fresh data.
 */
public enum SourceGoogleSearchConsoleDataState {
    FINAL_("final"),
    ALL("all");

    @JsonValue
    public final String value;

    private SourceGoogleSearchConsoleDataState(String value) {
        this.value = value;
    }
}