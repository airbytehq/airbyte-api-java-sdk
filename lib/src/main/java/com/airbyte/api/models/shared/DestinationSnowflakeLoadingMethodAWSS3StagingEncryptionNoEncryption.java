/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryption - Staging data will be stored in plaintext.
 */

public class DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryption {
    @JsonProperty("encryption_type")
    public DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryptionEncryptionType encryptionType;

    public DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryption withEncryptionType(DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryptionEncryptionType encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    
    public DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryption(@JsonProperty("encryption_type") DestinationSnowflakeLoadingMethodAWSS3StagingEncryptionNoEncryptionEncryptionType encryptionType) {
        this.encryptionType = encryptionType;
  }
}
