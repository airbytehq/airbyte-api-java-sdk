/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SourceAmazonAdsAmazonAds {
    AMAZON_ADS("amazon-ads");

    @JsonValue
    private final String value;

    private SourceAmazonAdsAmazonAds(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
