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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class SCPSecureCopyProtocol {

    @JsonProperty("host")
    private String host;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<String> port;

    @JsonProperty("storage")
    private SourceFileSchemasProviderStorageProvider6Storage storage;

    @JsonProperty("user")
    private String user;

    @JsonCreator
    public SCPSecureCopyProtocol(
            @JsonProperty("host") String host,
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("port") Optional<String> port,
            @JsonProperty("user") String user) {
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(user, "user");
        this.host = host;
        this.password = password;
        this.port = port;
        this.storage = Builder._SINGLETON_VALUE_Storage.value();
        this.user = user;
    }
    
    public SCPSecureCopyProtocol(
            String host,
            String user) {
        this(host, Optional.empty(), Optional.empty(), user);
    }

    @JsonIgnore
    public String host() {
        return host;
    }

    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    @JsonIgnore
    public Optional<String> port() {
        return port;
    }

    @JsonIgnore
    public SourceFileSchemasProviderStorageProvider6Storage storage() {
        return storage;
    }

    @JsonIgnore
    public String user() {
        return user;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SCPSecureCopyProtocol withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    public SCPSecureCopyProtocol withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SCPSecureCopyProtocol withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public SCPSecureCopyProtocol withPort(String port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    public SCPSecureCopyProtocol withPort(Optional<String> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    public SCPSecureCopyProtocol withUser(String user) {
        Utils.checkNotNull(user, "user");
        this.user = user;
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
        SCPSecureCopyProtocol other = (SCPSecureCopyProtocol) o;
        return 
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.port, other.port) &&
            Objects.deepEquals(this.storage, other.storage) &&
            Objects.deepEquals(this.user, other.user);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            host,
            password,
            port,
            storage,
            user);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SCPSecureCopyProtocol.class,
                "host", host,
                "password", password,
                "port", port,
                "storage", storage,
                "user", user);
    }
    
    public final static class Builder {
 
        private String host;
 
        private Optional<String> password = Optional.empty();
 
        private Optional<String> port;
 
        private String user;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        public Builder password(Optional<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        public Builder port(String port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        public Builder port(Optional<String> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        public Builder user(String user) {
            Utils.checkNotNull(user, "user");
            this.user = user;
            return this;
        }
        
        public SCPSecureCopyProtocol build() {
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            return new SCPSecureCopyProtocol(
                host,
                password,
                port,
                user);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "\"22\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<SourceFileSchemasProviderStorageProvider6Storage> _SINGLETON_VALUE_Storage =
                new LazySingletonValue<>(
                        "storage",
                        "\"SCP\"",
                        new TypeReference<SourceFileSchemasProviderStorageProvider6Storage>() {});
    }
}
