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
 * ChooseHowToPartitionData - Partition data by cursor fields when a cursor field is a date
 */
public enum ChooseHowToPartitionData {
    NO_PARTITIONING("NO PARTITIONING"),
    DATE("DATE"),
    YEAR("YEAR"),
    MONTH("MONTH"),
    DAY("DAY"),
    YEAR_MONTH("YEAR/MONTH"),
    YEAR_MONTH_DAY("YEAR/MONTH/DAY");

    @JsonValue
    private final String value;

    private ChooseHowToPartitionData(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
