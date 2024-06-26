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

public class AuthenticateViaLeverOAuth {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceLeverHiringAuthType> authType;

    /**
     * The Client ID of your Lever Hiring developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<? extends String> clientId;

    /**
     * The Client Secret of your Lever Hiring developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<? extends String> clientSecret;

    /**
     * The token for obtaining new access token.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonCreator
    public AuthenticateViaLeverOAuth(
            @JsonProperty("client_id") Optional<? extends String> clientId,
            @JsonProperty("client_secret") Optional<? extends String> clientSecret,
            @JsonProperty("refresh_token") String refreshToken) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
    }
    
    public AuthenticateViaLeverOAuth(
            String refreshToken) {
        this(Optional.empty(), Optional.empty(), refreshToken);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceLeverHiringAuthType> authType() {
        return (Optional<SourceLeverHiringAuthType>) authType;
    }

    /**
     * The Client ID of your Lever Hiring developer application.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientId() {
        return (Optional<String>) clientId;
    }

    /**
     * The Client Secret of your Lever Hiring developer application.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientSecret() {
        return (Optional<String>) clientSecret;
    }

    /**
     * The token for obtaining new access token.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Client ID of your Lever Hiring developer application.
     */
    public AuthenticateViaLeverOAuth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * The Client ID of your Lever Hiring developer application.
     */
    public AuthenticateViaLeverOAuth withClientId(Optional<? extends String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Lever Hiring developer application.
     */
    public AuthenticateViaLeverOAuth withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * The Client Secret of your Lever Hiring developer application.
     */
    public AuthenticateViaLeverOAuth withClientSecret(Optional<? extends String> clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The token for obtaining new access token.
     */
    public AuthenticateViaLeverOAuth withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
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
        AuthenticateViaLeverOAuth other = (AuthenticateViaLeverOAuth) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            clientId,
            clientSecret,
            refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthenticateViaLeverOAuth.class,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> clientId = Optional.empty();
 
        private Optional<? extends String> clientSecret = Optional.empty();
 
        private String refreshToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Client ID of your Lever Hiring developer application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * The Client ID of your Lever Hiring developer application.
         */
        public Builder clientId(Optional<? extends String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your Lever Hiring developer application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * The Client Secret of your Lever Hiring developer application.
         */
        public Builder clientSecret(Optional<? extends String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The token for obtaining new access token.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }
        
        public AuthenticateViaLeverOAuth build() {
            return new AuthenticateViaLeverOAuth(
                clientId,
                clientSecret,
                refreshToken);
        }

        private static final LazySingletonValue<Optional<? extends SourceLeverHiringAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<Optional<? extends SourceLeverHiringAuthType>>() {});
    }
}

