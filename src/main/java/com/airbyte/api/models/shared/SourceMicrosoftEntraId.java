/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SourceMicrosoftEntraId {

    @JsonProperty("application_id_uri")
    private String applicationIdUri;

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("sourceType")
    private MicrosoftEntraId sourceType;

    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonProperty("user_id")
    private String userId;

    @JsonCreator
    public SourceMicrosoftEntraId(
            @JsonProperty("application_id_uri") String applicationIdUri,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("tenant_id") String tenantId,
            @JsonProperty("user_id") String userId) {
        Utils.checkNotNull(applicationIdUri, "applicationIdUri");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(tenantId, "tenantId");
        Utils.checkNotNull(userId, "userId");
        this.applicationIdUri = applicationIdUri;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.tenantId = tenantId;
        this.userId = userId;
    }

    @JsonIgnore
    public String applicationIdUri() {
        return applicationIdUri;
    }

    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public MicrosoftEntraId sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public String tenantId() {
        return tenantId;
    }

    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceMicrosoftEntraId withApplicationIdUri(String applicationIdUri) {
        Utils.checkNotNull(applicationIdUri, "applicationIdUri");
        this.applicationIdUri = applicationIdUri;
        return this;
    }

    public SourceMicrosoftEntraId withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public SourceMicrosoftEntraId withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    public SourceMicrosoftEntraId withTenantId(String tenantId) {
        Utils.checkNotNull(tenantId, "tenantId");
        this.tenantId = tenantId;
        return this;
    }

    public SourceMicrosoftEntraId withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        SourceMicrosoftEntraId other = (SourceMicrosoftEntraId) o;
        return 
            java.util.Objects.deepEquals(this.applicationIdUri, other.applicationIdUri) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.tenantId, other.tenantId) &&
            java.util.Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            applicationIdUri,
            clientId,
            clientSecret,
            sourceType,
            tenantId,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftEntraId.class,
                "applicationIdUri", applicationIdUri,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "sourceType", sourceType,
                "tenantId", tenantId,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String applicationIdUri;
 
        private String clientId;
 
        private String clientSecret;
 
        private String tenantId;
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder applicationIdUri(String applicationIdUri) {
            Utils.checkNotNull(applicationIdUri, "applicationIdUri");
            this.applicationIdUri = applicationIdUri;
            return this;
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder tenantId(String tenantId) {
            Utils.checkNotNull(tenantId, "tenantId");
            this.tenantId = tenantId;
            return this;
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public SourceMicrosoftEntraId build() {
            return new SourceMicrosoftEntraId(
                applicationIdUri,
                clientId,
                clientSecret,
                tenantId,
                userId);
        }

        private static final LazySingletonValue<MicrosoftEntraId> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"microsoft-entra-id\"",
                        new TypeReference<MicrosoftEntraId>() {});
    }
}

