/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceLinkedinAdsSchemasAuthMethod {
    ACCESS_TOKEN("access_token");

    @JsonValue
    private final String value;

    private SourceLinkedinAdsSchemasAuthMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceLinkedinAdsSchemasAuthMethod> fromValue(String value) {
        for (SourceLinkedinAdsSchemasAuthMethod o: SourceLinkedinAdsSchemasAuthMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

