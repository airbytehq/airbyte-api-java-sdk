/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceTwitterTwitter {
    TWITTER("twitter");

    @JsonValue
    public final String value;

    private SourceTwitterTwitter(String value) {
        this.value = value;
    }
}
