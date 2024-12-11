/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * TimeGranularityType - Granularity of the statistics for metrics per time period. Must be either "DAY" or "MONTH"
 */
public enum TimeGranularityType {
    DAY("DAY"),
    MONTH("MONTH");

    @JsonValue
    private final String value;

    private TimeGranularityType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
