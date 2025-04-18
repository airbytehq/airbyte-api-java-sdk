/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceSftpSchemasAuthMethod
 * 
 * <p>Connect through ssh key
 */
public enum SourceSftpSchemasAuthMethod {
    SSH_KEY_AUTH("SSH_KEY_AUTH");

    @JsonValue
    private final String value;

    private SourceSftpSchemasAuthMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceSftpSchemasAuthMethod> fromValue(String value) {
        for (SourceSftpSchemasAuthMethod o: SourceSftpSchemasAuthMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

