/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * AWSRegion
 * 
 * <p>Select the AWS Region.
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
    
    public static Optional<AWSRegion> fromValue(String value) {
        for (AWSRegion o: AWSRegion.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

