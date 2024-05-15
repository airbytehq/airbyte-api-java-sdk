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
 * SourceMicrosoftOnedriveValidationPolicy - The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
 */
public enum SourceMicrosoftOnedriveValidationPolicy {
    EMIT_RECORD("Emit Record"),
    SKIP_RECORD("Skip Record"),
    WAIT_FOR_DISCOVER("Wait for Discover");

    @JsonValue
    private final String value;

    private SourceMicrosoftOnedriveValidationPolicy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}