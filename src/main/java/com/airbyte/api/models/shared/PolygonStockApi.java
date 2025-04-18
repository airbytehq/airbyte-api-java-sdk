/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum PolygonStockApi {
    POLYGON_STOCK_API("polygon-stock-api");

    @JsonValue
    private final String value;

    private PolygonStockApi(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PolygonStockApi> fromValue(String value) {
        for (PolygonStockApi o: PolygonStockApi.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

