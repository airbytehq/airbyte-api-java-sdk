/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceAmazonSqsAmazonSqs {
    AMAZON_SQS("amazon-sqs");

    @JsonValue
    public final String value;

    private SourceAmazonSqsAmazonSqs(String value) {
        this.value = value;
    }
}
