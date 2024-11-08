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

/**
 * SourceGnewsCountry - This parameter allows you to specify the country where the news articles returned by the API were published, the contents of the articles are not necessarily related to the specified country. You have to set as value the 2 letters code of the country you want to filter.
 */
public enum SourceGnewsCountry {
    AU("au"),
    BR("br"),
    CA("ca"),
    CN("cn"),
    EG("eg"),
    FR("fr"),
    DE("de"),
    GR("gr"),
    HK("hk"),
    IN("in"),
    IE("ie"),
    IL("il"),
    IT("it"),
    JP("jp"),
    NL("nl"),
    NO("no"),
    PK("pk"),
    PE("pe"),
    PH("ph"),
    PT("pt"),
    RO("ro"),
    RU("ru"),
    SG("sg"),
    ES("es"),
    SE("se"),
    CH("ch"),
    TW("tw"),
    UA("ua"),
    GB("gb"),
    US("us");

    @JsonValue
    private final String value;

    private SourceGnewsCountry(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
