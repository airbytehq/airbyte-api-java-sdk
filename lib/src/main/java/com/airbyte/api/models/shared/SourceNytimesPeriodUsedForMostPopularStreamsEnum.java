/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceNytimesPeriodUsedForMostPopularStreamsEnum - Period of time (in days)
 */
public enum SourceNytimesPeriodUsedForMostPopularStreamsEnum {
    ONE("1"),
    SEVEN("7"),
    THIRTY("30");

    @JsonValue
    public final String value;

    private SourceNytimesPeriodUsedForMostPopularStreamsEnum(String value) {
        this.value = value;
    }
}
