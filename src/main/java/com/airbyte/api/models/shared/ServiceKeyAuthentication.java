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

/**
 * ServiceKeyAuthentication - ServiceCredentials class for service key authentication.
 * This class is structured similarly to OAuthCredentials but for a different authentication method.
 */

public class ServiceKeyAuthentication {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceMicrosoftOnedriveSchemasAuthType> authType;

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
     * Tenant ID of the Microsoft OneDrive user
     */
    @JsonProperty("tenant_id")
    private String tenantId;

    /**
     * Special characters such as a period, comma, space, and the at sign (@) are converted to underscores (_). More details: https://learn.microsoft.com/en-us/sharepoint/list-onedrive-urls
     */
    @JsonProperty("user_principal_name")
    private String userPrincipalName;

    @JsonCreator
    public ServiceKeyAuthentication(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("tenant_id") String tenantId,
            @JsonProperty("user_principal_name") String userPrincipalName) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(tenantId, "tenantId");
        Utils.checkNotNull(userPrincipalName, "userPrincipalName");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.tenantId = tenantId;
        this.userPrincipalName = userPrincipalName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMicrosoftOnedriveSchemasAuthType> authType() {
        return (Optional<SourceMicrosoftOnedriveSchemasAuthType>) authType;
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
     * Tenant ID of the Microsoft OneDrive user
     */
    @JsonIgnore
    public String tenantId() {
        return tenantId;
    }

    /**
     * Special characters such as a period, comma, space, and the at sign (@) are converted to underscores (_). More details: https://learn.microsoft.com/en-us/sharepoint/list-onedrive-urls
     */
    @JsonIgnore
    public String userPrincipalName() {
        return userPrincipalName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Client ID of your Microsoft developer application
     */
    public ServiceKeyAuthentication withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret of your Microsoft developer application
     */
    public ServiceKeyAuthentication withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Tenant ID of the Microsoft OneDrive user
     */
    public ServiceKeyAuthentication withTenantId(String tenantId) {
        Utils.checkNotNull(tenantId, "tenantId");
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Special characters such as a period, comma, space, and the at sign (@) are converted to underscores (_). More details: https://learn.microsoft.com/en-us/sharepoint/list-onedrive-urls
     */
    public ServiceKeyAuthentication withUserPrincipalName(String userPrincipalName) {
        Utils.checkNotNull(userPrincipalName, "userPrincipalName");
        this.userPrincipalName = userPrincipalName;
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
        ServiceKeyAuthentication other = (ServiceKeyAuthentication) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.tenantId, other.tenantId) &&
            java.util.Objects.deepEquals(this.userPrincipalName, other.userPrincipalName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            clientId,
            clientSecret,
            tenantId,
            userPrincipalName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServiceKeyAuthentication.class,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "tenantId", tenantId,
                "userPrincipalName", userPrincipalName);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private String tenantId;
 
        private String userPrincipalName;  
        
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
         * Tenant ID of the Microsoft OneDrive user
         */
        public Builder tenantId(String tenantId) {
            Utils.checkNotNull(tenantId, "tenantId");
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Special characters such as a period, comma, space, and the at sign (@) are converted to underscores (_). More details: https://learn.microsoft.com/en-us/sharepoint/list-onedrive-urls
         */
        public Builder userPrincipalName(String userPrincipalName) {
            Utils.checkNotNull(userPrincipalName, "userPrincipalName");
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        
        public ServiceKeyAuthentication build() {
            return new ServiceKeyAuthentication(
                clientId,
                clientSecret,
                tenantId,
                userPrincipalName);
        }

        private static final LazySingletonValue<Optional<? extends SourceMicrosoftOnedriveSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Service\"",
                        new TypeReference<Optional<? extends SourceMicrosoftOnedriveSchemasAuthType>>() {});
    }
}

