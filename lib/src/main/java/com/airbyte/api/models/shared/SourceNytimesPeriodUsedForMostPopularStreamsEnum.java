/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceNytimesPeriodUsedForMostPopularStreamsEnum - Period of time (in days)
 */
public enum SourceNytimesPeriodUsedForMostPopularStreamsEnum {
    ONE(1L),
    SEVEN(7L),
    THIRTY(30L);

    @JsonValue
    public final Long value;

    private SourceNytimesPeriodUsedForMostPopularStreamsEnum(Long value) {
        this.value = value;
    }
}
