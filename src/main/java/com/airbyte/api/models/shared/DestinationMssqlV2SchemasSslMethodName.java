/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DestinationMssqlV2SchemasSslMethodName {
    ENCRYPTED_VERIFY_CERTIFICATE("encrypted_verify_certificate");

    @JsonValue
    private final String value;

    private DestinationMssqlV2SchemasSslMethodName(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationMssqlV2SchemasSslMethodName> fromValue(String value) {
        for (DestinationMssqlV2SchemasSslMethodName o: DestinationMssqlV2SchemasSslMethodName.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

