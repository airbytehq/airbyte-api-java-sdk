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


public class DestinationMssqlPasswordAuthentication {

    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    @JsonProperty("tunnel_host")
    private String tunnelHost;

    /**
     * Connect through a jump server tunnel host using username and password authentication
     */
    @JsonProperty("tunnel_method")
    private DestinationMssqlSchemasTunnelMethodTunnelMethod tunnelMethod;

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_port")
    private Optional<Long> tunnelPort;

    /**
     * OS-level username for logging into the jump server host
     */
    @JsonProperty("tunnel_user")
    private String tunnelUser;

    /**
     * OS-level password for logging into the jump server host
     */
    @JsonProperty("tunnel_user_password")
    private String tunnelUserPassword;

    @JsonCreator
    public DestinationMssqlPasswordAuthentication(
            @JsonProperty("tunnel_host") String tunnelHost,
            @JsonProperty("tunnel_port") Optional<Long> tunnelPort,
            @JsonProperty("tunnel_user") String tunnelUser,
            @JsonProperty("tunnel_user_password") String tunnelUserPassword) {
        Utils.checkNotNull(tunnelHost, "tunnelHost");
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        Utils.checkNotNull(tunnelUser, "tunnelUser");
        Utils.checkNotNull(tunnelUserPassword, "tunnelUserPassword");
        this.tunnelHost = tunnelHost;
        this.tunnelMethod = Builder._SINGLETON_VALUE_TunnelMethod.value();
        this.tunnelPort = tunnelPort;
        this.tunnelUser = tunnelUser;
        this.tunnelUserPassword = tunnelUserPassword;
    }
    
    public DestinationMssqlPasswordAuthentication(
            String tunnelHost,
            String tunnelUser,
            String tunnelUserPassword) {
        this(tunnelHost, Optional.empty(), tunnelUser, tunnelUserPassword);
    }

    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    @JsonIgnore
    public String tunnelHost() {
        return tunnelHost;
    }

    /**
     * Connect through a jump server tunnel host using username and password authentication
     */
    @JsonIgnore
    public DestinationMssqlSchemasTunnelMethodTunnelMethod tunnelMethod() {
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
     * OS-level username for logging into the jump server host
     */
    @JsonIgnore
    public String tunnelUser() {
        return tunnelUser;
    }

    /**
     * OS-level password for logging into the jump server host
     */
    @JsonIgnore
    public String tunnelUserPassword() {
        return tunnelUserPassword;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    public DestinationMssqlPasswordAuthentication withTunnelHost(String tunnelHost) {
        Utils.checkNotNull(tunnelHost, "tunnelHost");
        this.tunnelHost = tunnelHost;
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public DestinationMssqlPasswordAuthentication withTunnelPort(long tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = Optional.ofNullable(tunnelPort);
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public DestinationMssqlPasswordAuthentication withTunnelPort(Optional<Long> tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = tunnelPort;
        return this;
    }

    /**
     * OS-level username for logging into the jump server host
     */
    public DestinationMssqlPasswordAuthentication withTunnelUser(String tunnelUser) {
        Utils.checkNotNull(tunnelUser, "tunnelUser");
        this.tunnelUser = tunnelUser;
        return this;
    }

    /**
     * OS-level password for logging into the jump server host
     */
    public DestinationMssqlPasswordAuthentication withTunnelUserPassword(String tunnelUserPassword) {
        Utils.checkNotNull(tunnelUserPassword, "tunnelUserPassword");
        this.tunnelUserPassword = tunnelUserPassword;
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
        DestinationMssqlPasswordAuthentication other = (DestinationMssqlPasswordAuthentication) o;
        return 
            Objects.deepEquals(this.tunnelHost, other.tunnelHost) &&
            Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            Objects.deepEquals(this.tunnelPort, other.tunnelPort) &&
            Objects.deepEquals(this.tunnelUser, other.tunnelUser) &&
            Objects.deepEquals(this.tunnelUserPassword, other.tunnelUserPassword);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            tunnelHost,
            tunnelMethod,
            tunnelPort,
            tunnelUser,
            tunnelUserPassword);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMssqlPasswordAuthentication.class,
                "tunnelHost", tunnelHost,
                "tunnelMethod", tunnelMethod,
                "tunnelPort", tunnelPort,
                "tunnelUser", tunnelUser,
                "tunnelUserPassword", tunnelUserPassword);
    }
    
    public final static class Builder {
 
        private String tunnelHost;
 
        private Optional<Long> tunnelPort;
 
        private String tunnelUser;
 
        private String tunnelUserPassword;  
        
        private Builder() {
          // force use of static builder() method
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
         * OS-level username for logging into the jump server host
         */
        public Builder tunnelUser(String tunnelUser) {
            Utils.checkNotNull(tunnelUser, "tunnelUser");
            this.tunnelUser = tunnelUser;
            return this;
        }

        /**
         * OS-level password for logging into the jump server host
         */
        public Builder tunnelUserPassword(String tunnelUserPassword) {
            Utils.checkNotNull(tunnelUserPassword, "tunnelUserPassword");
            this.tunnelUserPassword = tunnelUserPassword;
            return this;
        }
        
        public DestinationMssqlPasswordAuthentication build() {
            if (tunnelPort == null) {
                tunnelPort = _SINGLETON_VALUE_TunnelPort.value();
            }            return new DestinationMssqlPasswordAuthentication(
                tunnelHost,
                tunnelPort,
                tunnelUser,
                tunnelUserPassword);
        }

        private static final LazySingletonValue<DestinationMssqlSchemasTunnelMethodTunnelMethod> _SINGLETON_VALUE_TunnelMethod =
                new LazySingletonValue<>(
                        "tunnel_method",
                        "\"SSH_PASSWORD_AUTH\"",
                        new TypeReference<DestinationMssqlSchemasTunnelMethodTunnelMethod>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_TunnelPort =
                new LazySingletonValue<>(
                        "tunnel_port",
                        "22",
                        new TypeReference<Optional<Long>>() {});
    }
}

