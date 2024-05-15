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


public class SourceMssql {

    /**
     * The name of the database.
     */
    @JsonProperty("database")
    private String database;

    /**
     * The hostname of the database.
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
    @JsonProperty("password")
    private String password;

    /**
     * The port of the database.
     */
    @JsonProperty("port")
    private long port;

    /**
     * Configures how data is extracted from the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication_method")
    private Optional<? extends UpdateMethod> replicationMethod;

    /**
     * The list of schemas to sync from. Defaults to user. Case sensitive.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    private Optional<? extends java.util.List<String>> schemas;

    @JsonProperty("sourceType")
    private SourceMssqlMssql sourceType;

    /**
     * The encryption method which is used when communicating with the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_method")
    private Optional<? extends SourceMssqlSSLMethod> sslMethod;

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends SourceMssqlSSHTunnelMethod> tunnelMethod;

    /**
     * The username which is used to access the database.
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceMssql(
            @JsonProperty("database") String database,
            @JsonProperty("host") String host,
            @JsonProperty("jdbc_url_params") Optional<? extends String> jdbcUrlParams,
            @JsonProperty("password") String password,
            @JsonProperty("port") long port,
            @JsonProperty("replication_method") Optional<? extends UpdateMethod> replicationMethod,
            @JsonProperty("schemas") Optional<? extends java.util.List<String>> schemas,
            @JsonProperty("ssl_method") Optional<? extends SourceMssqlSSLMethod> sslMethod,
            @JsonProperty("tunnel_method") Optional<? extends SourceMssqlSSHTunnelMethod> tunnelMethod,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(replicationMethod, "replicationMethod");
        Utils.checkNotNull(schemas, "schemas");
        Utils.checkNotNull(sslMethod, "sslMethod");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        Utils.checkNotNull(username, "username");
        this.database = database;
        this.host = host;
        this.jdbcUrlParams = jdbcUrlParams;
        this.password = password;
        this.port = port;
        this.replicationMethod = replicationMethod;
        this.schemas = schemas;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.sslMethod = sslMethod;
        this.tunnelMethod = tunnelMethod;
        this.username = username;
    }
    
    public SourceMssql(
            String database,
            String host,
            String password,
            long port,
            String username) {
        this(database, host, Optional.empty(), password, port, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), username);
    }

    /**
     * The name of the database.
     */
    @JsonIgnore
    public String database() {
        return database;
    }

    /**
     * The hostname of the database.
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
    @JsonIgnore
    public String password() {
        return password;
    }

    /**
     * The port of the database.
     */
    @JsonIgnore
    public long port() {
        return port;
    }

    /**
     * Configures how data is extracted from the database.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateMethod> replicationMethod() {
        return (Optional<UpdateMethod>) replicationMethod;
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
    public SourceMssqlMssql sourceType() {
        return sourceType;
    }

    /**
     * The encryption method which is used when communicating with the database.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMssqlSSLMethod> sslMethod() {
        return (Optional<SourceMssqlSSLMethod>) sslMethod;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMssqlSSHTunnelMethod> tunnelMethod() {
        return (Optional<SourceMssqlSSHTunnelMethod>) tunnelMethod;
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
     * The name of the database.
     */
    public SourceMssql withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * The hostname of the database.
     */
    public SourceMssql withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public SourceMssql withJdbcUrlParams(String jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public SourceMssql withJdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }

    /**
     * The password associated with the username.
     */
    public SourceMssql withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * The port of the database.
     */
    public SourceMssql withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * Configures how data is extracted from the database.
     */
    public SourceMssql withReplicationMethod(UpdateMethod replicationMethod) {
        Utils.checkNotNull(replicationMethod, "replicationMethod");
        this.replicationMethod = Optional.ofNullable(replicationMethod);
        return this;
    }

    /**
     * Configures how data is extracted from the database.
     */
    public SourceMssql withReplicationMethod(Optional<? extends UpdateMethod> replicationMethod) {
        Utils.checkNotNull(replicationMethod, "replicationMethod");
        this.replicationMethod = replicationMethod;
        return this;
    }

    /**
     * The list of schemas to sync from. Defaults to user. Case sensitive.
     */
    public SourceMssql withSchemas(java.util.List<String> schemas) {
        Utils.checkNotNull(schemas, "schemas");
        this.schemas = Optional.ofNullable(schemas);
        return this;
    }

    /**
     * The list of schemas to sync from. Defaults to user. Case sensitive.
     */
    public SourceMssql withSchemas(Optional<? extends java.util.List<String>> schemas) {
        Utils.checkNotNull(schemas, "schemas");
        this.schemas = schemas;
        return this;
    }

    /**
     * The encryption method which is used when communicating with the database.
     */
    public SourceMssql withSslMethod(SourceMssqlSSLMethod sslMethod) {
        Utils.checkNotNull(sslMethod, "sslMethod");
        this.sslMethod = Optional.ofNullable(sslMethod);
        return this;
    }

    /**
     * The encryption method which is used when communicating with the database.
     */
    public SourceMssql withSslMethod(Optional<? extends SourceMssqlSSLMethod> sslMethod) {
        Utils.checkNotNull(sslMethod, "sslMethod");
        this.sslMethod = sslMethod;
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public SourceMssql withTunnelMethod(SourceMssqlSSHTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public SourceMssql withTunnelMethod(Optional<? extends SourceMssqlSSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
        return this;
    }

    /**
     * The username which is used to access the database.
     */
    public SourceMssql withUsername(String username) {
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
        SourceMssql other = (SourceMssql) o;
        return 
            java.util.Objects.deepEquals(this.database, other.database) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.jdbcUrlParams, other.jdbcUrlParams) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.replicationMethod, other.replicationMethod) &&
            java.util.Objects.deepEquals(this.schemas, other.schemas) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.sslMethod, other.sslMethod) &&
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            database,
            host,
            jdbcUrlParams,
            password,
            port,
            replicationMethod,
            schemas,
            sourceType,
            sslMethod,
            tunnelMethod,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMssql.class,
                "database", database,
                "host", host,
                "jdbcUrlParams", jdbcUrlParams,
                "password", password,
                "port", port,
                "replicationMethod", replicationMethod,
                "schemas", schemas,
                "sourceType", sourceType,
                "sslMethod", sslMethod,
                "tunnelMethod", tunnelMethod,
                "username", username);
    }
    
    public final static class Builder {
 
        private String database;
 
        private String host;
 
        private Optional<? extends String> jdbcUrlParams = Optional.empty();
 
        private String password;
 
        private Long port;
 
        private Optional<? extends UpdateMethod> replicationMethod = Optional.empty();
 
        private Optional<? extends java.util.List<String>> schemas = Optional.empty();
 
        private Optional<? extends SourceMssqlSSLMethod> sslMethod = Optional.empty();
 
        private Optional<? extends SourceMssqlSSHTunnelMethod> tunnelMethod = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the database.
         */
        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }

        /**
         * The hostname of the database.
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
            this.password = password;
            return this;
        }

        /**
         * The port of the database.
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * Configures how data is extracted from the database.
         */
        public Builder replicationMethod(UpdateMethod replicationMethod) {
            Utils.checkNotNull(replicationMethod, "replicationMethod");
            this.replicationMethod = Optional.ofNullable(replicationMethod);
            return this;
        }

        /**
         * Configures how data is extracted from the database.
         */
        public Builder replicationMethod(Optional<? extends UpdateMethod> replicationMethod) {
            Utils.checkNotNull(replicationMethod, "replicationMethod");
            this.replicationMethod = replicationMethod;
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
         * The encryption method which is used when communicating with the database.
         */
        public Builder sslMethod(SourceMssqlSSLMethod sslMethod) {
            Utils.checkNotNull(sslMethod, "sslMethod");
            this.sslMethod = Optional.ofNullable(sslMethod);
            return this;
        }

        /**
         * The encryption method which is used when communicating with the database.
         */
        public Builder sslMethod(Optional<? extends SourceMssqlSSLMethod> sslMethod) {
            Utils.checkNotNull(sslMethod, "sslMethod");
            this.sslMethod = sslMethod;
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(SourceMssqlSSHTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(Optional<? extends SourceMssqlSSHTunnelMethod> tunnelMethod) {
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
        
        public SourceMssql build() {
            return new SourceMssql(
                database,
                host,
                jdbcUrlParams,
                password,
                port,
                replicationMethod,
                schemas,
                sslMethod,
                tunnelMethod,
                username);
        }

        private static final LazySingletonValue<SourceMssqlMssql> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mssql\"",
                        new TypeReference<SourceMssqlMssql>() {});
    }
}

