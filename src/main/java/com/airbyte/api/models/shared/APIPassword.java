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

/**
 * APIPassword - API Password Auth
 */

public class APIPassword {

    /**
     * The API Password for your private application in the `Shopify` store.
     */
    @JsonProperty("api_password")
    private String apiPassword;

    @JsonProperty("auth_method")
    private SourceShopifySchemasAuthMethod authMethod;

    @JsonCreator
    public APIPassword(
            @JsonProperty("api_password") String apiPassword) {
        Utils.checkNotNull(apiPassword, "apiPassword");
        this.apiPassword = apiPassword;
        this.authMethod = Builder._SINGLETON_VALUE_AuthMethod.value();
    }

    /**
     * The API Password for your private application in the `Shopify` store.
     */
    @JsonIgnore
    public String apiPassword() {
        return apiPassword;
    }

    @JsonIgnore
    public SourceShopifySchemasAuthMethod authMethod() {
        return authMethod;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The API Password for your private application in the `Shopify` store.
     */
    public APIPassword withApiPassword(String apiPassword) {
        Utils.checkNotNull(apiPassword, "apiPassword");
        this.apiPassword = apiPassword;
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
        APIPassword other = (APIPassword) o;
        return 
            java.util.Objects.deepEquals(this.apiPassword, other.apiPassword) &&
            java.util.Objects.deepEquals(this.authMethod, other.authMethod);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiPassword,
            authMethod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(APIPassword.class,
                "apiPassword", apiPassword,
                "authMethod", authMethod);
    }
    
    public final static class Builder {
 
        private String apiPassword;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The API Password for your private application in the `Shopify` store.
         */
        public Builder apiPassword(String apiPassword) {
            Utils.checkNotNull(apiPassword, "apiPassword");
            this.apiPassword = apiPassword;
            return this;
        }
        
        public APIPassword build() {
            return new APIPassword(
                apiPassword);
        }

        private static final LazySingletonValue<SourceShopifySchemasAuthMethod> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"api_password\"",
                        new TypeReference<SourceShopifySchemasAuthMethod>() {});
    }
}

