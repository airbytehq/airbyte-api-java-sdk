/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceAuth0SchemasCredentialsAuthenticationMethod {
    OAUTH2_CONFIDENTIAL_APPLICATION("oauth2_confidential_application");

    @JsonValue
    private final String value;

    private SourceAuth0SchemasCredentialsAuthenticationMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceAuth0SchemasCredentialsAuthenticationMethod> fromValue(String value) {
        for (SourceAuth0SchemasCredentialsAuthenticationMethod o: SourceAuth0SchemasCredentialsAuthenticationMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

