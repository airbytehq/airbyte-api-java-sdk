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

/**
 * SurveyMonkeyAuthorizationMethod
 * 
 * <p>The authorization method to use to retrieve data from SurveyMonkey
 */
public class SurveyMonkeyAuthorizationMethod {

    /**
     * Access Token for making authenticated requests. See the &lt;a href="https://docs.airbyte.io/integrations/sources/surveymonkey"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("auth_method")
    private SourceSurveymonkeyAuthMethod authMethod;

    /**
     * The Client ID of the SurveyMonkey developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<String> clientId;

    /**
     * The Client Secret of the SurveyMonkey developer application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<String> clientSecret;

    @JsonCreator
    public SurveyMonkeyAuthorizationMethod(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("client_id") Optional<String> clientId,
            @JsonProperty("client_secret") Optional<String> clientSecret) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.accessToken = accessToken;
        this.authMethod = Builder._SINGLETON_VALUE_AuthMethod.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }
    
    public SurveyMonkeyAuthorizationMethod(
            String accessToken) {
        this(accessToken, Optional.empty(), Optional.empty());
    }

    /**
     * Access Token for making authenticated requests. See the &lt;a href="https://docs.airbyte.io/integrations/sources/surveymonkey"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public SourceSurveymonkeyAuthMethod authMethod() {
        return authMethod;
    }

    /**
     * The Client ID of the SurveyMonkey developer application.
     */
    @JsonIgnore
    public Optional<String> clientId() {
        return clientId;
    }

    /**
     * The Client Secret of the SurveyMonkey developer application.
     */
    @JsonIgnore
    public Optional<String> clientSecret() {
        return clientSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Access Token for making authenticated requests. See the &lt;a href="https://docs.airbyte.io/integrations/sources/surveymonkey"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    public SurveyMonkeyAuthorizationMethod withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The Client ID of the SurveyMonkey developer application.
     */
    public SurveyMonkeyAuthorizationMethod withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * The Client ID of the SurveyMonkey developer application.
     */
    public SurveyMonkeyAuthorizationMethod withClientId(Optional<String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of the SurveyMonkey developer application.
     */
    public SurveyMonkeyAuthorizationMethod withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * The Client Secret of the SurveyMonkey developer application.
     */
    public SurveyMonkeyAuthorizationMethod withClientSecret(Optional<String> clientSecret) {
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
        SurveyMonkeyAuthorizationMethod other = (SurveyMonkeyAuthorizationMethod) o;
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
        return Utils.toString(SurveyMonkeyAuthorizationMethod.class,
                "accessToken", accessToken,
                "authMethod", authMethod,
                "clientId", clientId,
                "clientSecret", clientSecret);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private Optional<String> clientId = Optional.empty();
 
        private Optional<String> clientSecret = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Access Token for making authenticated requests. See the &lt;a href="https://docs.airbyte.io/integrations/sources/surveymonkey"&gt;docs&lt;/a&gt; for information on how to generate this key.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The Client ID of the SurveyMonkey developer application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * The Client ID of the SurveyMonkey developer application.
         */
        public Builder clientId(Optional<String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of the SurveyMonkey developer application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * The Client Secret of the SurveyMonkey developer application.
         */
        public Builder clientSecret(Optional<String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public SurveyMonkeyAuthorizationMethod build() {
            return new SurveyMonkeyAuthorizationMethod(
                accessToken,
                clientId,
                clientSecret);
        }

        private static final LazySingletonValue<SourceSurveymonkeyAuthMethod> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"oauth2.0\"",
                        new TypeReference<SourceSurveymonkeyAuthMethod>() {});
    }
}
