/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationOracleOracleEnum {
    ORACLE("oracle");

    @JsonValue
    public final String value;

    private DestinationOracleOracleEnum(String value) {
        this.value = value;
    }
}
