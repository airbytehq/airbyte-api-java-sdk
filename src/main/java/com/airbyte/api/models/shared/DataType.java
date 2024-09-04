/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DataType - /latest: Latest market ticker quotes and averages for cryptocurrencies and exchanges. /historical: Intervals of historic market data like OHLCV data or data for use in charting libraries. See &lt;a href="https://coinmarketcap.com/api/documentation/v1/#section/Endpoint-Overview"&gt;here&lt;/a&gt;.
 */
public enum DataType {
    LATEST("latest"),
    HISTORICAL("historical");

    @JsonValue
    private final String value;

    private DataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
