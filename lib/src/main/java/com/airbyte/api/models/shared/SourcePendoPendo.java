/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourcePendoPendo {
    PENDO("pendo");

    @JsonValue
    public final String value;

    private SourcePendoPendo(String value) {
        this.value = value;
    }
}
