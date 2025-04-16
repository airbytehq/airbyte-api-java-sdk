/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum AlpacaBrokerApi {
    ALPACA_BROKER_API("alpaca-broker-api");

    @JsonValue
    private final String value;

    private AlpacaBrokerApi(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AlpacaBrokerApi> fromValue(String value) {
        for (AlpacaBrokerApi o: AlpacaBrokerApi.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

