/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterFilterName {
    NUMERIC_FILTER("numericFilter");

    @JsonValue
    private final String value;

    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterFilterName(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterFilterName> fromValue(String value) {
        for (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterFilterName o: SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3ExpressionFilterFilterName.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

