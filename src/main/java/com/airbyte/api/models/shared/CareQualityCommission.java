/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum CareQualityCommission {
    CARE_QUALITY_COMMISSION("care-quality-commission");

    @JsonValue
    private final String value;

    private CareQualityCommission(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
