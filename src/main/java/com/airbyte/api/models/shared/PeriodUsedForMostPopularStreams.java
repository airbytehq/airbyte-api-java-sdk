/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

/**
 * PeriodUsedForMostPopularStreams
 * 
 * <p>Period of time (in days)
 */
public enum PeriodUsedForMostPopularStreams {
    ONE(1L),
    SEVEN(7L),
    THIRTY(30L);

    @JsonValue
    private final long value;

    private PeriodUsedForMostPopularStreams(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
    
    public static Optional<PeriodUsedForMostPopularStreams> fromValue(long value) {
        for (PeriodUsedForMostPopularStreams o: PeriodUsedForMostPopularStreams.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

