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

public class SourceMondayOAuth20 {

    /**
     * Access Token for making authenticated requests.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("auth_type")
    private SourceMondayAuthType authType;

    /**
     * The Client ID of your OAuth application.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret of your OAuth application.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Slug/subdomain of the account, or the first part of the URL that comes before .monday.com
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subdomain")
    private Optional<? extends String> subdomain;

    @JsonCreator
    public SourceMondayOAuth20(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("subdomain") Optional<? extends String> subdomain) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(subdomain, "subdomain");
        this.accessToken = accessToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.subdomain = subdomain;
    }
    
    public SourceMondayOAuth20(
            String accessToken,
            String clientId,
            String clientSecret) {
        this(accessToken, clientId, clientSecret, Optional.empty());
    }

    /**
     * Access Token for making authenticated requests.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public SourceMondayAuthType authType() {
        return authType;
    }

    /**
     * The Client ID of your OAuth application.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your OAuth application.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * Slug/subdomain of the account, or the first part of the URL that comes before .monday.com
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> subdomain() {
        return (Optional<String>) subdomain;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Access Token for making authenticated requests.
     */
    public SourceMondayOAuth20 withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The Client ID of your OAuth application.
     */
    public SourceMondayOAuth20 withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your OAuth application.
     */
    public SourceMondayOAuth20 withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Slug/subdomain of the account, or the first part of the URL that comes before .monday.com
     */
    public SourceMondayOAuth20 withSubdomain(String subdomain) {
        Utils.checkNotNull(subdomain, "subdomain");
        this.subdomain = Optional.ofNullable(subdomain);
        return this;
    }

    /**
     * Slug/subdomain of the account, or the first part of the URL that comes before .monday.com
     */
    public SourceMondayOAuth20 withSubdomain(Optional<? extends String> subdomain) {
        Utils.checkNotNull(subdomain, "subdomain");
        this.subdomain = subdomain;
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
        SourceMondayOAuth20 other = (SourceMondayOAuth20) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.subdomain, other.subdomain);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            authType,
            clientId,
            clientSecret,
            subdomain);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMondayOAuth20.class,
                "accessToken", accessToken,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "subdomain", subdomain);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private String clientId;
 
        private String clientSecret;
 
        private Optional<? extends String> subdomain;  
        
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
         * The Client ID of your OAuth application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your OAuth application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Slug/subdomain of the account, or the first part of the URL that comes before .monday.com
         */
        public Builder subdomain(String subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = Optional.ofNullable(subdomain);
            return this;
        }

        /**
         * Slug/subdomain of the account, or the first part of the URL that comes before .monday.com
         */
        public Builder subdomain(Optional<? extends String> subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = subdomain;
            return this;
        }
        
        public SourceMondayOAuth20 build() {
            if (subdomain == null) {
                subdomain = _SINGLETON_VALUE_Subdomain.value();
            }
            return new SourceMondayOAuth20(
                accessToken,
                clientId,
                clientSecret,
                subdomain);
        }

        private static final LazySingletonValue<SourceMondayAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"oauth2.0\"",
                        new TypeReference<SourceMondayAuthType>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Subdomain =
                new LazySingletonValue<>(
                        "subdomain",
                        "\"\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

