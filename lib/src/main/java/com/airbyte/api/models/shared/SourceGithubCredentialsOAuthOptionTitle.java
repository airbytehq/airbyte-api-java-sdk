/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceGithubCredentialsOAuthOptionTitle {
    O_AUTH_CREDENTIALS("OAuth Credentials");

    @JsonValue
    public final String value;

    private SourceGithubCredentialsOAuthOptionTitle(String value) {
        this.value = value;
    }
}
