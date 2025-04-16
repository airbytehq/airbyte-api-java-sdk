/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum TheGuardianApi {
    THE_GUARDIAN_API("the-guardian-api");

    @JsonValue
    private final String value;

    private TheGuardianApi(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TheGuardianApi> fromValue(String value) {
        for (TheGuardianApi o: TheGuardianApi.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

