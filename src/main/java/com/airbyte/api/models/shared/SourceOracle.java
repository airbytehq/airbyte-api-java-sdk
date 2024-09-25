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

public class SourceOracle {

    /**
     * Connect data that will be used for DB connection
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connection_data")
    private Optional<? extends ConnectBy> connectionData;

    /**
     * The encryption method with is used when communicating with the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encryption")
    private Optional<? extends SourceOracleEncryption> encryption;

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
     * The password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    /**
     * Port of the database.
     * Oracle Corporations recommends the following port numbers:
     * 1521 - Default listening port for client connections to the listener. 
     * 2484 - Recommended and officially registered listening port for client connections to the listener using TCP/IP with SSL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Long> port;

    /**
     * The list of schemas to sync from. Defaults to user. Case sensitive.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    private Optional<? extends java.util.List<String>> schemas;

    @JsonProperty("sourceType")
    private SourceOracleOracle sourceType;

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends SourceOracleSSHTunnelMethod> tunnelMethod;

    /**
     * The username which is used to access the database.
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceOracle(
            @JsonProperty("connection_data") Optional<? extends ConnectBy> connectionData,
            @JsonProperty("encryption") Optional<? extends SourceOracleEncryption> encryption,
            @JsonProperty("host") String host,
            @JsonProperty("jdbc_url_params") Optional<? extends String> jdbcUrlParams,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("port") Optional<? extends Long> port,
            @JsonProperty("schemas") Optional<? extends java.util.List<String>> schemas,
            @JsonProperty("tunnel_method") Optional<? extends SourceOracleSSHTunnelMethod> tunnelMethod,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(connectionData, "connectionData");
        Utils.checkNotNull(encryption, "encryption");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(schemas, "schemas");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        Utils.checkNotNull(username, "username");
        this.connectionData = connectionData;
        this.encryption = encryption;
        this.host = host;
        this.jdbcUrlParams = jdbcUrlParams;
        this.password = password;
        this.port = port;
        this.schemas = schemas;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.tunnelMethod = tunnelMethod;
        this.username = username;
    }
    
    public SourceOracle(
            String host,
            String username) {
        this(Optional.empty(), Optional.empty(), host, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), username);
    }

    /**
     * Connect data that will be used for DB connection
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConnectBy> connectionData() {
        return (Optional<ConnectBy>) connectionData;
    }

    /**
     * The encryption method with is used when communicating with the database.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceOracleEncryption> encryption() {
        return (Optional<SourceOracleEncryption>) encryption;
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
     * The password associated with the username.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> password() {
        return (Optional<String>) password;
    }

    /**
     * Port of the database.
     * Oracle Corporations recommends the following port numbers:
     * 1521 - Default listening port for client connections to the listener. 
     * 2484 - Recommended and officially registered listening port for client connections to the listener using TCP/IP with SSL
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> port() {
        return (Optional<Long>) port;
    }

    /**
     * The list of schemas to sync from. Defaults to user. Case sensitive.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> schemas() {
        return (Optional<java.util.List<String>>) schemas;
    }

    @JsonIgnore
    public SourceOracleOracle sourceType() {
        return sourceType;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceOracleSSHTunnelMethod> tunnelMethod() {
        return (Optional<SourceOracleSSHTunnelMethod>) tunnelMethod;
    }

    /**
     * The username which is used to access the database.
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Connect data that will be used for DB connection
     */
    public SourceOracle withConnectionData(ConnectBy connectionData) {
        Utils.checkNotNull(connectionData, "connectionData");
        this.connectionData = Optional.ofNullable(connectionData);
        return this;
    }

    /**
     * Connect data that will be used for DB connection
     */
    public SourceOracle withConnectionData(Optional<? extends ConnectBy> connectionData) {
        Utils.checkNotNull(connectionData, "connectionData");
        this.connectionData = connectionData;
        return this;
    }

    /**
     * The encryption method with is used when communicating with the database.
     */
    public SourceOracle withEncryption(SourceOracleEncryption encryption) {
        Utils.checkNotNull(encryption, "encryption");
        this.encryption = Optional.ofNullable(encryption);
        return this;
    }

    /**
     * The encryption method with is used when communicating with the database.
     */
    public SourceOracle withEncryption(Optional<? extends SourceOracleEncryption> encryption) {
        Utils.checkNotNull(encryption, "encryption");
        this.encryption = encryption;
        return this;
    }

    /**
     * Hostname of the database.
     */
    public SourceOracle withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public SourceOracle withJdbcUrlParams(String jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public SourceOracle withJdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }

    /**
     * The password associated with the username.
     */
    public SourceOracle withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * The password associated with the username.
     */
    public SourceOracle withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Port of the database.
     * Oracle Corporations recommends the following port numbers:
     * 1521 - Default listening port for client connections to the listener. 
     * 2484 - Recommended and officially registered listening port for client connections to the listener using TCP/IP with SSL
     */
    public SourceOracle withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * Port of the database.
     * Oracle Corporations recommends the following port numbers:
     * 1521 - Default listening port for client connections to the listener. 
     * 2484 - Recommended and officially registered listening port for client connections to the listener using TCP/IP with SSL
     */
    public SourceOracle withPort(Optional<? extends Long> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * The list of schemas to sync from. Defaults to user. Case sensitive.
     */
    public SourceOracle withSchemas(java.util.List<String> schemas) {
        Utils.checkNotNull(schemas, "schemas");
        this.schemas = Optional.ofNullable(schemas);
        return this;
    }

    /**
     * The list of schemas to sync from. Defaults to user. Case sensitive.
     */
    public SourceOracle withSchemas(Optional<? extends java.util.List<String>> schemas) {
        Utils.checkNotNull(schemas, "schemas");
        this.schemas = schemas;
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public SourceOracle withTunnelMethod(SourceOracleSSHTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public SourceOracle withTunnelMethod(Optional<? extends SourceOracleSSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
        return this;
    }

    /**
     * The username which is used to access the database.
     */
    public SourceOracle withUsername(String username) {
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
        SourceOracle other = (SourceOracle) o;
        return 
            java.util.Objects.deepEquals(this.connectionData, other.connectionData) &&
            java.util.Objects.deepEquals(this.encryption, other.encryption) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.jdbcUrlParams, other.jdbcUrlParams) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.schemas, other.schemas) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connectionData,
            encryption,
            host,
            jdbcUrlParams,
            password,
            port,
            schemas,
            sourceType,
            tunnelMethod,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOracle.class,
                "connectionData", connectionData,
                "encryption", encryption,
                "host", host,
                "jdbcUrlParams", jdbcUrlParams,
                "password", password,
                "port", port,
                "schemas", schemas,
                "sourceType", sourceType,
                "tunnelMethod", tunnelMethod,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<? extends ConnectBy> connectionData = Optional.empty();
 
        private Optional<? extends SourceOracleEncryption> encryption = Optional.empty();
 
        private String host;
 
        private Optional<? extends String> jdbcUrlParams = Optional.empty();
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends Long> port;
 
        private Optional<? extends java.util.List<String>> schemas = Optional.empty();
 
        private Optional<? extends SourceOracleSSHTunnelMethod> tunnelMethod = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Connect data that will be used for DB connection
         */
        public Builder connectionData(ConnectBy connectionData) {
            Utils.checkNotNull(connectionData, "connectionData");
            this.connectionData = Optional.ofNullable(connectionData);
            return this;
        }

        /**
         * Connect data that will be used for DB connection
         */
        public Builder connectionData(Optional<? extends ConnectBy> connectionData) {
            Utils.checkNotNull(connectionData, "connectionData");
            this.connectionData = connectionData;
            return this;
        }

        /**
         * The encryption method with is used when communicating with the database.
         */
        public Builder encryption(SourceOracleEncryption encryption) {
            Utils.checkNotNull(encryption, "encryption");
            this.encryption = Optional.ofNullable(encryption);
            return this;
        }

        /**
         * The encryption method with is used when communicating with the database.
         */
        public Builder encryption(Optional<? extends SourceOracleEncryption> encryption) {
            Utils.checkNotNull(encryption, "encryption");
            this.encryption = encryption;
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
         * The password associated with the username.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * The password associated with the username.
         */
        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Port of the database.
         * Oracle Corporations recommends the following port numbers:
         * 1521 - Default listening port for client connections to the listener. 
         * 2484 - Recommended and officially registered listening port for client connections to the listener using TCP/IP with SSL
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * Port of the database.
         * Oracle Corporations recommends the following port numbers:
         * 1521 - Default listening port for client connections to the listener. 
         * 2484 - Recommended and officially registered listening port for client connections to the listener using TCP/IP with SSL
         */
        public Builder port(Optional<? extends Long> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * The list of schemas to sync from. Defaults to user. Case sensitive.
         */
        public Builder schemas(java.util.List<String> schemas) {
            Utils.checkNotNull(schemas, "schemas");
            this.schemas = Optional.ofNullable(schemas);
            return this;
        }

        /**
         * The list of schemas to sync from. Defaults to user. Case sensitive.
         */
        public Builder schemas(Optional<? extends java.util.List<String>> schemas) {
            Utils.checkNotNull(schemas, "schemas");
            this.schemas = schemas;
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(SourceOracleSSHTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(Optional<? extends SourceOracleSSHTunnelMethod> tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = tunnelMethod;
            return this;
        }

        /**
         * The username which is used to access the database.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceOracle build() {
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            return new SourceOracle(
                connectionData,
                encryption,
                host,
                jdbcUrlParams,
                password,
                port,
                schemas,
                tunnelMethod,
                username);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "1521",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<SourceOracleOracle> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"oracle\"",
                        new TypeReference<SourceOracleOracle>() {});
    }
}

