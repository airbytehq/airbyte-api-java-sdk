/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DestinationS3DataLakeCatalogType {
    GLUE("GLUE");

    @JsonValue
    private final String value;

    private DestinationS3DataLakeCatalogType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationS3DataLakeCatalogType> fromValue(String value) {
        for (DestinationS3DataLakeCatalogType o: DestinationS3DataLakeCatalogType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

