/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * MarketNewsCategory - This parameter can be 1 of the following values general, forex, crypto, merger.
 */
public enum MarketNewsCategory {
    GENERAL("general"),
    FOREX("forex"),
    CRYPTO("crypto"),
    MERGER("merger");

    @JsonValue
    private final String value;

    private MarketNewsCategory(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<MarketNewsCategory> fromValue(String value) {
        for (MarketNewsCategory o: MarketNewsCategory.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}