/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceBraintreeEnvironmentEnum - Environment specifies where the data will come from.
 */
public enum SourceBraintreeEnvironmentEnum {
    DEVELOPMENT("Development"),
    SANDBOX("Sandbox"),
    QA("Qa"),
    PRODUCTION("Production");

    @JsonValue
    public final String value;

    private SourceBraintreeEnvironmentEnum(String value) {
        this.value = value;
    }
}
