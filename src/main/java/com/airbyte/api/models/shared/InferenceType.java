/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * InferenceType - How to infer the types of the columns. If none, inference default to strings.
 */
public enum InferenceType {
    NONE("None"),
    PRIMITIVE_TYPES_ONLY("Primitive Types Only");

    @JsonValue
    private final String value;

    private InferenceType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
