/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterValidEnums {
    OPERATION_UNSPECIFIED("OPERATION_UNSPECIFIED"),
    EQUAL("EQUAL"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_OR_EQUAL("LESS_THAN_OR_EQUAL"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_OR_EQUAL("GREATER_THAN_OR_EQUAL");

    @JsonValue
    private final String value;

    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterValidEnums(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
