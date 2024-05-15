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


public class SourceSquareAPIKey {

    /**
     * The API key for a Square application
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("auth_type")
    private SourceSquareSchemasAuthType authType;

    @JsonCreator
    public SourceSquareAPIKey(
            @JsonProperty("api_key") String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
    }

    /**
     * The API key for a Square application
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public SourceSquareSchemasAuthType authType() {
        return authType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The API key for a Square application
     */
    public SourceSquareAPIKey withApiKey(String apiKey) {
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
        SourceSquareAPIKey other = (SourceSquareAPIKey) o;
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
        return Utils.toString(SourceSquareAPIKey.class,
                "apiKey", apiKey,
                "authType", authType);
    }
    
    public final static class Builder {
 
        private String apiKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The API key for a Square application
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }
        
        public SourceSquareAPIKey build() {
            return new SourceSquareAPIKey(
                apiKey);
        }

        private static final LazySingletonValue<SourceSquareSchemasAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"API Key\"",
                        new TypeReference<SourceSquareSchemasAuthType>() {});
    }
}

