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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SourceSurveySparrow {

    /**
     * Your access token. See &lt;a href="https://developers.surveysparrow.com/rest-apis#authentication"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * Is your account location is EU based? If yes, the base url to retrieve data will be different.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<? extends BaseURL> region;

    @JsonProperty("sourceType")
    private SurveySparrow sourceType;

    /**
     * A List of your survey ids for survey-specific stream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_id")
    private Optional<? extends List<Object>> surveyId;

    @JsonCreator
    public SourceSurveySparrow(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("region") Optional<? extends BaseURL> region,
            @JsonProperty("survey_id") Optional<? extends List<Object>> surveyId) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(surveyId, "surveyId");
        this.accessToken = accessToken;
        this.region = region;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.surveyId = surveyId;
    }
    
    public SourceSurveySparrow(
            String accessToken) {
        this(accessToken, Optional.empty(), Optional.empty());
    }

    /**
     * Your access token. See &lt;a href="https://developers.surveysparrow.com/rest-apis#authentication"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    /**
     * Is your account location is EU based? If yes, the base url to retrieve data will be different.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BaseURL> region() {
        return (Optional<BaseURL>) region;
    }

    @JsonIgnore
    public SurveySparrow sourceType() {
        return sourceType;
    }

    /**
     * A List of your survey ids for survey-specific stream
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Object>> surveyId() {
        return (Optional<List<Object>>) surveyId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your access token. See &lt;a href="https://developers.surveysparrow.com/rest-apis#authentication"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    public SourceSurveySparrow withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Is your account location is EU based? If yes, the base url to retrieve data will be different.
     */
    public SourceSurveySparrow withRegion(BaseURL region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    /**
     * Is your account location is EU based? If yes, the base url to retrieve data will be different.
     */
    public SourceSurveySparrow withRegion(Optional<? extends BaseURL> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * A List of your survey ids for survey-specific stream
     */
    public SourceSurveySparrow withSurveyId(List<Object> surveyId) {
        Utils.checkNotNull(surveyId, "surveyId");
        this.surveyId = Optional.ofNullable(surveyId);
        return this;
    }

    /**
     * A List of your survey ids for survey-specific stream
     */
    public SourceSurveySparrow withSurveyId(Optional<? extends List<Object>> surveyId) {
        Utils.checkNotNull(surveyId, "surveyId");
        this.surveyId = surveyId;
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
        SourceSurveySparrow other = (SourceSurveySparrow) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.surveyId, other.surveyId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            region,
            sourceType,
            surveyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSurveySparrow.class,
                "accessToken", accessToken,
                "region", region,
                "sourceType", sourceType,
                "surveyId", surveyId);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private Optional<? extends BaseURL> region = Optional.empty();
 
        private Optional<? extends List<Object>> surveyId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your access token. See &lt;a href="https://developers.surveysparrow.com/rest-apis#authentication"&gt;here&lt;/a&gt;. The key is case sensitive.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Is your account location is EU based? If yes, the base url to retrieve data will be different.
         */
        public Builder region(BaseURL region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        /**
         * Is your account location is EU based? If yes, the base url to retrieve data will be different.
         */
        public Builder region(Optional<? extends BaseURL> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        /**
         * A List of your survey ids for survey-specific stream
         */
        public Builder surveyId(List<Object> surveyId) {
            Utils.checkNotNull(surveyId, "surveyId");
            this.surveyId = Optional.ofNullable(surveyId);
            return this;
        }

        /**
         * A List of your survey ids for survey-specific stream
         */
        public Builder surveyId(Optional<? extends List<Object>> surveyId) {
            Utils.checkNotNull(surveyId, "surveyId");
            this.surveyId = surveyId;
            return this;
        }
        
        public SourceSurveySparrow build() {
            return new SourceSurveySparrow(
                accessToken,
                region,
                surveyId);
        }

        private static final LazySingletonValue<SurveySparrow> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"survey-sparrow\"",
                        new TypeReference<SurveySparrow>() {});
    }
}
