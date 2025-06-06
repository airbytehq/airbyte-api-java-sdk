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

public class SourceHeight {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Search query to be used with search stream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_query")
    private Optional<String> searchQuery;

    @JsonProperty("sourceType")
    private Height sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceHeight(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("search_query") Optional<String> searchQuery,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(searchQuery, "searchQuery");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.searchQuery = searchQuery;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceHeight(
            String apiKey,
            OffsetDateTime startDate) {
        this(apiKey, Optional.empty(), startDate);
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Search query to be used with search stream
     */
    @JsonIgnore
    public Optional<String> searchQuery() {
        return searchQuery;
    }

    @JsonIgnore
    public Height sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceHeight withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Search query to be used with search stream
     */
    public SourceHeight withSearchQuery(String searchQuery) {
        Utils.checkNotNull(searchQuery, "searchQuery");
        this.searchQuery = Optional.ofNullable(searchQuery);
        return this;
    }

    /**
     * Search query to be used with search stream
     */
    public SourceHeight withSearchQuery(Optional<String> searchQuery) {
        Utils.checkNotNull(searchQuery, "searchQuery");
        this.searchQuery = searchQuery;
        return this;
    }

    public SourceHeight withStartDate(OffsetDateTime startDate) {
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
        SourceHeight other = (SourceHeight) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.searchQuery, other.searchQuery) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            searchQuery,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceHeight.class,
                "apiKey", apiKey,
                "searchQuery", searchQuery,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> searchQuery;
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Search query to be used with search stream
         */
        public Builder searchQuery(String searchQuery) {
            Utils.checkNotNull(searchQuery, "searchQuery");
            this.searchQuery = Optional.ofNullable(searchQuery);
            return this;
        }

        /**
         * Search query to be used with search stream
         */
        public Builder searchQuery(Optional<String> searchQuery) {
            Utils.checkNotNull(searchQuery, "searchQuery");
            this.searchQuery = searchQuery;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceHeight build() {
            if (searchQuery == null) {
                searchQuery = _SINGLETON_VALUE_SearchQuery.value();
            }
            return new SourceHeight(
                apiKey,
                searchQuery,
                startDate);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_SearchQuery =
                new LazySingletonValue<>(
                        "search_query",
                        "\"task\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Height> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"height\"",
                        new TypeReference<Height>() {});
    }
}
