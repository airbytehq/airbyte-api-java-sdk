/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourcePocketPocket {
    POCKET("pocket");

    @JsonValue
    public final String value;

    private SourcePocketPocket(String value) {
        this.value = value;
    }
}
