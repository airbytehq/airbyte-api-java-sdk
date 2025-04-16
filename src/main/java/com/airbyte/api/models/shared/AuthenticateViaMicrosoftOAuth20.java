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

public class AuthenticateViaMicrosoftOAuth20 {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceMicrosoftTeamsAuthType> authType;

    /**
     * The Client ID of your Microsoft Teams developer application.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret of your Microsoft Teams developer application.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * A Refresh Token to renew the expired Access Token.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * A globally unique identifier (GUID) that is different than your organization name or domain. Follow these steps to obtain: open one of the Teams where you belong inside the Teams Application -&gt; Click on the … next to the Team title -&gt; Click on Get link to team -&gt; Copy the link to the team and grab the tenant ID form the URL
     */
    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonCreator
    public AuthenticateViaMicrosoftOAuth20(
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
    public Optional<SourceMicrosoftTeamsAuthType> authType() {
        return (Optional<SourceMicrosoftTeamsAuthType>) authType;
    }

    /**
     * The Client ID of your Microsoft Teams developer application.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your Microsoft Teams developer application.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * A Refresh Token to renew the expired Access Token.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    /**
     * A globally unique identifier (GUID) that is different than your organization name or domain. Follow these steps to obtain: open one of the Teams where you belong inside the Teams Application -&gt; Click on the … next to the Team title -&gt; Click on Get link to team -&gt; Copy the link to the team and grab the tenant ID form the URL
     */
    @JsonIgnore
    public String tenantId() {
        return tenantId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The Client ID of your Microsoft Teams developer application.
     */
    public AuthenticateViaMicrosoftOAuth20 withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Microsoft Teams developer application.
     */
    public AuthenticateViaMicrosoftOAuth20 withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * A Refresh Token to renew the expired Access Token.
     */
    public AuthenticateViaMicrosoftOAuth20 withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * A globally unique identifier (GUID) that is different than your organization name or domain. Follow these steps to obtain: open one of the Teams where you belong inside the Teams Application -&gt; Click on the … next to the Team title -&gt; Click on Get link to team -&gt; Copy the link to the team and grab the tenant ID form the URL
     */
    public AuthenticateViaMicrosoftOAuth20 withTenantId(String tenantId) {
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
        AuthenticateViaMicrosoftOAuth20 other = (AuthenticateViaMicrosoftOAuth20) o;
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
        return Utils.toString(AuthenticateViaMicrosoftOAuth20.class,
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
         * The Client ID of your Microsoft Teams developer application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your Microsoft Teams developer application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * A Refresh Token to renew the expired Access Token.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * A globally unique identifier (GUID) that is different than your organization name or domain. Follow these steps to obtain: open one of the Teams where you belong inside the Teams Application -&gt; Click on the … next to the Team title -&gt; Click on Get link to team -&gt; Copy the link to the team and grab the tenant ID form the URL
         */
        public Builder tenantId(String tenantId) {
            Utils.checkNotNull(tenantId, "tenantId");
            this.tenantId = tenantId;
            return this;
        }
        
        public AuthenticateViaMicrosoftOAuth20 build() {
            return new AuthenticateViaMicrosoftOAuth20(
                clientId,
                clientSecret,
                refreshToken,
                tenantId);
        }

        private static final LazySingletonValue<Optional<? extends SourceMicrosoftTeamsAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<Optional<? extends SourceMicrosoftTeamsAuthType>>() {});
    }
}
