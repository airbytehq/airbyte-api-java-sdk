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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class SourceSigmaComputing {

    /**
     * The base url of your sigma organization
     */
    @JsonProperty("base_url")
    private String baseUrl;

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_refresh_token")
    private String clientRefreshToken;

    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("oauth_access_token")
    private Optional<String> oauthAccessToken;

    /**
     * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("oauth_token_expiry_date")
    private Optional<OffsetDateTime> oauthTokenExpiryDate;

    @JsonProperty("sourceType")
    private SigmaComputing sourceType;

    @JsonCreator
    public SourceSigmaComputing(
            @JsonProperty("base_url") String baseUrl,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_refresh_token") String clientRefreshToken,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("oauth_access_token") Optional<String> oauthAccessToken,
            @JsonProperty("oauth_token_expiry_date") Optional<OffsetDateTime> oauthTokenExpiryDate) {
        Utils.checkNotNull(baseUrl, "baseUrl");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
        Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
        this.baseUrl = baseUrl;
        this.clientId = clientId;
        this.clientRefreshToken = clientRefreshToken;
        this.clientSecret = clientSecret;
        this.oauthAccessToken = oauthAccessToken;
        this.oauthTokenExpiryDate = oauthTokenExpiryDate;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceSigmaComputing(
            String baseUrl,
            String clientId,
            String clientRefreshToken,
            String clientSecret) {
        this(baseUrl, clientId, clientRefreshToken, clientSecret, Optional.empty(), Optional.empty());
    }

    /**
     * The base url of your sigma organization
     */
    @JsonIgnore
    public String baseUrl() {
        return baseUrl;
    }

    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    @JsonIgnore
    public String clientRefreshToken() {
        return clientRefreshToken;
    }

    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    @JsonIgnore
    public Optional<String> oauthAccessToken() {
        return oauthAccessToken;
    }

    /**
     * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> oauthTokenExpiryDate() {
        return oauthTokenExpiryDate;
    }

    @JsonIgnore
    public SigmaComputing sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The base url of your sigma organization
     */
    public SourceSigmaComputing withBaseUrl(String baseUrl) {
        Utils.checkNotNull(baseUrl, "baseUrl");
        this.baseUrl = baseUrl;
        return this;
    }

    public SourceSigmaComputing withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public SourceSigmaComputing withClientRefreshToken(String clientRefreshToken) {
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        this.clientRefreshToken = clientRefreshToken;
        return this;
    }

    public SourceSigmaComputing withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceSigmaComputing withOauthAccessToken(String oauthAccessToken) {
        Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
        this.oauthAccessToken = Optional.ofNullable(oauthAccessToken);
        return this;
    }

    /**
     * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceSigmaComputing withOauthAccessToken(Optional<String> oauthAccessToken) {
        Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
        this.oauthAccessToken = oauthAccessToken;
        return this;
    }

    /**
     * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceSigmaComputing withOauthTokenExpiryDate(OffsetDateTime oauthTokenExpiryDate) {
        Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
        this.oauthTokenExpiryDate = Optional.ofNullable(oauthTokenExpiryDate);
        return this;
    }

    /**
     * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceSigmaComputing withOauthTokenExpiryDate(Optional<OffsetDateTime> oauthTokenExpiryDate) {
        Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
        this.oauthTokenExpiryDate = oauthTokenExpiryDate;
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
        SourceSigmaComputing other = (SourceSigmaComputing) o;
        return 
            Objects.deepEquals(this.baseUrl, other.baseUrl) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientRefreshToken, other.clientRefreshToken) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.oauthAccessToken, other.oauthAccessToken) &&
            Objects.deepEquals(this.oauthTokenExpiryDate, other.oauthTokenExpiryDate) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            baseUrl,
            clientId,
            clientRefreshToken,
            clientSecret,
            oauthAccessToken,
            oauthTokenExpiryDate,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSigmaComputing.class,
                "baseUrl", baseUrl,
                "clientId", clientId,
                "clientRefreshToken", clientRefreshToken,
                "clientSecret", clientSecret,
                "oauthAccessToken", oauthAccessToken,
                "oauthTokenExpiryDate", oauthTokenExpiryDate,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String baseUrl;
 
        private String clientId;
 
        private String clientRefreshToken;
 
        private String clientSecret;
 
        private Optional<String> oauthAccessToken = Optional.empty();
 
        private Optional<OffsetDateTime> oauthTokenExpiryDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The base url of your sigma organization
         */
        public Builder baseUrl(String baseUrl) {
            Utils.checkNotNull(baseUrl, "baseUrl");
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        public Builder clientRefreshToken(String clientRefreshToken) {
            Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
            this.clientRefreshToken = clientRefreshToken;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
         */
        public Builder oauthAccessToken(String oauthAccessToken) {
            Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
            this.oauthAccessToken = Optional.ofNullable(oauthAccessToken);
            return this;
        }

        /**
         * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
         */
        public Builder oauthAccessToken(Optional<String> oauthAccessToken) {
            Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
            this.oauthAccessToken = oauthAccessToken;
            return this;
        }

        /**
         * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
         */
        public Builder oauthTokenExpiryDate(OffsetDateTime oauthTokenExpiryDate) {
            Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
            this.oauthTokenExpiryDate = Optional.ofNullable(oauthTokenExpiryDate);
            return this;
        }

        /**
         * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
         */
        public Builder oauthTokenExpiryDate(Optional<OffsetDateTime> oauthTokenExpiryDate) {
            Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
            this.oauthTokenExpiryDate = oauthTokenExpiryDate;
            return this;
        }
        
        public SourceSigmaComputing build() {
            return new SourceSigmaComputing(
                baseUrl,
                clientId,
                clientRefreshToken,
                clientSecret,
                oauthAccessToken,
                oauthTokenExpiryDate);
        }

        private static final LazySingletonValue<SigmaComputing> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"sigma-computing\"",
                        new TypeReference<SigmaComputing>() {});
    }
}
