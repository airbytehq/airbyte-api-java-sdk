/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePostgres - The values required to configure the source.
 */

public class SourcePostgres {
    /**
     * Name of the database.
     */
    @JsonProperty("database")
    public String database;

    public SourcePostgres withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * Hostname of the database.
     */
    @JsonProperty("host")
    public String host;

    public SourcePostgres withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (Eg. key1=value1&amp;key2=value2&amp;key3=value3). For more information read about &lt;a href="https://jdbc.postgresql.org/documentation/head/connect.html"&gt;JDBC URL parameters&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;

    public SourcePostgres withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;

    public SourcePostgres withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    public Long port;

    public SourcePostgres withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Configures how data is extracted from the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication_method")
    public Object replicationMethod;

    public SourcePostgres withReplicationMethod(Object replicationMethod) {
        this.replicationMethod = replicationMethod;
        return this;
    }
    
    /**
     * The list of schemas (case sensitive) to sync from. Defaults to public.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    public String[] schemas;

    public SourcePostgres withSchemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourcePostgresPostgres sourceType;

    public SourcePostgres withSourceType(SourcePostgresPostgres sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * SSL connection modes. 
     *   Read more &lt;a href="https://jdbc.postgresql.org/documentation/head/ssl-client.html"&gt; in the docs&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl_mode")
    public Object sslMode;

    public SourcePostgres withSslMode(Object sslMode) {
        this.sslMode = sslMode;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;

    public SourcePostgres withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Username to access the database.
     */
    @JsonProperty("username")
    public String username;

    public SourcePostgres withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public SourcePostgres(@JsonProperty("database") String database, @JsonProperty("host") String host, @JsonProperty("sourceType") SourcePostgresPostgres sourceType, @JsonProperty("username") String username) {
        this.database = database;
        this.host = host;
        this.sourceType = sourceType;
        this.username = username;
  }
}
