/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * BaseURLPrefix
 * 
 * <p>You can access our API through the following URLs - Standard API Usage (Use the default API URL - https://api.jotform.com), For EU (Use the EU API URL - https://eu-api.jotform.com), For HIPAA (Use the HIPAA API URL - https://hipaa-api.jotform.com)
 */
public enum BaseURLPrefix {
    STANDARD("Standard"),
    EU("EU"),
    HIPAA("HIPAA");

    @JsonValue
    private final String value;

    private BaseURLPrefix(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<BaseURLPrefix> fromValue(String value) {
        for (BaseURLPrefix o: BaseURLPrefix.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

