/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

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
