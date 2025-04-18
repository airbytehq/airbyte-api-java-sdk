/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * CredentialsTitle
 * 
 * <p>Name of the credentials
 */
public enum CredentialsTitle {
    IAM_ROLE("IAM Role");

    @JsonValue
    private final String value;

    private CredentialsTitle(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CredentialsTitle> fromValue(String value) {
        for (CredentialsTitle o: CredentialsTitle.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

