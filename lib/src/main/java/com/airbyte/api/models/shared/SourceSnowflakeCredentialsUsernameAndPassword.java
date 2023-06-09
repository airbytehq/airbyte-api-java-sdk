/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceSnowflakeCredentialsUsernameAndPassword {
    @JsonProperty("auth_type")
    public SourceSnowflakeCredentialsUsernameAndPasswordAuthType authType;

    public SourceSnowflakeCredentialsUsernameAndPassword withAuthType(SourceSnowflakeCredentialsUsernameAndPasswordAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The password associated with the username.
     */
    @JsonProperty("password")
    public String password;

    public SourceSnowflakeCredentialsUsernameAndPassword withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * The username you created to allow Airbyte to access the database.
     */
    @JsonProperty("username")
    public String username;

    public SourceSnowflakeCredentialsUsernameAndPassword withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public SourceSnowflakeCredentialsUsernameAndPassword(@JsonProperty("username") String username, @JsonProperty("password") String password, @JsonProperty("auth_type") SourceSnowflakeCredentialsUsernameAndPasswordAuthType authType) {
        this.username = username;
        this.password = password;
        this.authType = authType;
  }
}
