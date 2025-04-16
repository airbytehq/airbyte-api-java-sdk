/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * GroupBy
 * 
 * <p>Category term for grouping the search results
 */
public enum GroupBy {
    NETWORK("network"),
    PRODUCT("product"),
    COUNTRY("country"),
    DATE("date");

    @JsonValue
    private final String value;

    private GroupBy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GroupBy> fromValue(String value) {
        for (GroupBy o: GroupBy.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

