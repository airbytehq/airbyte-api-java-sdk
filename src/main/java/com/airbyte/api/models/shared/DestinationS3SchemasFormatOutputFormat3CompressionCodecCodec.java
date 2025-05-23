/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec {
    SNAPPY("snappy");

    @JsonValue
    private final String value;

    private DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec> fromValue(String value) {
        for (DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec o: DestinationS3SchemasFormatOutputFormat3CompressionCodecCodec.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

