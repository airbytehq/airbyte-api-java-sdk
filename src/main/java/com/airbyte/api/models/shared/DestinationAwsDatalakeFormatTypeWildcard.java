/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum DestinationAwsDatalakeFormatTypeWildcard {
    PARQUET("Parquet");

    @JsonValue
    private final String value;

    private DestinationAwsDatalakeFormatTypeWildcard(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
