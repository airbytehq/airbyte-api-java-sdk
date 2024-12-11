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


public class OAuth20 {

    @JsonProperty("auth_method")
    private SourcePinterestAuthMethod authMethod;

    /**
     * The Client ID of your OAuth application
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret of your OAuth application.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonCreator
    public OAuth20(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.authMethod = Builder._SINGLETON_VALUE_AuthMethod.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
    }

    @JsonIgnore
    public SourcePinterestAuthMethod authMethod() {
        return authMethod;
    }

    /**
     * The Client ID of your OAuth application
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your OAuth application.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Client ID of your OAuth application
     */
    public OAuth20 withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your OAuth application.
     */
    public OAuth20 withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Refresh Token to obtain new Access Token, when it's expired.
     */
    public OAuth20 withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
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
        OAuth20 other = (OAuth20) o;
        return 
            Objects.deepEquals(this.authMethod, other.authMethod) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authMethod,
            clientId,
            clientSecret,
            refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OAuth20.class,
                "authMethod", authMethod,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private String refreshToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Client ID of your OAuth application
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your OAuth application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Refresh Token to obtain new Access Token, when it's expired.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }
        
        public OAuth20 build() {
            return new OAuth20(
                clientId,
                clientSecret,
                refreshToken);
        }

        private static final LazySingletonValue<SourcePinterestAuthMethod> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"oauth2.0\"",
                        new TypeReference<SourcePinterestAuthMethod>() {});
    }
}

