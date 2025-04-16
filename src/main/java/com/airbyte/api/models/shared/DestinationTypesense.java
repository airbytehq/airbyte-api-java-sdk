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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
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
    private Optional<Long> batchSize;

    @JsonProperty("destinationType")
    private Typesense destinationType;

    /**
     * Hostname of the Typesense instance without protocol. Accept multiple hosts separated by comma.
     */
    @JsonProperty("host")
    private String host;

    /**
     * Path of the Typesense instance. Default is none
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("path")
    private Optional<String> path;

    /**
     * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 8108
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<String> port;

    /**
     * Protocol of the Typesense instance. Ex: http or https. Default is https
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocol")
    private Optional<String> protocol;

    @JsonCreator
    public DestinationTypesense(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("batch_size") Optional<Long> batchSize,
            @JsonProperty("host") String host,
            @JsonProperty("path") Optional<String> path,
            @JsonProperty("port") Optional<String> port,
            @JsonProperty("protocol") Optional<String> protocol) {
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
    
    public DestinationTypesense(
            String apiKey,
            String host) {
        this(apiKey, Optional.empty(), host, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Typesense API Key
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * How many documents should be imported together. Default 1000
     */
    @JsonIgnore
    public Optional<Long> batchSize() {
        return batchSize;
    }

    @JsonIgnore
    public Typesense destinationType() {
        return destinationType;
    }

    /**
     * Hostname of the Typesense instance without protocol. Accept multiple hosts separated by comma.
     */
    @JsonIgnore
    public String host() {
        return host;
    }

    /**
     * Path of the Typesense instance. Default is none
     */
    @JsonIgnore
    public Optional<String> path() {
        return path;
    }

    /**
     * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 8108
     */
    @JsonIgnore
    public Optional<String> port() {
        return port;
    }

    /**
     * Protocol of the Typesense instance. Ex: http or https. Default is https
     */
    @JsonIgnore
    public Optional<String> protocol() {
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
    public DestinationTypesense withBatchSize(Optional<Long> batchSize) {
        Utils.checkNotNull(batchSize, "batchSize");
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Hostname of the Typesense instance without protocol. Accept multiple hosts separated by comma.
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
    public DestinationTypesense withPath(Optional<String> path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    /**
     * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 8108
     */
    public DestinationTypesense withPort(String port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 8108
     */
    public DestinationTypesense withPort(Optional<String> port) {
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
    public DestinationTypesense withProtocol(Optional<String> protocol) {
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
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.batchSize, other.batchSize) &&
            Objects.deepEquals(this.destinationType, other.destinationType) &&
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.path, other.path) &&
            Objects.deepEquals(this.port, other.port) &&
            Objects.deepEquals(this.protocol, other.protocol);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<Long> batchSize = Optional.empty();
 
        private String host;
 
        private Optional<String> path = Optional.empty();
 
        private Optional<String> port = Optional.empty();
 
        private Optional<String> protocol = Optional.empty();
        
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
        public Builder batchSize(Optional<Long> batchSize) {
            Utils.checkNotNull(batchSize, "batchSize");
            this.batchSize = batchSize;
            return this;
        }

        /**
         * Hostname of the Typesense instance without protocol. Accept multiple hosts separated by comma.
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
        public Builder path(Optional<String> path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }

        /**
         * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 8108
         */
        public Builder port(String port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 8108
         */
        public Builder port(Optional<String> port) {
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
        public Builder protocol(Optional<String> protocol) {
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
