/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SourceSlackOptionTitle {
    DEFAULT_O_AUTH20_AUTHORIZATION("Default OAuth2.0 authorization");

    @JsonValue
    private final String value;

    private SourceSlackOptionTitle(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
