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


public class SourceHubspotOAuth {

    /**
     * The Client ID of your HubSpot developer application. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this ID.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The client secret for your HubSpot developer application. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this secret.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Name of the credentials
     */
    @JsonProperty("credentials_title")
    private SourceHubspotAuthType credentialsTitle;

    /**
     * Refresh token to renew an expired access token. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this token.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonCreator
    public SourceHubspotOAuth(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.credentialsTitle = Builder._SINGLETON_VALUE_CredentialsTitle.value();
        this.refreshToken = refreshToken;
    }

    /**
     * The Client ID of your HubSpot developer application. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this ID.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The client secret for your HubSpot developer application. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this secret.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * Name of the credentials
     */
    @JsonIgnore
    public SourceHubspotAuthType credentialsTitle() {
        return credentialsTitle;
    }

    /**
     * Refresh token to renew an expired access token. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this token.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Client ID of your HubSpot developer application. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this ID.
     */
    public SourceHubspotOAuth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The client secret for your HubSpot developer application. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this secret.
     */
    public SourceHubspotOAuth withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Refresh token to renew an expired access token. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this token.
     */
    public SourceHubspotOAuth withRefreshToken(String refreshToken) {
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
        SourceHubspotOAuth other = (SourceHubspotOAuth) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.credentialsTitle, other.credentialsTitle) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId,
            clientSecret,
            credentialsTitle,
            refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceHubspotOAuth.class,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "credentialsTitle", credentialsTitle,
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
         * The Client ID of your HubSpot developer application. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this ID.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The client secret for your HubSpot developer application. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this secret.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Refresh token to renew an expired access token. See the &lt;a href="https://legacydocs.hubspot.com/docs/methods/oauth2/oauth2-quickstart"&gt;Hubspot docs&lt;/a&gt; if you need help finding this token.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }
        
        public SourceHubspotOAuth build() {
            return new SourceHubspotOAuth(
                clientId,
                clientSecret,
                refreshToken);
        }

        private static final LazySingletonValue<SourceHubspotAuthType> _SINGLETON_VALUE_CredentialsTitle =
                new LazySingletonValue<>(
                        "credentials_title",
                        "\"OAuth Credentials\"",
                        new TypeReference<SourceHubspotAuthType>() {});
    }
}

