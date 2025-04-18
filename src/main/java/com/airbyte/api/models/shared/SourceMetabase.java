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

public class SourceMetabase {

    /**
     * URL to your metabase instance API
     */
    @JsonProperty("instance_api_url")
    private String instanceApiUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    /**
     * To generate your session token, you need to run the following command: ``` curl -X POST \
     *   -H "Content-Type: application/json" \
     *   -d '{"username": "person@metabase.com", "password": "fakepassword"}' \
     *   http://localhost:3000/api/session
     * ``` Then copy the value of the `id` field returned by a successful call to that API.
     * Note that by default, sessions are good for 14 days and needs to be regenerated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("session_token")
    private Optional<String> sessionToken;

    @JsonProperty("sourceType")
    private Metabase sourceType;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceMetabase(
            @JsonProperty("instance_api_url") String instanceApiUrl,
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("session_token") Optional<String> sessionToken,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(instanceApiUrl, "instanceApiUrl");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(sessionToken, "sessionToken");
        Utils.checkNotNull(username, "username");
        this.instanceApiUrl = instanceApiUrl;
        this.password = password;
        this.sessionToken = sessionToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.username = username;
    }
    
    public SourceMetabase(
            String instanceApiUrl,
            String username) {
        this(instanceApiUrl, Optional.empty(), Optional.empty(), username);
    }

    /**
     * URL to your metabase instance API
     */
    @JsonIgnore
    public String instanceApiUrl() {
        return instanceApiUrl;
    }

    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    /**
     * To generate your session token, you need to run the following command: ``` curl -X POST \
     *   -H "Content-Type: application/json" \
     *   -d '{"username": "person@metabase.com", "password": "fakepassword"}' \
     *   http://localhost:3000/api/session
     * ``` Then copy the value of the `id` field returned by a successful call to that API.
     * Note that by default, sessions are good for 14 days and needs to be regenerated.
     */
    @JsonIgnore
    public Optional<String> sessionToken() {
        return sessionToken;
    }

    @JsonIgnore
    public Metabase sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * URL to your metabase instance API
     */
    public SourceMetabase withInstanceApiUrl(String instanceApiUrl) {
        Utils.checkNotNull(instanceApiUrl, "instanceApiUrl");
        this.instanceApiUrl = instanceApiUrl;
        return this;
    }

    public SourceMetabase withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourceMetabase withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * To generate your session token, you need to run the following command: ``` curl -X POST \
     *   -H "Content-Type: application/json" \
     *   -d '{"username": "person@metabase.com", "password": "fakepassword"}' \
     *   http://localhost:3000/api/session
     * ``` Then copy the value of the `id` field returned by a successful call to that API.
     * Note that by default, sessions are good for 14 days and needs to be regenerated.
     */
    public SourceMetabase withSessionToken(String sessionToken) {
        Utils.checkNotNull(sessionToken, "sessionToken");
        this.sessionToken = Optional.ofNullable(sessionToken);
        return this;
    }

    /**
     * To generate your session token, you need to run the following command: ``` curl -X POST \
     *   -H "Content-Type: application/json" \
     *   -d '{"username": "person@metabase.com", "password": "fakepassword"}' \
     *   http://localhost:3000/api/session
     * ``` Then copy the value of the `id` field returned by a successful call to that API.
     * Note that by default, sessions are good for 14 days and needs to be regenerated.
     */
    public SourceMetabase withSessionToken(Optional<String> sessionToken) {
        Utils.checkNotNull(sessionToken, "sessionToken");
        this.sessionToken = sessionToken;
        return this;
    }

    public SourceMetabase withUsername(String username) {
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
        SourceMetabase other = (SourceMetabase) o;
        return 
            Objects.deepEquals(this.instanceApiUrl, other.instanceApiUrl) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.sessionToken, other.sessionToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            instanceApiUrl,
            password,
            sessionToken,
            sourceType,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMetabase.class,
                "instanceApiUrl", instanceApiUrl,
                "password", password,
                "sessionToken", sessionToken,
                "sourceType", sourceType,
                "username", username);
    }
    
    public final static class Builder {
 
        private String instanceApiUrl;
 
        private Optional<String> password = Optional.empty();
 
        private Optional<String> sessionToken = Optional.empty();
 
        private String username;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * URL to your metabase instance API
         */
        public Builder instanceApiUrl(String instanceApiUrl) {
            Utils.checkNotNull(instanceApiUrl, "instanceApiUrl");
            this.instanceApiUrl = instanceApiUrl;
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

        /**
         * To generate your session token, you need to run the following command: ``` curl -X POST \
         *   -H "Content-Type: application/json" \
         *   -d '{"username": "person@metabase.com", "password": "fakepassword"}' \
         *   http://localhost:3000/api/session
         * ``` Then copy the value of the `id` field returned by a successful call to that API.
         * Note that by default, sessions are good for 14 days and needs to be regenerated.
         */
        public Builder sessionToken(String sessionToken) {
            Utils.checkNotNull(sessionToken, "sessionToken");
            this.sessionToken = Optional.ofNullable(sessionToken);
            return this;
        }

        /**
         * To generate your session token, you need to run the following command: ``` curl -X POST \
         *   -H "Content-Type: application/json" \
         *   -d '{"username": "person@metabase.com", "password": "fakepassword"}' \
         *   http://localhost:3000/api/session
         * ``` Then copy the value of the `id` field returned by a successful call to that API.
         * Note that by default, sessions are good for 14 days and needs to be regenerated.
         */
        public Builder sessionToken(Optional<String> sessionToken) {
            Utils.checkNotNull(sessionToken, "sessionToken");
            this.sessionToken = sessionToken;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceMetabase build() {
            return new SourceMetabase(
                instanceApiUrl,
                password,
                sessionToken,
                username);
        }

        private static final LazySingletonValue<Metabase> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"metabase\"",
                        new TypeReference<Metabase>() {});
    }
}
