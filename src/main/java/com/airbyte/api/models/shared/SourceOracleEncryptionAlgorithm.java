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
 * SourceOracleEncryptionAlgorithm - This parameter defines what encryption algorithm is used.
 */
public enum SourceOracleEncryptionAlgorithm {
    AES256("AES256"),
    RC456("RC4_56"),
    THREE_DES168("3DES168");

    @JsonValue
    private final String value;

    private SourceOracleEncryptionAlgorithm(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
