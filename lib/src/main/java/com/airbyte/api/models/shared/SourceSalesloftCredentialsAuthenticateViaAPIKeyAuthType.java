/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceSalesloftCredentialsAuthenticateViaAPIKeyAuthType {
    API_KEY("api_key");

    @JsonValue
    public final String value;

    private SourceSalesloftCredentialsAuthenticateViaAPIKeyAuthType(String value) {
        this.value = value;
    }
}