/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceDremioDremio {
    DREMIO("dremio");

    @JsonValue
    public final String value;

    private SourceDremioDremio(String value) {
        this.value = value;
    }
}
