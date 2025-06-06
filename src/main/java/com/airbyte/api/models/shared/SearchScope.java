/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SearchScope
 * 
 * <p>Specifies the location(s) to search for files. Valid options are 'ACCESSIBLE_DRIVES' to search in the selected OneDrive drive, 'SHARED_ITEMS' for shared items the user has access to, and 'ALL' to search both.
 */
public enum SearchScope {
    ACCESSIBLE_DRIVES("ACCESSIBLE_DRIVES"),
    SHARED_ITEMS("SHARED_ITEMS"),
    ALL("ALL");

    @JsonValue
    private final String value;

    private SearchScope(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SearchScope> fromValue(String value) {
        for (SearchScope o: SearchScope.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

