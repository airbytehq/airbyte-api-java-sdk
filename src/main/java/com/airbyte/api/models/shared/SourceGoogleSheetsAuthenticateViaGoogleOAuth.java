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

public class SourceGoogleSheetsAuthenticateViaGoogleOAuth {

    @JsonProperty("auth_type")
    private SourceGoogleSheetsAuthType authType;

    /**
     * Enter your Google application's Client ID. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * Enter your Google application's Client Secret. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Enter your Google application's refresh token. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonCreator
    public SourceGoogleSheetsAuthenticateViaGoogleOAuth(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
    }

    @JsonIgnore
    public SourceGoogleSheetsAuthType authType() {
        return authType;
    }

    /**
     * Enter your Google application's Client ID. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Enter your Google application's Client Secret. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * Enter your Google application's refresh token. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Enter your Google application's Client ID. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    public SourceGoogleSheetsAuthenticateViaGoogleOAuth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Enter your Google application's Client Secret. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    public SourceGoogleSheetsAuthenticateViaGoogleOAuth withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Enter your Google application's refresh token. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
     */
    public SourceGoogleSheetsAuthenticateViaGoogleOAuth withRefreshToken(String refreshToken) {
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
        SourceGoogleSheetsAuthenticateViaGoogleOAuth other = (SourceGoogleSheetsAuthenticateViaGoogleOAuth) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            clientId,
            clientSecret,
            refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleSheetsAuthenticateViaGoogleOAuth.class,
                "authType", authType,
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
         * Enter your Google application's Client ID. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Enter your Google application's Client Secret. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Enter your Google application's refresh token. See &lt;a href='https://developers.google.com/identity/protocols/oauth2'&gt;Google's documentation&lt;/a&gt; for more information.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }
        
        public SourceGoogleSheetsAuthenticateViaGoogleOAuth build() {
            return new SourceGoogleSheetsAuthenticateViaGoogleOAuth(
                clientId,
                clientSecret,
                refreshToken);
        }

        private static final LazySingletonValue<SourceGoogleSheetsAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<SourceGoogleSheetsAuthType>() {});
    }
}

