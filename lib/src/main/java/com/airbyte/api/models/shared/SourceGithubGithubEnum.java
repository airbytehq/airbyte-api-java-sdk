/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceGithubGithubEnum {
    GITHUB("github");

    @JsonValue
    public final String value;

    private SourceGithubGithubEnum(String value) {
        this.value = value;
    }
}
