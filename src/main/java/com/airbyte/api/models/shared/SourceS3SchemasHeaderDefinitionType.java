/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceS3SchemasHeaderDefinitionType {
    AUTOGENERATED("Autogenerated");

    @JsonValue
    private final String value;

    private SourceS3SchemasHeaderDefinitionType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceS3SchemasHeaderDefinitionType> fromValue(String value) {
        for (SourceS3SchemasHeaderDefinitionType o: SourceS3SchemasHeaderDefinitionType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

