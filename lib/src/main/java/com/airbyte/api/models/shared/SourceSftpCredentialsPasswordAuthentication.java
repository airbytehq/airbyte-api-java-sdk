/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSftpCredentialsPasswordAuthentication - The server authentication method
 */
public class SourceSftpCredentialsPasswordAuthentication {
    /**
     * Connect through password authentication
     */
    @JsonProperty("auth_method")
    public SourceSftpCredentialsPasswordAuthenticationAuthMethodEnum authMethod;

    public SourceSftpCredentialsPasswordAuthentication withAuthMethod(SourceSftpCredentialsPasswordAuthenticationAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    /**
     * OS-level password for logging into the jump server host
     */
    @JsonProperty("auth_user_password")
    public String authUserPassword;

    public SourceSftpCredentialsPasswordAuthentication withAuthUserPassword(String authUserPassword) {
        this.authUserPassword = authUserPassword;
        return this;
    }
    
    public SourceSftpCredentialsPasswordAuthentication(@JsonProperty("auth_method") SourceSftpCredentialsPasswordAuthenticationAuthMethodEnum authMethod, @JsonProperty("auth_user_password") String authUserPassword) {
        this.authMethod = authMethod;
        this.authUserPassword = authUserPassword;
  }
}
