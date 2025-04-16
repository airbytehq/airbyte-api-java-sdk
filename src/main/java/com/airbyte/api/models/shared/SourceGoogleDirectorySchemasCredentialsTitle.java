/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceGoogleDirectorySchemasCredentialsTitle
 * 
 * <p>Authentication Scenario
 */
public enum SourceGoogleDirectorySchemasCredentialsTitle {
    SERVICE_ACCOUNTS("Service accounts");

    @JsonValue
    private final String value;

    private SourceGoogleDirectorySchemasCredentialsTitle(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceGoogleDirectorySchemasCredentialsTitle> fromValue(String value) {
        for (SourceGoogleDirectorySchemasCredentialsTitle o: SourceGoogleDirectorySchemasCredentialsTitle.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

