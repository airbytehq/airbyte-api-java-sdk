/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceTrustpilotCredentialsOAuth20AuthTypeEnum {
    OAUTH20("oauth2.0");

    @JsonValue
    public final String value;

    private SourceTrustpilotCredentialsOAuth20AuthTypeEnum(String value) {
        this.value = value;
    }
}