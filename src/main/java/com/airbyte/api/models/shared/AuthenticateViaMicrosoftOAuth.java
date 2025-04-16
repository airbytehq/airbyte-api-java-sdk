/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * AuthenticateViaMicrosoftOAuth
 * 
 * <p>OAuthCredentials class to hold authentication details for Microsoft OAuth authentication.
 * This class uses pydantic for data validation and settings management.
 */
public class AuthenticateViaMicrosoftOAuth {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceMicrosoftOnedriveAuthType> authType;

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
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * Tenant ID of the Microsoft OneDrive user
     */
    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonCreator
    public AuthenticateViaMicrosoftOAuth(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken,
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMicrosoftOnedriveAuthType> authType() {
        return (Optional<SourceMicrosoftOnedriveAuthType>) authType;
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
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    /**
     * Tenant ID of the Microsoft OneDrive user
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
    public AuthenticateViaMicrosoftOAuth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret of your Microsoft developer application
     */
    public AuthenticateViaMicrosoftOAuth withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Refresh Token of your Microsoft developer application
     */
    public AuthenticateViaMicrosoftOAuth withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Tenant ID of the Microsoft OneDrive user
     */
    public AuthenticateViaMicrosoftOAuth withTenantId(String tenantId) {
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
        AuthenticateViaMicrosoftOAuth other = (AuthenticateViaMicrosoftOAuth) o;
        return 
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            Objects.deepEquals(this.tenantId, other.tenantId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authType,
            clientId,
            clientSecret,
            refreshToken,
            tenantId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthenticateViaMicrosoftOAuth.class,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken,
                "tenantId", tenantId);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private String refreshToken;
 
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
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * Tenant ID of the Microsoft OneDrive user
         */
        public Builder tenantId(String tenantId) {
            Utils.checkNotNull(tenantId, "tenantId");
            this.tenantId = tenantId;
            return this;
        }
        
        public AuthenticateViaMicrosoftOAuth build() {
            return new AuthenticateViaMicrosoftOAuth(
                clientId,
                clientSecret,
                refreshToken,
                tenantId);
        }

        private static final LazySingletonValue<Optional<? extends SourceMicrosoftOnedriveAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<Optional<? extends SourceMicrosoftOnedriveAuthType>>() {});
    }
}
