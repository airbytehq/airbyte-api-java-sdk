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


public class SourceGoogleSearchConsoleOAuth {

    /**
     * Access token for making authenticated requests. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    private Optional<String> accessToken;

    @JsonProperty("auth_type")
    private SourceGoogleSearchConsoleAuthType authType;

    /**
     * The client ID of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The client secret of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * The token for obtaining a new access token. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonCreator
    public SourceGoogleSearchConsoleOAuth(
            @JsonProperty("access_token") Optional<String> accessToken,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.accessToken = accessToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
    }
    
    public SourceGoogleSearchConsoleOAuth(
            String clientId,
            String clientSecret,
            String refreshToken) {
        this(Optional.empty(), clientId, clientSecret, refreshToken);
    }

    /**
     * Access token for making authenticated requests. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<String> accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public SourceGoogleSearchConsoleAuthType authType() {
        return authType;
    }

    /**
     * The client ID of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The client secret of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * The token for obtaining a new access token. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Access token for making authenticated requests. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    public SourceGoogleSearchConsoleOAuth withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = Optional.ofNullable(accessToken);
        return this;
    }

    /**
     * Access token for making authenticated requests. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    public SourceGoogleSearchConsoleOAuth withAccessToken(Optional<String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The client ID of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    public SourceGoogleSearchConsoleOAuth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The client secret of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    public SourceGoogleSearchConsoleOAuth withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The token for obtaining a new access token. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
     */
    public SourceGoogleSearchConsoleOAuth withRefreshToken(String refreshToken) {
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
        SourceGoogleSearchConsoleOAuth other = (SourceGoogleSearchConsoleOAuth) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            authType,
            clientId,
            clientSecret,
            refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleSearchConsoleOAuth.class,
                "accessToken", accessToken,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken);
    }
    
    public final static class Builder {
 
        private Optional<String> accessToken = Optional.empty();
 
        private String clientId;
 
        private String clientSecret;
 
        private String refreshToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Access token for making authenticated requests. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = Optional.ofNullable(accessToken);
            return this;
        }

        /**
         * Access token for making authenticated requests. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
         */
        public Builder accessToken(Optional<String> accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The client ID of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The client secret of your Google Search Console developer application. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The token for obtaining a new access token. Read more &lt;a href="https://developers.google.com/webmaster-tools/v1/how-tos/authorizing"&gt;here&lt;/a&gt;.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }
        
        public SourceGoogleSearchConsoleOAuth build() {
            return new SourceGoogleSearchConsoleOAuth(
                accessToken,
                clientId,
                clientSecret,
                refreshToken);
        }

        private static final LazySingletonValue<SourceGoogleSearchConsoleAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<SourceGoogleSearchConsoleAuthType>() {});
    }
}

