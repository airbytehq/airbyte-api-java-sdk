/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceGoogleSheetsCredentialsServiceAccountKeyAuthenticationAuthType {
    SERVICE("Service");

    @JsonValue
    public final String value;

    private SourceGoogleSheetsCredentialsServiceAccountKeyAuthenticationAuthType(String value) {
        this.value = value;
    }
}
