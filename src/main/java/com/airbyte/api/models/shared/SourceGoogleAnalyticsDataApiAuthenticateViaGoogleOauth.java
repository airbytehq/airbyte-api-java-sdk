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

public class SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth {

    /**
     * Access Token for making authenticated requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    private Optional<String> accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceGoogleAnalyticsDataApiAuthType> authType;

    /**
     * The Client ID of your Google Analytics developer application.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret of your Google Analytics developer application.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * The token for obtaining a new access token.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonCreator
    public SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth(
            @JsonProperty("access_token") Optional<String> accessToken,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
    }
    
    public SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth(
            String clientId,
            String clientSecret,
            String refreshToken) {
        this(Optional.empty(), clientId, clientSecret, refreshToken);
    }

    /**
     * Access Token for making authenticated requests.
     */
    @JsonIgnore
    public Optional<String> accessToken() {
        return accessToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGoogleAnalyticsDataApiAuthType> authType() {
        return (Optional<SourceGoogleAnalyticsDataApiAuthType>) authType;
    }

    /**
     * The Client ID of your Google Analytics developer application.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your Google Analytics developer application.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * The token for obtaining a new access token.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Access Token for making authenticated requests.
     */
    public SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = Optional.ofNullable(accessToken);
        return this;
    }

    /**
     * Access Token for making authenticated requests.
     */
    public SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth withAccessToken(Optional<String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The Client ID of your Google Analytics developer application.
     */
    public SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Google Analytics developer application.
     */
    public SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The token for obtaining a new access token.
     */
    public SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth withRefreshToken(String refreshToken) {
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
        SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth other = (SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            authType,
            clientId,
            clientSecret,
            refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth.class,
                "accessToken", accessToken,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken);
    }
    
    public final static class Builder {
 
        private Optional<String> accessToken = Optional.empty();
 
        private String clientId;
 
        private String clientSecret;
 
        private String refreshToken;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Access Token for making authenticated requests.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = Optional.ofNullable(accessToken);
            return this;
        }

        /**
         * Access Token for making authenticated requests.
         */
        public Builder accessToken(Optional<String> accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The Client ID of your Google Analytics developer application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your Google Analytics developer application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The token for obtaining a new access token.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }
        
        public SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth build() {
            return new SourceGoogleAnalyticsDataApiAuthenticateViaGoogleOauth(
                accessToken,
                clientId,
                clientSecret,
                refreshToken);
        }

        private static final LazySingletonValue<Optional<? extends SourceGoogleAnalyticsDataApiAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<Optional<? extends SourceGoogleAnalyticsDataApiAuthType>>() {});
    }
}
