/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValueType {
    INT64_VALUE("int64Value");

    @JsonValue
    private final String value;

    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValueType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValueType> fromValue(String value) {
        for (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValueType o: SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter2ValueType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

