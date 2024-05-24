/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class IAMUser {

    /**
     * AWS User Access Key Id
     */
    @JsonProperty("aws_access_key_id")
    private String awsAccessKeyId;

    /**
     * Secret Access Key
     */
    @JsonProperty("aws_secret_access_key")
    private String awsSecretAccessKey;

    /**
     * Name of the credentials
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials_title")
    private Optional<? extends DestinationAwsDatalakeCredentialsTitle> credentialsTitle;

    @JsonCreator
    public IAMUser(
            @JsonProperty("aws_access_key_id") String awsAccessKeyId,
            @JsonProperty("aws_secret_access_key") String awsSecretAccessKey) {
        Utils.checkNotNull(awsAccessKeyId, "awsAccessKeyId");
        Utils.checkNotNull(awsSecretAccessKey, "awsSecretAccessKey");
        this.awsAccessKeyId = awsAccessKeyId;
        this.awsSecretAccessKey = awsSecretAccessKey;
        this.credentialsTitle = Builder._SINGLETON_VALUE_CredentialsTitle.value();
    }

    /**
     * AWS User Access Key Id
     */
    @JsonIgnore
    public String awsAccessKeyId() {
        return awsAccessKeyId;
    }

    /**
     * Secret Access Key
     */
    @JsonIgnore
    public String awsSecretAccessKey() {
        return awsSecretAccessKey;
    }

    /**
     * Name of the credentials
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationAwsDatalakeCredentialsTitle> credentialsTitle() {
        return (Optional<DestinationAwsDatalakeCredentialsTitle>) credentialsTitle;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * AWS User Access Key Id
     */
    public IAMUser withAwsAccessKeyId(String awsAccessKeyId) {
        Utils.checkNotNull(awsAccessKeyId, "awsAccessKeyId");
        this.awsAccessKeyId = awsAccessKeyId;
        return this;
    }

    /**
     * Secret Access Key
     */
    public IAMUser withAwsSecretAccessKey(String awsSecretAccessKey) {
        Utils.checkNotNull(awsSecretAccessKey, "awsSecretAccessKey");
        this.awsSecretAccessKey = awsSecretAccessKey;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IAMUser other = (IAMUser) o;
        return 
            java.util.Objects.deepEquals(this.awsAccessKeyId, other.awsAccessKeyId) &&
            java.util.Objects.deepEquals(this.awsSecretAccessKey, other.awsSecretAccessKey) &&
            java.util.Objects.deepEquals(this.credentialsTitle, other.credentialsTitle);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            awsAccessKeyId,
            awsSecretAccessKey,
            credentialsTitle);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IAMUser.class,
                "awsAccessKeyId", awsAccessKeyId,
                "awsSecretAccessKey", awsSecretAccessKey,
                "credentialsTitle", credentialsTitle);
    }
    
    public final static class Builder {
 
        private String awsAccessKeyId;
 
        private String awsSecretAccessKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * AWS User Access Key Id
         */
        public Builder awsAccessKeyId(String awsAccessKeyId) {
            Utils.checkNotNull(awsAccessKeyId, "awsAccessKeyId");
            this.awsAccessKeyId = awsAccessKeyId;
            return this;
        }

        /**
         * Secret Access Key
         */
        public Builder awsSecretAccessKey(String awsSecretAccessKey) {
            Utils.checkNotNull(awsSecretAccessKey, "awsSecretAccessKey");
            this.awsSecretAccessKey = awsSecretAccessKey;
            return this;
        }
        
        public IAMUser build() {
            return new IAMUser(
                awsAccessKeyId,
                awsSecretAccessKey);
        }

        private static final LazySingletonValue<Optional<? extends DestinationAwsDatalakeCredentialsTitle>> _SINGLETON_VALUE_CredentialsTitle =
                new LazySingletonValue<>(
                        "credentials_title",
                        "\"IAM User\"",
                        new TypeReference<Optional<? extends DestinationAwsDatalakeCredentialsTitle>>() {});
    }
}

