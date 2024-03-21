/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 * SourceMysqlVerifyCA - Always connect with SSL. Verifies CA, but allows connection even if Hostname does not match.
 */

public class SourceMysqlVerifyCA {

    /**
     * CA certificate
     */
    @JsonProperty("ca_certificate")
    private String caCertificate;

    /**
     * Client certificate (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client key&lt;/b&gt; as well)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_certificate")
    private Optional<? extends String> clientCertificate;

    /**
     * Client key (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client certificate&lt;/b&gt; as well)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key")
    private Optional<? extends String> clientKey;

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    private Optional<? extends String> clientKeyPassword;

    @JsonProperty("mode")
    private SourceMysqlSchemasSslModeMode mode;

    public SourceMysqlVerifyCA(
            @JsonProperty("ca_certificate") String caCertificate,
            @JsonProperty("client_certificate") Optional<? extends String> clientCertificate,
            @JsonProperty("client_key") Optional<? extends String> clientKey,
            @JsonProperty("client_key_password") Optional<? extends String> clientKeyPassword) {
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

    /**
     * CA certificate
     */
    public String caCertificate() {
        return caCertificate;
    }

    /**
     * Client certificate (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client key&lt;/b&gt; as well)
     */
    public Optional<? extends String> clientCertificate() {
        return clientCertificate;
    }

    /**
     * Client key (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client certificate&lt;/b&gt; as well)
     */
    public Optional<? extends String> clientKey() {
        return clientKey;
    }

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    public Optional<? extends String> clientKeyPassword() {
        return clientKeyPassword;
    }

    public SourceMysqlSchemasSslModeMode mode() {
        return mode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * CA certificate
     */
    public SourceMysqlVerifyCA withCaCertificate(String caCertificate) {
        Utils.checkNotNull(caCertificate, "caCertificate");
        this.caCertificate = caCertificate;
        return this;
    }

    /**
     * Client certificate (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client key&lt;/b&gt; as well)
     */
    public SourceMysqlVerifyCA withClientCertificate(String clientCertificate) {
        Utils.checkNotNull(clientCertificate, "clientCertificate");
        this.clientCertificate = Optional.ofNullable(clientCertificate);
        return this;
    }

    /**
     * Client certificate (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client key&lt;/b&gt; as well)
     */
    public SourceMysqlVerifyCA withClientCertificate(Optional<? extends String> clientCertificate) {
        Utils.checkNotNull(clientCertificate, "clientCertificate");
        this.clientCertificate = clientCertificate;
        return this;
    }

    /**
     * Client key (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client certificate&lt;/b&gt; as well)
     */
    public SourceMysqlVerifyCA withClientKey(String clientKey) {
        Utils.checkNotNull(clientKey, "clientKey");
        this.clientKey = Optional.ofNullable(clientKey);
        return this;
    }

    /**
     * Client key (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client certificate&lt;/b&gt; as well)
     */
    public SourceMysqlVerifyCA withClientKey(Optional<? extends String> clientKey) {
        Utils.checkNotNull(clientKey, "clientKey");
        this.clientKey = clientKey;
        return this;
    }

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    public SourceMysqlVerifyCA withClientKeyPassword(String clientKeyPassword) {
        Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
        this.clientKeyPassword = Optional.ofNullable(clientKeyPassword);
        return this;
    }

    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    public SourceMysqlVerifyCA withClientKeyPassword(Optional<? extends String> clientKeyPassword) {
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
        SourceMysqlVerifyCA other = (SourceMysqlVerifyCA) o;
        return 
            java.util.Objects.deepEquals(this.caCertificate, other.caCertificate) &&
            java.util.Objects.deepEquals(this.clientCertificate, other.clientCertificate) &&
            java.util.Objects.deepEquals(this.clientKey, other.clientKey) &&
            java.util.Objects.deepEquals(this.clientKeyPassword, other.clientKeyPassword) &&
            java.util.Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            caCertificate,
            clientCertificate,
            clientKey,
            clientKeyPassword,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMysqlVerifyCA.class,
                "caCertificate", caCertificate,
                "clientCertificate", clientCertificate,
                "clientKey", clientKey,
                "clientKeyPassword", clientKeyPassword,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private String caCertificate;
 
        private Optional<? extends String> clientCertificate = Optional.empty();
 
        private Optional<? extends String> clientKey = Optional.empty();
 
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
         * Client certificate (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client key&lt;/b&gt; as well)
         */
        public Builder clientCertificate(String clientCertificate) {
            Utils.checkNotNull(clientCertificate, "clientCertificate");
            this.clientCertificate = Optional.ofNullable(clientCertificate);
            return this;
        }

        /**
         * Client certificate (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client key&lt;/b&gt; as well)
         */
        public Builder clientCertificate(Optional<? extends String> clientCertificate) {
            Utils.checkNotNull(clientCertificate, "clientCertificate");
            this.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * Client key (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client certificate&lt;/b&gt; as well)
         */
        public Builder clientKey(String clientKey) {
            Utils.checkNotNull(clientKey, "clientKey");
            this.clientKey = Optional.ofNullable(clientKey);
            return this;
        }

        /**
         * Client key (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client certificate&lt;/b&gt; as well)
         */
        public Builder clientKey(Optional<? extends String> clientKey) {
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
        public Builder clientKeyPassword(Optional<? extends String> clientKeyPassword) {
            Utils.checkNotNull(clientKeyPassword, "clientKeyPassword");
            this.clientKeyPassword = clientKeyPassword;
            return this;
        }
        
        public SourceMysqlVerifyCA build() {
            return new SourceMysqlVerifyCA(
                caCertificate,
                clientCertificate,
                clientKey,
                clientKeyPassword);
        }

        private static final LazySingletonValue<SourceMysqlSchemasSslModeMode> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"verify_ca\"",
                        new TypeReference<SourceMysqlSchemasSslModeMode>() {});
    }
}

