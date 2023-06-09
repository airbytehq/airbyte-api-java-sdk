/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceSftpBulkFileType - The file type you want to sync. Currently only 'csv' and 'json' files are supported.
 */
public enum SourceSftpBulkFileType {
    CSV("csv"),
    JSON("json");

    @JsonValue
    public final String value;

    private SourceSftpBulkFileType(String value) {
        this.value = value;
    }
}
