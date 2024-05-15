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


public class SourcePaypalTransaction {

    /**
     * The Client ID of your Paypal developer application.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The Client Secret of your Paypal developer application.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Start Date parameter for the list dispute endpoint in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This Start Date must be in range within 180 days before present time, and requires ONLY 3 miliseconds(mandatory). If you don't use this option, it defaults to a start date set 180 days in the past.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dispute_start_date")
    private Optional<? extends OffsetDateTime> disputeStartDate;

    /**
     * End Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This can be help you select specific range of time, mainly for test purposes  or data integrity tests. When this is not used, now_utc() is used by the streams. This does not apply to Disputes and Product streams.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<? extends OffsetDateTime> endDate;

    /**
     * Determines whether to use the sandbox or production environment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sandbox")
    private Optional<? extends Boolean> isSandbox;

    /**
     * The key to refresh the expired access token.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    private Optional<? extends String> refreshToken;

    @JsonProperty("sourceType")
    private PaypalTransaction sourceType;

    /**
     * Start Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. Date must be in range from 3 years till 12 hrs before present time.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * The number of days per request. Must be a number between 1 and 31.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time_window")
    private Optional<? extends Long> timeWindow;

    @JsonCreator
    public SourcePaypalTransaction(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("dispute_start_date") Optional<? extends OffsetDateTime> disputeStartDate,
            @JsonProperty("end_date") Optional<? extends OffsetDateTime> endDate,
            @JsonProperty("is_sandbox") Optional<? extends Boolean> isSandbox,
            @JsonProperty("refresh_token") Optional<? extends String> refreshToken,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("time_window") Optional<? extends Long> timeWindow) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(disputeStartDate, "disputeStartDate");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(isSandbox, "isSandbox");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(timeWindow, "timeWindow");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.disputeStartDate = disputeStartDate;
        this.endDate = endDate;
        this.isSandbox = isSandbox;
        this.refreshToken = refreshToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.timeWindow = timeWindow;
    }
    
    public SourcePaypalTransaction(
            String clientId,
            String clientSecret,
            OffsetDateTime startDate) {
        this(clientId, clientSecret, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), startDate, Optional.empty());
    }

    /**
     * The Client ID of your Paypal developer application.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * The Client Secret of your Paypal developer application.
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * Start Date parameter for the list dispute endpoint in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This Start Date must be in range within 180 days before present time, and requires ONLY 3 miliseconds(mandatory). If you don't use this option, it defaults to a start date set 180 days in the past.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> disputeStartDate() {
        return (Optional<OffsetDateTime>) disputeStartDate;
    }

    /**
     * End Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This can be help you select specific range of time, mainly for test purposes  or data integrity tests. When this is not used, now_utc() is used by the streams. This does not apply to Disputes and Product streams.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> endDate() {
        return (Optional<OffsetDateTime>) endDate;
    }

    /**
     * Determines whether to use the sandbox or production environment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> isSandbox() {
        return (Optional<Boolean>) isSandbox;
    }

    /**
     * The key to refresh the expired access token.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> refreshToken() {
        return (Optional<String>) refreshToken;
    }

    @JsonIgnore
    public PaypalTransaction sourceType() {
        return sourceType;
    }

    /**
     * Start Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. Date must be in range from 3 years till 12 hrs before present time.
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * The number of days per request. Must be a number between 1 and 31.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> timeWindow() {
        return (Optional<Long>) timeWindow;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Client ID of your Paypal developer application.
     */
    public SourcePaypalTransaction withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The Client Secret of your Paypal developer application.
     */
    public SourcePaypalTransaction withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Start Date parameter for the list dispute endpoint in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This Start Date must be in range within 180 days before present time, and requires ONLY 3 miliseconds(mandatory). If you don't use this option, it defaults to a start date set 180 days in the past.
     */
    public SourcePaypalTransaction withDisputeStartDate(OffsetDateTime disputeStartDate) {
        Utils.checkNotNull(disputeStartDate, "disputeStartDate");
        this.disputeStartDate = Optional.ofNullable(disputeStartDate);
        return this;
    }

    /**
     * Start Date parameter for the list dispute endpoint in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This Start Date must be in range within 180 days before present time, and requires ONLY 3 miliseconds(mandatory). If you don't use this option, it defaults to a start date set 180 days in the past.
     */
    public SourcePaypalTransaction withDisputeStartDate(Optional<? extends OffsetDateTime> disputeStartDate) {
        Utils.checkNotNull(disputeStartDate, "disputeStartDate");
        this.disputeStartDate = disputeStartDate;
        return this;
    }

    /**
     * End Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This can be help you select specific range of time, mainly for test purposes  or data integrity tests. When this is not used, now_utc() is used by the streams. This does not apply to Disputes and Product streams.
     */
    public SourcePaypalTransaction withEndDate(OffsetDateTime endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * End Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This can be help you select specific range of time, mainly for test purposes  or data integrity tests. When this is not used, now_utc() is used by the streams. This does not apply to Disputes and Product streams.
     */
    public SourcePaypalTransaction withEndDate(Optional<? extends OffsetDateTime> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Determines whether to use the sandbox or production environment.
     */
    public SourcePaypalTransaction withIsSandbox(boolean isSandbox) {
        Utils.checkNotNull(isSandbox, "isSandbox");
        this.isSandbox = Optional.ofNullable(isSandbox);
        return this;
    }

    /**
     * Determines whether to use the sandbox or production environment.
     */
    public SourcePaypalTransaction withIsSandbox(Optional<? extends Boolean> isSandbox) {
        Utils.checkNotNull(isSandbox, "isSandbox");
        this.isSandbox = isSandbox;
        return this;
    }

    /**
     * The key to refresh the expired access token.
     */
    public SourcePaypalTransaction withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = Optional.ofNullable(refreshToken);
        return this;
    }

    /**
     * The key to refresh the expired access token.
     */
    public SourcePaypalTransaction withRefreshToken(Optional<? extends String> refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Start Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. Date must be in range from 3 years till 12 hrs before present time.
     */
    public SourcePaypalTransaction withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The number of days per request. Must be a number between 1 and 31.
     */
    public SourcePaypalTransaction withTimeWindow(long timeWindow) {
        Utils.checkNotNull(timeWindow, "timeWindow");
        this.timeWindow = Optional.ofNullable(timeWindow);
        return this;
    }

    /**
     * The number of days per request. Must be a number between 1 and 31.
     */
    public SourcePaypalTransaction withTimeWindow(Optional<? extends Long> timeWindow) {
        Utils.checkNotNull(timeWindow, "timeWindow");
        this.timeWindow = timeWindow;
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
        SourcePaypalTransaction other = (SourcePaypalTransaction) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.disputeStartDate, other.disputeStartDate) &&
            java.util.Objects.deepEquals(this.endDate, other.endDate) &&
            java.util.Objects.deepEquals(this.isSandbox, other.isSandbox) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.timeWindow, other.timeWindow);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId,
            clientSecret,
            disputeStartDate,
            endDate,
            isSandbox,
            refreshToken,
            sourceType,
            startDate,
            timeWindow);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePaypalTransaction.class,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "disputeStartDate", disputeStartDate,
                "endDate", endDate,
                "isSandbox", isSandbox,
                "refreshToken", refreshToken,
                "sourceType", sourceType,
                "startDate", startDate,
                "timeWindow", timeWindow);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private Optional<? extends OffsetDateTime> disputeStartDate = Optional.empty();
 
        private Optional<? extends OffsetDateTime> endDate = Optional.empty();
 
        private Optional<? extends Boolean> isSandbox;
 
        private Optional<? extends String> refreshToken = Optional.empty();
 
        private OffsetDateTime startDate;
 
        private Optional<? extends Long> timeWindow;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Client ID of your Paypal developer application.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The Client Secret of your Paypal developer application.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Start Date parameter for the list dispute endpoint in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This Start Date must be in range within 180 days before present time, and requires ONLY 3 miliseconds(mandatory). If you don't use this option, it defaults to a start date set 180 days in the past.
         */
        public Builder disputeStartDate(OffsetDateTime disputeStartDate) {
            Utils.checkNotNull(disputeStartDate, "disputeStartDate");
            this.disputeStartDate = Optional.ofNullable(disputeStartDate);
            return this;
        }

        /**
         * Start Date parameter for the list dispute endpoint in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This Start Date must be in range within 180 days before present time, and requires ONLY 3 miliseconds(mandatory). If you don't use this option, it defaults to a start date set 180 days in the past.
         */
        public Builder disputeStartDate(Optional<? extends OffsetDateTime> disputeStartDate) {
            Utils.checkNotNull(disputeStartDate, "disputeStartDate");
            this.disputeStartDate = disputeStartDate;
            return this;
        }

        /**
         * End Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This can be help you select specific range of time, mainly for test purposes  or data integrity tests. When this is not used, now_utc() is used by the streams. This does not apply to Disputes and Product streams.
         */
        public Builder endDate(OffsetDateTime endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * End Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. This can be help you select specific range of time, mainly for test purposes  or data integrity tests. When this is not used, now_utc() is used by the streams. This does not apply to Disputes and Product streams.
         */
        public Builder endDate(Optional<? extends OffsetDateTime> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * Determines whether to use the sandbox or production environment.
         */
        public Builder isSandbox(boolean isSandbox) {
            Utils.checkNotNull(isSandbox, "isSandbox");
            this.isSandbox = Optional.ofNullable(isSandbox);
            return this;
        }

        /**
         * Determines whether to use the sandbox or production environment.
         */
        public Builder isSandbox(Optional<? extends Boolean> isSandbox) {
            Utils.checkNotNull(isSandbox, "isSandbox");
            this.isSandbox = isSandbox;
            return this;
        }

        /**
         * The key to refresh the expired access token.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = Optional.ofNullable(refreshToken);
            return this;
        }

        /**
         * The key to refresh the expired access token.
         */
        public Builder refreshToken(Optional<? extends String> refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * Start Date for data extraction in &lt;a href=\"https://datatracker.ietf.org/doc/html/rfc3339#section-5.6\"&gt;ISO format&lt;/a&gt;. Date must be in range from 3 years till 12 hrs before present time.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The number of days per request. Must be a number between 1 and 31.
         */
        public Builder timeWindow(long timeWindow) {
            Utils.checkNotNull(timeWindow, "timeWindow");
            this.timeWindow = Optional.ofNullable(timeWindow);
            return this;
        }

        /**
         * The number of days per request. Must be a number between 1 and 31.
         */
        public Builder timeWindow(Optional<? extends Long> timeWindow) {
            Utils.checkNotNull(timeWindow, "timeWindow");
            this.timeWindow = timeWindow;
            return this;
        }
        
        public SourcePaypalTransaction build() {
            if (isSandbox == null) {
                isSandbox = _SINGLETON_VALUE_IsSandbox.value();
            }
            if (timeWindow == null) {
                timeWindow = _SINGLETON_VALUE_TimeWindow.value();
            }
            return new SourcePaypalTransaction(
                clientId,
                clientSecret,
                disputeStartDate,
                endDate,
                isSandbox,
                refreshToken,
                startDate,
                timeWindow);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_IsSandbox =
                new LazySingletonValue<>(
                        "is_sandbox",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<PaypalTransaction> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"paypal-transaction\"",
                        new TypeReference<PaypalTransaction>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_TimeWindow =
                new LazySingletonValue<>(
                        "time_window",
                        "7",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

