/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceSftpCredentialsPasswordAuthenticationAuthMethodEnum - Connect through password authentication
 */
public enum SourceSftpCredentialsPasswordAuthenticationAuthMethodEnum {
    SSH_PASSWORD_AUTH("SSH_PASSWORD_AUTH");

    @JsonValue
    public final String value;

    private SourceSftpCredentialsPasswordAuthenticationAuthMethodEnum(String value) {
        this.value = value;
    }
}
