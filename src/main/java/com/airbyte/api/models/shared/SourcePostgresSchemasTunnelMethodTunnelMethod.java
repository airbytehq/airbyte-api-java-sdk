/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SourcePostgresSchemasTunnelMethodTunnelMethod - Connect through a jump server tunnel host using username and password authentication
 */
public enum SourcePostgresSchemasTunnelMethodTunnelMethod {
    SSH_PASSWORD_AUTH("SSH_PASSWORD_AUTH");

    @JsonValue
    private final String value;

    private SourcePostgresSchemasTunnelMethodTunnelMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
