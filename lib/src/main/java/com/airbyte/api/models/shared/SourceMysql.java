/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysql - The values required to configure the source.
 */
public class SourceMysql {
    /**
     * The database name.
     */
    @JsonProperty("database")
    public String database;

    public SourceMysql withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * The host name of the database.
     */
    @JsonProperty("host")
    public String host;

    public SourceMysql withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3). For more information read about &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html"&gt;JDBC URL parameters&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;

    public SourceMysql withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * The password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;

    public SourceMysql withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * The port to connect to.
     */
    @JsonProperty("port")
    public Long port;

    public SourceMysql withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Replication method to use for extracting data from the database.
     */
    @JsonProperty("replication_method")
    public Object replicationMethod;

    public SourceMysql withReplicationMethod(Object replicationMethod) {
        this.replicationMethod = replicationMethod;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceMysqlMysqlEnum sourceType;

    public SourceMysql withSourceType(SourceMysqlMysqlEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * SSL connection modes. Read more &lt;a href="https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-using-ssl.html"&gt; in the docs&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")
    public Object sslMode;

    public SourceMysql withSslMode(Object sslMode) {
        this.sslMode = sslMode;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;

    public SourceMysql withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * The username which is used to access the database.
     */
    @JsonProperty("username")
    public String username;

    public SourceMysql withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public SourceMysql(@JsonProperty("database") String database, @JsonProperty("host") String host, @JsonProperty("port") Long port, @JsonProperty("replication_method") Object replicationMethod, @JsonProperty("sourceType") SourceMysqlMysqlEnum sourceType, @JsonProperty("username") String username) {
        this.database = database;
        this.host = host;
        this.port = port;
        this.replicationMethod = replicationMethod;
        this.sourceType = sourceType;
        this.username = username;
  }
}
