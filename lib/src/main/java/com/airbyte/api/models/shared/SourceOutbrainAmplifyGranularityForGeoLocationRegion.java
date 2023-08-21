/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceOutbrainAmplifyGranularityForGeoLocationRegion - The granularity used for geo location data in reports.
 */
public enum SourceOutbrainAmplifyGranularityForGeoLocationRegion {
    COUNTRY("country"),
    REGION("region"),
    SUBREGION("subregion");

    @JsonValue
    public final String value;

    private SourceOutbrainAmplifyGranularityForGeoLocationRegion(String value) {
        this.value = value;
    }
}
