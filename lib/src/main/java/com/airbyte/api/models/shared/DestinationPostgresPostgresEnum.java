/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationPostgresPostgresEnum {
    POSTGRES("postgres");

    @JsonValue
    public final String value;

    private DestinationPostgresPostgresEnum(String value) {
        this.value = value;
    }
}
