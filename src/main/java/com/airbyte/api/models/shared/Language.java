/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public enum Language {
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

    private Language(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
