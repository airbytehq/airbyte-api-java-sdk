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


public class SourceAirtableOAuth20 {

    /**
     * Access Token for making authenticated requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    private Optional<? extends String> accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    private Optional<? extends SourceAirtableSchemasAuthMethod> authMethod;

    /**
     * The client ID of the Airtable developer application.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The client secret the Airtable developer application.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * The key to refresh the expired access token.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * The date-time when the access token should be refreshed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token_expiry_date")
    private Optional<? extends OffsetDateTime> tokenExpiryDate;

    @JsonCreator
    public SourceAirtableOAuth20(
            @JsonProperty("access_token") Optional<? extends String> accessToken,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken,
            @JsonProperty("token_expiry_date") Optional<? extends OffsetDateTime> tokenExpiryDate) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(tokenExpiryDate, "tokenExpiryDate");
        this.accessToken = accessToken;
        this.authMethod = Builder._SINGLETON_VALUE_AuthMethod.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.tokenExpiryDate = tokenExpiryDate;
    }
    
    public SourceAirtableOAuth20(
            String clientId,
            String clientSecret,
            String refreshToken) {
        this(Optional.empty(), clientId, clientSecret, refreshToken, Optional.empty());
    }

    /**
     * Access Token for making authenticated requests.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> accessToken() {
        return (Optional<String>) accessToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceAirtableSchemasAuthMethod> authMethod() {
        return (Optional<SourceAirtableSchemasAuthMethod>) authMethod;
    }

    /**
     * The client ID of the Airtable developer application.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The client secret the Airtable developer application.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * The key to refresh the expired access token.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    /**
     * The date-time when the access token should be refreshed.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> tokenExpiryDate() {
        return (Optional<OffsetDateTime>) tokenExpiryDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Access Token for making authenticated requests.
     */
    public SourceAirtableOAuth20 withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = Optional.ofNullable(accessToken);
        return this;
    }

    /**
     * Access Token for making authenticated requests.
     */
    public SourceAirtableOAuth20 withAccessToken(Optional<? extends String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The client ID of the Airtable developer application.
     */
    public SourceAirtableOAuth20 withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The client secret the Airtable developer application.
     */
    public SourceAirtableOAuth20 withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The key to refresh the expired access token.
     */
    public SourceAirtableOAuth20 withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * The date-time when the access token should be refreshed.
     */
    public SourceAirtableOAuth20 withTokenExpiryDate(OffsetDateTime tokenExpiryDate) {
        Utils.checkNotNull(tokenExpiryDate, "tokenExpiryDate");
        this.tokenExpiryDate = Optional.ofNullable(tokenExpiryDate);
        return this;
    }

    /**
     * The date-time when the access token should be refreshed.
     */
    public SourceAirtableOAuth20 withTokenExpiryDate(Optional<? extends OffsetDateTime> tokenExpiryDate) {
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
        SourceAirtableOAuth20 other = (SourceAirtableOAuth20) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.authMethod, other.authMethod) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            java.util.Objects.deepEquals(this.tokenExpiryDate, other.tokenExpiryDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            authMethod,
            clientId,
            clientSecret,
            refreshToken,
            tokenExpiryDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAirtableOAuth20.class,
                "accessToken", accessToken,
                "authMethod", authMethod,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken,
                "tokenExpiryDate", tokenExpiryDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> accessToken = Optional.empty();
 
        private String clientId;
 
        private String clientSecret;
 
        private String refreshToken;
 
        private Optional<? extends OffsetDateTime> tokenExpiryDate = Optional.empty();  
        
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
        public Builder accessToken(Optional<? extends String> accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The client ID of the Airtable developer application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The client secret the Airtable developer application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The key to refresh the expired access token.
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
            this.tokenExpiryDate = Optional.ofNullable(tokenExpiryDate);
            return this;
        }

        /**
         * The date-time when the access token should be refreshed.
         */
        public Builder tokenExpiryDate(Optional<? extends OffsetDateTime> tokenExpiryDate) {
            Utils.checkNotNull(tokenExpiryDate, "tokenExpiryDate");
            this.tokenExpiryDate = tokenExpiryDate;
            return this;
        }
        
        public SourceAirtableOAuth20 build() {
            return new SourceAirtableOAuth20(
                accessToken,
                clientId,
                clientSecret,
                refreshToken,
                tokenExpiryDate);
        }

        private static final LazySingletonValue<Optional<? extends SourceAirtableSchemasAuthMethod>> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"oauth2.0\"",
                        new TypeReference<Optional<? extends SourceAirtableSchemasAuthMethod>>() {});
    }
}

