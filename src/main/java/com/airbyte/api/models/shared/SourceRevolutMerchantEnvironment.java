/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceRevolutMerchantEnvironment
 * 
 * <p>The base url of your environment. Either sandbox or production
 */
public enum SourceRevolutMerchantEnvironment {
    SANDBOX_MERCHANT("sandbox-merchant"),
    MERCHANT("merchant");

    @JsonValue
    private final String value;

    private SourceRevolutMerchantEnvironment(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceRevolutMerchantEnvironment> fromValue(String value) {
        for (SourceRevolutMerchantEnvironment o: SourceRevolutMerchantEnvironment.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

