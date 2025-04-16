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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class SourceMailjetSms {

    /**
     * Retrieve SMS messages created before the specified timestamp. Required format - Unix timestamp.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<Long> endDate;

    @JsonProperty("sourceType")
    private MailjetSms sourceType;

    /**
     * Retrieve SMS messages created after the specified timestamp. Required format - Unix timestamp.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<Long> startDate;

    /**
     * Your access token. See &lt;a href="https://dev.mailjet.com/sms/reference/overview/authentication"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("token")
    private String token;

    @JsonCreator
    public SourceMailjetSms(
            @JsonProperty("end_date") Optional<Long> endDate,
            @JsonProperty("start_date") Optional<Long> startDate,
            @JsonProperty("token") String token) {
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(token, "token");
        this.endDate = endDate;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.token = token;
    }
    
    public SourceMailjetSms(
            String token) {
        this(Optional.empty(), Optional.empty(), token);
    }

    /**
     * Retrieve SMS messages created before the specified timestamp. Required format - Unix timestamp.
     */
    @JsonIgnore
    public Optional<Long> endDate() {
        return endDate;
    }

    @JsonIgnore
    public MailjetSms sourceType() {
        return sourceType;
    }

    /**
     * Retrieve SMS messages created after the specified timestamp. Required format - Unix timestamp.
     */
    @JsonIgnore
    public Optional<Long> startDate() {
        return startDate;
    }

    /**
     * Your access token. See &lt;a href="https://dev.mailjet.com/sms/reference/overview/authentication"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Retrieve SMS messages created before the specified timestamp. Required format - Unix timestamp.
     */
    public SourceMailjetSms withEndDate(long endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * Retrieve SMS messages created before the specified timestamp. Required format - Unix timestamp.
     */
    public SourceMailjetSms withEndDate(Optional<Long> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Retrieve SMS messages created after the specified timestamp. Required format - Unix timestamp.
     */
    public SourceMailjetSms withStartDate(long startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * Retrieve SMS messages created after the specified timestamp. Required format - Unix timestamp.
     */
    public SourceMailjetSms withStartDate(Optional<Long> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Your access token. See &lt;a href="https://dev.mailjet.com/sms/reference/overview/authentication"&gt;here&lt;/a&gt;.
     */
    public SourceMailjetSms withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
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
        SourceMailjetSms other = (SourceMailjetSms) o;
        return 
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            endDate,
            sourceType,
            startDate,
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMailjetSms.class,
                "endDate", endDate,
                "sourceType", sourceType,
                "startDate", startDate,
                "token", token);
    }
    
    public final static class Builder {
 
        private Optional<Long> endDate = Optional.empty();
 
        private Optional<Long> startDate = Optional.empty();
 
        private String token;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Retrieve SMS messages created before the specified timestamp. Required format - Unix timestamp.
         */
        public Builder endDate(long endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * Retrieve SMS messages created before the specified timestamp. Required format - Unix timestamp.
         */
        public Builder endDate(Optional<Long> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * Retrieve SMS messages created after the specified timestamp. Required format - Unix timestamp.
         */
        public Builder startDate(long startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * Retrieve SMS messages created after the specified timestamp. Required format - Unix timestamp.
         */
        public Builder startDate(Optional<Long> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Your access token. See &lt;a href="https://dev.mailjet.com/sms/reference/overview/authentication"&gt;here&lt;/a&gt;.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public SourceMailjetSms build() {
            return new SourceMailjetSms(
                endDate,
                startDate,
                token);
        }

        private static final LazySingletonValue<MailjetSms> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mailjet-sms\"",
                        new TypeReference<MailjetSms>() {});
    }
}
