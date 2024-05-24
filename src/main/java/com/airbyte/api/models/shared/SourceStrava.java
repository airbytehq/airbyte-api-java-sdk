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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

public class SourceStrava {

    /**
     * The Athlete ID of your Strava developer application.
     */
    @JsonProperty("athlete_id")
    private long athleteId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceStravaAuthType> authType;

    /**
     * The Client ID of your Strava developer application.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret of your Strava developer application.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * The Refresh Token with the activity: read_all permissions.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("sourceType")
    private SourceStravaStrava sourceType;

    /**
     * UTC date and time. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceStrava(
            @JsonProperty("athlete_id") long athleteId,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("refresh_token") String refreshToken,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(athleteId, "athleteId");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(startDate, "startDate");
        this.athleteId = athleteId;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * The Athlete ID of your Strava developer application.
     */
    @JsonIgnore
    public long athleteId() {
        return athleteId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceStravaAuthType> authType() {
        return (Optional<SourceStravaAuthType>) authType;
    }

    /**
     * The Client ID of your Strava developer application.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your Strava developer application.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * The Refresh Token with the activity: read_all permissions.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    @JsonIgnore
    public SourceStravaStrava sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time. Any data before this date will not be replicated.
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Athlete ID of your Strava developer application.
     */
    public SourceStrava withAthleteId(long athleteId) {
        Utils.checkNotNull(athleteId, "athleteId");
        this.athleteId = athleteId;
        return this;
    }

    /**
     * The Client ID of your Strava developer application.
     */
    public SourceStrava withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Strava developer application.
     */
    public SourceStrava withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The Refresh Token with the activity: read_all permissions.
     */
    public SourceStrava withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * UTC date and time. Any data before this date will not be replicated.
     */
    public SourceStrava withStartDate(OffsetDateTime startDate) {
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
        SourceStrava other = (SourceStrava) o;
        return 
            java.util.Objects.deepEquals(this.athleteId, other.athleteId) &&
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            athleteId,
            authType,
            clientId,
            clientSecret,
            refreshToken,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceStrava.class,
                "athleteId", athleteId,
                "authType", authType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "refreshToken", refreshToken,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Long athleteId;
 
        private String clientId;
 
        private String clientSecret;
 
        private String refreshToken;
 
        private OffsetDateTime startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Athlete ID of your Strava developer application.
         */
        public Builder athleteId(long athleteId) {
            Utils.checkNotNull(athleteId, "athleteId");
            this.athleteId = athleteId;
            return this;
        }

        /**
         * The Client ID of your Strava developer application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your Strava developer application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The Refresh Token with the activity: read_all permissions.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * UTC date and time. Any data before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceStrava build() {
            return new SourceStrava(
                athleteId,
                clientId,
                clientSecret,
                refreshToken,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends SourceStravaAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Client\"",
                        new TypeReference<Optional<? extends SourceStravaAuthType>>() {});

        private static final LazySingletonValue<SourceStravaStrava> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"strava\"",
                        new TypeReference<SourceStravaStrava>() {});
    }
}

