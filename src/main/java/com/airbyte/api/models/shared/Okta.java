/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Okta {
    OKTA("okta");

    @JsonValue
    private final String value;

    private Okta(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
