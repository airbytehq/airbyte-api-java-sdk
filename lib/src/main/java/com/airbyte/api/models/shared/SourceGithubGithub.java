/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceGithubGithub {
    GITHUB("github");

    @JsonValue
    public final String value;

    private SourceGithubGithub(String value) {
        this.value = value;
    }
}