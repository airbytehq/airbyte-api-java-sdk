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

public enum SourceMssqlSchemasSSLMethodSSLMethodSSLMethod {
    ENCRYPTED_VERIFY_CERTIFICATE("encrypted_verify_certificate");

    @JsonValue
    private final String value;

    private SourceMssqlSchemasSSLMethodSSLMethodSSLMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
