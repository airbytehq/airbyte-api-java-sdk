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

public class SourceGiphy {

    /**
     * Your GIPHY API Key. You can create and find your API key in the GIPHY Developer Dashboard at https://developers.giphy.com/dashboard/.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * A query for search endpoint
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query")
    private Optional<String> query;

    /**
     * Query for clips search endpoint
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query_for_clips")
    private Optional<String> queryForClips;

    /**
     * Query for gif search endpoint
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query_for_gif")
    private Optional<String> queryForGif;

    /**
     * Query for stickers search endpoint
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query_for_stickers")
    private Optional<String> queryForStickers;

    @JsonProperty("sourceType")
    private Giphy sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceGiphy(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("query") Optional<String> query,
            @JsonProperty("query_for_clips") Optional<String> queryForClips,
            @JsonProperty("query_for_gif") Optional<String> queryForGif,
            @JsonProperty("query_for_stickers") Optional<String> queryForStickers,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(queryForClips, "queryForClips");
        Utils.checkNotNull(queryForGif, "queryForGif");
        Utils.checkNotNull(queryForStickers, "queryForStickers");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.query = query;
        this.queryForClips = queryForClips;
        this.queryForGif = queryForGif;
        this.queryForStickers = queryForStickers;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceGiphy(
            String apiKey,
            OffsetDateTime startDate) {
        this(apiKey, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), startDate);
    }

    /**
     * Your GIPHY API Key. You can create and find your API key in the GIPHY Developer Dashboard at https://developers.giphy.com/dashboard/.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * A query for search endpoint
     */
    @JsonIgnore
    public Optional<String> query() {
        return query;
    }

    /**
     * Query for clips search endpoint
     */
    @JsonIgnore
    public Optional<String> queryForClips() {
        return queryForClips;
    }

    /**
     * Query for gif search endpoint
     */
    @JsonIgnore
    public Optional<String> queryForGif() {
        return queryForGif;
    }

    /**
     * Query for stickers search endpoint
     */
    @JsonIgnore
    public Optional<String> queryForStickers() {
        return queryForStickers;
    }

    @JsonIgnore
    public Giphy sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your GIPHY API Key. You can create and find your API key in the GIPHY Developer Dashboard at https://developers.giphy.com/dashboard/.
     */
    public SourceGiphy withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * A query for search endpoint
     */
    public SourceGiphy withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * A query for search endpoint
     */
    public SourceGiphy withQuery(Optional<String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    /**
     * Query for clips search endpoint
     */
    public SourceGiphy withQueryForClips(String queryForClips) {
        Utils.checkNotNull(queryForClips, "queryForClips");
        this.queryForClips = Optional.ofNullable(queryForClips);
        return this;
    }

    /**
     * Query for clips search endpoint
     */
    public SourceGiphy withQueryForClips(Optional<String> queryForClips) {
        Utils.checkNotNull(queryForClips, "queryForClips");
        this.queryForClips = queryForClips;
        return this;
    }

    /**
     * Query for gif search endpoint
     */
    public SourceGiphy withQueryForGif(String queryForGif) {
        Utils.checkNotNull(queryForGif, "queryForGif");
        this.queryForGif = Optional.ofNullable(queryForGif);
        return this;
    }

    /**
     * Query for gif search endpoint
     */
    public SourceGiphy withQueryForGif(Optional<String> queryForGif) {
        Utils.checkNotNull(queryForGif, "queryForGif");
        this.queryForGif = queryForGif;
        return this;
    }

    /**
     * Query for stickers search endpoint
     */
    public SourceGiphy withQueryForStickers(String queryForStickers) {
        Utils.checkNotNull(queryForStickers, "queryForStickers");
        this.queryForStickers = Optional.ofNullable(queryForStickers);
        return this;
    }

    /**
     * Query for stickers search endpoint
     */
    public SourceGiphy withQueryForStickers(Optional<String> queryForStickers) {
        Utils.checkNotNull(queryForStickers, "queryForStickers");
        this.queryForStickers = queryForStickers;
        return this;
    }

    public SourceGiphy withStartDate(OffsetDateTime startDate) {
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
        SourceGiphy other = (SourceGiphy) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.query, other.query) &&
            Objects.deepEquals(this.queryForClips, other.queryForClips) &&
            Objects.deepEquals(this.queryForGif, other.queryForGif) &&
            Objects.deepEquals(this.queryForStickers, other.queryForStickers) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            query,
            queryForClips,
            queryForGif,
            queryForStickers,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGiphy.class,
                "apiKey", apiKey,
                "query", query,
                "queryForClips", queryForClips,
                "queryForGif", queryForGif,
                "queryForStickers", queryForStickers,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> query;
 
        private Optional<String> queryForClips;
 
        private Optional<String> queryForGif;
 
        private Optional<String> queryForStickers;
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your GIPHY API Key. You can create and find your API key in the GIPHY Developer Dashboard at https://developers.giphy.com/dashboard/.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * A query for search endpoint
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * A query for search endpoint
         */
        public Builder query(Optional<String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }

        /**
         * Query for clips search endpoint
         */
        public Builder queryForClips(String queryForClips) {
            Utils.checkNotNull(queryForClips, "queryForClips");
            this.queryForClips = Optional.ofNullable(queryForClips);
            return this;
        }

        /**
         * Query for clips search endpoint
         */
        public Builder queryForClips(Optional<String> queryForClips) {
            Utils.checkNotNull(queryForClips, "queryForClips");
            this.queryForClips = queryForClips;
            return this;
        }

        /**
         * Query for gif search endpoint
         */
        public Builder queryForGif(String queryForGif) {
            Utils.checkNotNull(queryForGif, "queryForGif");
            this.queryForGif = Optional.ofNullable(queryForGif);
            return this;
        }

        /**
         * Query for gif search endpoint
         */
        public Builder queryForGif(Optional<String> queryForGif) {
            Utils.checkNotNull(queryForGif, "queryForGif");
            this.queryForGif = queryForGif;
            return this;
        }

        /**
         * Query for stickers search endpoint
         */
        public Builder queryForStickers(String queryForStickers) {
            Utils.checkNotNull(queryForStickers, "queryForStickers");
            this.queryForStickers = Optional.ofNullable(queryForStickers);
            return this;
        }

        /**
         * Query for stickers search endpoint
         */
        public Builder queryForStickers(Optional<String> queryForStickers) {
            Utils.checkNotNull(queryForStickers, "queryForStickers");
            this.queryForStickers = queryForStickers;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceGiphy build() {
            if (query == null) {
                query = _SINGLETON_VALUE_Query.value();
            }
            if (queryForClips == null) {
                queryForClips = _SINGLETON_VALUE_QueryForClips.value();
            }
            if (queryForGif == null) {
                queryForGif = _SINGLETON_VALUE_QueryForGif.value();
            }
            if (queryForStickers == null) {
                queryForStickers = _SINGLETON_VALUE_QueryForStickers.value();
            }
            return new SourceGiphy(
                apiKey,
                query,
                queryForClips,
                queryForGif,
                queryForStickers,
                startDate);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Query =
                new LazySingletonValue<>(
                        "query",
                        "\"foo\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_QueryForClips =
                new LazySingletonValue<>(
                        "query_for_clips",
                        "\"foo\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_QueryForGif =
                new LazySingletonValue<>(
                        "query_for_gif",
                        "\"foo\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_QueryForStickers =
                new LazySingletonValue<>(
                        "query_for_stickers",
                        "\"foo\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Giphy> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"giphy\"",
                        new TypeReference<Giphy>() {});
    }
}
