/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationVertica - The values required to configure the destination.
 */

public class DestinationVertica {
    /**
     * Name of the database.
     */
    @JsonProperty("database")
    public String database;

    public DestinationVertica withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationVerticaVertica destinationType;

    public DestinationVertica withDestinationType(DestinationVerticaVertica destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Hostname of the database.
     */
    @JsonProperty("host")
    public String host;

    public DestinationVertica withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;

    public DestinationVertica withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;

    public DestinationVertica withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of the database.
     */
    @JsonProperty("port")
    public Long port;

    public DestinationVertica withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Schema for vertica destination
     */
    @JsonProperty("schema")
    public String schema;

    public DestinationVertica withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;

    public DestinationVertica withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")
    public String username;

    public DestinationVertica withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public DestinationVertica(@JsonProperty("database") String database, @JsonProperty("destinationType") DestinationVerticaVertica destinationType, @JsonProperty("host") String host, @JsonProperty("port") Long port, @JsonProperty("schema") String schema, @JsonProperty("username") String username) {
        this.database = database;
        this.destinationType = destinationType;
        this.host = host;
        this.port = port;
        this.schema = schema;
        this.username = username;
  }
}
