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

public class SourceRocketChat {

    /**
     * Your rocket.chat instance URL.
     */
    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("sourceType")
    private RocketChat sourceType;

    /**
     * Your API Token. See &lt;a href="https://developer.rocket.chat/reference/api/rest-api/endpoints/other-important-endpoints/access-tokens-endpoints"&gt;here&lt;/a&gt;. The token is case sensitive.
     */
    @JsonProperty("token")
    private String token;

    /**
     * Your User Id.
     */
    @JsonProperty("user_id")
    private String userId;

    @JsonCreator
    public SourceRocketChat(
            @JsonProperty("endpoint") String endpoint,
            @JsonProperty("token") String token,
            @JsonProperty("user_id") String userId) {
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(token, "token");
        Utils.checkNotNull(userId, "userId");
        this.endpoint = endpoint;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.token = token;
        this.userId = userId;
    }

    /**
     * Your rocket.chat instance URL.
     */
    @JsonIgnore
    public String endpoint() {
        return endpoint;
    }

    @JsonIgnore
    public RocketChat sourceType() {
        return sourceType;
    }

    /**
     * Your API Token. See &lt;a href="https://developer.rocket.chat/reference/api/rest-api/endpoints/other-important-endpoints/access-tokens-endpoints"&gt;here&lt;/a&gt;. The token is case sensitive.
     */
    @JsonIgnore
    public String token() {
        return token;
    }

    /**
     * Your User Id.
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your rocket.chat instance URL.
     */
    public SourceRocketChat withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Your API Token. See &lt;a href="https://developer.rocket.chat/reference/api/rest-api/endpoints/other-important-endpoints/access-tokens-endpoints"&gt;here&lt;/a&gt;. The token is case sensitive.
     */
    public SourceRocketChat withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
        return this;
    }

    /**
     * Your User Id.
     */
    public SourceRocketChat withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        SourceRocketChat other = (SourceRocketChat) o;
        return 
            Objects.deepEquals(this.endpoint, other.endpoint) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.token, other.token) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            endpoint,
            sourceType,
            token,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRocketChat.class,
                "endpoint", endpoint,
                "sourceType", sourceType,
                "token", token,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String endpoint;
 
        private String token;
 
        private String userId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your rocket.chat instance URL.
         */
        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Your API Token. See &lt;a href="https://developer.rocket.chat/reference/api/rest-api/endpoints/other-important-endpoints/access-tokens-endpoints"&gt;here&lt;/a&gt;. The token is case sensitive.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }

        /**
         * Your User Id.
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public SourceRocketChat build() {
            return new SourceRocketChat(
                endpoint,
                token,
                userId);
        }

        private static final LazySingletonValue<RocketChat> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"rocket-chat\"",
                        new TypeReference<RocketChat>() {});
    }
}
