/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class DestinationMssqlSSHKeyAuthentication {

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
    private DestinationMssqlSchemasTunnelMethod tunnelMethod;

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_port")
    private Optional<? extends Long> tunnelPort;

    /**
     * OS-level username for logging into the jump server host.
     */
    @JsonProperty("tunnel_user")
    private String tunnelUser;

    @JsonCreator
    public DestinationMssqlSSHKeyAuthentication(
            @JsonProperty("ssh_key") String sshKey,
            @JsonProperty("tunnel_host") String tunnelHost,
            @JsonProperty("tunnel_port") Optional<? extends Long> tunnelPort,
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
    
    public DestinationMssqlSSHKeyAuthentication(
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
    public DestinationMssqlSchemasTunnelMethod tunnelMethod() {
        return tunnelMethod;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> tunnelPort() {
        return (Optional<Long>) tunnelPort;
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
    public DestinationMssqlSSHKeyAuthentication withSshKey(String sshKey) {
        Utils.checkNotNull(sshKey, "sshKey");
        this.sshKey = sshKey;
        return this;
    }

    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    public DestinationMssqlSSHKeyAuthentication withTunnelHost(String tunnelHost) {
        Utils.checkNotNull(tunnelHost, "tunnelHost");
        this.tunnelHost = tunnelHost;
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public DestinationMssqlSSHKeyAuthentication withTunnelPort(long tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = Optional.ofNullable(tunnelPort);
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public DestinationMssqlSSHKeyAuthentication withTunnelPort(Optional<? extends Long> tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = tunnelPort;
        return this;
    }

    /**
     * OS-level username for logging into the jump server host.
     */
    public DestinationMssqlSSHKeyAuthentication withTunnelUser(String tunnelUser) {
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
        DestinationMssqlSSHKeyAuthentication other = (DestinationMssqlSSHKeyAuthentication) o;
        return 
            java.util.Objects.deepEquals(this.sshKey, other.sshKey) &&
            java.util.Objects.deepEquals(this.tunnelHost, other.tunnelHost) &&
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            java.util.Objects.deepEquals(this.tunnelPort, other.tunnelPort) &&
            java.util.Objects.deepEquals(this.tunnelUser, other.tunnelUser);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sshKey,
            tunnelHost,
            tunnelMethod,
            tunnelPort,
            tunnelUser);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMssqlSSHKeyAuthentication.class,
                "sshKey", sshKey,
                "tunnelHost", tunnelHost,
                "tunnelMethod", tunnelMethod,
                "tunnelPort", tunnelPort,
                "tunnelUser", tunnelUser);
    }
    
    public final static class Builder {
 
        private String sshKey;
 
        private String tunnelHost;
 
        private Optional<? extends Long> tunnelPort;
 
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
        public Builder tunnelPort(Optional<? extends Long> tunnelPort) {
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
        
        public DestinationMssqlSSHKeyAuthentication build() {
            if (tunnelPort == null) {
                tunnelPort = _SINGLETON_VALUE_TunnelPort.value();
            }
            return new DestinationMssqlSSHKeyAuthentication(
                sshKey,
                tunnelHost,
                tunnelPort,
                tunnelUser);
        }

        private static final LazySingletonValue<DestinationMssqlSchemasTunnelMethod> _SINGLETON_VALUE_TunnelMethod =
                new LazySingletonValue<>(
                        "tunnel_method",
                        "\"SSH_KEY_AUTH\"",
                        new TypeReference<DestinationMssqlSchemasTunnelMethod>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_TunnelPort =
                new LazySingletonValue<>(
                        "tunnel_port",
                        "22",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

