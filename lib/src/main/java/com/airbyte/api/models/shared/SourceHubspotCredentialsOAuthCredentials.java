/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceHubspotCredentialsOAuthCredentials - Name of the credentials
 */
public enum SourceHubspotCredentialsOAuthCredentials {
    O_AUTH_CREDENTIALS("OAuth Credentials");

    @JsonValue
    public final String value;

    private SourceHubspotCredentialsOAuthCredentials(String value) {
        this.value = value;
    }
}