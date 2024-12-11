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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class SourceQualaroo {

    /**
     * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonProperty("key")
    private String key;

    @JsonProperty("sourceType")
    private Qualaroo sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all surveys to which you have access will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_ids")
    private Optional<? extends List<String>> surveyIds;

    /**
     * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonProperty("token")
    private String token;

    @JsonCreator
    public SourceQualaroo(
            @JsonProperty("key") String key,
            @JsonProperty("start_date") String startDate,
            @JsonProperty("survey_ids") Optional<? extends List<String>> surveyIds,
            @JsonProperty("token") String token) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(surveyIds, "surveyIds");
        Utils.checkNotNull(token, "token");
        this.key = key;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.surveyIds = surveyIds;
        this.token = token;
    }
    
    public SourceQualaroo(
            String key,
            String startDate,
            String token) {
        this(key, startDate, Optional.empty(), token);
    }

    /**
     * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonIgnore
    public String key() {
        return key;
    }

    @JsonIgnore
    public Qualaroo sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonIgnore
    public String startDate() {
        return startDate;
    }

    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all surveys to which you have access will be replicated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> surveyIds() {
        return (Optional<List<String>>) surveyIds;
    }

    /**
     * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonIgnore
    public String token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    public SourceQualaroo withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public SourceQualaroo withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all surveys to which you have access will be replicated.
     */
    public SourceQualaroo withSurveyIds(List<String> surveyIds) {
        Utils.checkNotNull(surveyIds, "surveyIds");
        this.surveyIds = Optional.ofNullable(surveyIds);
        return this;
    }

    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all surveys to which you have access will be replicated.
     */
    public SourceQualaroo withSurveyIds(Optional<? extends List<String>> surveyIds) {
        Utils.checkNotNull(surveyIds, "surveyIds");
        this.surveyIds = surveyIds;
        return this;
    }

    /**
     * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    public SourceQualaroo withToken(String token) {
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
        SourceQualaroo other = (SourceQualaroo) o;
        return 
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.surveyIds, other.surveyIds) &&
            Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key,
            sourceType,
            startDate,
            surveyIds,
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceQualaroo.class,
                "key", key,
                "sourceType", sourceType,
                "startDate", startDate,
                "surveyIds", surveyIds,
                "token", token);
    }
    
    public final static class Builder {
 
        private String key;
 
        private String startDate;
 
        private Optional<? extends List<String>> surveyIds = Optional.empty();
 
        private String token;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * IDs of the surveys from which you'd like to replicate data. If left empty, data from all surveys to which you have access will be replicated.
         */
        public Builder surveyIds(List<String> surveyIds) {
            Utils.checkNotNull(surveyIds, "surveyIds");
            this.surveyIds = Optional.ofNullable(surveyIds);
            return this;
        }

        /**
         * IDs of the surveys from which you'd like to replicate data. If left empty, data from all surveys to which you have access will be replicated.
         */
        public Builder surveyIds(Optional<? extends List<String>> surveyIds) {
            Utils.checkNotNull(surveyIds, "surveyIds");
            this.surveyIds = surveyIds;
            return this;
        }

        /**
         * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public SourceQualaroo build() {
            return new SourceQualaroo(
                key,
                startDate,
                surveyIds,
                token);
        }

        private static final LazySingletonValue<Qualaroo> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"qualaroo\"",
                        new TypeReference<Qualaroo>() {});
    }
}

