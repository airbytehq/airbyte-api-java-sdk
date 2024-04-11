/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * SourceGoogleAnalyticsDataApiGranularity - The granularity used to interpret the startOffset and endOffset for the extended reporting date range for a cohort report.
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
}
