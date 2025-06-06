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

public class SourceZendeskSunshineOAuth20 {

    /**
     * Long-term access Token for making authenticated requests.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    private Optional<? extends SourceZendeskSunshineAuthMethod> authMethod;

    /**
     * The Client ID of your OAuth application.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret of your OAuth application.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonCreator
    public SourceZendeskSunshineOAuth20(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.accessToken = accessToken;
        this.authMethod = Builder._SINGLETON_VALUE_AuthMethod.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Long-term access Token for making authenticated requests.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceZendeskSunshineAuthMethod> authMethod() {
        return (Optional<SourceZendeskSunshineAuthMethod>) authMethod;
    }

    /**
     * The Client ID of your OAuth application.
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

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Long-term access Token for making authenticated requests.
     */
    public SourceZendeskSunshineOAuth20 withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The Client ID of your OAuth application.
     */
    public SourceZendeskSunshineOAuth20 withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your OAuth application.
     */
    public SourceZendeskSunshineOAuth20 withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
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
        SourceZendeskSunshineOAuth20 other = (SourceZendeskSunshineOAuth20) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.authMethod, other.authMethod) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            authMethod,
            clientId,
            clientSecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZendeskSunshineOAuth20.class,
                "accessToken", accessToken,
                "authMethod", authMethod,
                "clientId", clientId,
                "clientSecret", clientSecret);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private String clientId;
 
        private String clientSecret;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Long-term access Token for making authenticated requests.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The Client ID of your OAuth application.
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
        
        public SourceZendeskSunshineOAuth20 build() {
            return new SourceZendeskSunshineOAuth20(
                accessToken,
                clientId,
                clientSecret);
        }

        private static final LazySingletonValue<Optional<? extends SourceZendeskSunshineAuthMethod>> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"oauth2.0\"",
                        new TypeReference<Optional<? extends SourceZendeskSunshineAuthMethod>>() {});
    }
}
