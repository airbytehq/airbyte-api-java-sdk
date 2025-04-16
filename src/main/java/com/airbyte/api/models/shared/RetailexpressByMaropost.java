/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum RetailexpressByMaropost {
    RETAILEXPRESS_BY_MAROPOST("retailexpress-by-maropost");

    @JsonValue
    private final String value;

    private RetailexpressByMaropost(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RetailexpressByMaropost> fromValue(String value) {
        for (RetailexpressByMaropost o: RetailexpressByMaropost.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

