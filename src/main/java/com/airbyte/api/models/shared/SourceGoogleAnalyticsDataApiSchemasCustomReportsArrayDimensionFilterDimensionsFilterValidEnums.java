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

public enum SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilterValidEnums {
    MATCH_TYPE_UNSPECIFIED("MATCH_TYPE_UNSPECIFIED"),
    EXACT("EXACT"),
    BEGINS_WITH("BEGINS_WITH"),
    ENDS_WITH("ENDS_WITH"),
    CONTAINS("CONTAINS"),
    FULL_REGEXP("FULL_REGEXP"),
    PARTIAL_REGEXP("PARTIAL_REGEXP");

    @JsonValue
    private final String value;

    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilterValidEnums(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
