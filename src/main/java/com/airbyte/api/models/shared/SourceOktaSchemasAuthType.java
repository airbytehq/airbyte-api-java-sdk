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

public enum SourceOktaSchemasAuthType {
    OAUTH20_PRIVATE_KEY("oauth2.0_private_key");

    @JsonValue
    private final String value;

    private SourceOktaSchemasAuthType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
