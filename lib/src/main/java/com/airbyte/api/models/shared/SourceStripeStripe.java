/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceStripeStripe {
    STRIPE("stripe");

    @JsonValue
    public final String value;

    private SourceStripeStripe(String value) {
        this.value = value;
    }
}
