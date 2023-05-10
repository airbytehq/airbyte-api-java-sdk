/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFirebolt - The values required to configure the source.
 */
public class SourceFirebolt {
    /**
     * Firebolt account to login.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    public String account;

    public SourceFirebolt withAccount(String account) {
        this.account = account;
        return this;
    }
    
    /**
     * The database to connect to.
     */
    @JsonProperty("database")
    public String database;

    public SourceFirebolt withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * Engine name or url to connect to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("engine")
    public String engine;

    public SourceFirebolt withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    /**
     * The host name of your Firebolt database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("host")
    public String host;

    public SourceFirebolt withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Firebolt password.
     */
    @JsonProperty("password")
    public String password;

    public SourceFirebolt withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceFireboltFireboltEnum sourceType;

    public SourceFirebolt withSourceType(SourceFireboltFireboltEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Firebolt email address you use to login.
     */
    @JsonProperty("username")
    public String username;

    public SourceFirebolt withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public SourceFirebolt(@JsonProperty("username") String username, @JsonProperty("password") String password, @JsonProperty("database") String database, @JsonProperty("sourceType") SourceFireboltFireboltEnum sourceType) {
        this.username = username;
        this.password = password;
        this.database = database;
        this.sourceType = sourceType;
  }
}
