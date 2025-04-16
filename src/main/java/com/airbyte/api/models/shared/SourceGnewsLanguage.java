/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceGnewsLanguage {
    AR("ar"),
    ZH("zh"),
    NL("nl"),
    EN("en"),
    FR("fr"),
    DE("de"),
    EL("el"),
    HE("he"),
    HI("hi"),
    IT("it"),
    JA("ja"),
    ML("ml"),
    MR("mr"),
    NO("no"),
    PT("pt"),
    RO("ro"),
    RU("ru"),
    ES("es"),
    SV("sv"),
    TA("ta"),
    TE("te"),
    UK("uk");

    @JsonValue
    private final String value;

    private SourceGnewsLanguage(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceGnewsLanguage> fromValue(String value) {
        for (SourceGnewsLanguage o: SourceGnewsLanguage.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

