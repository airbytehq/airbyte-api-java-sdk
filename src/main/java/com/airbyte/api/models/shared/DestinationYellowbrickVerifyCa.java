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
 * DestinationYellowbrickVerifyCa - Verify-ca SSL mode.
 */

public class DestinationYellowbrickVerifyCa {

    /**
     * CA certificate
     */
    @JsonProperty("ca_certificate")
    private String caCertificate;

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    private Optional<? extends String> clientKeyPassword;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationYellowbrickSchemasSSLModeSSLModes5Mode> mode;

    @JsonCreator
    public DestinationYellowbrickVerifyCa(
            @JsonProperty("ca_certificate") String caCertificate,
            @JsonProperty("client_key_password") Optional<? extends String> clientKeyPassword) {
        Utils.checkNotNull(caCertificate, "caCertificate");
        Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
        this.caCertificate = caCertificate;
        this.clientKeyPassword = clientKeyPassword;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }
    
    public DestinationYellowbrickVerifyCa(
            String caCertificate) {
        this(caCertificate, Optional.empty());
    }

    /**
     * CA certificate
     */
    @JsonIgnore
    public String caCertificate() {
        return caCertificate;
    }

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientKeyPassword() {
        return (Optional<String>) clientKeyPassword;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationYellowbrickSchemasSSLModeSSLModes5Mode> mode() {
        return (Optional<DestinationYellowbrickSchemasSSLModeSSLModes5Mode>) mode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * CA certificate
     */
    public DestinationYellowbrickVerifyCa withCaCertificate(String caCertificate) {
        Utils.checkNotNull(caCertificate, "caCertificate");
        this.caCertificate = caCertificate;
        return this;
    }

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    public DestinationYellowbrickVerifyCa withClientKeyPassword(String clientKeyPassword) {
        Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
        this.clientKeyPassword = Optional.ofNullable(clientKeyPassword);
        return this;
    }

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    public DestinationYellowbrickVerifyCa withClientKeyPassword(Optional<? extends String> clientKeyPassword) {
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
        DestinationYellowbrickVerifyCa other = (DestinationYellowbrickVerifyCa) o;
        return 
            java.util.Objects.deepEquals(this.caCertificate, other.caCertificate) &&
            java.util.Objects.deepEquals(this.clientKeyPassword, other.clientKeyPassword) &&
            java.util.Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            caCertificate,
            clientKeyPassword,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationYellowbrickVerifyCa.class,
                "caCertificate", caCertificate,
                "clientKeyPassword", clientKeyPassword,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private String caCertificate;
 
        private Optional<? extends String> clientKeyPassword = Optional.empty();  
        
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
        public Builder clientKeyPassword(Optional<? extends String> clientKeyPassword) {
            Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
            this.clientKeyPassword = clientKeyPassword;
            return this;
        }
        
        public DestinationYellowbrickVerifyCa build() {
            return new DestinationYellowbrickVerifyCa(
                caCertificate,
                clientKeyPassword);
        }

        private static final LazySingletonValue<Optional<? extends DestinationYellowbrickSchemasSSLModeSSLModes5Mode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"verify-ca\"",
                        new TypeReference<Optional<? extends DestinationYellowbrickSchemasSSLModeSSLModes5Mode>>() {});
    }
}

