/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceRailzRailz {
    RAILZ("railz");

    @JsonValue
    public final String value;

    private SourceRailzRailz(String value) {
        this.value = value;
    }
}