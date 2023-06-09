/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourcePocketContentType - Select the content type of the items to retrieve.
 */
public enum SourcePocketContentType {
    ARTICLE("article"),
    VIDEO("video"),
    IMAGE("image");

    @JsonValue
    public final String value;

    private SourcePocketContentType(String value) {
        this.value = value;
    }
}
