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


public class DestinationRedis {

    /**
     * Redis cache type to store data in.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cache_type")
    private Optional<? extends CacheType> cacheType;

    @JsonProperty("destinationType")
    private Redis destinationType;

    /**
     * Redis host to connect to.
     */
    @JsonProperty("host")
    private String host;

    /**
     * Password associated with Redis.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    /**
     * Port of Redis.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Long> port;

    /**
     * Indicates whether SSL encryption protocol will be used to connect to Redis. It is recommended to use SSL connection if possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl")
    private Optional<? extends Boolean> ssl;

    /**
     * SSL connection modes. 
     *   &lt;li&gt;&lt;b&gt;verify-full&lt;/b&gt; - This is the most secure mode. Always require encryption and verifies the identity of the source database server
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")
    private Optional<? extends DestinationRedisSSLModes> sslMode;

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends DestinationRedisSSHTunnelMethod> tunnelMethod;

    /**
     * Username associated with Redis.
     */
    @JsonProperty("username")
    private String username;

    public DestinationRedis(
            @JsonProperty("cache_type") Optional<? extends CacheType> cacheType,
            @JsonProperty("host") String host,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("port") Optional<? extends Long> port,
            @JsonProperty("ssl") Optional<? extends Boolean> ssl,
            @JsonProperty("ssl_mode") Optional<? extends DestinationRedisSSLModes> sslMode,
            @JsonProperty("tunnel_method") Optional<? extends DestinationRedisSSHTunnelMethod> tunnelMethod,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(cacheType, "cacheType");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(ssl, "ssl");
        Utils.checkNotNull(sslMode, "sslMode");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        Utils.checkNotNull(username, "username");
        this.cacheType = cacheType;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.host = host;
        this.password = password;
        this.port = port;
        this.ssl = ssl;
        this.sslMode = sslMode;
        this.tunnelMethod = tunnelMethod;
        this.username = username;
    }

    /**
     * Redis cache type to store data in.
     */
    public Optional<? extends CacheType> cacheType() {
        return cacheType;
    }

    public Redis destinationType() {
        return destinationType;
    }

    /**
     * Redis host to connect to.
     */
    public String host() {
        return host;
    }

    /**
     * Password associated with Redis.
     */
    public Optional<? extends String> password() {
        return password;
    }

    /**
     * Port of Redis.
     */
    public Optional<? extends Long> port() {
        return port;
    }

    /**
     * Indicates whether SSL encryption protocol will be used to connect to Redis. It is recommended to use SSL connection if possible.
     */
    public Optional<? extends Boolean> ssl() {
        return ssl;
    }

    /**
     * SSL connection modes. 
     *   &lt;li&gt;&lt;b&gt;verify-full&lt;/b&gt; - This is the most secure mode. Always require encryption and verifies the identity of the source database server
     */
    public Optional<? extends DestinationRedisSSLModes> sslMode() {
        return sslMode;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public Optional<? extends DestinationRedisSSHTunnelMethod> tunnelMethod() {
        return tunnelMethod;
    }

    /**
     * Username associated with Redis.
     */
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Redis cache type to store data in.
     */
    public DestinationRedis withCacheType(CacheType cacheType) {
        Utils.checkNotNull(cacheType, "cacheType");
        this.cacheType = Optional.ofNullable(cacheType);
        return this;
    }

    /**
     * Redis cache type to store data in.
     */
    public DestinationRedis withCacheType(Optional<? extends CacheType> cacheType) {
        Utils.checkNotNull(cacheType, "cacheType");
        this.cacheType = cacheType;
        return this;
    }

    /**
     * Redis host to connect to.
     */
    public DestinationRedis withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Password associated with Redis.
     */
    public DestinationRedis withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Password associated with Redis.
     */
    public DestinationRedis withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Port of Redis.
     */
    public DestinationRedis withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * Port of Redis.
     */
    public DestinationRedis withPort(Optional<? extends Long> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * Indicates whether SSL encryption protocol will be used to connect to Redis. It is recommended to use SSL connection if possible.
     */
    public DestinationRedis withSsl(boolean ssl) {
        Utils.checkNotNull(ssl, "ssl");
        this.ssl = Optional.ofNullable(ssl);
        return this;
    }

    /**
     * Indicates whether SSL encryption protocol will be used to connect to Redis. It is recommended to use SSL connection if possible.
     */
    public DestinationRedis withSsl(Optional<? extends Boolean> ssl) {
        Utils.checkNotNull(ssl, "ssl");
        this.ssl = ssl;
        return this;
    }

    /**
     * SSL connection modes. 
     *   &lt;li&gt;&lt;b&gt;verify-full&lt;/b&gt; - This is the most secure mode. Always require encryption and verifies the identity of the source database server
     */
    public DestinationRedis withSslMode(DestinationRedisSSLModes sslMode) {
        Utils.checkNotNull(sslMode, "sslMode");
        this.sslMode = Optional.ofNullable(sslMode);
        return this;
    }

    /**
     * SSL connection modes. 
     *   &lt;li&gt;&lt;b&gt;verify-full&lt;/b&gt; - This is the most secure mode. Always require encryption and verifies the identity of the source database server
     */
    public DestinationRedis withSslMode(Optional<? extends DestinationRedisSSLModes> sslMode) {
        Utils.checkNotNull(sslMode, "sslMode");
        this.sslMode = sslMode;
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationRedis withTunnelMethod(DestinationRedisSSHTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationRedis withTunnelMethod(Optional<? extends DestinationRedisSSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
        return this;
    }

    /**
     * Username associated with Redis.
     */
    public DestinationRedis withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        DestinationRedis other = (DestinationRedis) o;
        return 
            java.util.Objects.deepEquals(this.cacheType, other.cacheType) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.ssl, other.ssl) &&
            java.util.Objects.deepEquals(this.sslMode, other.sslMode) &&
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cacheType,
            destinationType,
            host,
            password,
            port,
            ssl,
            sslMode,
            tunnelMethod,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationRedis.class,
                "cacheType", cacheType,
                "destinationType", destinationType,
                "host", host,
                "password", password,
                "port", port,
                "ssl", ssl,
                "sslMode", sslMode,
                "tunnelMethod", tunnelMethod,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<? extends CacheType> cacheType;
 
        private String host;
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends Long> port;
 
        private Optional<? extends Boolean> ssl;
 
        private Optional<? extends DestinationRedisSSLModes> sslMode = Optional.empty();
 
        private Optional<? extends DestinationRedisSSHTunnelMethod> tunnelMethod = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Redis cache type to store data in.
         */
        public Builder cacheType(CacheType cacheType) {
            Utils.checkNotNull(cacheType, "cacheType");
            this.cacheType = Optional.ofNullable(cacheType);
            return this;
        }

        /**
         * Redis cache type to store data in.
         */
        public Builder cacheType(Optional<? extends CacheType> cacheType) {
            Utils.checkNotNull(cacheType, "cacheType");
            this.cacheType = cacheType;
            return this;
        }

        /**
         * Redis host to connect to.
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * Password associated with Redis.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * Password associated with Redis.
         */
        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Port of Redis.
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * Port of Redis.
         */
        public Builder port(Optional<? extends Long> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * Indicates whether SSL encryption protocol will be used to connect to Redis. It is recommended to use SSL connection if possible.
         */
        public Builder ssl(boolean ssl) {
            Utils.checkNotNull(ssl, "ssl");
            this.ssl = Optional.ofNullable(ssl);
            return this;
        }

        /**
         * Indicates whether SSL encryption protocol will be used to connect to Redis. It is recommended to use SSL connection if possible.
         */
        public Builder ssl(Optional<? extends Boolean> ssl) {
            Utils.checkNotNull(ssl, "ssl");
            this.ssl = ssl;
            return this;
        }

        /**
         * SSL connection modes. 
         *   &lt;li&gt;&lt;b&gt;verify-full&lt;/b&gt; - This is the most secure mode. Always require encryption and verifies the identity of the source database server
         */
        public Builder sslMode(DestinationRedisSSLModes sslMode) {
            Utils.checkNotNull(sslMode, "sslMode");
            this.sslMode = Optional.ofNullable(sslMode);
            return this;
        }

        /**
         * SSL connection modes. 
         *   &lt;li&gt;&lt;b&gt;verify-full&lt;/b&gt; - This is the most secure mode. Always require encryption and verifies the identity of the source database server
         */
        public Builder sslMode(Optional<? extends DestinationRedisSSLModes> sslMode) {
            Utils.checkNotNull(sslMode, "sslMode");
            this.sslMode = sslMode;
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(DestinationRedisSSHTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(Optional<? extends DestinationRedisSSHTunnelMethod> tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = tunnelMethod;
            return this;
        }

        /**
         * Username associated with Redis.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public DestinationRedis build() {
            if (cacheType == null) {
                cacheType = _SINGLETON_VALUE_CacheType.value();
            }
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            if (ssl == null) {
                ssl = _SINGLETON_VALUE_Ssl.value();
            }
            return new DestinationRedis(
                cacheType,
                host,
                password,
                port,
                ssl,
                sslMode,
                tunnelMethod,
                username);
        }

        private static final LazySingletonValue<Optional<? extends CacheType>> _SINGLETON_VALUE_CacheType =
                new LazySingletonValue<>(
                        "cache_type",
                        "\"hash\"",
                        new TypeReference<Optional<? extends CacheType>>() {});

        private static final LazySingletonValue<Redis> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"redis\"",
                        new TypeReference<Redis>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "6379",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Ssl =
                new LazySingletonValue<>(
                        "ssl",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

