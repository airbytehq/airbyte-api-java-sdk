/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationGcsCredentialHMACKeyCredentialType {
    HMAC_KEY("HMAC_KEY");

    @JsonValue
    public final String value;

    private DestinationGcsCredentialHMACKeyCredentialType(String value) {
        this.value = value;
    }
}