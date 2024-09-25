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

public class DestinationClickhouse {

    /**
     * Name of the database.
     */
    @JsonProperty("database")
    private String database;

    @JsonProperty("destinationType")
    private Clickhouse destinationType;

    /**
     * Hostname of the database.
     */
    @JsonProperty("host")
    private String host;

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    private Optional<? extends String> jdbcUrlParams;

    /**
     * Password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    /**
     * HTTP port of the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Long> port;

    /**
     * The schema to write raw tables into (default: airbyte_internal)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw_data_schema")
    private Optional<? extends String> rawDataSchema;

    /**
     * Encrypt data using SSL.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl")
    private Optional<? extends Boolean> ssl;

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends SSHTunnelMethod> tunnelMethod;

    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public DestinationClickhouse(
            @JsonProperty("database") String database,
            @JsonProperty("host") String host,
            @JsonProperty("jdbc_url_params") Optional<? extends String> jdbcUrlParams,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("port") Optional<? extends Long> port,
            @JsonProperty("raw_data_schema") Optional<? extends String> rawDataSchema,
            @JsonProperty("ssl") Optional<? extends Boolean> ssl,
            @JsonProperty("tunnel_method") Optional<? extends SSHTunnelMethod> tunnelMethod,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        Utils.checkNotNull(ssl, "ssl");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        Utils.checkNotNull(username, "username");
        this.database = database;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.host = host;
        this.jdbcUrlParams = jdbcUrlParams;
        this.password = password;
        this.port = port;
        this.rawDataSchema = rawDataSchema;
        this.ssl = ssl;
        this.tunnelMethod = tunnelMethod;
        this.username = username;
    }
    
    public DestinationClickhouse(
            String database,
            String host,
            String username) {
        this(database, host, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), username);
    }

    /**
     * Name of the database.
     */
    @JsonIgnore
    public String database() {
        return database;
    }

    @JsonIgnore
    public Clickhouse destinationType() {
        return destinationType;
    }

    /**
     * Hostname of the database.
     */
    @JsonIgnore
    public String host() {
        return host;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> jdbcUrlParams() {
        return (Optional<String>) jdbcUrlParams;
    }

    /**
     * Password associated with the username.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> password() {
        return (Optional<String>) password;
    }

    /**
     * HTTP port of the database.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> port() {
        return (Optional<Long>) port;
    }

    /**
     * The schema to write raw tables into (default: airbyte_internal)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> rawDataSchema() {
        return (Optional<String>) rawDataSchema;
    }

    /**
     * Encrypt data using SSL.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> ssl() {
        return (Optional<Boolean>) ssl;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SSHTunnelMethod> tunnelMethod() {
        return (Optional<SSHTunnelMethod>) tunnelMethod;
    }

    /**
     * Username to use to access the database.
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the database.
     */
    public DestinationClickhouse withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * Hostname of the database.
     */
    public DestinationClickhouse withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public DestinationClickhouse withJdbcUrlParams(String jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public DestinationClickhouse withJdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }

    /**
     * Password associated with the username.
     */
    public DestinationClickhouse withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Password associated with the username.
     */
    public DestinationClickhouse withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * HTTP port of the database.
     */
    public DestinationClickhouse withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * HTTP port of the database.
     */
    public DestinationClickhouse withPort(Optional<? extends Long> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * The schema to write raw tables into (default: airbyte_internal)
     */
    public DestinationClickhouse withRawDataSchema(String rawDataSchema) {
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        this.rawDataSchema = Optional.ofNullable(rawDataSchema);
        return this;
    }

    /**
     * The schema to write raw tables into (default: airbyte_internal)
     */
    public DestinationClickhouse withRawDataSchema(Optional<? extends String> rawDataSchema) {
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        this.rawDataSchema = rawDataSchema;
        return this;
    }

    /**
     * Encrypt data using SSL.
     */
    public DestinationClickhouse withSsl(boolean ssl) {
        Utils.checkNotNull(ssl, "ssl");
        this.ssl = Optional.ofNullable(ssl);
        return this;
    }

    /**
     * Encrypt data using SSL.
     */
    public DestinationClickhouse withSsl(Optional<? extends Boolean> ssl) {
        Utils.checkNotNull(ssl, "ssl");
        this.ssl = ssl;
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationClickhouse withTunnelMethod(SSHTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationClickhouse withTunnelMethod(Optional<? extends SSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
        return this;
    }

    /**
     * Username to use to access the database.
     */
    public DestinationClickhouse withUsername(String username) {
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
        DestinationClickhouse other = (DestinationClickhouse) o;
        return 
            java.util.Objects.deepEquals(this.database, other.database) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.jdbcUrlParams, other.jdbcUrlParams) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.rawDataSchema, other.rawDataSchema) &&
            java.util.Objects.deepEquals(this.ssl, other.ssl) &&
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            database,
            destinationType,
            host,
            jdbcUrlParams,
            password,
            port,
            rawDataSchema,
            ssl,
            tunnelMethod,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationClickhouse.class,
                "database", database,
                "destinationType", destinationType,
                "host", host,
                "jdbcUrlParams", jdbcUrlParams,
                "password", password,
                "port", port,
                "rawDataSchema", rawDataSchema,
                "ssl", ssl,
                "tunnelMethod", tunnelMethod,
                "username", username);
    }
    
    public final static class Builder {
 
        private String database;
 
        private String host;
 
        private Optional<? extends String> jdbcUrlParams = Optional.empty();
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends Long> port;
 
        private Optional<? extends String> rawDataSchema = Optional.empty();
 
        private Optional<? extends Boolean> ssl;
 
        private Optional<? extends SSHTunnelMethod> tunnelMethod = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the database.
         */
        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }

        /**
         * Hostname of the database.
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
         */
        public Builder jdbcUrlParams(String jdbcUrlParams) {
            Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
            this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
            return this;
        }

        /**
         * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
         */
        public Builder jdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
            Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
            this.jdbcUrlParams = jdbcUrlParams;
            return this;
        }

        /**
         * Password associated with the username.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * Password associated with the username.
         */
        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * HTTP port of the database.
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * HTTP port of the database.
         */
        public Builder port(Optional<? extends Long> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * The schema to write raw tables into (default: airbyte_internal)
         */
        public Builder rawDataSchema(String rawDataSchema) {
            Utils.checkNotNull(rawDataSchema, "rawDataSchema");
            this.rawDataSchema = Optional.ofNullable(rawDataSchema);
            return this;
        }

        /**
         * The schema to write raw tables into (default: airbyte_internal)
         */
        public Builder rawDataSchema(Optional<? extends String> rawDataSchema) {
            Utils.checkNotNull(rawDataSchema, "rawDataSchema");
            this.rawDataSchema = rawDataSchema;
            return this;
        }

        /**
         * Encrypt data using SSL.
         */
        public Builder ssl(boolean ssl) {
            Utils.checkNotNull(ssl, "ssl");
            this.ssl = Optional.ofNullable(ssl);
            return this;
        }

        /**
         * Encrypt data using SSL.
         */
        public Builder ssl(Optional<? extends Boolean> ssl) {
            Utils.checkNotNull(ssl, "ssl");
            this.ssl = ssl;
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(SSHTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(Optional<? extends SSHTunnelMethod> tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = tunnelMethod;
            return this;
        }

        /**
         * Username to use to access the database.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public DestinationClickhouse build() {
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            if (ssl == null) {
                ssl = _SINGLETON_VALUE_Ssl.value();
            }
            return new DestinationClickhouse(
                database,
                host,
                jdbcUrlParams,
                password,
                port,
                rawDataSchema,
                ssl,
                tunnelMethod,
                username);
        }

        private static final LazySingletonValue<Clickhouse> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"clickhouse\"",
                        new TypeReference<Clickhouse>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "8123",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Ssl =
                new LazySingletonValue<>(
                        "ssl",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

