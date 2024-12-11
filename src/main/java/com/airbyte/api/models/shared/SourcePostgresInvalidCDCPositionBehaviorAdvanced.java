/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SourcePostgresInvalidCDCPositionBehaviorAdvanced - Determines whether Airbyte should fail or re-sync data in case of an stale/invalid cursor value into the WAL. If 'Fail sync' is chosen, a user will have to manually reset the connection before being able to continue syncing data. If 'Re-sync data' is chosen, Airbyte will automatically trigger a refresh but could lead to higher cloud costs and data loss.
 */
public enum SourcePostgresInvalidCDCPositionBehaviorAdvanced {
    FAIL_SYNC("Fail sync"),
    RE_SYNC_DATA("Re-sync data");

    @JsonValue
    private final String value;

    private SourcePostgresInvalidCDCPositionBehaviorAdvanced(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
