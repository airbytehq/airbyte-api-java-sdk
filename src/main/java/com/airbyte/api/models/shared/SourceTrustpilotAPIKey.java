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
 * SourceTrustpilotAPIKey - The API key authentication method gives you access to only the streams which are part of the Public API. When you want to get streams available via the Consumer API (e.g. the private reviews) you need to use authentication method OAuth 2.0.
 */

public class SourceTrustpilotAPIKey {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceTrustpilotSchemasAuthType> authType;

    /**
     * The API key of the Trustpilot API application.
     */
    @JsonProperty("client_id")
    private String clientId;

    @JsonCreator
    public SourceTrustpilotAPIKey(
            @JsonProperty("client_id") String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceTrustpilotSchemasAuthType> authType() {
        return (Optional<SourceTrustpilotSchemasAuthType>) authType;
    }

    /**
     * The API key of the Trustpilot API application.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The API key of the Trustpilot API application.
     */
    public SourceTrustpilotAPIKey withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
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
        SourceTrustpilotAPIKey other = (SourceTrustpilotAPIKey) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            clientId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTrustpilotAPIKey.class,
                "authType", authType,
                "clientId", clientId);
    }
    
    public final static class Builder {
 
        private String clientId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The API key of the Trustpilot API application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }
        
        public SourceTrustpilotAPIKey build() {
            return new SourceTrustpilotAPIKey(
                clientId);
        }

        private static final LazySingletonValue<Optional<? extends SourceTrustpilotSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"apikey\"",
                        new TypeReference<Optional<? extends SourceTrustpilotSchemasAuthType>>() {});
    }
}

