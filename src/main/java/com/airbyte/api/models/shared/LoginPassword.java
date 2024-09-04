/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * LoginPassword - Login/Password.
 */

public class LoginPassword {

    @JsonProperty("authorization")
    private DestinationMongodbAuthorization authorization;

    /**
     * Password associated with the username.
     */
    @JsonProperty("password")
    private String password;

    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public LoginPassword(
            @JsonProperty("password") String password,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.authorization = Builder._SINGLETON_VALUE_Authorization.value();
        this.password = password;
        this.username = username;
    }

    @JsonIgnore
    public DestinationMongodbAuthorization authorization() {
        return authorization;
    }

    /**
     * Password associated with the username.
     */
    @JsonIgnore
    public String password() {
        return password;
    }

    /**
     * Username to use to access the database.
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Password associated with the username.
     */
    public LoginPassword withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Username to use to access the database.
     */
    public LoginPassword withUsername(String username) {
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
        LoginPassword other = (LoginPassword) o;
        return 
            Objects.deepEquals(this.authorization, other.authorization) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authorization,
            password,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LoginPassword.class,
                "authorization", authorization,
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
         * Password associated with the username.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Username to use to access the database.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public LoginPassword build() {
            return new LoginPassword(
                password,
                username);
        }

        private static final LazySingletonValue<DestinationMongodbAuthorization> _SINGLETON_VALUE_Authorization =
                new LazySingletonValue<>(
                        "authorization",
                        "\"login/password\"",
                        new TypeReference<DestinationMongodbAuthorization>() {});
    }
}

