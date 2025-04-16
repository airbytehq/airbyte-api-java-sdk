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
 * DestinationTeradataVerifyCa
 * 
 * <p>Verify-ca SSL mode.
 */
public class DestinationTeradataVerifyCa {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationTeradataSchemasSSLModeSSLModes5Mode> mode;

    /**
     * Specifies the file name of a PEM file that contains Certificate Authority (CA) certificates for use with SSLMODE=verify-ca.
     *  See more information - &lt;a href="https://teradata-docs.s3.amazonaws.com/doc/connectivity/jdbc/reference/current/jdbcug_chapter_2.html#URL_SSLCA"&gt; in the docs&lt;/a&gt;.
     */
    @JsonProperty("ssl_ca_certificate")
    private String sslCaCertificate;

    @JsonCreator
    public DestinationTeradataVerifyCa(
            @JsonProperty("ssl_ca_certificate") String sslCaCertificate) {
        Utils.checkNotNull(sslCaCertificate, "sslCaCertificate");
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.sslCaCertificate = sslCaCertificate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationTeradataSchemasSSLModeSSLModes5Mode> mode() {
        return (Optional<DestinationTeradataSchemasSSLModeSSLModes5Mode>) mode;
    }

    /**
     * Specifies the file name of a PEM file that contains Certificate Authority (CA) certificates for use with SSLMODE=verify-ca.
     *  See more information - &lt;a href="https://teradata-docs.s3.amazonaws.com/doc/connectivity/jdbc/reference/current/jdbcug_chapter_2.html#URL_SSLCA"&gt; in the docs&lt;/a&gt;.
     */
    @JsonIgnore
    public String sslCaCertificate() {
        return sslCaCertificate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Specifies the file name of a PEM file that contains Certificate Authority (CA) certificates for use with SSLMODE=verify-ca.
     *  See more information - &lt;a href="https://teradata-docs.s3.amazonaws.com/doc/connectivity/jdbc/reference/current/jdbcug_chapter_2.html#URL_SSLCA"&gt; in the docs&lt;/a&gt;.
     */
    public DestinationTeradataVerifyCa withSslCaCertificate(String sslCaCertificate) {
        Utils.checkNotNull(sslCaCertificate, "sslCaCertificate");
        this.sslCaCertificate = sslCaCertificate;
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
        DestinationTeradataVerifyCa other = (DestinationTeradataVerifyCa) o;
        return 
            Objects.deepEquals(this.mode, other.mode) &&
            Objects.deepEquals(this.sslCaCertificate, other.sslCaCertificate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            mode,
            sslCaCertificate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationTeradataVerifyCa.class,
                "mode", mode,
                "sslCaCertificate", sslCaCertificate);
    }
    
    public final static class Builder {
 
        private String sslCaCertificate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specifies the file name of a PEM file that contains Certificate Authority (CA) certificates for use with SSLMODE=verify-ca.
         *  See more information - &lt;a href="https://teradata-docs.s3.amazonaws.com/doc/connectivity/jdbc/reference/current/jdbcug_chapter_2.html#URL_SSLCA"&gt; in the docs&lt;/a&gt;.
         */
        public Builder sslCaCertificate(String sslCaCertificate) {
            Utils.checkNotNull(sslCaCertificate, "sslCaCertificate");
            this.sslCaCertificate = sslCaCertificate;
            return this;
        }
        
        public DestinationTeradataVerifyCa build() {
            return new DestinationTeradataVerifyCa(
                sslCaCertificate);
        }

        private static final LazySingletonValue<Optional<? extends DestinationTeradataSchemasSSLModeSSLModes5Mode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"verify-ca\"",
                        new TypeReference<Optional<? extends DestinationTeradataSchemasSSLModeSSLModes5Mode>>() {});
    }
}
