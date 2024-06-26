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

public class APIToken {

    /**
     * API Token for making authenticated requests.
     */
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("auth_type")
    private SourceMondaySchemasAuthType authType;

    @JsonCreator
    public APIToken(
            @JsonProperty("api_token") String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
    }

    /**
     * API Token for making authenticated requests.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    @JsonIgnore
    public SourceMondaySchemasAuthType authType() {
        return authType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API Token for making authenticated requests.
     */
    public APIToken withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
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
        APIToken other = (APIToken) o;
        return 
            java.util.Objects.deepEquals(this.apiToken, other.apiToken) &&
            java.util.Objects.deepEquals(this.authType, other.authType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiToken,
            authType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(APIToken.class,
                "apiToken", apiToken,
                "authType", authType);
    }
    
    public final static class Builder {
 
        private String apiToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Token for making authenticated requests.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }
        
        public APIToken build() {
            return new APIToken(
                apiToken);
        }

        private static final LazySingletonValue<SourceMondaySchemasAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"api_token\"",
                        new TypeReference<SourceMondaySchemasAuthType>() {});
    }
}

