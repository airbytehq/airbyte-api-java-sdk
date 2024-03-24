/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceSnowflakeUsernameAndPassword {

    @JsonProperty("auth_type")
    private SourceSnowflakeSchemasAuthType authType;

    /**
     * The password associated with the username.
     */
    @JsonProperty("password")
    private String password;

    /**
     * The username you created to allow Airbyte to access the database.
     */
    @JsonProperty("username")
    private String username;

    public SourceSnowflakeUsernameAndPassword(
            @JsonProperty("password") String password,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.password = password;
        this.username = username;
    }

    public SourceSnowflakeSchemasAuthType authType() {
        return authType;
    }

    /**
     * The password associated with the username.
     */
    public String password() {
        return password;
    }

    /**
     * The username you created to allow Airbyte to access the database.
     */
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The password associated with the username.
     */
    public SourceSnowflakeUsernameAndPassword withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * The username you created to allow Airbyte to access the database.
     */
    public SourceSnowflakeUsernameAndPassword withUsername(String username) {
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
        SourceSnowflakeUsernameAndPassword other = (SourceSnowflakeUsernameAndPassword) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            password,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSnowflakeUsernameAndPassword.class,
                "authType", authType,
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
         * The password associated with the username.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * The username you created to allow Airbyte to access the database.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceSnowflakeUsernameAndPassword build() {
            return new SourceSnowflakeUsernameAndPassword(
                password,
                username);
        }

        private static final LazySingletonValue<SourceSnowflakeSchemasAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"username/password\"",
                        new TypeReference<SourceSnowflakeSchemasAuthType>() {});
    }
}

