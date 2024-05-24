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

public class AuthenticateViaPrivateKey {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceSftpBulkSchemasAuthType> authType;

    /**
     * The Private key
     */
    @JsonProperty("private_key")
    private String privateKey;

    @JsonCreator
    public AuthenticateViaPrivateKey(
            @JsonProperty("private_key") String privateKey) {
        Utils.checkNotNull(privateKey, "privateKey");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.privateKey = privateKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceSftpBulkSchemasAuthType> authType() {
        return (Optional<SourceSftpBulkSchemasAuthType>) authType;
    }

    /**
     * The Private key
     */
    @JsonIgnore
    public String privateKey() {
        return privateKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Private key
     */
    public AuthenticateViaPrivateKey withPrivateKey(String privateKey) {
        Utils.checkNotNull(privateKey, "privateKey");
        this.privateKey = privateKey;
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
        AuthenticateViaPrivateKey other = (AuthenticateViaPrivateKey) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.privateKey, other.privateKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            privateKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthenticateViaPrivateKey.class,
                "authType", authType,
                "privateKey", privateKey);
    }
    
    public final static class Builder {
 
        private String privateKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Private key
         */
        public Builder privateKey(String privateKey) {
            Utils.checkNotNull(privateKey, "privateKey");
            this.privateKey = privateKey;
            return this;
        }
        
        public AuthenticateViaPrivateKey build() {
            return new AuthenticateViaPrivateKey(
                privateKey);
        }

        private static final LazySingletonValue<Optional<? extends SourceSftpBulkSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"private_key\"",
                        new TypeReference<Optional<? extends SourceSftpBulkSchemasAuthType>>() {});
    }
}

