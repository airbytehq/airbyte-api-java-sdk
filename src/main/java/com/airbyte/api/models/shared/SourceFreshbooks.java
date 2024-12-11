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


public class SourceFreshbooks {

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("business_uuid")
    private String businessUuid;

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

    @JsonProperty("redirect_uri")
    private String redirectUri;

    @JsonProperty("sourceType")
    private Freshbooks sourceType;

    @JsonCreator
    public SourceFreshbooks(
            @JsonProperty("account_id") String accountId,
            @JsonProperty("business_uuid") String businessUuid,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_refresh_token") String clientRefreshToken,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("oauth_access_token") Optional<String> oauthAccessToken,
            @JsonProperty("oauth_token_expiry_date") Optional<OffsetDateTime> oauthTokenExpiryDate,
            @JsonProperty("redirect_uri") String redirectUri) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(businessUuid, "businessUuid");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
        Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
        Utils.checkNotNull(redirectUri, "redirectUri");
        this.accountId = accountId;
        this.businessUuid = businessUuid;
        this.clientId = clientId;
        this.clientRefreshToken = clientRefreshToken;
        this.clientSecret = clientSecret;
        this.oauthAccessToken = oauthAccessToken;
        this.oauthTokenExpiryDate = oauthTokenExpiryDate;
        this.redirectUri = redirectUri;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceFreshbooks(
            String accountId,
            String businessUuid,
            String clientId,
            String clientRefreshToken,
            String clientSecret,
            String redirectUri) {
        this(accountId, businessUuid, clientId, clientRefreshToken, clientSecret, Optional.empty(), Optional.empty(), redirectUri);
    }

    @JsonIgnore
    public String accountId() {
        return accountId;
    }

    @JsonIgnore
    public String businessUuid() {
        return businessUuid;
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
    public String redirectUri() {
        return redirectUri;
    }

    @JsonIgnore
    public Freshbooks sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceFreshbooks withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public SourceFreshbooks withBusinessUuid(String businessUuid) {
        Utils.checkNotNull(businessUuid, "businessUuid");
        this.businessUuid = businessUuid;
        return this;
    }

    public SourceFreshbooks withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public SourceFreshbooks withClientRefreshToken(String clientRefreshToken) {
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        this.clientRefreshToken = clientRefreshToken;
        return this;
    }

    public SourceFreshbooks withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceFreshbooks withOauthAccessToken(String oauthAccessToken) {
        Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
        this.oauthAccessToken = Optional.ofNullable(oauthAccessToken);
        return this;
    }

    /**
     * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceFreshbooks withOauthAccessToken(Optional<String> oauthAccessToken) {
        Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
        this.oauthAccessToken = oauthAccessToken;
        return this;
    }

    /**
     * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceFreshbooks withOauthTokenExpiryDate(OffsetDateTime oauthTokenExpiryDate) {
        Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
        this.oauthTokenExpiryDate = Optional.ofNullable(oauthTokenExpiryDate);
        return this;
    }

    /**
     * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceFreshbooks withOauthTokenExpiryDate(Optional<OffsetDateTime> oauthTokenExpiryDate) {
        Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
        this.oauthTokenExpiryDate = oauthTokenExpiryDate;
        return this;
    }

    public SourceFreshbooks withRedirectUri(String redirectUri) {
        Utils.checkNotNull(redirectUri, "redirectUri");
        this.redirectUri = redirectUri;
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
        SourceFreshbooks other = (SourceFreshbooks) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.businessUuid, other.businessUuid) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientRefreshToken, other.clientRefreshToken) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.oauthAccessToken, other.oauthAccessToken) &&
            Objects.deepEquals(this.oauthTokenExpiryDate, other.oauthTokenExpiryDate) &&
            Objects.deepEquals(this.redirectUri, other.redirectUri) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            businessUuid,
            clientId,
            clientRefreshToken,
            clientSecret,
            oauthAccessToken,
            oauthTokenExpiryDate,
            redirectUri,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceFreshbooks.class,
                "accountId", accountId,
                "businessUuid", businessUuid,
                "clientId", clientId,
                "clientRefreshToken", clientRefreshToken,
                "clientSecret", clientSecret,
                "oauthAccessToken", oauthAccessToken,
                "oauthTokenExpiryDate", oauthTokenExpiryDate,
                "redirectUri", redirectUri,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private String businessUuid;
 
        private String clientId;
 
        private String clientRefreshToken;
 
        private String clientSecret;
 
        private Optional<String> oauthAccessToken = Optional.empty();
 
        private Optional<OffsetDateTime> oauthTokenExpiryDate = Optional.empty();
 
        private String redirectUri;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        public Builder businessUuid(String businessUuid) {
            Utils.checkNotNull(businessUuid, "businessUuid");
            this.businessUuid = businessUuid;
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

        public Builder redirectUri(String redirectUri) {
            Utils.checkNotNull(redirectUri, "redirectUri");
            this.redirectUri = redirectUri;
            return this;
        }
        
        public SourceFreshbooks build() {
            return new SourceFreshbooks(
                accountId,
                businessUuid,
                clientId,
                clientRefreshToken,
                clientSecret,
                oauthAccessToken,
                oauthTokenExpiryDate,
                redirectUri);
        }

        private static final LazySingletonValue<Freshbooks> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"freshbooks\"",
                        new TypeReference<Freshbooks>() {});
    }
}

