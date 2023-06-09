/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSftpCredentialsSSHKeyAuthentication - The server authentication method
 */

public class SourceSftpCredentialsSSHKeyAuthentication {
    /**
     * Connect through ssh key
     */
    @JsonProperty("auth_method")
    public SourceSftpCredentialsSSHKeyAuthenticationAuthMethod authMethod;

    public SourceSftpCredentialsSSHKeyAuthentication withAuthMethod(SourceSftpCredentialsSSHKeyAuthenticationAuthMethod authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    /**
     * OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa )
     */
    @JsonProperty("auth_ssh_key")
    public String authSshKey;

    public SourceSftpCredentialsSSHKeyAuthentication withAuthSshKey(String authSshKey) {
        this.authSshKey = authSshKey;
        return this;
    }
    
    public SourceSftpCredentialsSSHKeyAuthentication(@JsonProperty("auth_method") SourceSftpCredentialsSSHKeyAuthenticationAuthMethod authMethod, @JsonProperty("auth_ssh_key") String authSshKey) {
        this.authMethod = authMethod;
        this.authSshKey = authSshKey;
  }
}
