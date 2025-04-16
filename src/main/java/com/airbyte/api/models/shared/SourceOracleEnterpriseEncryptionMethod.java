/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SourceOracleEnterpriseEncryptionMethod {
    UNENCRYPTED("unencrypted");

    @JsonValue
    private final String value;

    private SourceOracleEnterpriseEncryptionMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SourceOracleEnterpriseEncryptionMethod> fromValue(String value) {
        for (SourceOracleEnterpriseEncryptionMethod o: SourceOracleEnterpriseEncryptionMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

