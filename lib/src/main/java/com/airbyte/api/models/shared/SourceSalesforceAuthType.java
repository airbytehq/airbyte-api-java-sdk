/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceSalesforceAuthType {
    CLIENT("Client");

    @JsonValue
    public final String value;

    private SourceSalesforceAuthType(String value) {
        this.value = value;
    }
}
