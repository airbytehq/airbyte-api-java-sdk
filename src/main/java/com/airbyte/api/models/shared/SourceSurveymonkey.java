/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
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


public class SourceSurveymonkey {

    /**
     * The authorization method to use to retrieve data from SurveyMonkey
     */
    @JsonProperty("credentials")
    private SurveyMonkeyAuthorizationMethod credentials;

    /**
     * Depending on the originating datacenter of the SurveyMonkey account, the API access URL may be different.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("origin")
    private Optional<? extends OriginDatacenterOfTheSurveyMonkeyAccount> origin;

    @JsonProperty("sourceType")
    private SourceSurveymonkeySurveymonkey sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all boards to which you have access will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_ids")
    private Optional<? extends java.util.List<String>> surveyIds;

    public SourceSurveymonkey(
            @JsonProperty("credentials") SurveyMonkeyAuthorizationMethod credentials,
            @JsonProperty("origin") Optional<? extends OriginDatacenterOfTheSurveyMonkeyAccount> origin,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("survey_ids") Optional<? extends java.util.List<String>> surveyIds) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(origin, "origin");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(surveyIds, "surveyIds");
        this.credentials = credentials;
        this.origin = origin;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.surveyIds = surveyIds;
    }

    /**
     * The authorization method to use to retrieve data from SurveyMonkey
     */
    public SurveyMonkeyAuthorizationMethod credentials() {
        return credentials;
    }

    /**
     * Depending on the originating datacenter of the SurveyMonkey account, the API access URL may be different.
     */
    public Optional<? extends OriginDatacenterOfTheSurveyMonkeyAccount> origin() {
        return origin;
    }

    public SourceSurveymonkeySurveymonkey sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all boards to which you have access will be replicated.
     */
    public Optional<? extends java.util.List<String>> surveyIds() {
        return surveyIds;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The authorization method to use to retrieve data from SurveyMonkey
     */
    public SourceSurveymonkey withCredentials(SurveyMonkeyAuthorizationMethod credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Depending on the originating datacenter of the SurveyMonkey account, the API access URL may be different.
     */
    public SourceSurveymonkey withOrigin(OriginDatacenterOfTheSurveyMonkeyAccount origin) {
        Utils.checkNotNull(origin, "origin");
        this.origin = Optional.ofNullable(origin);
        return this;
    }

    /**
     * Depending on the originating datacenter of the SurveyMonkey account, the API access URL may be different.
     */
    public SourceSurveymonkey withOrigin(Optional<? extends OriginDatacenterOfTheSurveyMonkeyAccount> origin) {
        Utils.checkNotNull(origin, "origin");
        this.origin = origin;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public SourceSurveymonkey withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all boards to which you have access will be replicated.
     */
    public SourceSurveymonkey withSurveyIds(java.util.List<String> surveyIds) {
        Utils.checkNotNull(surveyIds, "surveyIds");
        this.surveyIds = Optional.ofNullable(surveyIds);
        return this;
    }

    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all boards to which you have access will be replicated.
     */
    public SourceSurveymonkey withSurveyIds(Optional<? extends java.util.List<String>> surveyIds) {
        Utils.checkNotNull(surveyIds, "surveyIds");
        this.surveyIds = surveyIds;
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
        SourceSurveymonkey other = (SourceSurveymonkey) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.origin, other.origin) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.surveyIds, other.surveyIds);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials,
            origin,
            sourceType,
            startDate,
            surveyIds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSurveymonkey.class,
                "credentials", credentials,
                "origin", origin,
                "sourceType", sourceType,
                "startDate", startDate,
                "surveyIds", surveyIds);
    }
    
    public final static class Builder {
 
        private SurveyMonkeyAuthorizationMethod credentials;
 
        private Optional<? extends OriginDatacenterOfTheSurveyMonkeyAccount> origin;
 
        private OffsetDateTime startDate;
 
        private Optional<? extends java.util.List<String>> surveyIds = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The authorization method to use to retrieve data from SurveyMonkey
         */
        public Builder credentials(SurveyMonkeyAuthorizationMethod credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Depending on the originating datacenter of the SurveyMonkey account, the API access URL may be different.
         */
        public Builder origin(OriginDatacenterOfTheSurveyMonkeyAccount origin) {
            Utils.checkNotNull(origin, "origin");
            this.origin = Optional.ofNullable(origin);
            return this;
        }

        /**
         * Depending on the originating datacenter of the SurveyMonkey account, the API access URL may be different.
         */
        public Builder origin(Optional<? extends OriginDatacenterOfTheSurveyMonkeyAccount> origin) {
            Utils.checkNotNull(origin, "origin");
            this.origin = origin;
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

        /**
         * IDs of the surveys from which you'd like to replicate data. If left empty, data from all boards to which you have access will be replicated.
         */
        public Builder surveyIds(java.util.List<String> surveyIds) {
            Utils.checkNotNull(surveyIds, "surveyIds");
            this.surveyIds = Optional.ofNullable(surveyIds);
            return this;
        }

        /**
         * IDs of the surveys from which you'd like to replicate data. If left empty, data from all boards to which you have access will be replicated.
         */
        public Builder surveyIds(Optional<? extends java.util.List<String>> surveyIds) {
            Utils.checkNotNull(surveyIds, "surveyIds");
            this.surveyIds = surveyIds;
            return this;
        }
        
        public SourceSurveymonkey build() {
            if (origin == null) {
                origin = _SINGLETON_VALUE_Origin.value();
            }
            return new SourceSurveymonkey(
                credentials,
                origin,
                startDate,
                surveyIds);
        }

        private static final LazySingletonValue<Optional<? extends OriginDatacenterOfTheSurveyMonkeyAccount>> _SINGLETON_VALUE_Origin =
                new LazySingletonValue<>(
                        "origin",
                        "\"USA\"",
                        new TypeReference<Optional<? extends OriginDatacenterOfTheSurveyMonkeyAccount>>() {});

        private static final LazySingletonValue<SourceSurveymonkeySurveymonkey> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"surveymonkey\"",
                        new TypeReference<SourceSurveymonkeySurveymonkey>() {});
    }
}

