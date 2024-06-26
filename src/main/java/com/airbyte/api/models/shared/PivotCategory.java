/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * PivotCategory - Choose a category to pivot your analytics report around. This selection will organize your data based on the chosen attribute, allowing you to analyze trends and performance from different perspectives.
 */
public enum PivotCategory {
    COMPANY("COMPANY"),
    ACCOUNT("ACCOUNT"),
    SHARE("SHARE"),
    CAMPAIGN("CAMPAIGN"),
    CREATIVE("CREATIVE"),
    CAMPAIGN_GROUP("CAMPAIGN_GROUP"),
    CONVERSION("CONVERSION"),
    CONVERSATION_NODE("CONVERSATION_NODE"),
    CONVERSATION_NODE_OPTION_INDEX("CONVERSATION_NODE_OPTION_INDEX"),
    SERVING_LOCATION("SERVING_LOCATION"),
    CARD_INDEX("CARD_INDEX"),
    MEMBER_COMPANY_SIZE("MEMBER_COMPANY_SIZE"),
    MEMBER_INDUSTRY("MEMBER_INDUSTRY"),
    MEMBER_SENIORITY("MEMBER_SENIORITY"),
    MEMBER_JOB_TITLE("MEMBER_JOB_TITLE"),
    MEMBER_JOB_FUNCTION("MEMBER_JOB_FUNCTION"),
    MEMBER_COUNTRY_V2("MEMBER_COUNTRY_V2"),
    MEMBER_REGION_V2("MEMBER_REGION_V2"),
    MEMBER_COMPANY("MEMBER_COMPANY"),
    PLACEMENT_NAME("PLACEMENT_NAME"),
    IMPRESSION_DEVICE_TYPE("IMPRESSION_DEVICE_TYPE");

    @JsonValue
    private final String value;

    private PivotCategory(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
