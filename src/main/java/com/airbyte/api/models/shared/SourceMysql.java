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


public class SourceMysql {

    /**
     * The database name.
     */
    @JsonProperty("database")
    private String database;

    /**
     * The host name of the database.
     */
    @JsonProperty("host")
    private String host;

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3). For more information read about &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html"&gt;JDBC URL parameters&lt;/a&gt;.
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
     * The port to connect to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Long> port;

    /**
     * Configures how data is extracted from the database.
     */
    @JsonProperty("replication_method")
    private SourceMysqlUpdateMethod replicationMethod;

    @JsonProperty("sourceType")
    private SourceMysqlMysql sourceType;

    /**
     * SSL connection modes. Read more &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-using-ssl.html"&gt; in the docs&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")
    private Optional<? extends SourceMysqlSSLModes> sslMode;

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends SourceMysqlSSHTunnelMethod> tunnelMethod;

    /**
     * The username which is used to access the database.
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceMysql(
            @JsonProperty("database") String database,
            @JsonProperty("host") String host,
            @JsonProperty("jdbc_url_params") Optional<? extends String> jdbcUrlParams,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("port") Optional<? extends Long> port,
            @JsonProperty("replication_method") SourceMysqlUpdateMethod replicationMethod,
            @JsonProperty("ssl_mode") Optional<? extends SourceMysqlSSLModes> sslMode,
            @JsonProperty("tunnel_method") Optional<? extends SourceMysqlSSHTunnelMethod> tunnelMethod,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(replicationMethod, "replicationMethod");
        Utils.checkNotNull(sslMode, "sslMode");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        Utils.checkNotNull(username, "username");
        this.database = database;
        this.host = host;
        this.jdbcUrlParams = jdbcUrlParams;
        this.password = password;
        this.port = port;
        this.replicationMethod = replicationMethod;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.sslMode = sslMode;
        this.tunnelMethod = tunnelMethod;
        this.username = username;
    }
    
    public SourceMysql(
            String database,
            String host,
            SourceMysqlUpdateMethod replicationMethod,
            String username) {
        this(database, host, Optional.empty(), Optional.empty(), Optional.empty(), replicationMethod, Optional.empty(), Optional.empty(), username);
    }

    /**
     * The database name.
     */
    @JsonIgnore
    public String database() {
        return database;
    }

    /**
     * The host name of the database.
     */
    @JsonIgnore
    public String host() {
        return host;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3). For more information read about &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html"&gt;JDBC URL parameters&lt;/a&gt;.
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
     * The port to connect to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> port() {
        return (Optional<Long>) port;
    }

    /**
     * Configures how data is extracted from the database.
     */
    @JsonIgnore
    public SourceMysqlUpdateMethod replicationMethod() {
        return replicationMethod;
    }

    @JsonIgnore
    public SourceMysqlMysql sourceType() {
        return sourceType;
    }

    /**
     * SSL connection modes. Read more &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-using-ssl.html"&gt; in the docs&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMysqlSSLModes> sslMode() {
        return (Optional<SourceMysqlSSLModes>) sslMode;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMysqlSSHTunnelMethod> tunnelMethod() {
        return (Optional<SourceMysqlSSHTunnelMethod>) tunnelMethod;
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
     * The database name.
     */
    public SourceMysql withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * The host name of the database.
     */
    public SourceMysql withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3). For more information read about &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html"&gt;JDBC URL parameters&lt;/a&gt;.
     */
    public SourceMysql withJdbcUrlParams(String jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3). For more information read about &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html"&gt;JDBC URL parameters&lt;/a&gt;.
     */
    public SourceMysql withJdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }

    /**
     * The password associated with the username.
     */
    public SourceMysql withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * The password associated with the username.
     */
    public SourceMysql withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * The port to connect to.
     */
    public SourceMysql withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * The port to connect to.
     */
    public SourceMysql withPort(Optional<? extends Long> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * Configures how data is extracted from the database.
     */
    public SourceMysql withReplicationMethod(SourceMysqlUpdateMethod replicationMethod) {
        Utils.checkNotNull(replicationMethod, "replicationMethod");
        this.replicationMethod = replicationMethod;
        return this;
    }

    /**
     * SSL connection modes. Read more &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-using-ssl.html"&gt; in the docs&lt;/a&gt;.
     */
    public SourceMysql withSslMode(SourceMysqlSSLModes sslMode) {
        Utils.checkNotNull(sslMode, "sslMode");
        this.sslMode = Optional.ofNullable(sslMode);
        return this;
    }

    /**
     * SSL connection modes. Read more &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-using-ssl.html"&gt; in the docs&lt;/a&gt;.
     */
    public SourceMysql withSslMode(Optional<? extends SourceMysqlSSLModes> sslMode) {
        Utils.checkNotNull(sslMode, "sslMode");
        this.sslMode = sslMode;
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public SourceMysql withTunnelMethod(SourceMysqlSSHTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public SourceMysql withTunnelMethod(Optional<? extends SourceMysqlSSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
        return this;
    }

    /**
     * The username which is used to access the database.
     */
    public SourceMysql withUsername(String username) {
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
        SourceMysql other = (SourceMysql) o;
        return 
            java.util.Objects.deepEquals(this.database, other.database) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.jdbcUrlParams, other.jdbcUrlParams) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.replicationMethod, other.replicationMethod) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.sslMode, other.sslMode) &&
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
            sourceType,
            sslMode,
            tunnelMethod,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMysql.class,
                "database", database,
                "host", host,
                "jdbcUrlParams", jdbcUrlParams,
                "password", password,
                "port", port,
                "replicationMethod", replicationMethod,
                "sourceType", sourceType,
                "sslMode", sslMode,
                "tunnelMethod", tunnelMethod,
                "username", username);
    }
    
    public final static class Builder {
 
        private String database;
 
        private String host;
 
        private Optional<? extends String> jdbcUrlParams = Optional.empty();
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends Long> port;
 
        private SourceMysqlUpdateMethod replicationMethod;
 
        private Optional<? extends SourceMysqlSSLModes> sslMode = Optional.empty();
 
        private Optional<? extends SourceMysqlSSHTunnelMethod> tunnelMethod = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The database name.
         */
        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }

        /**
         * The host name of the database.
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3). For more information read about &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html"&gt;JDBC URL parameters&lt;/a&gt;.
         */
        public Builder jdbcUrlParams(String jdbcUrlParams) {
            Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
            this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
            return this;
        }

        /**
         * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3). For more information read about &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html"&gt;JDBC URL parameters&lt;/a&gt;.
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
         * The port to connect to.
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * The port to connect to.
         */
        public Builder port(Optional<? extends Long> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * Configures how data is extracted from the database.
         */
        public Builder replicationMethod(SourceMysqlUpdateMethod replicationMethod) {
            Utils.checkNotNull(replicationMethod, "replicationMethod");
            this.replicationMethod = replicationMethod;
            return this;
        }

        /**
         * SSL connection modes. Read more &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-using-ssl.html"&gt; in the docs&lt;/a&gt;.
         */
        public Builder sslMode(SourceMysqlSSLModes sslMode) {
            Utils.checkNotNull(sslMode, "sslMode");
            this.sslMode = Optional.ofNullable(sslMode);
            return this;
        }

        /**
         * SSL connection modes. Read more &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-using-ssl.html"&gt; in the docs&lt;/a&gt;.
         */
        public Builder sslMode(Optional<? extends SourceMysqlSSLModes> sslMode) {
            Utils.checkNotNull(sslMode, "sslMode");
            this.sslMode = sslMode;
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(SourceMysqlSSHTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(Optional<? extends SourceMysqlSSHTunnelMethod> tunnelMethod) {
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
        
        public SourceMysql build() {
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            return new SourceMysql(
                database,
                host,
                jdbcUrlParams,
                password,
                port,
                replicationMethod,
                sslMode,
                tunnelMethod,
                username);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "3306",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<SourceMysqlMysql> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mysql\"",
                        new TypeReference<SourceMysqlMysql>() {});
    }
}
