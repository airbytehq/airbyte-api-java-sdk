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


public class AuthenticateViaLeverApiKey {

    /**
     * The Api Key of your Lever Hiring account.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceLeverHiringSchemasAuthType> authType;

    @JsonCreator
    public AuthenticateViaLeverApiKey(
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
    }

    /**
     * The Api Key of your Lever Hiring account.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceLeverHiringSchemasAuthType> authType() {
        return (Optional<SourceLeverHiringSchemasAuthType>) authType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Api Key of your Lever Hiring account.
     */
    public AuthenticateViaLeverApiKey withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
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
        AuthenticateViaLeverApiKey other = (AuthenticateViaLeverApiKey) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.authType, other.authType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            authType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthenticateViaLeverApiKey.class,
                "apiKey", apiKey,
                "authType", authType);
    }
    
    public final static class Builder {
 
        private String apiKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Api Key of your Lever Hiring account.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public AuthenticateViaLeverApiKey build() {
            return new AuthenticateViaLeverApiKey(
                apiKey);
        }

        private static final LazySingletonValue<Optional<? extends SourceLeverHiringSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Api Key\"",
                        new TypeReference<Optional<? extends SourceLeverHiringSchemasAuthType>>() {});
    }
}
