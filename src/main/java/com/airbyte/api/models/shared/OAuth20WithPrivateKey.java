/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class OAuth20WithPrivateKey {

    @JsonProperty("auth_type")
    private SourceOktaSchemasAuthType authType;

    /**
     * The Client ID of your OAuth application.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The key ID (kid).
     */
    @JsonProperty("key_id")
    private String keyId;

    /**
     * The private key in PEM format
     */
    @JsonProperty("private_key")
    private String privateKey;

    /**
     * The OAuth scope.
     */
    @JsonProperty("scope")
    private String scope;

    @JsonCreator
    public OAuth20WithPrivateKey(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("key_id") String keyId,
            @JsonProperty("private_key") String privateKey,
            @JsonProperty("scope") String scope) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(keyId, "keyId");
        Utils.checkNotNull(privateKey, "privateKey");
        Utils.checkNotNull(scope, "scope");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.keyId = keyId;
        this.privateKey = privateKey;
        this.scope = scope;
    }

    @JsonIgnore
    public SourceOktaSchemasAuthType authType() {
        return authType;
    }

    /**
     * The Client ID of your OAuth application.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The key ID (kid).
     */
    @JsonIgnore
    public String keyId() {
        return keyId;
    }

    /**
     * The private key in PEM format
     */
    @JsonIgnore
    public String privateKey() {
        return privateKey;
    }

    /**
     * The OAuth scope.
     */
    @JsonIgnore
    public String scope() {
        return scope;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Client ID of your OAuth application.
     */
    public OAuth20WithPrivateKey withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The key ID (kid).
     */
    public OAuth20WithPrivateKey withKeyId(String keyId) {
        Utils.checkNotNull(keyId, "keyId");
        this.keyId = keyId;
        return this;
    }

    /**
     * The private key in PEM format
     */
    public OAuth20WithPrivateKey withPrivateKey(String privateKey) {
        Utils.checkNotNull(privateKey, "privateKey");
        this.privateKey = privateKey;
        return this;
    }

    /**
     * The OAuth scope.
     */
    public OAuth20WithPrivateKey withScope(String scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = scope;
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
        OAuth20WithPrivateKey other = (OAuth20WithPrivateKey) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.keyId, other.keyId) &&
            java.util.Objects.deepEquals(this.privateKey, other.privateKey) &&
            java.util.Objects.deepEquals(this.scope, other.scope);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            clientId,
            keyId,
            privateKey,
            scope);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OAuth20WithPrivateKey.class,
                "authType", authType,
                "clientId", clientId,
                "keyId", keyId,
                "privateKey", privateKey,
                "scope", scope);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String keyId;
 
        private String privateKey;
 
        private String scope;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Client ID of your OAuth application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The key ID (kid).
         */
        public Builder keyId(String keyId) {
            Utils.checkNotNull(keyId, "keyId");
            this.keyId = keyId;
            return this;
        }

        /**
         * The private key in PEM format
         */
        public Builder privateKey(String privateKey) {
            Utils.checkNotNull(privateKey, "privateKey");
            this.privateKey = privateKey;
            return this;
        }

        /**
         * The OAuth scope.
         */
        public Builder scope(String scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = scope;
            return this;
        }
        
        public OAuth20WithPrivateKey build() {
            return new OAuth20WithPrivateKey(
                clientId,
                keyId,
                privateKey,
                scope);
        }

        private static final LazySingletonValue<SourceOktaSchemasAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"oauth2.0_private_key\"",
                        new TypeReference<SourceOktaSchemasAuthType>() {});
    }
}
