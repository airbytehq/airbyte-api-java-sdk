/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstance {
    STANDALONE("standalone");

    @JsonValue
    public final String value;

    private SourceMongodbInstanceTypeStandaloneMongoDbInstanceInstance(String value) {
        this.value = value;
    }
}
