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


public class SourceClickhousePasswordAuthentication {

    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    @JsonProperty("tunnel_host")
    private String tunnelHost;

    /**
     * Connect through a jump server tunnel host using username and password authentication
     */
    @JsonProperty("tunnel_method")
    private SourceClickhouseSchemasTunnelMethodTunnelMethod tunnelMethod;

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_port")
    private Optional<? extends Long> tunnelPort;

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
    public SourceClickhousePasswordAuthentication(
            @JsonProperty("tunnel_host") String tunnelHost,
            @JsonProperty("tunnel_port") Optional<? extends Long> tunnelPort,
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
    
    public SourceClickhousePasswordAuthentication(
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
    public SourceClickhouseSchemasTunnelMethodTunnelMethod tunnelMethod() {
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
    public SourceClickhousePasswordAuthentication withTunnelHost(String tunnelHost) {
        Utils.checkNotNull(tunnelHost, "tunnelHost");
        this.tunnelHost = tunnelHost;
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public SourceClickhousePasswordAuthentication withTunnelPort(long tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = Optional.ofNullable(tunnelPort);
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public SourceClickhousePasswordAuthentication withTunnelPort(Optional<? extends Long> tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = tunnelPort;
        return this;
    }

    /**
     * OS-level username for logging into the jump server host
     */
    public SourceClickhousePasswordAuthentication withTunnelUser(String tunnelUser) {
        Utils.checkNotNull(tunnelUser, "tunnelUser");
        this.tunnelUser = tunnelUser;
        return this;
    }

    /**
     * OS-level password for logging into the jump server host
     */
    public SourceClickhousePasswordAuthentication withTunnelUserPassword(String tunnelUserPassword) {
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
        SourceClickhousePasswordAuthentication other = (SourceClickhousePasswordAuthentication) o;
        return 
            java.util.Objects.deepEquals(this.tunnelHost, other.tunnelHost) &&
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            java.util.Objects.deepEquals(this.tunnelPort, other.tunnelPort) &&
            java.util.Objects.deepEquals(this.tunnelUser, other.tunnelUser) &&
            java.util.Objects.deepEquals(this.tunnelUserPassword, other.tunnelUserPassword);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            tunnelHost,
            tunnelMethod,
            tunnelPort,
            tunnelUser,
            tunnelUserPassword);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceClickhousePasswordAuthentication.class,
                "tunnelHost", tunnelHost,
                "tunnelMethod", tunnelMethod,
                "tunnelPort", tunnelPort,
                "tunnelUser", tunnelUser,
                "tunnelUserPassword", tunnelUserPassword);
    }
    
    public final static class Builder {
 
        private String tunnelHost;
 
        private Optional<? extends Long> tunnelPort;
 
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
        public Builder tunnelPort(Optional<? extends Long> tunnelPort) {
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
        
        public SourceClickhousePasswordAuthentication build() {
            if (tunnelPort == null) {
                tunnelPort = _SINGLETON_VALUE_TunnelPort.value();
            }
            return new SourceClickhousePasswordAuthentication(
                tunnelHost,
                tunnelPort,
                tunnelUser,
                tunnelUserPassword);
        }

        private static final LazySingletonValue<SourceClickhouseSchemasTunnelMethodTunnelMethod> _SINGLETON_VALUE_TunnelMethod =
                new LazySingletonValue<>(
                        "tunnel_method",
                        "\"SSH_PASSWORD_AUTH\"",
                        new TypeReference<SourceClickhouseSchemasTunnelMethodTunnelMethod>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_TunnelPort =
                new LazySingletonValue<>(
                        "tunnel_port",
                        "22",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}
