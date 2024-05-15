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

/**
 * SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth - OAuthCredentials class to hold authentication details for Microsoft OAuth authentication.
 * This class uses pydantic for data validation and settings management.
 */

public class SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceMicrosoftSharepointAuthType> authType;

    /**
     * Client ID of your Microsoft developer application
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * Client Secret of your Microsoft developer application
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Refresh Token of your Microsoft developer application
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    private Optional<? extends String> refreshToken;

    /**
     * Tenant ID of the Microsoft SharePoint user
     */
    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonCreator
    public SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") Optional<? extends String> refreshToken,
            @JsonProperty("tenant_id") String tenantId) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(tenantId, "tenantId");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.tenantId = tenantId;
    }
    
    public SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth(
            String clientId,
            String clientSecret,
            String tenantId) {
        this(clientId, clientSecret, Optional.empty(), tenantId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMicrosoftSharepointAuthType> authType() {
        return (Optional<SourceMicrosoftSharepointAuthType>) authType;
    }

    /**
     * Client ID of your Microsoft developer application
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Client Secret of your Microsoft developer application
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * Refresh Token of your Microsoft developer application
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> refreshToken() {
        return (Optional<String>) refreshToken;
    }

    /**
     * Tenant ID of the Microsoft SharePoint user
     */
    @JsonIgnore
    public String tenantId() {
        return tenantId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Client ID of your Microsoft developer application
     */
    public SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret of your Microsoft developer application
     */
    public SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Refresh Token of your Microsoft developer application
     */
    public SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = Optional.ofNullable(refreshToken);
        return this;
    }

    /**
     * Refresh Token of your Microsoft developer application
     */
    public SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth withRefreshToken(Optional<? extends String> refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Tenant ID of the Microsoft SharePoint user
     */
    public SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth withTenantId(String tenantId) {
        Utils.checkNotNull(tenantId, "tenantId");
        this.tenantId = tenantId;
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
        SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth other = (SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            java.util.Objects.deepEquals(this.tenantId, other.tenantId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            clientId,
            clientSecret,
            refreshToken,
            tenantId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth.class,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken,
                "tenantId", tenantId);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private Optional<? extends String> refreshToken = Optional.empty();
 
        private String tenantId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Client ID of your Microsoft developer application
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Client Secret of your Microsoft developer application
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Refresh Token of your Microsoft developer application
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = Optional.ofNullable(refreshToken);
            return this;
        }

        /**
         * Refresh Token of your Microsoft developer application
         */
        public Builder refreshToken(Optional<? extends String> refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * Tenant ID of the Microsoft SharePoint user
         */
        public Builder tenantId(String tenantId) {
            Utils.checkNotNull(tenantId, "tenantId");
            this.tenantId = tenantId;
            return this;
        }
        
        public SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth build() {
            return new SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth(
                clientId,
                clientSecret,
                refreshToken,
                tenantId);
        }

        private static final LazySingletonValue<Optional<? extends SourceMicrosoftSharepointAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<Optional<? extends SourceMicrosoftSharepointAuthType>>() {});
    }
}
