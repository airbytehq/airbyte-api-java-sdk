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
 * SourceFileSchemasProviderStorageProvider8Storage - WARNING: Note that the local storage URL available for reading must start with the local mount "/local/" at the moment until we implement more advanced docker mounting options.
 */
public enum SourceFileSchemasProviderStorageProvider8Storage {
    LOCAL("local");

    @JsonValue
    private final String value;

    private SourceFileSchemasProviderStorageProvider8Storage(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
