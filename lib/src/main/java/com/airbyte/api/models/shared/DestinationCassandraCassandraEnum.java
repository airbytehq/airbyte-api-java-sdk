/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationCassandraCassandraEnum {
    CASSANDRA("cassandra");

    @JsonValue
    public final String value;

    private DestinationCassandraCassandraEnum(String value) {
        this.value = value;
    }
}
