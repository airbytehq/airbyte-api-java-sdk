/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * NamespaceDefinitionEnum - Define the location where the data will be stored in the destination
 */
public enum NamespaceDefinitionEnum {
    SOURCE("source"),
    DESTINATION("destination"),
    CUSTOM_FORMAT("custom_format");

    @JsonValue
    private final String value;

    private NamespaceDefinitionEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
