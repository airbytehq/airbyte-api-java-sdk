/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceSnowflakeSnowflakeEnum {
    SNOWFLAKE("snowflake");

    @JsonValue
    public final String value;

    private SourceSnowflakeSnowflakeEnum(String value) {
        this.value = value;
    }
}
