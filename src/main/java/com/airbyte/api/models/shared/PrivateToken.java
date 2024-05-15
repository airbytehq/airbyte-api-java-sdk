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


public class PrivateToken {

    /**
     * Log into your Gitlab account and then generate a personal Access Token.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceGitlabSchemasAuthType> authType;

    @JsonCreator
    public PrivateToken(
            @JsonProperty("access_token") String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
    }

    /**
     * Log into your Gitlab account and then generate a personal Access Token.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGitlabSchemasAuthType> authType() {
        return (Optional<SourceGitlabSchemasAuthType>) authType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Log into your Gitlab account and then generate a personal Access Token.
     */
    public PrivateToken withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
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
        PrivateToken other = (PrivateToken) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.authType, other.authType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            authType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PrivateToken.class,
                "accessToken", accessToken,
                "authType", authType);
    }
    
    public final static class Builder {
 
        private String accessToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Log into your Gitlab account and then generate a personal Access Token.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }
        
        public PrivateToken build() {
            return new PrivateToken(
                accessToken);
        }

        private static final LazySingletonValue<Optional<? extends SourceGitlabSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"access_token\"",
                        new TypeReference<Optional<? extends SourceGitlabSchemasAuthType>>() {});
    }
}

