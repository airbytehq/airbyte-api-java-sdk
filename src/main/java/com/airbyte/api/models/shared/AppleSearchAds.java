/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum AppleSearchAds {
    APPLE_SEARCH_ADS("apple-search-ads");

    @JsonValue
    private final String value;

    private AppleSearchAds(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AppleSearchAds> fromValue(String value) {
        for (AppleSearchAds o: AppleSearchAds.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}