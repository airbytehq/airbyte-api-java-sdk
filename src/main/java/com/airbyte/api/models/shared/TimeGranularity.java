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
 * TimeGranularity - Choose how to group the data in your report by time. The options are:&lt;br&gt;- 'ALL': A single result summarizing the entire time range.&lt;br&gt;- 'DAILY': Group results by each day.&lt;br&gt;- 'MONTHLY': Group results by each month.&lt;br&gt;- 'YEARLY': Group results by each year.&lt;br&gt;Selecting a time grouping helps you analyze trends and patterns over different time periods.
 */
public enum TimeGranularity {
    ALL("ALL"),
    DAILY("DAILY"),
    MONTHLY("MONTHLY"),
    YEARLY("YEARLY");

    @JsonValue
    private final String value;

    private TimeGranularity(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
