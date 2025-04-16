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

public class RESTAPIStreams {

    /**
     * Follow the instructions in the "OAuth 2.0 in Postman - API Client for Integrations" article in the Workday community docs to obtain access token.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("auth_type")
    private Rest authType;

    /**
     * Rows after this date will be synced, default 2 years ago.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<OffsetDateTime> startDate;

    @JsonCreator
    public RESTAPIStreams(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("start_date") Optional<OffsetDateTime> startDate) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(startDate, "startDate");
        this.accessToken = accessToken;
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.startDate = startDate;
    }
    
    public RESTAPIStreams(
            String accessToken) {
        this(accessToken, Optional.empty());
    }

    /**
     * Follow the instructions in the "OAuth 2.0 in Postman - API Client for Integrations" article in the Workday community docs to obtain access token.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public Rest authType() {
        return authType;
    }

    /**
     * Rows after this date will be synced, default 2 years ago.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Follow the instructions in the "OAuth 2.0 in Postman - API Client for Integrations" article in the Workday community docs to obtain access token.
     */
    public RESTAPIStreams withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Rows after this date will be synced, default 2 years ago.
     */
    public RESTAPIStreams withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * Rows after this date will be synced, default 2 years ago.
     */
    public RESTAPIStreams withStartDate(Optional<OffsetDateTime> startDate) {
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
        RESTAPIStreams other = (RESTAPIStreams) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            authType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RESTAPIStreams.class,
                "accessToken", accessToken,
                "authType", authType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private Optional<OffsetDateTime> startDate = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Follow the instructions in the "OAuth 2.0 in Postman - API Client for Integrations" article in the Workday community docs to obtain access token.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Rows after this date will be synced, default 2 years ago.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * Rows after this date will be synced, default 2 years ago.
         */
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public RESTAPIStreams build() {
            return new RESTAPIStreams(
                accessToken,
                startDate);
        }

        private static final LazySingletonValue<Rest> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"REST\"",
                        new TypeReference<Rest>() {});
    }
}
