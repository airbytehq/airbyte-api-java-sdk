/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionType {
    AES_CBC_ENVELOPE("aes_cbc_envelope");

    @JsonValue
    public final String value;

    private DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionAESCBCEnvelopeEncryptionEncryptionType(String value) {
        this.value = value;
    }
}
