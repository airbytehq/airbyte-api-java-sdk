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

public class SourceIntercom {

    /**
     * Access token for making authenticated requests. See the &lt;a href="https://developers.intercom.com/building-apps/docs/authentication-types#how-to-get-your-access-token"&gt;Intercom docs&lt;/a&gt; for more information.
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * Set lower value in case of failing long running sync of Activity Logs stream.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("activity_logs_time_step")
    private Optional<? extends Long> activityLogsTimeStep;

    /**
     * Client Id for your Intercom application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<? extends String> clientId;

    /**
     * Client Secret for your Intercom application.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<? extends String> clientSecret;

    @JsonProperty("sourceType")
    private SourceIntercomIntercom sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceIntercom(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("activity_logs_time_step") Optional<? extends Long> activityLogsTimeStep,
            @JsonProperty("client_id") Optional<? extends String> clientId,
            @JsonProperty("client_secret") Optional<? extends String> clientSecret,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(activityLogsTimeStep, "activityLogsTimeStep");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(startDate, "startDate");
        this.accessToken = accessToken;
        this.activityLogsTimeStep = activityLogsTimeStep;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceIntercom(
            String accessToken,
            OffsetDateTime startDate) {
        this(accessToken, Optional.empty(), Optional.empty(), Optional.empty(), startDate);
    }

    /**
     * Access token for making authenticated requests. See the &lt;a href="https://developers.intercom.com/building-apps/docs/authentication-types#how-to-get-your-access-token"&gt;Intercom docs&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    /**
     * Set lower value in case of failing long running sync of Activity Logs stream.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> activityLogsTimeStep() {
        return (Optional<Long>) activityLogsTimeStep;
    }

    /**
     * Client Id for your Intercom application.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientId() {
        return (Optional<String>) clientId;
    }

    /**
     * Client Secret for your Intercom application.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientSecret() {
        return (Optional<String>) clientSecret;
    }

    @JsonIgnore
    public SourceIntercomIntercom sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Access token for making authenticated requests. See the &lt;a href="https://developers.intercom.com/building-apps/docs/authentication-types#how-to-get-your-access-token"&gt;Intercom docs&lt;/a&gt; for more information.
     */
    public SourceIntercom withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Set lower value in case of failing long running sync of Activity Logs stream.
     */
    public SourceIntercom withActivityLogsTimeStep(long activityLogsTimeStep) {
        Utils.checkNotNull(activityLogsTimeStep, "activityLogsTimeStep");
        this.activityLogsTimeStep = Optional.ofNullable(activityLogsTimeStep);
        return this;
    }

    /**
     * Set lower value in case of failing long running sync of Activity Logs stream.
     */
    public SourceIntercom withActivityLogsTimeStep(Optional<? extends Long> activityLogsTimeStep) {
        Utils.checkNotNull(activityLogsTimeStep, "activityLogsTimeStep");
        this.activityLogsTimeStep = activityLogsTimeStep;
        return this;
    }

    /**
     * Client Id for your Intercom application.
     */
    public SourceIntercom withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * Client Id for your Intercom application.
     */
    public SourceIntercom withClientId(Optional<? extends String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret for your Intercom application.
     */
    public SourceIntercom withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * Client Secret for your Intercom application.
     */
    public SourceIntercom withClientSecret(Optional<? extends String> clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public SourceIntercom withStartDate(OffsetDateTime startDate) {
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
        SourceIntercom other = (SourceIntercom) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.activityLogsTimeStep, other.activityLogsTimeStep) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            activityLogsTimeStep,
            clientId,
            clientSecret,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceIntercom.class,
                "accessToken", accessToken,
                "activityLogsTimeStep", activityLogsTimeStep,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private Optional<? extends Long> activityLogsTimeStep;
 
        private Optional<? extends String> clientId = Optional.empty();
 
        private Optional<? extends String> clientSecret = Optional.empty();
 
        private OffsetDateTime startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Access token for making authenticated requests. See the &lt;a href="https://developers.intercom.com/building-apps/docs/authentication-types#how-to-get-your-access-token"&gt;Intercom docs&lt;/a&gt; for more information.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Set lower value in case of failing long running sync of Activity Logs stream.
         */
        public Builder activityLogsTimeStep(long activityLogsTimeStep) {
            Utils.checkNotNull(activityLogsTimeStep, "activityLogsTimeStep");
            this.activityLogsTimeStep = Optional.ofNullable(activityLogsTimeStep);
            return this;
        }

        /**
         * Set lower value in case of failing long running sync of Activity Logs stream.
         */
        public Builder activityLogsTimeStep(Optional<? extends Long> activityLogsTimeStep) {
            Utils.checkNotNull(activityLogsTimeStep, "activityLogsTimeStep");
            this.activityLogsTimeStep = activityLogsTimeStep;
            return this;
        }

        /**
         * Client Id for your Intercom application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * Client Id for your Intercom application.
         */
        public Builder clientId(Optional<? extends String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Client Secret for your Intercom application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * Client Secret for your Intercom application.
         */
        public Builder clientSecret(Optional<? extends String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceIntercom build() {
            if (activityLogsTimeStep == null) {
                activityLogsTimeStep = _SINGLETON_VALUE_ActivityLogsTimeStep.value();
            }
            return new SourceIntercom(
                accessToken,
                activityLogsTimeStep,
                clientId,
                clientSecret,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_ActivityLogsTimeStep =
                new LazySingletonValue<>(
                        "activity_logs_time_step",
                        "30",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<SourceIntercomIntercom> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"intercom\"",
                        new TypeReference<SourceIntercomIntercom>() {});
    }
}

