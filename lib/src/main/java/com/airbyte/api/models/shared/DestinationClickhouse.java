/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationClickhouse - The values required to configure the destination.
 */
public class DestinationClickhouse {
    /**
     * Name of the database.
     */
    @JsonProperty("database")
    public String database;

    public DestinationClickhouse withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationClickhouseClickhouseEnum destinationType;

    public DestinationClickhouse withDestinationType(DestinationClickhouseClickhouseEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Hostname of the database.
     */
    @JsonProperty("host")
    public String host;

    public DestinationClickhouse withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;

    public DestinationClickhouse withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;

    public DestinationClickhouse withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * HTTP port of the database.
     */
    @JsonProperty("port")
    public Long port;

    public DestinationClickhouse withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;

    public DestinationClickhouse withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")
    public String username;

    public DestinationClickhouse withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public DestinationClickhouse(@JsonProperty("database") String database, @JsonProperty("destinationType") DestinationClickhouseClickhouseEnum destinationType, @JsonProperty("host") String host, @JsonProperty("port") Long port, @JsonProperty("username") String username) {
        this.database = database;
        this.destinationType = destinationType;
        this.host = host;
        this.port = port;
        this.username = username;
  }
}
