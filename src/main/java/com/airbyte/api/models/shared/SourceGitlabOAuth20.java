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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class SourceGitlabOAuth20 {

    /**
     * Access Token for making authenticated requests.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceGitlabAuthType> authType;

    /**
     * The API ID of the Gitlab developer application.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The API Secret the Gitlab developer application.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * The key to refresh the expired access_token.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * The date-time when the access token should be refreshed.
     */
    @JsonProperty("token_expiry_date")
    private OffsetDateTime tokenExpiryDate;

    @JsonCreator
    public SourceGitlabOAuth20(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken,
            @JsonProperty("token_expiry_date") OffsetDateTime tokenExpiryDate) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(tokenExpiryDate, "tokenExpiryDate");
        this.accessToken = accessToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.tokenExpiryDate = tokenExpiryDate;
    }

    /**
     * Access Token for making authenticated requests.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceGitlabAuthType> authType() {
        return (Optional<SourceGitlabAuthType>) authType;
    }

    /**
     * The API ID of the Gitlab developer application.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The API Secret the Gitlab developer application.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * The key to refresh the expired access_token.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    /**
     * The date-time when the access token should be refreshed.
     */
    @JsonIgnore
    public OffsetDateTime tokenExpiryDate() {
        return tokenExpiryDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Access Token for making authenticated requests.
     */
    public SourceGitlabOAuth20 withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The API ID of the Gitlab developer application.
     */
    public SourceGitlabOAuth20 withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The API Secret the Gitlab developer application.
     */
    public SourceGitlabOAuth20 withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The key to refresh the expired access_token.
     */
    public SourceGitlabOAuth20 withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * The date-time when the access token should be refreshed.
     */
    public SourceGitlabOAuth20 withTokenExpiryDate(OffsetDateTime tokenExpiryDate) {
        Utils.checkNotNull(tokenExpiryDate, "tokenExpiryDate");
        this.tokenExpiryDate = tokenExpiryDate;
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
        SourceGitlabOAuth20 other = (SourceGitlabOAuth20) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            java.util.Objects.deepEquals(this.tokenExpiryDate, other.tokenExpiryDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            authType,
            clientId,
            clientSecret,
            refreshToken,
            tokenExpiryDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGitlabOAuth20.class,
                "accessToken", accessToken,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken,
                "tokenExpiryDate", tokenExpiryDate);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private String clientId;
 
        private String clientSecret;
 
        private String refreshToken;
 
        private OffsetDateTime tokenExpiryDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Access Token for making authenticated requests.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The API ID of the Gitlab developer application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The API Secret the Gitlab developer application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The key to refresh the expired access_token.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * The date-time when the access token should be refreshed.
         */
        public Builder tokenExpiryDate(OffsetDateTime tokenExpiryDate) {
            Utils.checkNotNull(tokenExpiryDate, "tokenExpiryDate");
            this.tokenExpiryDate = tokenExpiryDate;
            return this;
        }
        
        public SourceGitlabOAuth20 build() {
            return new SourceGitlabOAuth20(
                accessToken,
                clientId,
                clientSecret,
                refreshToken,
                tokenExpiryDate);
        }

        private static final LazySingletonValue<Optional<? extends SourceGitlabAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"oauth2.0\"",
                        new TypeReference<Optional<? extends SourceGitlabAuthType>>() {});
    }
}

