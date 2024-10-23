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

public class SourceAlgolia {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * The application ID for your application found in settings
     */
    @JsonProperty("application_id")
    private String applicationId;

    /**
     * Object ID within index for search queries
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_id")
    private Optional<? extends String> objectId;

    /**
     * Search query to be used with indexes_query stream with format defined in `https://www.algolia.com/doc/rest-api/search/#tag/Search/operation/searchSingleIndex`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_query")
    private Optional<? extends String> searchQuery;

    @JsonProperty("sourceType")
    private Algolia sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceAlgolia(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("application_id") String applicationId,
            @JsonProperty("object_id") Optional<? extends String> objectId,
            @JsonProperty("search_query") Optional<? extends String> searchQuery,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(applicationId, "applicationId");
        Utils.checkNotNull(objectId, "objectId");
        Utils.checkNotNull(searchQuery, "searchQuery");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.applicationId = applicationId;
        this.objectId = objectId;
        this.searchQuery = searchQuery;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceAlgolia(
            String apiKey,
            String applicationId,
            OffsetDateTime startDate) {
        this(apiKey, applicationId, Optional.empty(), Optional.empty(), startDate);
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * The application ID for your application found in settings
     */
    @JsonIgnore
    public String applicationId() {
        return applicationId;
    }

    /**
     * Object ID within index for search queries
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> objectId() {
        return (Optional<String>) objectId;
    }

    /**
     * Search query to be used with indexes_query stream with format defined in `https://www.algolia.com/doc/rest-api/search/#tag/Search/operation/searchSingleIndex`
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> searchQuery() {
        return (Optional<String>) searchQuery;
    }

    @JsonIgnore
    public Algolia sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceAlgolia withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The application ID for your application found in settings
     */
    public SourceAlgolia withApplicationId(String applicationId) {
        Utils.checkNotNull(applicationId, "applicationId");
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Object ID within index for search queries
     */
    public SourceAlgolia withObjectId(String objectId) {
        Utils.checkNotNull(objectId, "objectId");
        this.objectId = Optional.ofNullable(objectId);
        return this;
    }

    /**
     * Object ID within index for search queries
     */
    public SourceAlgolia withObjectId(Optional<? extends String> objectId) {
        Utils.checkNotNull(objectId, "objectId");
        this.objectId = objectId;
        return this;
    }

    /**
     * Search query to be used with indexes_query stream with format defined in `https://www.algolia.com/doc/rest-api/search/#tag/Search/operation/searchSingleIndex`
     */
    public SourceAlgolia withSearchQuery(String searchQuery) {
        Utils.checkNotNull(searchQuery, "searchQuery");
        this.searchQuery = Optional.ofNullable(searchQuery);
        return this;
    }

    /**
     * Search query to be used with indexes_query stream with format defined in `https://www.algolia.com/doc/rest-api/search/#tag/Search/operation/searchSingleIndex`
     */
    public SourceAlgolia withSearchQuery(Optional<? extends String> searchQuery) {
        Utils.checkNotNull(searchQuery, "searchQuery");
        this.searchQuery = searchQuery;
        return this;
    }

    public SourceAlgolia withStartDate(OffsetDateTime startDate) {
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
        SourceAlgolia other = (SourceAlgolia) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.applicationId, other.applicationId) &&
            java.util.Objects.deepEquals(this.objectId, other.objectId) &&
            java.util.Objects.deepEquals(this.searchQuery, other.searchQuery) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            applicationId,
            objectId,
            searchQuery,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAlgolia.class,
                "apiKey", apiKey,
                "applicationId", applicationId,
                "objectId", objectId,
                "searchQuery", searchQuery,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String applicationId;
 
        private Optional<? extends String> objectId;
 
        private Optional<? extends String> searchQuery;
 
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
         * The application ID for your application found in settings
         */
        public Builder applicationId(String applicationId) {
            Utils.checkNotNull(applicationId, "applicationId");
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Object ID within index for search queries
         */
        public Builder objectId(String objectId) {
            Utils.checkNotNull(objectId, "objectId");
            this.objectId = Optional.ofNullable(objectId);
            return this;
        }

        /**
         * Object ID within index for search queries
         */
        public Builder objectId(Optional<? extends String> objectId) {
            Utils.checkNotNull(objectId, "objectId");
            this.objectId = objectId;
            return this;
        }

        /**
         * Search query to be used with indexes_query stream with format defined in `https://www.algolia.com/doc/rest-api/search/#tag/Search/operation/searchSingleIndex`
         */
        public Builder searchQuery(String searchQuery) {
            Utils.checkNotNull(searchQuery, "searchQuery");
            this.searchQuery = Optional.ofNullable(searchQuery);
            return this;
        }

        /**
         * Search query to be used with indexes_query stream with format defined in `https://www.algolia.com/doc/rest-api/search/#tag/Search/operation/searchSingleIndex`
         */
        public Builder searchQuery(Optional<? extends String> searchQuery) {
            Utils.checkNotNull(searchQuery, "searchQuery");
            this.searchQuery = searchQuery;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceAlgolia build() {
            if (objectId == null) {
                objectId = _SINGLETON_VALUE_ObjectId.value();
            }
            if (searchQuery == null) {
                searchQuery = _SINGLETON_VALUE_SearchQuery.value();
            }
            return new SourceAlgolia(
                apiKey,
                applicationId,
                objectId,
                searchQuery,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_ObjectId =
                new LazySingletonValue<>(
                        "object_id",
                        "\"ecommerce-sample-data-9999996\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_SearchQuery =
                new LazySingletonValue<>(
                        "search_query",
                        "\"hitsPerPage=2&getRankingInfo=1\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Algolia> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"algolia\"",
                        new TypeReference<Algolia>() {});
    }
}
