/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceMailchimpMailchimp {
    MAILCHIMP("mailchimp");

    @JsonValue
    public final String value;

    private SourceMailchimpMailchimp(String value) {
        this.value = value;
    }
}
