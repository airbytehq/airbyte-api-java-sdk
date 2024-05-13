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
 * Region - Region to pull data from (EU/NA/FE). See &lt;a href="https://advertising.amazon.com/API/docs/en-us/info/api-overview#api-endpoints"&gt;docs&lt;/a&gt; for more details.
 */
public enum Region {
    NA("NA"),
    EU("EU"),
    FE("FE");

    @JsonValue
    private final String value;

    private Region(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
