/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterValueType {
    DOUBLE_VALUE("doubleValue");

    @JsonValue
    private final String value;

    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter4FilterValueType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
