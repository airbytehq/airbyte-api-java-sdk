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
 * SourceOracleNativeNetworkEncryptionNNE
 * 
 * <p>The native network encryption gives you the ability to encrypt database connections, without the configuration overhead of TCP/IP and SSL/TLS and without the need to open and listen on different ports.
 */
public class SourceOracleNativeNetworkEncryptionNNE {

    /**
     * This parameter defines what encryption algorithm is used.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encryption_algorithm")
    private Optional<? extends SourceOracleEncryptionAlgorithm> encryptionAlgorithm;

    @JsonProperty("encryption_method")
    private SourceOracleSchemasEncryptionMethod encryptionMethod;

    @JsonCreator
    public SourceOracleNativeNetworkEncryptionNNE(
            @JsonProperty("encryption_algorithm") Optional<? extends SourceOracleEncryptionAlgorithm> encryptionAlgorithm) {
        Utils.checkNotNull(encryptionAlgorithm, "encryptionAlgorithm");
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionMethod = Builder._SINGLETON_VALUE_EncryptionMethod.value();
    }
    
    public SourceOracleNativeNetworkEncryptionNNE() {
        this(Optional.empty());
    }

    /**
     * This parameter defines what encryption algorithm is used.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceOracleEncryptionAlgorithm> encryptionAlgorithm() {
        return (Optional<SourceOracleEncryptionAlgorithm>) encryptionAlgorithm;
    }

    @JsonIgnore
    public SourceOracleSchemasEncryptionMethod encryptionMethod() {
        return encryptionMethod;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * This parameter defines what encryption algorithm is used.
     */
    public SourceOracleNativeNetworkEncryptionNNE withEncryptionAlgorithm(SourceOracleEncryptionAlgorithm encryptionAlgorithm) {
        Utils.checkNotNull(encryptionAlgorithm, "encryptionAlgorithm");
        this.encryptionAlgorithm = Optional.ofNullable(encryptionAlgorithm);
        return this;
    }

    /**
     * This parameter defines what encryption algorithm is used.
     */
    public SourceOracleNativeNetworkEncryptionNNE withEncryptionAlgorithm(Optional<? extends SourceOracleEncryptionAlgorithm> encryptionAlgorithm) {
        Utils.checkNotNull(encryptionAlgorithm, "encryptionAlgorithm");
        this.encryptionAlgorithm = encryptionAlgorithm;
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
        SourceOracleNativeNetworkEncryptionNNE other = (SourceOracleNativeNetworkEncryptionNNE) o;
        return 
            Objects.deepEquals(this.encryptionAlgorithm, other.encryptionAlgorithm) &&
            Objects.deepEquals(this.encryptionMethod, other.encryptionMethod);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            encryptionAlgorithm,
            encryptionMethod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOracleNativeNetworkEncryptionNNE.class,
                "encryptionAlgorithm", encryptionAlgorithm,
                "encryptionMethod", encryptionMethod);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceOracleEncryptionAlgorithm> encryptionAlgorithm;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * This parameter defines what encryption algorithm is used.
         */
        public Builder encryptionAlgorithm(SourceOracleEncryptionAlgorithm encryptionAlgorithm) {
            Utils.checkNotNull(encryptionAlgorithm, "encryptionAlgorithm");
            this.encryptionAlgorithm = Optional.ofNullable(encryptionAlgorithm);
            return this;
        }

        /**
         * This parameter defines what encryption algorithm is used.
         */
        public Builder encryptionAlgorithm(Optional<? extends SourceOracleEncryptionAlgorithm> encryptionAlgorithm) {
            Utils.checkNotNull(encryptionAlgorithm, "encryptionAlgorithm");
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        
        public SourceOracleNativeNetworkEncryptionNNE build() {
            if (encryptionAlgorithm == null) {
                encryptionAlgorithm = _SINGLETON_VALUE_EncryptionAlgorithm.value();
            }
            return new SourceOracleNativeNetworkEncryptionNNE(
                encryptionAlgorithm);
        }

        private static final LazySingletonValue<Optional<? extends SourceOracleEncryptionAlgorithm>> _SINGLETON_VALUE_EncryptionAlgorithm =
                new LazySingletonValue<>(
                        "encryption_algorithm",
                        "\"AES256\"",
                        new TypeReference<Optional<? extends SourceOracleEncryptionAlgorithm>>() {});

        private static final LazySingletonValue<SourceOracleSchemasEncryptionMethod> _SINGLETON_VALUE_EncryptionMethod =
                new LazySingletonValue<>(
                        "encryption_method",
                        "\"client_nne\"",
                        new TypeReference<SourceOracleSchemasEncryptionMethod>() {});
    }
}
