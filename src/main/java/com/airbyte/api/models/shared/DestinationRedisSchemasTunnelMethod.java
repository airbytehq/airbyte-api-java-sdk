/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DestinationRedisSchemasTunnelMethod - Connect through a jump server tunnel host using username and ssh key
 */
public enum DestinationRedisSchemasTunnelMethod {
    SSH_KEY_AUTH("SSH_KEY_AUTH");

    @JsonValue
    private final String value;

    private DestinationRedisSchemasTunnelMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
