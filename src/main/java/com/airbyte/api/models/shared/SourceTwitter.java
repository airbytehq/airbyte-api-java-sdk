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


public class SourceTwitter {

    /**
     * App only Bearer Token. See the &lt;a href="https://developer.twitter.com/en/docs/authentication/oauth-2-0/bearer-tokens"&gt;docs&lt;/a&gt; for more information on how to obtain this token.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * The end date for retrieving tweets must be a minimum of 10 seconds prior to the request time.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<OffsetDateTime> endDate;

    /**
     * Query for matching Tweets. You can learn how to build this query by reading &lt;a href="https://developer.twitter.com/en/docs/twitter-api/tweets/search/integrate/build-a-query"&gt; build a query guide &lt;/a&gt;.
     */
    @JsonProperty("query")
    private String query;

    @JsonProperty("sourceType")
    private Twitter sourceType;

    /**
     * The start date for retrieving tweets cannot be more than 7 days in the past.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<OffsetDateTime> startDate;

    @JsonCreator
    public SourceTwitter(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("end_date") Optional<OffsetDateTime> endDate,
            @JsonProperty("query") String query,
            @JsonProperty("start_date") Optional<OffsetDateTime> startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.endDate = endDate;
        this.query = query;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceTwitter(
            String apiKey,
            String query) {
        this(apiKey, Optional.empty(), query, Optional.empty());
    }

    /**
     * App only Bearer Token. See the &lt;a href="https://developer.twitter.com/en/docs/authentication/oauth-2-0/bearer-tokens"&gt;docs&lt;/a&gt; for more information on how to obtain this token.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * The end date for retrieving tweets must be a minimum of 10 seconds prior to the request time.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> endDate() {
        return endDate;
    }

    /**
     * Query for matching Tweets. You can learn how to build this query by reading &lt;a href="https://developer.twitter.com/en/docs/twitter-api/tweets/search/integrate/build-a-query"&gt; build a query guide &lt;/a&gt;.
     */
    @JsonIgnore
    public String query() {
        return query;
    }

    @JsonIgnore
    public Twitter sourceType() {
        return sourceType;
    }

    /**
     * The start date for retrieving tweets cannot be more than 7 days in the past.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * App only Bearer Token. See the &lt;a href="https://developer.twitter.com/en/docs/authentication/oauth-2-0/bearer-tokens"&gt;docs&lt;/a&gt; for more information on how to obtain this token.
     */
    public SourceTwitter withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The end date for retrieving tweets must be a minimum of 10 seconds prior to the request time.
     */
    public SourceTwitter withEndDate(OffsetDateTime endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * The end date for retrieving tweets must be a minimum of 10 seconds prior to the request time.
     */
    public SourceTwitter withEndDate(Optional<OffsetDateTime> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Query for matching Tweets. You can learn how to build this query by reading &lt;a href="https://developer.twitter.com/en/docs/twitter-api/tweets/search/integrate/build-a-query"&gt; build a query guide &lt;/a&gt;.
     */
    public SourceTwitter withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    /**
     * The start date for retrieving tweets cannot be more than 7 days in the past.
     */
    public SourceTwitter withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The start date for retrieving tweets cannot be more than 7 days in the past.
     */
    public SourceTwitter withStartDate(Optional<OffsetDateTime> startDate) {
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
        SourceTwitter other = (SourceTwitter) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.query, other.query) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            endDate,
            query,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTwitter.class,
                "apiKey", apiKey,
                "endDate", endDate,
                "query", query,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<OffsetDateTime> endDate = Optional.empty();
 
        private String query;
 
        private Optional<OffsetDateTime> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * App only Bearer Token. See the &lt;a href="https://developer.twitter.com/en/docs/authentication/oauth-2-0/bearer-tokens"&gt;docs&lt;/a&gt; for more information on how to obtain this token.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The end date for retrieving tweets must be a minimum of 10 seconds prior to the request time.
         */
        public Builder endDate(OffsetDateTime endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * The end date for retrieving tweets must be a minimum of 10 seconds prior to the request time.
         */
        public Builder endDate(Optional<OffsetDateTime> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * Query for matching Tweets. You can learn how to build this query by reading &lt;a href="https://developer.twitter.com/en/docs/twitter-api/tweets/search/integrate/build-a-query"&gt; build a query guide &lt;/a&gt;.
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }

        /**
         * The start date for retrieving tweets cannot be more than 7 days in the past.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The start date for retrieving tweets cannot be more than 7 days in the past.
         */
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceTwitter build() {
            return new SourceTwitter(
                apiKey,
                endDate,
                query,
                startDate);
        }

        private static final LazySingletonValue<Twitter> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"twitter\"",
                        new TypeReference<Twitter>() {});
    }
}

