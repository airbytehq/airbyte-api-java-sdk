/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationRedisRedis {
    REDIS("redis");

    @JsonValue
    public final String value;

    private DestinationRedisRedis(String value) {
        this.value = value;
    }
}
