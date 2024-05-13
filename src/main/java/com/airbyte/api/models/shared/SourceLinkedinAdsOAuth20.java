/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SourceLinkedinAdsOAuth20 {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    private Optional<? extends SourceLinkedinAdsAuthMethod> authMethod;

    /**
     * The client ID of your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The client secret of your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * The key to refresh the expired access token. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonCreator
    public SourceLinkedinAdsOAuth20(
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceLinkedinAdsAuthMethod> authMethod() {
        return (Optional<SourceLinkedinAdsAuthMethod>) authMethod;
    }

    /**
     * The client ID of your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The client secret of your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * The key to refresh the expired access token. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The client ID of your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    public SourceLinkedinAdsOAuth20 withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The client secret of your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    public SourceLinkedinAdsOAuth20 withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The key to refresh the expired access token. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
     */
    public SourceLinkedinAdsOAuth20 withRefreshToken(String refreshToken) {
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
        SourceLinkedinAdsOAuth20 other = (SourceLinkedinAdsOAuth20) o;
        return 
            java.util.Objects.deepEquals(this.authMethod, other.authMethod) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authMethod,
            clientId,
            clientSecret,
            refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceLinkedinAdsOAuth20.class,
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
         * The client ID of your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The client secret of your developer application. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The key to refresh the expired access token. Refer to our &lt;a href='https://docs.airbyte.com/integrations/sources/linkedin-ads#setup-guide'&gt;documentation&lt;/a&gt; for more information.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }
        
        public SourceLinkedinAdsOAuth20 build() {
            return new SourceLinkedinAdsOAuth20(
                clientId,
                clientSecret,
                refreshToken);
        }

        private static final LazySingletonValue<Optional<? extends SourceLinkedinAdsAuthMethod>> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"oAuth2.0\"",
                        new TypeReference<Optional<? extends SourceLinkedinAdsAuthMethod>>() {});
    }
}

