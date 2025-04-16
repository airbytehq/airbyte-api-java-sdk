/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum UrlBase {
    HTTPS_EU_API_SURVEYSPARROW_COM_V3("https://eu-api.surveysparrow.com/v3");

    @JsonValue
    private final String value;

    private UrlBase(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<UrlBase> fromValue(String value) {
        for (UrlBase o: UrlBase.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

