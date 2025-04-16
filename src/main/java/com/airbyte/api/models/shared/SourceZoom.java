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

public class SourceZoom {

    /**
     * The account ID for your Zoom account. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    @JsonProperty("account_id")
    private String accountId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorization_endpoint")
    private Optional<String> authorizationEndpoint;

    /**
     * The client ID for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The client secret for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("sourceType")
    private Zoom sourceType;

    @JsonCreator
    public SourceZoom(
            @JsonProperty("account_id") String accountId,
            @JsonProperty("authorization_endpoint") Optional<String> authorizationEndpoint,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.accountId = accountId;
        this.authorizationEndpoint = authorizationEndpoint;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceZoom(
            String accountId,
            String clientId,
            String clientSecret) {
        this(accountId, Optional.empty(), clientId, clientSecret);
    }

    /**
     * The account ID for your Zoom account. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    @JsonIgnore
    public String accountId() {
        return accountId;
    }

    @JsonIgnore
    public Optional<String> authorizationEndpoint() {
        return authorizationEndpoint;
    }

    /**
     * The client ID for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The client secret for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public Zoom sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The account ID for your Zoom account. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    public SourceZoom withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public SourceZoom withAuthorizationEndpoint(String authorizationEndpoint) {
        Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
        this.authorizationEndpoint = Optional.ofNullable(authorizationEndpoint);
        return this;
    }

    public SourceZoom withAuthorizationEndpoint(Optional<String> authorizationEndpoint) {
        Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * The client ID for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    public SourceZoom withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The client secret for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    public SourceZoom withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
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
        SourceZoom other = (SourceZoom) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.authorizationEndpoint, other.authorizationEndpoint) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            authorizationEndpoint,
            clientId,
            clientSecret,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZoom.class,
                "accountId", accountId,
                "authorizationEndpoint", authorizationEndpoint,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private Optional<String> authorizationEndpoint;
 
        private String clientId;
 
        private String clientSecret;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The account ID for your Zoom account. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
            this.authorizationEndpoint = Optional.ofNullable(authorizationEndpoint);
            return this;
        }

        public Builder authorizationEndpoint(Optional<String> authorizationEndpoint) {
            Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        /**
         * The client ID for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The client secret for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public SourceZoom build() {
            if (authorizationEndpoint == null) {
                authorizationEndpoint = _SINGLETON_VALUE_AuthorizationEndpoint.value();
            }
            return new SourceZoom(
                accountId,
                authorizationEndpoint,
                clientId,
                clientSecret);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_AuthorizationEndpoint =
                new LazySingletonValue<>(
                        "authorization_endpoint",
                        "\"https://zoom.us/oauth/token\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Zoom> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"zoom\"",
                        new TypeReference<Zoom>() {});
    }
}
