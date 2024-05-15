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


public class SignInViaSlackOAuth {

    /**
     * Slack access_token. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help generating the token.
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * Slack client_id. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this id.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * Slack client_secret. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this secret.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("option_title")
    private SourceSlackOptionTitle optionTitle;

    @JsonCreator
    public SignInViaSlackOAuth(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.optionTitle = Builder._SINGLETON_VALUE_OptionTitle.value();
    }

    /**
     * Slack access_token. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help generating the token.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    /**
     * Slack client_id. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this id.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Slack client_secret. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this secret.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public SourceSlackOptionTitle optionTitle() {
        return optionTitle;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Slack access_token. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help generating the token.
     */
    public SignInViaSlackOAuth withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Slack client_id. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this id.
     */
    public SignInViaSlackOAuth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Slack client_secret. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this secret.
     */
    public SignInViaSlackOAuth withClientSecret(String clientSecret) {
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
        SignInViaSlackOAuth other = (SignInViaSlackOAuth) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.optionTitle, other.optionTitle);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            clientId,
            clientSecret,
            optionTitle);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SignInViaSlackOAuth.class,
                "accessToken", accessToken,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "optionTitle", optionTitle);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private String clientId;
 
        private String clientSecret;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Slack access_token. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help generating the token.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Slack client_id. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this id.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Slack client_secret. See our &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; if you need help finding this secret.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public SignInViaSlackOAuth build() {
            return new SignInViaSlackOAuth(
                accessToken,
                clientId,
                clientSecret);
        }

        private static final LazySingletonValue<SourceSlackOptionTitle> _SINGLETON_VALUE_OptionTitle =
                new LazySingletonValue<>(
                        "option_title",
                        "\"Default OAuth2.0 authorization\"",
                        new TypeReference<SourceSlackOptionTitle>() {});
    }
}
