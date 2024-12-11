/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DataFreshness - If set to 'final', the returned data will include only finalized, stable data. If set to 'all', fresh data will be included. When using Incremental sync mode, we do not recommend setting this parameter to 'all' as it may cause data loss. More information can be found in our &lt;a href='https://docs.airbyte.com/integrations/source/google-search-console'&gt;full documentation&lt;/a&gt;.
 */
public enum DataFreshness {
    FINAL("final"),
    ALL("all");

    @JsonValue
    private final String value;

    private DataFreshness(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
