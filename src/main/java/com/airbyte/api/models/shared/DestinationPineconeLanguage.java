/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationPineconeLanguage
 * 
 * <p>Split code in suitable places based on the programming language
 */
public enum DestinationPineconeLanguage {
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

    private DestinationPineconeLanguage(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DestinationPineconeLanguage> fromValue(String value) {
        for (DestinationPineconeLanguage o: DestinationPineconeLanguage.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

