/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationAwsDatalakeAwsDatalakeEnum {
    AWS_DATALAKE("aws-datalake");

    @JsonValue
    public final String value;

    private DestinationAwsDatalakeAwsDatalakeEnum(String value) {
        this.value = value;
    }
}