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

public class SingleStoreAccessToken {

    /**
     * Access Token for making authenticated requests.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("auth_type")
    private SourceCartSchemasAuthType authType;

    /**
     * The name of Cart.com Online Store. All API URLs start with https://[mystorename.com]/api/v1/, where [mystorename.com] is the domain name of your store.
     */
    @JsonProperty("store_name")
    private String storeName;

    @JsonCreator
    public SingleStoreAccessToken(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("store_name") String storeName) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(storeName, "storeName");
        this.accessToken = accessToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.storeName = storeName;
    }

    /**
     * Access Token for making authenticated requests.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public SourceCartSchemasAuthType authType() {
        return authType;
    }

    /**
     * The name of Cart.com Online Store. All API URLs start with https://[mystorename.com]/api/v1/, where [mystorename.com] is the domain name of your store.
     */
    @JsonIgnore
    public String storeName() {
        return storeName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Access Token for making authenticated requests.
     */
    public SingleStoreAccessToken withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The name of Cart.com Online Store. All API URLs start with https://[mystorename.com]/api/v1/, where [mystorename.com] is the domain name of your store.
     */
    public SingleStoreAccessToken withStoreName(String storeName) {
        Utils.checkNotNull(storeName, "storeName");
        this.storeName = storeName;
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
        SingleStoreAccessToken other = (SingleStoreAccessToken) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.storeName, other.storeName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            authType,
            storeName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SingleStoreAccessToken.class,
                "accessToken", accessToken,
                "authType", authType,
                "storeName", storeName);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private String storeName;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Access Token for making authenticated requests.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The name of Cart.com Online Store. All API URLs start with https://[mystorename.com]/api/v1/, where [mystorename.com] is the domain name of your store.
         */
        public Builder storeName(String storeName) {
            Utils.checkNotNull(storeName, "storeName");
            this.storeName = storeName;
            return this;
        }
        
        public SingleStoreAccessToken build() {
            return new SingleStoreAccessToken(
                accessToken,
                storeName);
        }

        private static final LazySingletonValue<SourceCartSchemasAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"SINGLE_STORE_ACCESS_TOKEN\"",
                        new TypeReference<SourceCartSchemasAuthType>() {});
    }
}

