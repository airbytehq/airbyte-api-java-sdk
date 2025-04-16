/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * EncryptionAlgorithm
 * 
 * <p>This parameter defines the database encryption algorithm.
 */
public enum EncryptionAlgorithm {
    AES256("AES256"),
    RC456("RC4_56"),
    THREE_DES168("3DES168");

    @JsonValue
    private final String value;

    private EncryptionAlgorithm(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EncryptionAlgorithm> fromValue(String value) {
        for (EncryptionAlgorithm o: EncryptionAlgorithm.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

