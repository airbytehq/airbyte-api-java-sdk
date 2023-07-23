/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceCoinApiEnvironment - The environment to use. Either sandbox or production.
 * 
 */
public enum SourceCoinApiEnvironment {
    SANDBOX("sandbox"),
    PRODUCTION("production");

    @JsonValue
    public final String value;

    private SourceCoinApiEnvironment(String value) {
        this.value = value;
    }
}
