/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum RefreshTokenEndpoint {
    HTTPS_API_SANDBOX_EBAY_COM_IDENTITY_V1_OAUTH2_TOKEN("https://api.sandbox.ebay.com/identity/v1/oauth2/token"),
    HTTPS_API_EBAY_COM_IDENTITY_V1_OAUTH2_TOKEN("https://api.ebay.com/identity/v1/oauth2/token");

    @JsonValue
    private final String value;

    private RefreshTokenEndpoint(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RefreshTokenEndpoint> fromValue(String value) {
        for (RefreshTokenEndpoint o: RefreshTokenEndpoint.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

