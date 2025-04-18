/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceS3DeliveryType {
    USE_RECORDS_TRANSFER("use_records_transfer");

    @JsonValue
    private final String value;

    private SourceS3DeliveryType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceS3DeliveryType> fromValue(String value) {
        for (SourceS3DeliveryType o: SourceS3DeliveryType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

