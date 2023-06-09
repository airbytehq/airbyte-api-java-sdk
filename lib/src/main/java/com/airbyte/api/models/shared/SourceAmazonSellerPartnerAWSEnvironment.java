/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceAmazonSellerPartnerAWSEnvironment - Select the AWS Environment.
 */
public enum SourceAmazonSellerPartnerAWSEnvironment {
    PRODUCTION("PRODUCTION"),
    SANDBOX("SANDBOX");

    @JsonValue
    public final String value;

    private SourceAmazonSellerPartnerAWSEnvironment(String value) {
        this.value = value;
    }
}
