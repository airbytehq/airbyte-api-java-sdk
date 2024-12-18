/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DataSource - A data source that is powered by the platform.
 */
public enum DataSource {
    METRICS("metrics"),
    CLOUD_COST("cloud_cost"),
    LOGS("logs"),
    RUM("rum");

    @JsonValue
    private final String value;

    private DataSource(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
