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
 * DestinationPgvectorLanguage - Split code in suitable places based on the programming language
 */
public enum DestinationPgvectorLanguage {
    CPP("cpp"),
    GO("go"),
    JAVA("java"),
    JS("js"),
    PHP("php"),
    PROTO("proto"),
    PYTHON("python"),
    RST("rst"),
    RUBY("ruby"),
    RUST("rust"),
    SCALA("scala"),
    SWIFT("swift"),
    MARKDOWN("markdown"),
    LATEX("latex"),
    HTML("html"),
    SOL("sol");

    @JsonValue
    private final String value;

    private DestinationPgvectorLanguage(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
