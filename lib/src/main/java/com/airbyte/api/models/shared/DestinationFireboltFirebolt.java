/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationFireboltFirebolt {
    FIREBOLT("firebolt");

    @JsonValue
    public final String value;

    private DestinationFireboltFirebolt(String value) {
        this.value = value;
    }
}
