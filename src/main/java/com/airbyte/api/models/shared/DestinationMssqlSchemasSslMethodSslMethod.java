/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum DestinationMssqlSchemasSslMethodSslMethod {
    ENCRYPTED_VERIFY_CERTIFICATE("encrypted_verify_certificate");

    @JsonValue
    private final String value;

    private DestinationMssqlSchemasSslMethodSslMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
