/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceConfluenceConfluence {
    CONFLUENCE("confluence");

    @JsonValue
    public final String value;

    private SourceConfluenceConfluence(String value) {
        this.value = value;
    }
}
