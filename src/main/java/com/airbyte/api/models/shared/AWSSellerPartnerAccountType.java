/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * AWSSellerPartnerAccountType
 * 
 * <p>Type of the Account you're going to authorize the Airbyte application by
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
    
    public static Optional<AWSSellerPartnerAccountType> fromValue(String value) {
        for (AWSSellerPartnerAccountType o: AWSSellerPartnerAccountType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

