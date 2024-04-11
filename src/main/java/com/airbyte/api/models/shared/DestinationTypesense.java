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


public class DestinationTypesense {

    /**
     * Typesense API Key
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * How many documents should be imported together. Default 1000
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batch_size")
    private Optional<? extends Long> batchSize;

    @JsonProperty("destinationType")
    private Typesense destinationType;

    /**
     * Hostname of the Typesense instance without protocol.
     */
    @JsonProperty("host")
    private String host;

    /**
     * Path of the Typesense instance. Default is none
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("path")
    private Optional<? extends String> path;

    /**
     * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 443
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends String> port;

    /**
     * Protocol of the Typesense instance. Ex: http or https. Default is https
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocol")
    private Optional<? extends String> protocol;

    public DestinationTypesense(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("batch_size") Optional<? extends Long> batchSize,
            @JsonProperty("host") String host,
            @JsonProperty("path") Optional<? extends String> path,
            @JsonProperty("port") Optional<? extends String> port,
            @JsonProperty("protocol") Optional<? extends String> protocol) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(batchSize, "batchSize");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(path, "path");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(protocol, "protocol");
        this.apiKey = apiKey;
        this.batchSize = batchSize;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.host = host;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * Typesense API Key
     */
    public String apiKey() {
        return apiKey;
    }

    /**
     * How many documents should be imported together. Default 1000
     */
    public Optional<? extends Long> batchSize() {
        return batchSize;
    }

    public Typesense destinationType() {
        return destinationType;
    }

    /**
     * Hostname of the Typesense instance without protocol.
     */
    public String host() {
        return host;
    }

    /**
     * Path of the Typesense instance. Default is none
     */
    public Optional<? extends String> path() {
        return path;
    }

    /**
     * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 443
     */
    public Optional<? extends String> port() {
        return port;
    }

    /**
     * Protocol of the Typesense instance. Ex: http or https. Default is https
     */
    public Optional<? extends String> protocol() {
        return protocol;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Typesense API Key
     */
    public DestinationTypesense withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * How many documents should be imported together. Default 1000
     */
    public DestinationTypesense withBatchSize(long batchSize) {
        Utils.checkNotNull(batchSize, "batchSize");
        this.batchSize = Optional.ofNullable(batchSize);
        return this;
    }

    /**
     * How many documents should be imported together. Default 1000
     */
    public DestinationTypesense withBatchSize(Optional<? extends Long> batchSize) {
        Utils.checkNotNull(batchSize, "batchSize");
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Hostname of the Typesense instance without protocol.
     */
    public DestinationTypesense withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Path of the Typesense instance. Default is none
     */
    public DestinationTypesense withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = Optional.ofNullable(path);
        return this;
    }

    /**
     * Path of the Typesense instance. Default is none
     */
    public DestinationTypesense withPath(Optional<? extends String> path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    /**
     * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 443
     */
    public DestinationTypesense withPort(String port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 443
     */
    public DestinationTypesense withPort(Optional<? extends String> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * Protocol of the Typesense instance. Ex: http or https. Default is https
     */
    public DestinationTypesense withProtocol(String protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = Optional.ofNullable(protocol);
        return this;
    }

    /**
     * Protocol of the Typesense instance. Ex: http or https. Default is https
     */
    public DestinationTypesense withProtocol(Optional<? extends String> protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = protocol;
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
        DestinationTypesense other = (DestinationTypesense) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.batchSize, other.batchSize) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.path, other.path) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.protocol, other.protocol);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            batchSize,
            destinationType,
            host,
            path,
            port,
            protocol);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationTypesense.class,
                "apiKey", apiKey,
                "batchSize", batchSize,
                "destinationType", destinationType,
                "host", host,
                "path", path,
                "port", port,
                "protocol", protocol);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<? extends Long> batchSize = Optional.empty();
 
        private String host;
 
        private Optional<? extends String> path = Optional.empty();
 
        private Optional<? extends String> port = Optional.empty();
 
        private Optional<? extends String> protocol = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Typesense API Key
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * How many documents should be imported together. Default 1000
         */
        public Builder batchSize(long batchSize) {
            Utils.checkNotNull(batchSize, "batchSize");
            this.batchSize = Optional.ofNullable(batchSize);
            return this;
        }

        /**
         * How many documents should be imported together. Default 1000
         */
        public Builder batchSize(Optional<? extends Long> batchSize) {
            Utils.checkNotNull(batchSize, "batchSize");
            this.batchSize = batchSize;
            return this;
        }

        /**
         * Hostname of the Typesense instance without protocol.
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * Path of the Typesense instance. Default is none
         */
        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = Optional.ofNullable(path);
            return this;
        }

        /**
         * Path of the Typesense instance. Default is none
         */
        public Builder path(Optional<? extends String> path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }

        /**
         * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 443
         */
        public Builder port(String port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 443
         */
        public Builder port(Optional<? extends String> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * Protocol of the Typesense instance. Ex: http or https. Default is https
         */
        public Builder protocol(String protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = Optional.ofNullable(protocol);
            return this;
        }

        /**
         * Protocol of the Typesense instance. Ex: http or https. Default is https
         */
        public Builder protocol(Optional<? extends String> protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }
        
        public DestinationTypesense build() {
            return new DestinationTypesense(
                apiKey,
                batchSize,
                host,
                path,
                port,
                protocol);
        }

        private static final LazySingletonValue<Typesense> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"typesense\"",
                        new TypeReference<Typesense>() {});
    }
}

