/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * AWSSellerPartnerAccountType - Type of the Account you're going to authorize the Airbyte application by
 */
public enum AWSSellerPartnerAccountType {
    SELLER("Seller"),
    VENDOR("Vendor");

    @JsonValue
    private final String value;

    private AWSSellerPartnerAccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
