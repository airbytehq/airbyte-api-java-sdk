/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFileSecureProviderSSHSecureShell - The storage Provider or Location of the file(s) which should be replicated.
 */
public class SourceFileSecureProviderSSHSecureShell {
    @JsonProperty("host")
    public String host;

    public SourceFileSecureProviderSSHSecureShell withHost(String host) {
        this.host = host;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;

    public SourceFileSecureProviderSSHSecureShell withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    public String port;

    public SourceFileSecureProviderSSHSecureShell withPort(String port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("storage")
    public SourceFileSecureProviderSSHSecureShellStorageEnum storage;

    public SourceFileSecureProviderSSHSecureShell withStorage(SourceFileSecureProviderSSHSecureShellStorageEnum storage) {
        this.storage = storage;
        return this;
    }
    
    @JsonProperty("user")
    public String user;

    public SourceFileSecureProviderSSHSecureShell withUser(String user) {
        this.user = user;
        return this;
    }
    
    public SourceFileSecureProviderSSHSecureShell(@JsonProperty("host") String host, @JsonProperty("storage") SourceFileSecureProviderSSHSecureShellStorageEnum storage, @JsonProperty("user") String user) {
        this.host = host;
        this.storage = storage;
        this.user = user;
  }
}
