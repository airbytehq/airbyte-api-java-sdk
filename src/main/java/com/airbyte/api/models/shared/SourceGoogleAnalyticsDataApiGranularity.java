/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceGoogleAnalyticsDataApiGranularity
 * 
 * <p>The granularity used to interpret the startOffset and endOffset for the extended reporting date range for a cohort report.
 */
public enum SourceGoogleAnalyticsDataApiGranularity {
    GRANULARITY_UNSPECIFIED("GRANULARITY_UNSPECIFIED"),
    DAILY("DAILY"),
    WEEKLY("WEEKLY"),
    MONTHLY("MONTHLY");

    @JsonValue
    private final String value;

    private SourceGoogleAnalyticsDataApiGranularity(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceGoogleAnalyticsDataApiGranularity> fromValue(String value) {
        for (SourceGoogleAnalyticsDataApiGranularity o: SourceGoogleAnalyticsDataApiGranularity.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

