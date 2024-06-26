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
 * AWSRegion - Select the AWS Region.
 */
public enum AWSRegion {
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
    private final String value;

    private AWSRegion(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
