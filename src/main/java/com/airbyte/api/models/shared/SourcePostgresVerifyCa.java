/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * SourcePostgresVerifyCa - Always require encryption and verifies that the source database server has a valid SSL certificate.
 */

public class SourcePostgresVerifyCa {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * CA certificate
     */
    @JsonProperty("ca_certificate")
    private String caCertificate;

    /**
     * Client certificate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_certificate")
    private Optional<String> clientCertificate;

    /**
     * Client key
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key")
    private Optional<String> clientKey;

    /**
     * Password for keystorage. If you do not add it - the password will be generated automatically.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    private Optional<String> clientKeyPassword;

    @JsonProperty("mode")
    private SourcePostgresSchemasSSLModeSSLModes5Mode mode;

    @JsonCreator
    public SourcePostgresVerifyCa(
            @JsonProperty("ca_certificate") String caCertificate,
            @JsonProperty("client_certificate") Optional<String> clientCertificate,
            @JsonProperty("client_key") Optional<String> clientKey,
            @JsonProperty("client_key_password") Optional<String> clientKeyPassword) {
        Utils.checkNotNull(caCertificate, "caCertificate");
        Utils.checkNotNull(clientCertificate, "clientCertificate");
        Utils.checkNotNull(clientKey, "clientKey");
        Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
        this.additionalProperties = new HashMap<>();
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.clientKeyPassword = clientKeyPassword;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }
    
    public SourcePostgresVerifyCa(
            String caCertificate) {
        this(caCertificate, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    /**
     * CA certificate
     */
    @JsonIgnore
    public String caCertificate() {
        return caCertificate;
    }

    /**
     * Client certificate
     */
    @JsonIgnore
    public Optional<String> clientCertificate() {
        return clientCertificate;
    }

    /**
     * Client key
     */
    @JsonIgnore
    public Optional<String> clientKey() {
        return clientKey;
    }

    /**
     * Password for keystorage. If you do not add it - the password will be generated automatically.
     */
    @JsonIgnore
    public Optional<String> clientKeyPassword() {
        return clientKeyPassword;
    }

    @JsonIgnore
    public SourcePostgresSchemasSSLModeSSLModes5Mode mode() {
        return mode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    @JsonAnySetter
    public SourcePostgresVerifyCa withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }
    
    public SourcePostgresVerifyCa withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * CA certificate
     */
    public SourcePostgresVerifyCa withCaCertificate(String caCertificate) {
        Utils.checkNotNull(caCertificate, "caCertificate");
        this.caCertificate = caCertificate;
        return this;
    }

    /**
     * Client certificate
     */
    public SourcePostgresVerifyCa withClientCertificate(String clientCertificate) {
        Utils.checkNotNull(clientCertificate, "clientCertificate");
        this.clientCertificate = Optional.ofNullable(clientCertificate);
        return this;
    }

    /**
     * Client certificate
     */
    public SourcePostgresVerifyCa withClientCertificate(Optional<String> clientCertificate) {
        Utils.checkNotNull(clientCertificate, "clientCertificate");
        this.clientCertificate = clientCertificate;
        return this;
    }

    /**
     * Client key
     */
    public SourcePostgresVerifyCa withClientKey(String clientKey) {
        Utils.checkNotNull(clientKey, "clientKey");
        this.clientKey = Optional.ofNullable(clientKey);
        return this;
    }

    /**
     * Client key
     */
    public SourcePostgresVerifyCa withClientKey(Optional<String> clientKey) {
        Utils.checkNotNull(clientKey, "clientKey");
        this.clientKey = clientKey;
        return this;
    }

    /**
     * Password for keystorage. If you do not add it - the password will be generated automatically.
     */
    public SourcePostgresVerifyCa withClientKeyPassword(String clientKeyPassword) {
        Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
        this.clientKeyPassword = Optional.ofNullable(clientKeyPassword);
        return this;
    }

    /**
     * Password for keystorage. If you do not add it - the password will be generated automatically.
     */
    public SourcePostgresVerifyCa withClientKeyPassword(Optional<String> clientKeyPassword) {
        Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
        this.clientKeyPassword = clientKeyPassword;
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
        SourcePostgresVerifyCa other = (SourcePostgresVerifyCa) o;
        return 
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.caCertificate, other.caCertificate) &&
            Objects.deepEquals(this.clientCertificate, other.clientCertificate) &&
            Objects.deepEquals(this.clientKey, other.clientKey) &&
            Objects.deepEquals(this.clientKeyPassword, other.clientKeyPassword) &&
            Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            caCertificate,
            clientCertificate,
            clientKey,
            clientKeyPassword,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePostgresVerifyCa.class,
                "additionalProperties", additionalProperties,
                "caCertificate", caCertificate,
                "clientCertificate", clientCertificate,
                "clientKey", clientKey,
                "clientKeyPassword", clientKeyPassword,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();
 
        private String caCertificate;
 
        private Optional<String> clientCertificate = Optional.empty();
 
        private Optional<String> clientKey = Optional.empty();
 
        private Optional<String> clientKeyPassword = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalProperty(String key, Object value) {
            Utils.checkNotNull(key, "key");
            // we could be strict about null values (force the user
            // to pass `JsonNullable.of(null)`) but likely to be a bit 
            // annoying for additional properties building so we'll 
            // relax preconditions.
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * CA certificate
         */
        public Builder caCertificate(String caCertificate) {
            Utils.checkNotNull(caCertificate, "caCertificate");
            this.caCertificate = caCertificate;
            return this;
        }

        /**
         * Client certificate
         */
        public Builder clientCertificate(String clientCertificate) {
            Utils.checkNotNull(clientCertificate, "clientCertificate");
            this.clientCertificate = Optional.ofNullable(clientCertificate);
            return this;
        }

        /**
         * Client certificate
         */
        public Builder clientCertificate(Optional<String> clientCertificate) {
            Utils.checkNotNull(clientCertificate, "clientCertificate");
            this.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * Client key
         */
        public Builder clientKey(String clientKey) {
            Utils.checkNotNull(clientKey, "clientKey");
            this.clientKey = Optional.ofNullable(clientKey);
            return this;
        }

        /**
         * Client key
         */
        public Builder clientKey(Optional<String> clientKey) {
            Utils.checkNotNull(clientKey, "clientKey");
            this.clientKey = clientKey;
            return this;
        }

        /**
         * Password for keystorage. If you do not add it - the password will be generated automatically.
         */
        public Builder clientKeyPassword(String clientKeyPassword) {
            Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
            this.clientKeyPassword = Optional.ofNullable(clientKeyPassword);
            return this;
        }

        /**
         * Password for keystorage. If you do not add it - the password will be generated automatically.
         */
        public Builder clientKeyPassword(Optional<String> clientKeyPassword) {
            Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
            this.clientKeyPassword = clientKeyPassword;
            return this;
        }
        
        public SourcePostgresVerifyCa build() {
            return new SourcePostgresVerifyCa(
                caCertificate,
                clientCertificate,
                clientKey,
                clientKeyPassword)
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<SourcePostgresSchemasSSLModeSSLModes5Mode> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"verify-ca\"",
                        new TypeReference<SourcePostgresSchemasSSLModeSSLModes5Mode>() {});
    }
}

