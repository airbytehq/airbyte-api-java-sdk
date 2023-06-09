/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceStrava - The values required to configure the source.
 */

public class SourceStrava {
    /**
     * The Athlete ID of your Strava developer application.
     */
    @JsonProperty("athlete_id")
    public Long athleteId;

    public SourceStrava withAthleteId(Long athleteId) {
        this.athleteId = athleteId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceStravaAuthType authType;

    public SourceStrava withAuthType(SourceStravaAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Client ID of your Strava developer application.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceStrava withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your Strava developer application.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceStrava withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The Refresh Token with the activity: read_all permissions.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;

    public SourceStrava withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceStravaStrava sourceType;

    public SourceStrava withSourceType(SourceStravaStrava sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceStrava withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceStrava(@JsonProperty("athlete_id") Long athleteId, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken, @JsonProperty("sourceType") SourceStravaStrava sourceType, @JsonProperty("start_date") OffsetDateTime startDate) {
        this.athleteId = athleteId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
