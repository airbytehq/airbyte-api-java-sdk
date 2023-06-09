/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAwsDatalakeCredentialsIAMUser - Choose How to Authenticate to AWS.
 */

public class DestinationAwsDatalakeCredentialsIAMUser {
    /**
     * AWS User Access Key Id
     */
    @JsonProperty("aws_access_key_id")
    public String awsAccessKeyId;

    public DestinationAwsDatalakeCredentialsIAMUser withAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
        return this;
    }
    
    /**
     * Secret Access Key
     */
    @JsonProperty("aws_secret_access_key")
    public String awsSecretAccessKey;

    public DestinationAwsDatalakeCredentialsIAMUser withAwsSecretAccessKey(String awsSecretAccessKey) {
        this.awsSecretAccessKey = awsSecretAccessKey;
        return this;
    }
    
    /**
     * Name of the credentials
     */
    @JsonProperty("credentials_title")
    public DestinationAwsDatalakeCredentialsIAMUserCredentialsTitle credentialsTitle;

    public DestinationAwsDatalakeCredentialsIAMUser withCredentialsTitle(DestinationAwsDatalakeCredentialsIAMUserCredentialsTitle credentialsTitle) {
        this.credentialsTitle = credentialsTitle;
        return this;
    }
    
    public DestinationAwsDatalakeCredentialsIAMUser(@JsonProperty("aws_access_key_id") String awsAccessKeyId, @JsonProperty("aws_secret_access_key") String awsSecretAccessKey, @JsonProperty("credentials_title") DestinationAwsDatalakeCredentialsIAMUserCredentialsTitle credentialsTitle) {
        this.awsAccessKeyId = awsAccessKeyId;
        this.awsSecretAccessKey = awsSecretAccessKey;
        this.credentialsTitle = credentialsTitle;
  }
}
