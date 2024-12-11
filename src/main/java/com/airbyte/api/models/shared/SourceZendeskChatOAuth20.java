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
import java.util.Objects;
import java.util.Optional;


public class SourceZendeskChatOAuth20 {

    /**
     * Access Token for making authenticated requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    private Optional<String> accessToken;

    /**
     * The Client ID of your OAuth application
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<String> clientId;

    /**
     * The Client Secret of your OAuth application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<String> clientSecret;

    @JsonProperty("credentials")
    private SourceZendeskChatCredentials credentials;

    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    private Optional<String> refreshToken;

    @JsonCreator
    public SourceZendeskChatOAuth20(
            @JsonProperty("access_token") Optional<String> accessToken,
            @JsonProperty("client_id") Optional<String> clientId,
            @JsonProperty("client_secret") Optional<String> clientSecret,
            @JsonProperty("refresh_token") Optional<String> refreshToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.credentials = Builder._SINGLETON_VALUE_Credentials.value();
        this.refreshToken = refreshToken;
    }
    
    public SourceZendeskChatOAuth20() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Access Token for making authenticated requests.
     */
    @JsonIgnore
    public Optional<String> accessToken() {
        return accessToken;
    }

    /**
     * The Client ID of your OAuth application
     */
    @JsonIgnore
    public Optional<String> clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your OAuth application.
     */
    @JsonIgnore
    public Optional<String> clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public SourceZendeskChatCredentials credentials() {
        return credentials;
    }

    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    @JsonIgnore
    public Optional<String> refreshToken() {
        return refreshToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Access Token for making authenticated requests.
     */
    public SourceZendeskChatOAuth20 withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = Optional.ofNullable(accessToken);
        return this;
    }

    /**
     * Access Token for making authenticated requests.
     */
    public SourceZendeskChatOAuth20 withAccessToken(Optional<String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The Client ID of your OAuth application
     */
    public SourceZendeskChatOAuth20 withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * The Client ID of your OAuth application
     */
    public SourceZendeskChatOAuth20 withClientId(Optional<String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your OAuth application.
     */
    public SourceZendeskChatOAuth20 withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * The Client Secret of your OAuth application.
     */
    public SourceZendeskChatOAuth20 withClientSecret(Optional<String> clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    public SourceZendeskChatOAuth20 withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = Optional.ofNullable(refreshToken);
        return this;
    }

    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    public SourceZendeskChatOAuth20 withRefreshToken(Optional<String> refreshToken) {
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
        SourceZendeskChatOAuth20 other = (SourceZendeskChatOAuth20) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            clientId,
            clientSecret,
            credentials,
            refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZendeskChatOAuth20.class,
                "accessToken", accessToken,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "credentials", credentials,
                "refreshToken", refreshToken);
    }
    
    public final static class Builder {
 
        private Optional<String> accessToken = Optional.empty();
 
        private Optional<String> clientId = Optional.empty();
 
        private Optional<String> clientSecret = Optional.empty();
 
        private Optional<String> refreshToken = Optional.empty();  
        
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
         * The Client ID of your OAuth application
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * The Client ID of your OAuth application
         */
        public Builder clientId(Optional<String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your OAuth application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * The Client Secret of your OAuth application.
         */
        public Builder clientSecret(Optional<String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Refresh Token to obtain new Access Token, when it's expired.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = Optional.ofNullable(refreshToken);
            return this;
        }

        /**
         * Refresh Token to obtain new Access Token, when it's expired.
         */
        public Builder refreshToken(Optional<String> refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }
        
        public SourceZendeskChatOAuth20 build() {
            return new SourceZendeskChatOAuth20(
                accessToken,
                clientId,
                clientSecret,
                refreshToken);
        }

        private static final LazySingletonValue<SourceZendeskChatCredentials> _SINGLETON_VALUE_Credentials =
                new LazySingletonValue<>(
                        "credentials",
                        "\"oauth2.0\"",
                        new TypeReference<SourceZendeskChatCredentials>() {});
    }
}

