/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceSlackCredentialsAPITokenOptionTitle {
    API_TOKEN_CREDENTIALS("API Token Credentials");

    @JsonValue
    public final String value;

    private SourceSlackCredentialsAPITokenOptionTitle(String value) {
        this.value = value;
    }
}
