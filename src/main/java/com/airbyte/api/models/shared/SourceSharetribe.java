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

public class SourceSharetribe {

    @JsonProperty("client_id")
    private String clientId;

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
    private Sharetribe sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceSharetribe(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("oauth_access_token") Optional<String> oauthAccessToken,
            @JsonProperty("oauth_token_expiry_date") Optional<OffsetDateTime> oauthTokenExpiryDate,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
        Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
        Utils.checkNotNull(startDate, "startDate");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.oauthAccessToken = oauthAccessToken;
        this.oauthTokenExpiryDate = oauthTokenExpiryDate;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceSharetribe(
            String clientId,
            String clientSecret,
            OffsetDateTime startDate) {
        this(clientId, clientSecret, Optional.empty(), Optional.empty(), startDate);
    }

    @JsonIgnore
    public String clientId() {
        return clientId;
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
    public Sharetribe sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceSharetribe withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public SourceSharetribe withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceSharetribe withOauthAccessToken(String oauthAccessToken) {
        Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
        this.oauthAccessToken = Optional.ofNullable(oauthAccessToken);
        return this;
    }

    /**
     * The current access token. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceSharetribe withOauthAccessToken(Optional<String> oauthAccessToken) {
        Utils.checkNotNull(oauthAccessToken, "oauthAccessToken");
        this.oauthAccessToken = oauthAccessToken;
        return this;
    }

    /**
     * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceSharetribe withOauthTokenExpiryDate(OffsetDateTime oauthTokenExpiryDate) {
        Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
        this.oauthTokenExpiryDate = Optional.ofNullable(oauthTokenExpiryDate);
        return this;
    }

    /**
     * The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response.
     */
    public SourceSharetribe withOauthTokenExpiryDate(Optional<OffsetDateTime> oauthTokenExpiryDate) {
        Utils.checkNotNull(oauthTokenExpiryDate, "oauthTokenExpiryDate");
        this.oauthTokenExpiryDate = oauthTokenExpiryDate;
        return this;
    }

    public SourceSharetribe withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        SourceSharetribe other = (SourceSharetribe) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.oauthAccessToken, other.oauthAccessToken) &&
            Objects.deepEquals(this.oauthTokenExpiryDate, other.oauthTokenExpiryDate) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientSecret,
            oauthAccessToken,
            oauthTokenExpiryDate,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSharetribe.class,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "oauthAccessToken", oauthAccessToken,
                "oauthTokenExpiryDate", oauthTokenExpiryDate,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private Optional<String> oauthAccessToken = Optional.empty();
 
        private Optional<OffsetDateTime> oauthTokenExpiryDate = Optional.empty();
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
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

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceSharetribe build() {
            return new SourceSharetribe(
                clientId,
                clientSecret,
                oauthAccessToken,
                oauthTokenExpiryDate,
                startDate);
        }

        private static final LazySingletonValue<Sharetribe> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"sharetribe\"",
                        new TypeReference<Sharetribe>() {});
    }
}
