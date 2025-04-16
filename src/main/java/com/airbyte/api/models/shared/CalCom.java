/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum CalCom {
    CAL_COM("cal-com");

    @JsonValue
    private final String value;

    private CalCom(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CalCom> fromValue(String value) {
        for (CalCom o: CalCom.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

