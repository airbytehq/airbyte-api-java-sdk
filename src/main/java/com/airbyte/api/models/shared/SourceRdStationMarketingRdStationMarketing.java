/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceRdStationMarketingRdStationMarketing {
    RD_STATION_MARKETING("rd-station-marketing");

    @JsonValue
    private final String value;

    private SourceRdStationMarketingRdStationMarketing(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceRdStationMarketingRdStationMarketing> fromValue(String value) {
        for (SourceRdStationMarketingRdStationMarketing o: SourceRdStationMarketingRdStationMarketing.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}