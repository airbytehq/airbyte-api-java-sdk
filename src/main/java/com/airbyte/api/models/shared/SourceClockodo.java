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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SourceClockodo {

    /**
     * API key to use. Find it in the 'Personal data' section of your Clockodo account.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Your Clockodo account email address. Find it in your Clockodo account settings.
     */
    @JsonProperty("email_address")
    private String emailAddress;

    /**
     * Identification of the calling application, including the email address of a technical contact person. Format: [name of application or company];[email address].
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_application")
    private Optional<String> externalApplication;

    @JsonProperty("sourceType")
    private Clockodo sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * 2024, 2025
     */
    @JsonProperty("years")
    private List<Object> years;

    @JsonCreator
    public SourceClockodo(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("email_address") String emailAddress,
            @JsonProperty("external_application") Optional<String> externalApplication,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("years") List<Object> years) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(externalApplication, "externalApplication");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(years, "years");
        this.apiKey = apiKey;
        this.emailAddress = emailAddress;
        this.externalApplication = externalApplication;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.years = years;
    }
    
    public SourceClockodo(
            String apiKey,
            String emailAddress,
            OffsetDateTime startDate,
            List<Object> years) {
        this(apiKey, emailAddress, Optional.empty(), startDate, years);
    }

    /**
     * API key to use. Find it in the 'Personal data' section of your Clockodo account.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Your Clockodo account email address. Find it in your Clockodo account settings.
     */
    @JsonIgnore
    public String emailAddress() {
        return emailAddress;
    }

    /**
     * Identification of the calling application, including the email address of a technical contact person. Format: [name of application or company];[email address].
     */
    @JsonIgnore
    public Optional<String> externalApplication() {
        return externalApplication;
    }

    @JsonIgnore
    public Clockodo sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * 2024, 2025
     */
    @JsonIgnore
    public List<Object> years() {
        return years;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * API key to use. Find it in the 'Personal data' section of your Clockodo account.
     */
    public SourceClockodo withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Your Clockodo account email address. Find it in your Clockodo account settings.
     */
    public SourceClockodo withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Identification of the calling application, including the email address of a technical contact person. Format: [name of application or company];[email address].
     */
    public SourceClockodo withExternalApplication(String externalApplication) {
        Utils.checkNotNull(externalApplication, "externalApplication");
        this.externalApplication = Optional.ofNullable(externalApplication);
        return this;
    }

    /**
     * Identification of the calling application, including the email address of a technical contact person. Format: [name of application or company];[email address].
     */
    public SourceClockodo withExternalApplication(Optional<String> externalApplication) {
        Utils.checkNotNull(externalApplication, "externalApplication");
        this.externalApplication = externalApplication;
        return this;
    }

    public SourceClockodo withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * 2024, 2025
     */
    public SourceClockodo withYears(List<Object> years) {
        Utils.checkNotNull(years, "years");
        this.years = years;
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
        SourceClockodo other = (SourceClockodo) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            Objects.deepEquals(this.externalApplication, other.externalApplication) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.years, other.years);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            emailAddress,
            externalApplication,
            sourceType,
            startDate,
            years);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceClockodo.class,
                "apiKey", apiKey,
                "emailAddress", emailAddress,
                "externalApplication", externalApplication,
                "sourceType", sourceType,
                "startDate", startDate,
                "years", years);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String emailAddress;
 
        private Optional<String> externalApplication;
 
        private OffsetDateTime startDate;
 
        private List<Object> years;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API key to use. Find it in the 'Personal data' section of your Clockodo account.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Your Clockodo account email address. Find it in your Clockodo account settings.
         */
        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Identification of the calling application, including the email address of a technical contact person. Format: [name of application or company];[email address].
         */
        public Builder externalApplication(String externalApplication) {
            Utils.checkNotNull(externalApplication, "externalApplication");
            this.externalApplication = Optional.ofNullable(externalApplication);
            return this;
        }

        /**
         * Identification of the calling application, including the email address of a technical contact person. Format: [name of application or company];[email address].
         */
        public Builder externalApplication(Optional<String> externalApplication) {
            Utils.checkNotNull(externalApplication, "externalApplication");
            this.externalApplication = externalApplication;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * 2024, 2025
         */
        public Builder years(List<Object> years) {
            Utils.checkNotNull(years, "years");
            this.years = years;
            return this;
        }
        
        public SourceClockodo build() {
            if (externalApplication == null) {
                externalApplication = _SINGLETON_VALUE_ExternalApplication.value();
            }
            return new SourceClockodo(
                apiKey,
                emailAddress,
                externalApplication,
                startDate,
                years);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_ExternalApplication =
                new LazySingletonValue<>(
                        "external_application",
                        "\"Airbyte\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Clockodo> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"clockodo\"",
                        new TypeReference<Clockodo>() {});
    }
}
