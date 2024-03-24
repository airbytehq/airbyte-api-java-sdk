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
 * ClickWindowDays - Number of days to use as the conversion attribution window for a pin click action.
 */
public enum ClickWindowDays {
    ZERO(0L),
    ONE(1L),
    SEVEN(7L),
    FOURTEEN(14L),
    THIRTY(30L),
    SIXTY(60L);

    @JsonValue
    private final long value;

    private ClickWindowDays(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
}
