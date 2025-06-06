/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DestinationGcsSchemasFormatOutputFormat1Codec {
    SNAPPY("snappy");

    @JsonValue
    private final String value;

    private DestinationGcsSchemasFormatOutputFormat1Codec(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationGcsSchemasFormatOutputFormat1Codec> fromValue(String value) {
        for (DestinationGcsSchemasFormatOutputFormat1Codec o: DestinationGcsSchemasFormatOutputFormat1Codec.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

