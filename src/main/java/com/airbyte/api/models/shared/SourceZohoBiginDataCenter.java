/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SourceZohoBiginDataCenter - The data center where the Bigin account's resources are hosted
 */
public enum SourceZohoBiginDataCenter {
    COM("com"),
    COM_AU("com.au"),
    EU("eu"),
    IN("in"),
    COM_CN("com.cn"),
    JP("jp");

    @JsonValue
    private final String value;

    private SourceZohoBiginDataCenter(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
