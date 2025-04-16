/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceGoogleAnalyticsDataApiSchemasFilterType {
    NOT_EXPRESSION("notExpression");

    @JsonValue
    private final String value;

    private SourceGoogleAnalyticsDataApiSchemasFilterType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceGoogleAnalyticsDataApiSchemasFilterType> fromValue(String value) {
        for (SourceGoogleAnalyticsDataApiSchemasFilterType o: SourceGoogleAnalyticsDataApiSchemasFilterType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

