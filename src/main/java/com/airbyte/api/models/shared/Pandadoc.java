/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Pandadoc {
    PANDADOC("pandadoc");

    @JsonValue
    private final String value;

    private Pandadoc(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Pandadoc> fromValue(String value) {
        for (Pandadoc o: Pandadoc.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}