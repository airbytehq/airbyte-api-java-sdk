/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceMailchimpCredentialsAPIKeyAuthType {
    APIKEY("apikey");

    @JsonValue
    public final String value;

    private SourceMailchimpCredentialsAPIKeyAuthType(String value) {
        this.value = value;
    }
}
