/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceChartmogulInterval - Some APIs such as &lt;a href="https://dev.chartmogul.com/reference/endpoint-overview-metrics-api"&gt;Metrics&lt;/a&gt; require intervals to cluster data.
 */
public enum SourceChartmogulInterval {
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    QUARTER("quarter");

    @JsonValue
    public final String value;

    private SourceChartmogulInterval(String value) {
        this.value = value;
    }
}
