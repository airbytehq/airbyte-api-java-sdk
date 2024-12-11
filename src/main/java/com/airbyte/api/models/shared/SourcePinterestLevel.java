/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SourcePinterestLevel - Chosen level for API
 */
public enum SourcePinterestLevel {
    ADVERTISER("ADVERTISER"),
    ADVERTISER_TARGETING("ADVERTISER_TARGETING"),
    CAMPAIGN("CAMPAIGN"),
    CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
    AD_GROUP("AD_GROUP"),
    AD_GROUP_TARGETING("AD_GROUP_TARGETING"),
    PIN_PROMOTION("PIN_PROMOTION"),
    PIN_PROMOTION_TARGETING("PIN_PROMOTION_TARGETING"),
    KEYWORD("KEYWORD"),
    PRODUCT_GROUP("PRODUCT_GROUP"),
    PRODUCT_GROUP_TARGETING("PRODUCT_GROUP_TARGETING"),
    PRODUCT_ITEM("PRODUCT_ITEM");

    @JsonValue
    private final String value;

    private SourcePinterestLevel(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
