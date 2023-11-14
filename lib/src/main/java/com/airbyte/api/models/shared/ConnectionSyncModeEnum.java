/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConnectionSyncModeEnum {
    FULL_REFRESH_OVERWRITE("full_refresh_overwrite"),
    FULL_REFRESH_APPEND("full_refresh_append"),
    INCREMENTAL_APPEND("incremental_append"),
    INCREMENTAL_DEDUPED_HISTORY("incremental_deduped_history");

    @JsonValue
    public final String value;

    private ConnectionSyncModeEnum(String value) {
        this.value = value;
    }
}
