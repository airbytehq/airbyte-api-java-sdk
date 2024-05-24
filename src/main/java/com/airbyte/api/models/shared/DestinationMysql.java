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

public class DestinationMysql {

    /**
     * Name of the database.
     */
    @JsonProperty("database")
    private String database;

    @JsonProperty("destinationType")
    private Mysql destinationType;

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disable_type_dedupe")
    private Optional<? extends Boolean> disableTypeDedupe;

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
     * Port of the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Long> port;

    /**
     * The database to write raw tables into
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw_data_schema")
    private Optional<? extends String> rawDataSchema;

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod;

    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public DestinationMysql(
            @JsonProperty("database") String database,
            @JsonProperty("disable_type_dedupe") Optional<? extends Boolean> disableTypeDedupe,
            @JsonProperty("host") String host,
            @JsonProperty("jdbc_url_params") Optional<? extends String> jdbcUrlParams,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("port") Optional<? extends Long> port,
            @JsonProperty("raw_data_schema") Optional<? extends String> rawDataSchema,
            @JsonProperty("tunnel_method") Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        Utils.checkNotNull(username, "username");
        this.database = database;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.disableTypeDedupe = disableTypeDedupe;
        this.host = host;
        this.jdbcUrlParams = jdbcUrlParams;
        this.password = password;
        this.port = port;
        this.rawDataSchema = rawDataSchema;
        this.tunnelMethod = tunnelMethod;
        this.username = username;
    }
    
    public DestinationMysql(
            String database,
            String host,
            String username) {
        this(database, Optional.empty(), host, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), username);
    }

    /**
     * Name of the database.
     */
    @JsonIgnore
    public String database() {
        return database;
    }

    @JsonIgnore
    public Mysql destinationType() {
        return destinationType;
    }

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> disableTypeDedupe() {
        return (Optional<Boolean>) disableTypeDedupe;
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
     * Port of the database.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> port() {
        return (Optional<Long>) port;
    }

    /**
     * The database to write raw tables into
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> rawDataSchema() {
        return (Optional<String>) rawDataSchema;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationMysqlSSHTunnelMethod> tunnelMethod() {
        return (Optional<DestinationMysqlSSHTunnelMethod>) tunnelMethod;
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
    public DestinationMysql withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    public DestinationMysql withDisableTypeDedupe(boolean disableTypeDedupe) {
        Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
        this.disableTypeDedupe = Optional.ofNullable(disableTypeDedupe);
        return this;
    }

    /**
     * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
     */
    public DestinationMysql withDisableTypeDedupe(Optional<? extends Boolean> disableTypeDedupe) {
        Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
        this.disableTypeDedupe = disableTypeDedupe;
        return this;
    }

    /**
     * Hostname of the database.
     */
    public DestinationMysql withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public DestinationMysql withJdbcUrlParams(String jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public DestinationMysql withJdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }

    /**
     * Password associated with the username.
     */
    public DestinationMysql withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Password associated with the username.
     */
    public DestinationMysql withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Port of the database.
     */
    public DestinationMysql withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * Port of the database.
     */
    public DestinationMysql withPort(Optional<? extends Long> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * The database to write raw tables into
     */
    public DestinationMysql withRawDataSchema(String rawDataSchema) {
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        this.rawDataSchema = Optional.ofNullable(rawDataSchema);
        return this;
    }

    /**
     * The database to write raw tables into
     */
    public DestinationMysql withRawDataSchema(Optional<? extends String> rawDataSchema) {
        Utils.checkNotNull(rawDataSchema, "rawDataSchema");
        this.rawDataSchema = rawDataSchema;
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationMysql withTunnelMethod(DestinationMysqlSSHTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationMysql withTunnelMethod(Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
        return this;
    }

    /**
     * Username to use to access the database.
     */
    public DestinationMysql withUsername(String username) {
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
        DestinationMysql other = (DestinationMysql) o;
        return 
            java.util.Objects.deepEquals(this.database, other.database) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.disableTypeDedupe, other.disableTypeDedupe) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.jdbcUrlParams, other.jdbcUrlParams) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.rawDataSchema, other.rawDataSchema) &&
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            database,
            destinationType,
            disableTypeDedupe,
            host,
            jdbcUrlParams,
            password,
            port,
            rawDataSchema,
            tunnelMethod,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMysql.class,
                "database", database,
                "destinationType", destinationType,
                "disableTypeDedupe", disableTypeDedupe,
                "host", host,
                "jdbcUrlParams", jdbcUrlParams,
                "password", password,
                "port", port,
                "rawDataSchema", rawDataSchema,
                "tunnelMethod", tunnelMethod,
                "username", username);
    }
    
    public final static class Builder {
 
        private String database;
 
        private Optional<? extends Boolean> disableTypeDedupe;
 
        private String host;
 
        private Optional<? extends String> jdbcUrlParams = Optional.empty();
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends Long> port;
 
        private Optional<? extends String> rawDataSchema = Optional.empty();
 
        private Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod = Optional.empty();
 
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
         * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
         */
        public Builder disableTypeDedupe(boolean disableTypeDedupe) {
            Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
            this.disableTypeDedupe = Optional.ofNullable(disableTypeDedupe);
            return this;
        }

        /**
         * Disable Writing Final Tables. WARNING! The data format in _airbyte_data is likely stable but there are no guarantees that other metadata columns will remain the same in future versions
         */
        public Builder disableTypeDedupe(Optional<? extends Boolean> disableTypeDedupe) {
            Utils.checkNotNull(disableTypeDedupe, "disableTypeDedupe");
            this.disableTypeDedupe = disableTypeDedupe;
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
         * Port of the database.
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * Port of the database.
         */
        public Builder port(Optional<? extends Long> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * The database to write raw tables into
         */
        public Builder rawDataSchema(String rawDataSchema) {
            Utils.checkNotNull(rawDataSchema, "rawDataSchema");
            this.rawDataSchema = Optional.ofNullable(rawDataSchema);
            return this;
        }

        /**
         * The database to write raw tables into
         */
        public Builder rawDataSchema(Optional<? extends String> rawDataSchema) {
            Utils.checkNotNull(rawDataSchema, "rawDataSchema");
            this.rawDataSchema = rawDataSchema;
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(DestinationMysqlSSHTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod) {
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
        
        public DestinationMysql build() {
            if (disableTypeDedupe == null) {
                disableTypeDedupe = _SINGLETON_VALUE_DisableTypeDedupe.value();
            }
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            return new DestinationMysql(
                database,
                disableTypeDedupe,
                host,
                jdbcUrlParams,
                password,
                port,
                rawDataSchema,
                tunnelMethod,
                username);
        }

        private static final LazySingletonValue<Mysql> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"mysql\"",
                        new TypeReference<Mysql>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_DisableTypeDedupe =
                new LazySingletonValue<>(
                        "disable_type_dedupe",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "3306",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

