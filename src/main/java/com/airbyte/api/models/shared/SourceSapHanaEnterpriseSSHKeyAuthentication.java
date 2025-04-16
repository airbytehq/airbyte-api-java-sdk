/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceSapHanaEnterpriseSSHKeyAuthentication
 * 
 * <p>Connect through a jump server tunnel host using username and ssh key
 */
public class SourceSapHanaEnterpriseSSHKeyAuthentication {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

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

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends SourceSapHanaEnterpriseSchemasTunnelMethod> tunnelMethod;

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

    @JsonCreator
    public SourceSapHanaEnterpriseSSHKeyAuthentication(
            @JsonProperty("ssh_key") String sshKey,
            @JsonProperty("tunnel_host") String tunnelHost,
            @JsonProperty("tunnel_method") Optional<? extends SourceSapHanaEnterpriseSchemasTunnelMethod> tunnelMethod,
            @JsonProperty("tunnel_port") Optional<Long> tunnelPort,
            @JsonProperty("tunnel_user") String tunnelUser) {
        Utils.checkNotNull(sshKey, "sshKey");
        Utils.checkNotNull(tunnelHost, "tunnelHost");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        Utils.checkNotNull(tunnelUser, "tunnelUser");
        this.additionalProperties = new HashMap<>();
        this.sshKey = sshKey;
        this.tunnelHost = tunnelHost;
        this.tunnelMethod = tunnelMethod;
        this.tunnelPort = tunnelPort;
        this.tunnelUser = tunnelUser;
    }
    
    public SourceSapHanaEnterpriseSSHKeyAuthentication(
            String sshKey,
            String tunnelHost,
            String tunnelUser) {
        this(sshKey, tunnelHost, Optional.empty(), Optional.empty(), tunnelUser);
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceSapHanaEnterpriseSchemasTunnelMethod> tunnelMethod() {
        return (Optional<SourceSapHanaEnterpriseSchemasTunnelMethod>) tunnelMethod;
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

    public final static Builder builder() {
        return new Builder();
    }    

    @JsonAnySetter
    public SourceSapHanaEnterpriseSSHKeyAuthentication withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }    

    public SourceSapHanaEnterpriseSSHKeyAuthentication withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa )
     */
    public SourceSapHanaEnterpriseSSHKeyAuthentication withSshKey(String sshKey) {
        Utils.checkNotNull(sshKey, "sshKey");
        this.sshKey = sshKey;
        return this;
    }

    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    public SourceSapHanaEnterpriseSSHKeyAuthentication withTunnelHost(String tunnelHost) {
        Utils.checkNotNull(tunnelHost, "tunnelHost");
        this.tunnelHost = tunnelHost;
        return this;
    }

    public SourceSapHanaEnterpriseSSHKeyAuthentication withTunnelMethod(SourceSapHanaEnterpriseSchemasTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    public SourceSapHanaEnterpriseSSHKeyAuthentication withTunnelMethod(Optional<? extends SourceSapHanaEnterpriseSchemasTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public SourceSapHanaEnterpriseSSHKeyAuthentication withTunnelPort(long tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = Optional.ofNullable(tunnelPort);
        return this;
    }

    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    public SourceSapHanaEnterpriseSSHKeyAuthentication withTunnelPort(Optional<Long> tunnelPort) {
        Utils.checkNotNull(tunnelPort, "tunnelPort");
        this.tunnelPort = tunnelPort;
        return this;
    }

    /**
     * OS-level username for logging into the jump server host
     */
    public SourceSapHanaEnterpriseSSHKeyAuthentication withTunnelUser(String tunnelUser) {
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
        SourceSapHanaEnterpriseSSHKeyAuthentication other = (SourceSapHanaEnterpriseSSHKeyAuthentication) o;
        return 
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.sshKey, other.sshKey) &&
            Objects.deepEquals(this.tunnelHost, other.tunnelHost) &&
            Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            Objects.deepEquals(this.tunnelPort, other.tunnelPort) &&
            Objects.deepEquals(this.tunnelUser, other.tunnelUser);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            sshKey,
            tunnelHost,
            tunnelMethod,
            tunnelPort,
            tunnelUser);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSapHanaEnterpriseSSHKeyAuthentication.class,
                "additionalProperties", additionalProperties,
                "sshKey", sshKey,
                "tunnelHost", tunnelHost,
                "tunnelMethod", tunnelMethod,
                "tunnelPort", tunnelPort,
                "tunnelUser", tunnelUser);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();
 
        private String sshKey;
 
        private String tunnelHost;
 
        private Optional<? extends SourceSapHanaEnterpriseSchemasTunnelMethod> tunnelMethod;
 
        private Optional<Long> tunnelPort;
 
        private String tunnelUser;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalProperty(String key, Object value) {
            Utils.checkNotNull(key, "key");
            // we could be strict about null values (force the user
            // to pass `JsonNullable.of(null)`) but likely to be a bit 
            // annoying for additional properties building so we'll 
            // relax preconditions.
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
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

        public Builder tunnelMethod(SourceSapHanaEnterpriseSchemasTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        public Builder tunnelMethod(Optional<? extends SourceSapHanaEnterpriseSchemasTunnelMethod> tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = tunnelMethod;
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
        
        public SourceSapHanaEnterpriseSSHKeyAuthentication build() {
            if (tunnelMethod == null) {
                tunnelMethod = _SINGLETON_VALUE_TunnelMethod.value();
            }
            if (tunnelPort == null) {
                tunnelPort = _SINGLETON_VALUE_TunnelPort.value();
            }
            return new SourceSapHanaEnterpriseSSHKeyAuthentication(
                sshKey,
                tunnelHost,
                tunnelMethod,
                tunnelPort,
                tunnelUser)
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<Optional<? extends SourceSapHanaEnterpriseSchemasTunnelMethod>> _SINGLETON_VALUE_TunnelMethod =
                new LazySingletonValue<>(
                        "tunnel_method",
                        "\"SSH_KEY_AUTH\"",
                        new TypeReference<Optional<? extends SourceSapHanaEnterpriseSchemasTunnelMethod>>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_TunnelPort =
                new LazySingletonValue<>(
                        "tunnel_port",
                        "22",
                        new TypeReference<Optional<Long>>() {});
    }
}
