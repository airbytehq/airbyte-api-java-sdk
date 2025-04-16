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

/**
 * VerifyFull
 * 
 * <p>Verify-full SSL mode.
 */
public class VerifyFull {

    /**
     * CA certificate
     */
    @JsonProperty("ca_certificate")
    private String caCertificate;

    /**
     * Client certificate
     */
    @JsonProperty("client_certificate")
    private String clientCertificate;

    /**
     * Client key
     */
    @JsonProperty("client_key")
    private String clientKey;

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    private Optional<String> clientKeyPassword;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationPostgresSchemasSSLModeSSLModes6Mode> mode;

    @JsonCreator
    public VerifyFull(
            @JsonProperty("ca_certificate") String caCertificate,
            @JsonProperty("client_certificate") String clientCertificate,
            @JsonProperty("client_key") String clientKey,
            @JsonProperty("client_key_password") Optional<String> clientKeyPassword) {
        Utils.checkNotNull(caCertificate, "caCertificate");
        Utils.checkNotNull(clientCertificate, "clientCertificate");
        Utils.checkNotNull(clientKey, "clientKey");
        Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.clientKeyPassword = clientKeyPassword;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }
    
    public VerifyFull(
            String caCertificate,
            String clientCertificate,
            String clientKey) {
        this(caCertificate, clientCertificate, clientKey, Optional.empty());
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
    public String clientCertificate() {
        return clientCertificate;
    }

    /**
     * Client key
     */
    @JsonIgnore
    public String clientKey() {
        return clientKey;
    }

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    @JsonIgnore
    public Optional<String> clientKeyPassword() {
        return clientKeyPassword;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationPostgresSchemasSSLModeSSLModes6Mode> mode() {
        return (Optional<DestinationPostgresSchemasSSLModeSSLModes6Mode>) mode;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * CA certificate
     */
    public VerifyFull withCaCertificate(String caCertificate) {
        Utils.checkNotNull(caCertificate, "caCertificate");
        this.caCertificate = caCertificate;
        return this;
    }

    /**
     * Client certificate
     */
    public VerifyFull withClientCertificate(String clientCertificate) {
        Utils.checkNotNull(clientCertificate, "clientCertificate");
        this.clientCertificate = clientCertificate;
        return this;
    }

    /**
     * Client key
     */
    public VerifyFull withClientKey(String clientKey) {
        Utils.checkNotNull(clientKey, "clientKey");
        this.clientKey = clientKey;
        return this;
    }

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    public VerifyFull withClientKeyPassword(String clientKeyPassword) {
        Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
        this.clientKeyPassword = Optional.ofNullable(clientKeyPassword);
        return this;
    }

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    public VerifyFull withClientKeyPassword(Optional<String> clientKeyPassword) {
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
        VerifyFull other = (VerifyFull) o;
        return 
            Objects.deepEquals(this.caCertificate, other.caCertificate) &&
            Objects.deepEquals(this.clientCertificate, other.clientCertificate) &&
            Objects.deepEquals(this.clientKey, other.clientKey) &&
            Objects.deepEquals(this.clientKeyPassword, other.clientKeyPassword) &&
            Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            caCertificate,
            clientCertificate,
            clientKey,
            clientKeyPassword,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VerifyFull.class,
                "caCertificate", caCertificate,
                "clientCertificate", clientCertificate,
                "clientKey", clientKey,
                "clientKeyPassword", clientKeyPassword,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private String caCertificate;
 
        private String clientCertificate;
 
        private String clientKey;
 
        private Optional<String> clientKeyPassword = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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
            this.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * Client key
         */
        public Builder clientKey(String clientKey) {
            Utils.checkNotNull(clientKey, "clientKey");
            this.clientKey = clientKey;
            return this;
        }

        /**
         * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
         */
        public Builder clientKeyPassword(String clientKeyPassword) {
            Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
            this.clientKeyPassword = Optional.ofNullable(clientKeyPassword);
            return this;
        }

        /**
         * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
         */
        public Builder clientKeyPassword(Optional<String> clientKeyPassword) {
            Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
            this.clientKeyPassword = clientKeyPassword;
            return this;
        }
        
        public VerifyFull build() {
            return new VerifyFull(
                caCertificate,
                clientCertificate,
                clientKey,
                clientKeyPassword);
        }

        private static final LazySingletonValue<Optional<? extends DestinationPostgresSchemasSSLModeSSLModes6Mode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"verify-full\"",
                        new TypeReference<Optional<? extends DestinationPostgresSchemasSSLModeSSLModes6Mode>>() {});
    }
}
