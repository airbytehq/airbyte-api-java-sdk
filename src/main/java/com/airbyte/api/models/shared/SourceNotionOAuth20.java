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


public class SourceNotionOAuth20 {

    /**
     * The Access Token received by completing the OAuth flow for your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("auth_type")
    private SourceNotionAuthType authType;

    /**
     * The Client ID of your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret of your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonCreator
    public SourceNotionOAuth20(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.accessToken = accessToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * The Access Token received by completing the OAuth flow for your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public SourceNotionAuthType authType() {
        return authType;
    }

    /**
     * The Client ID of your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Access Token received by completing the OAuth flow for your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
     */
    public SourceNotionOAuth20 withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The Client ID of your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
     */
    public SourceNotionOAuth20 withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
     */
    public SourceNotionOAuth20 withClientSecret(String clientSecret) {
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
        SourceNotionOAuth20 other = (SourceNotionOAuth20) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            authType,
            clientId,
            clientSecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceNotionOAuth20.class,
                "accessToken", accessToken,
                "authType", authType,
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
         * The Access Token received by completing the OAuth flow for your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The Client ID of your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your Notion integration. See our &lt;a href='https://docs.airbyte.com/integrations/sources/notion#step-2-set-permissions-and-acquire-authorization-credentials'&gt;docs&lt;/a&gt; for more information.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public SourceNotionOAuth20 build() {
            return new SourceNotionOAuth20(
                accessToken,
                clientId,
                clientSecret);
        }

        private static final LazySingletonValue<SourceNotionAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"OAuth2.0\"",
                        new TypeReference<SourceNotionAuthType>() {});
    }
}
