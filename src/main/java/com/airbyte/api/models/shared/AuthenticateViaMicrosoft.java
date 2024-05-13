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


public class AuthenticateViaMicrosoft {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceMicrosoftTeamsSchemasAuthType> authType;

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
     * A globally unique identifier (GUID) that is different than your organization name or domain. Follow these steps to obtain: open one of the Teams where you belong inside the Teams Application -&gt; Click on the … next to the Team title -&gt; Click on Get link to team -&gt; Copy the link to the team and grab the tenant ID form the URL
     */
    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonCreator
    public AuthenticateViaMicrosoft(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("tenant_id") String tenantId) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(tenantId, "tenantId");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.tenantId = tenantId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMicrosoftTeamsSchemasAuthType> authType() {
        return (Optional<SourceMicrosoftTeamsSchemasAuthType>) authType;
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
    public AuthenticateViaMicrosoft withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Microsoft Teams developer application.
     */
    public AuthenticateViaMicrosoft withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * A globally unique identifier (GUID) that is different than your organization name or domain. Follow these steps to obtain: open one of the Teams where you belong inside the Teams Application -&gt; Click on the … next to the Team title -&gt; Click on Get link to team -&gt; Copy the link to the team and grab the tenant ID form the URL
     */
    public AuthenticateViaMicrosoft withTenantId(String tenantId) {
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
        AuthenticateViaMicrosoft other = (AuthenticateViaMicrosoft) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.tenantId, other.tenantId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            clientId,
            clientSecret,
            tenantId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthenticateViaMicrosoft.class,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "tenantId", tenantId);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
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
         * A globally unique identifier (GUID) that is different than your organization name or domain. Follow these steps to obtain: open one of the Teams where you belong inside the Teams Application -&gt; Click on the … next to the Team title -&gt; Click on Get link to team -&gt; Copy the link to the team and grab the tenant ID form the URL
         */
        public Builder tenantId(String tenantId) {
            Utils.checkNotNull(tenantId, "tenantId");
            this.tenantId = tenantId;
            return this;
        }
        
        public AuthenticateViaMicrosoft build() {
            return new AuthenticateViaMicrosoft(
                clientId,
                clientSecret,
                tenantId);
        }

        private static final LazySingletonValue<Optional<? extends SourceMicrosoftTeamsSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Token\"",
                        new TypeReference<Optional<? extends SourceMicrosoftTeamsSchemasAuthType>>() {});
    }
}

