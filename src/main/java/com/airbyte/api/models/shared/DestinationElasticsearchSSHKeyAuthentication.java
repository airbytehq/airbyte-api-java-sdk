/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class DestinationElasticsearchSSHKeyAuthentication {

    /**
     * OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa )
     */
    @JsonProperty("ssh_key")
    private String sshKey;

    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    @JsonProperty("tunnel_host")
    private String tunnelHost;

    /**
     * Connect through a jump server tunnel host using username and ssh key
     */
    @JsonProperty("tunnel_method")
    private DestinationElasticsearchSchemasTunnelMethod tunnelMethod;

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_port")
    private Optional<Long> tunnelPort;

    /**
     * OS-level username for logging into the jump server host.
     */
    @JsonProperty("tunnel_user")
    private String tunnelUser;

    @JsonCreator
    public DestinationElasticsearchSSHKeyAuthentication(
            @JsonProperty("ssh_key") String sshKey,
            @JsonProperty("tunnel_host") String tunnelHost,
            @JsonProperty("tunnel_port") Optional<Long> tunnelPort,
            @JsonProperty("tunnel_user") String tunnelUser) {
        Utils.checkNotNull(sshKey, "sshKey");
        Utils.checkNotNull(tunnelHost, "tunnelHost");
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        Utils.checkNotNull(tunnelUser, "tunnelUser");
        this.sshKey = sshKey;
        this.tunnelHost = tunnelHost;
        this.tunnelMethod = Builder._SINGLETON_VALUE_TunnelMethod.value();
        this.tunnelPort = tunnelPort;
        this.tunnelUser = tunnelUser;
    }
    
    public DestinationElasticsearchSSHKeyAuthentication(
            String sshKey,
            String tunnelHost,
            String tunnelUser) {
        this(sshKey, tunnelHost, Optional.empty(), tunnelUser);
    }

    /**
     * OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa )
     */
    @JsonIgnore
    public String sshKey() {
        return sshKey;
    }

    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    @JsonIgnore
    public String tunnelHost() {
        return tunnelHost;
    }

    /**
     * Connect through a jump server tunnel host using username and ssh key
     */
    @JsonIgnore
    public DestinationElasticsearchSchemasTunnelMethod tunnelMethod() {
        return tunnelMethod;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    @JsonIgnore
    public Optional<Long> tunnelPort() {
        return tunnelPort;
    }

    /**
     * OS-level username for logging into the jump server host.
     */
    @JsonIgnore
    public String tunnelUser() {
        return tunnelUser;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa )
     */
    public DestinationElasticsearchSSHKeyAuthentication withSshKey(String sshKey) {
        Utils.checkNotNull(sshKey, "sshKey");
        this.sshKey = sshKey;
        return this;
    }

    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    public DestinationElasticsearchSSHKeyAuthentication withTunnelHost(String tunnelHost) {
        Utils.checkNotNull(tunnelHost, "tunnelHost");
        this.tunnelHost = tunnelHost;
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public DestinationElasticsearchSSHKeyAuthentication withTunnelPort(long tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = Optional.ofNullable(tunnelPort);
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public DestinationElasticsearchSSHKeyAuthentication withTunnelPort(Optional<Long> tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = tunnelPort;
        return this;
    }

    /**
     * OS-level username for logging into the jump server host.
     */
    public DestinationElasticsearchSSHKeyAuthentication withTunnelUser(String tunnelUser) {
        Utils.checkNotNull(tunnelUser, "tunnelUser");
        this.tunnelUser = tunnelUser;
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
        DestinationElasticsearchSSHKeyAuthentication other = (DestinationElasticsearchSSHKeyAuthentication) o;
        return 
            Objects.deepEquals(this.sshKey, other.sshKey) &&
            Objects.deepEquals(this.tunnelHost, other.tunnelHost) &&
            Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            Objects.deepEquals(this.tunnelPort, other.tunnelPort) &&
            Objects.deepEquals(this.tunnelUser, other.tunnelUser);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sshKey,
            tunnelHost,
            tunnelMethod,
            tunnelPort,
            tunnelUser);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationElasticsearchSSHKeyAuthentication.class,
                "sshKey", sshKey,
                "tunnelHost", tunnelHost,
                "tunnelMethod", tunnelMethod,
                "tunnelPort", tunnelPort,
                "tunnelUser", tunnelUser);
    }
    
    public final static class Builder {
 
        private String sshKey;
 
        private String tunnelHost;
 
        private Optional<Long> tunnelPort;
 
        private String tunnelUser;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa )
         */
        public Builder sshKey(String sshKey) {
            Utils.checkNotNull(sshKey, "sshKey");
            this.sshKey = sshKey;
            return this;
        }

        /**
         * Hostname of the jump server host that allows inbound ssh tunnel.
         */
        public Builder tunnelHost(String tunnelHost) {
            Utils.checkNotNull(tunnelHost, "tunnelHost");
            this.tunnelHost = tunnelHost;
            return this;
        }

        /**
         * Port on the proxy/jump server that accepts inbound ssh connections.
         */
        public Builder tunnelPort(long tunnelPort) {
            Utils.checkNotNull(tunnelPort, "tunnelPort");
            this.tunnelPort = Optional.ofNullable(tunnelPort);
            return this;
        }

        /**
         * Port on the proxy/jump server that accepts inbound ssh connections.
         */
        public Builder tunnelPort(Optional<Long> tunnelPort) {
            Utils.checkNotNull(tunnelPort, "tunnelPort");
            this.tunnelPort = tunnelPort;
            return this;
        }

        /**
         * OS-level username for logging into the jump server host.
         */
        public Builder tunnelUser(String tunnelUser) {
            Utils.checkNotNull(tunnelUser, "tunnelUser");
            this.tunnelUser = tunnelUser;
            return this;
        }
        
        public DestinationElasticsearchSSHKeyAuthentication build() {
            if (tunnelPort == null) {
                tunnelPort = _SINGLETON_VALUE_TunnelPort.value();
            }
            return new DestinationElasticsearchSSHKeyAuthentication(
                sshKey,
                tunnelHost,
                tunnelPort,
                tunnelUser);
        }

        private static final LazySingletonValue<DestinationElasticsearchSchemasTunnelMethod> _SINGLETON_VALUE_TunnelMethod =
                new LazySingletonValue<>(
                        "tunnel_method",
                        "\"SSH_KEY_AUTH\"",
                        new TypeReference<DestinationElasticsearchSchemasTunnelMethod>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_TunnelPort =
                new LazySingletonValue<>(
                        "tunnel_port",
                        "22",
                        new TypeReference<Optional<Long>>() {});
    }
}
