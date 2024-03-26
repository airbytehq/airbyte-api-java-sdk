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
 * DestinationTeradataVerifyFull - Verify-full SSL mode.
 */

public class DestinationTeradataVerifyFull {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationTeradataSchemasSSLModeSSLModes6Mode> mode;

    /**
     * Specifies the file name of a PEM file that contains Certificate Authority (CA) certificates for use with SSLMODE=verify-full.
     *  See more information - &lt;a href="https://teradata-docs.s3.amazonaws.com/doc/connectivity/jdbc/reference/current/jdbcug_chapter_2.html#URL_SSLCA"&gt; in the docs&lt;/a&gt;.
     */
    @JsonProperty("ssl_ca_certificate")
    private String sslCaCertificate;

    public DestinationTeradataVerifyFull(
            @JsonProperty("ssl_ca_certificate") String sslCaCertificate) {
        Utils.checkNotNull(sslCaCertificate, "sslCaCertificate");
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.sslCaCertificate = sslCaCertificate;
    }

    public Optional<? extends DestinationTeradataSchemasSSLModeSSLModes6Mode> mode() {
        return mode;
    }

    /**
     * Specifies the file name of a PEM file that contains Certificate Authority (CA) certificates for use with SSLMODE=verify-full.
     *  See more information - &lt;a href="https://teradata-docs.s3.amazonaws.com/doc/connectivity/jdbc/reference/current/jdbcug_chapter_2.html#URL_SSLCA"&gt; in the docs&lt;/a&gt;.
     */
    public String sslCaCertificate() {
        return sslCaCertificate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specifies the file name of a PEM file that contains Certificate Authority (CA) certificates for use with SSLMODE=verify-full.
     *  See more information - &lt;a href="https://teradata-docs.s3.amazonaws.com/doc/connectivity/jdbc/reference/current/jdbcug_chapter_2.html#URL_SSLCA"&gt; in the docs&lt;/a&gt;.
     */
    public DestinationTeradataVerifyFull withSslCaCertificate(String sslCaCertificate) {
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
        DestinationTeradataVerifyFull other = (DestinationTeradataVerifyFull) o;
        return 
            java.util.Objects.deepEquals(this.mode, other.mode) &&
            java.util.Objects.deepEquals(this.sslCaCertificate, other.sslCaCertificate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            mode,
            sslCaCertificate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationTeradataVerifyFull.class,
                "mode", mode,
                "sslCaCertificate", sslCaCertificate);
    }
    
    public final static class Builder {
 
        private String sslCaCertificate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specifies the file name of a PEM file that contains Certificate Authority (CA) certificates for use with SSLMODE=verify-full.
         *  See more information - &lt;a href="https://teradata-docs.s3.amazonaws.com/doc/connectivity/jdbc/reference/current/jdbcug_chapter_2.html#URL_SSLCA"&gt; in the docs&lt;/a&gt;.
         */
        public Builder sslCaCertificate(String sslCaCertificate) {
            Utils.checkNotNull(sslCaCertificate, "sslCaCertificate");
            this.sslCaCertificate = sslCaCertificate;
            return this;
        }
        
        public DestinationTeradataVerifyFull build() {
            if (mode == null) {
                mode = _SINGLETON_VALUE_Mode.value();
            }
            return new DestinationTeradataVerifyFull(
                sslCaCertificate);
        }

        private static final LazySingletonValue<Optional<? extends DestinationTeradataSchemasSSLModeSSLModes6Mode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"verify-full\"",
                        new TypeReference<Optional<? extends DestinationTeradataSchemasSSLModeSSLModes6Mode>>() {});
    }
}

