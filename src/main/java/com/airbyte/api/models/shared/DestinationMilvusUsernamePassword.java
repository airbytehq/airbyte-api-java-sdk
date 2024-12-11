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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationMilvusUsernamePassword - Authenticate using username and password (suitable for self-managed Milvus clusters)
 */

public class DestinationMilvusUsernamePassword {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationMilvusSchemasIndexingAuthMode> mode;

    /**
     * Password for the Milvus instance
     */
    @JsonProperty("password")
    private String password;

    /**
     * Username for the Milvus instance
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public DestinationMilvusUsernamePassword(
            @JsonProperty("password") String password,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.password = password;
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationMilvusSchemasIndexingAuthMode> mode() {
        return (Optional<DestinationMilvusSchemasIndexingAuthMode>) mode;
    }

    /**
     * Password for the Milvus instance
     */
    @JsonIgnore
    public String password() {
        return password;
    }

    /**
     * Username for the Milvus instance
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Password for the Milvus instance
     */
    public DestinationMilvusUsernamePassword withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Username for the Milvus instance
     */
    public DestinationMilvusUsernamePassword withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        DestinationMilvusUsernamePassword other = (DestinationMilvusUsernamePassword) o;
        return 
            Objects.deepEquals(this.mode, other.mode) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            mode,
            password,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMilvusUsernamePassword.class,
                "mode", mode,
                "password", password,
                "username", username);
    }
    
    public final static class Builder {
 
        private String password;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Password for the Milvus instance
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Username for the Milvus instance
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public DestinationMilvusUsernamePassword build() {
            return new DestinationMilvusUsernamePassword(
                password,
                username);
        }

        private static final LazySingletonValue<Optional<? extends DestinationMilvusSchemasIndexingAuthMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"username_password\"",
                        new TypeReference<Optional<? extends DestinationMilvusSchemasIndexingAuthMode>>() {});
    }
}

