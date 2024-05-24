/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * UsernamePassword - Basic auth header with a username and password
 */

public class UsernamePassword {

    @JsonProperty("method")
    private DestinationElasticsearchSchemasMethod method;

    /**
     * Basic auth password to access a secure Elasticsearch server
     */
    @JsonProperty("password")
    private String password;

    /**
     * Basic auth username to access a secure Elasticsearch server
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public UsernamePassword(
            @JsonProperty("password") String password,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.method = Builder._SINGLETON_VALUE_Method.value();
        this.password = password;
        this.username = username;
    }

    @JsonIgnore
    public DestinationElasticsearchSchemasMethod method() {
        return method;
    }

    /**
     * Basic auth password to access a secure Elasticsearch server
     */
    @JsonIgnore
    public String password() {
        return password;
    }

    /**
     * Basic auth username to access a secure Elasticsearch server
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Basic auth password to access a secure Elasticsearch server
     */
    public UsernamePassword withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Basic auth username to access a secure Elasticsearch server
     */
    public UsernamePassword withUsername(String username) {
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
        UsernamePassword other = (UsernamePassword) o;
        return 
            java.util.Objects.deepEquals(this.method, other.method) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            method,
            password,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsernamePassword.class,
                "method", method,
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
         * Basic auth password to access a secure Elasticsearch server
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Basic auth username to access a secure Elasticsearch server
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public UsernamePassword build() {
            return new UsernamePassword(
                password,
                username);
        }

        private static final LazySingletonValue<DestinationElasticsearchSchemasMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"basic\"",
                        new TypeReference<DestinationElasticsearchSchemasMethod>() {});
    }
}

