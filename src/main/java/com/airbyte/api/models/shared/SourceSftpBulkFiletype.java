/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceSftpBulkFiletype {
    AVRO("avro");

    @JsonValue
    private final String value;

    private SourceSftpBulkFiletype(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceSftpBulkFiletype> fromValue(String value) {
        for (SourceSftpBulkFiletype o: SourceSftpBulkFiletype.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

