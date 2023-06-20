/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceAmazonSellerPartnerAWSRegion - Select the AWS Region.
 */
public enum SourceAmazonSellerPartnerAWSRegion {
    AE("AE"),
    AU("AU"),
    BE("BE"),
    BR("BR"),
    CA("CA"),
    DE("DE"),
    EG("EG"),
    ES("ES"),
    FR("FR"),
    GB("GB"),
    IN("IN"),
    IT("IT"),
    JP("JP"),
    MX("MX"),
    NL("NL"),
    PL("PL"),
    SA("SA"),
    SE("SE"),
    SG("SG"),
    TR("TR"),
    UK("UK"),
    US("US");

    @JsonValue
    public final String value;

    private SourceAmazonSellerPartnerAWSRegion(String value) {
        this.value = value;
    }
}