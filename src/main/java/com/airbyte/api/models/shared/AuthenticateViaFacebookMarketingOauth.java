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

public class AuthenticateViaFacebookMarketingOauth {

    /**
     * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    private Optional<? extends String> accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceFacebookMarketingAuthType> authType;

    /**
     * Client ID for the Facebook Marketing API
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * Client Secret for the Facebook Marketing API
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonCreator
    public AuthenticateViaFacebookMarketingOauth(
            @JsonProperty("access_token") Optional<? extends String> accessToken,
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
    
    public AuthenticateViaFacebookMarketingOauth(
            String clientId,
            String clientSecret) {
        this(Optional.empty(), clientId, clientSecret);
    }

    /**
     * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> accessToken() {
        return (Optional<String>) accessToken;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceFacebookMarketingAuthType> authType() {
        return (Optional<SourceFacebookMarketingAuthType>) authType;
    }

    /**
     * Client ID for the Facebook Marketing API
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Client Secret for the Facebook Marketing API
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
     */
    public AuthenticateViaFacebookMarketingOauth withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = Optional.ofNullable(accessToken);
        return this;
    }

    /**
     * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
     */
    public AuthenticateViaFacebookMarketingOauth withAccessToken(Optional<? extends String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Client ID for the Facebook Marketing API
     */
    public AuthenticateViaFacebookMarketingOauth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret for the Facebook Marketing API
     */
    public AuthenticateViaFacebookMarketingOauth withClientSecret(String clientSecret) {
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
        AuthenticateViaFacebookMarketingOauth other = (AuthenticateViaFacebookMarketingOauth) o;
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
        return Utils.toString(AuthenticateViaFacebookMarketingOauth.class,
                "accessToken", accessToken,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> accessToken = Optional.empty();
 
        private String clientId;
 
        private String clientSecret;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = Optional.ofNullable(accessToken);
            return this;
        }

        /**
         * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
         */
        public Builder accessToken(Optional<? extends String> accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Client ID for the Facebook Marketing API
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Client Secret for the Facebook Marketing API
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public AuthenticateViaFacebookMarketingOauth build() {
            return new AuthenticateViaFacebookMarketingOauth(
                accessToken,
                clientId,
                clientSecret);
        }

        private static final LazySingletonValue<Optional<? extends SourceFacebookMarketingAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<Optional<? extends SourceFacebookMarketingAuthType>>() {});
    }
}

