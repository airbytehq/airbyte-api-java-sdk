/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ConversionReportTime - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event..
 */
public enum ConversionReportTime {
    TIME_OF_AD_ACTION("TIME_OF_AD_ACTION"),
    TIME_OF_CONVERSION("TIME_OF_CONVERSION");

    @JsonValue
    private final String value;

    private ConversionReportTime(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
