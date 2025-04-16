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

public class SourceNewsApi {

    /**
     * API Key
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * The category you want to get top headlines for.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("category")
    private Optional<? extends Category> category;

    /**
     * The 2-letter ISO 3166-1 code of the country you want to get headlines
     * for. You can't mix this with the sources parameter.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<? extends Country> country;

    /**
     * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
     * engadget.com) to restrict the search to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domains")
    private Optional<? extends List<String>> domains;

    /**
     * A date and optional time for the newest article allowed. This should
     * be in ISO 8601 format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<String> endDate;

    /**
     * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
     * engadget.com) to remove from the results.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exclude_domains")
    private Optional<? extends List<String>> excludeDomains;

    /**
     * The 2-letter ISO-639-1 code of the language you want to get headlines
     * for. Possible options: ar de en es fr he it nl no pt ru se ud zh.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    private Optional<? extends Language> language;

    /**
     * Where to apply search query. Possible values are: title, description,
     * content.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_in")
    private Optional<? extends List<SearchIn>> searchIn;

    /**
     * Search query. See https://newsapi.org/docs/endpoints/everything for 
     * information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_query")
    private Optional<String> searchQuery;

    /**
     * The order to sort the articles in. Possible options: relevancy,
     * popularity, publishedAt.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort_by")
    private Optional<? extends SortBy> sortBy;

    @JsonProperty("sourceType")
    private NewsApi sourceType;

    /**
     * Identifiers (maximum 20) for the news sources or blogs you want
     * headlines from. Use the `/sources` endpoint to locate these
     * programmatically or look at the sources index:
     * https://newsapi.com/sources. Will override both country and category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sources")
    private Optional<? extends List<String>> sources;

    /**
     * A date and optional time for the oldest article allowed. This should
     * be in ISO 8601 format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<String> startDate;

    @JsonCreator
    public SourceNewsApi(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("category") Optional<? extends Category> category,
            @JsonProperty("country") Optional<? extends Country> country,
            @JsonProperty("domains") Optional<? extends List<String>> domains,
            @JsonProperty("end_date") Optional<String> endDate,
            @JsonProperty("exclude_domains") Optional<? extends List<String>> excludeDomains,
            @JsonProperty("language") Optional<? extends Language> language,
            @JsonProperty("search_in") Optional<? extends List<SearchIn>> searchIn,
            @JsonProperty("search_query") Optional<String> searchQuery,
            @JsonProperty("sort_by") Optional<? extends SortBy> sortBy,
            @JsonProperty("sources") Optional<? extends List<String>> sources,
            @JsonProperty("start_date") Optional<String> startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(category, "category");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(domains, "domains");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(excludeDomains, "excludeDomains");
        Utils.checkNotNull(language, "language");
        Utils.checkNotNull(searchIn, "searchIn");
        Utils.checkNotNull(searchQuery, "searchQuery");
        Utils.checkNotNull(sortBy, "sortBy");
        Utils.checkNotNull(sources, "sources");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.category = category;
        this.country = country;
        this.domains = domains;
        this.endDate = endDate;
        this.excludeDomains = excludeDomains;
        this.language = language;
        this.searchIn = searchIn;
        this.searchQuery = searchQuery;
        this.sortBy = sortBy;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.sources = sources;
        this.startDate = startDate;
    }
    
    public SourceNewsApi(
            String apiKey) {
        this(apiKey, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * API Key
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * The category you want to get top headlines for.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Category> category() {
        return (Optional<Category>) category;
    }

    /**
     * The 2-letter ISO 3166-1 code of the country you want to get headlines
     * for. You can't mix this with the sources parameter.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Country> country() {
        return (Optional<Country>) country;
    }

    /**
     * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
     * engadget.com) to restrict the search to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> domains() {
        return (Optional<List<String>>) domains;
    }

    /**
     * A date and optional time for the newest article allowed. This should
     * be in ISO 8601 format.
     */
    @JsonIgnore
    public Optional<String> endDate() {
        return endDate;
    }

    /**
     * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
     * engadget.com) to remove from the results.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> excludeDomains() {
        return (Optional<List<String>>) excludeDomains;
    }

    /**
     * The 2-letter ISO-639-1 code of the language you want to get headlines
     * for. Possible options: ar de en es fr he it nl no pt ru se ud zh.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Language> language() {
        return (Optional<Language>) language;
    }

    /**
     * Where to apply search query. Possible values are: title, description,
     * content.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SearchIn>> searchIn() {
        return (Optional<List<SearchIn>>) searchIn;
    }

    /**
     * Search query. See https://newsapi.org/docs/endpoints/everything for 
     * information.
     */
    @JsonIgnore
    public Optional<String> searchQuery() {
        return searchQuery;
    }

    /**
     * The order to sort the articles in. Possible options: relevancy,
     * popularity, publishedAt.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SortBy> sortBy() {
        return (Optional<SortBy>) sortBy;
    }

    @JsonIgnore
    public NewsApi sourceType() {
        return sourceType;
    }

    /**
     * Identifiers (maximum 20) for the news sources or blogs you want
     * headlines from. Use the `/sources` endpoint to locate these
     * programmatically or look at the sources index:
     * https://newsapi.com/sources. Will override both country and category.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> sources() {
        return (Optional<List<String>>) sources;
    }

    /**
     * A date and optional time for the oldest article allowed. This should
     * be in ISO 8601 format.
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * API Key
     */
    public SourceNewsApi withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The category you want to get top headlines for.
     */
    public SourceNewsApi withCategory(Category category) {
        Utils.checkNotNull(category, "category");
        this.category = Optional.ofNullable(category);
        return this;
    }

    /**
     * The category you want to get top headlines for.
     */
    public SourceNewsApi withCategory(Optional<? extends Category> category) {
        Utils.checkNotNull(category, "category");
        this.category = category;
        return this;
    }

    /**
     * The 2-letter ISO 3166-1 code of the country you want to get headlines
     * for. You can't mix this with the sources parameter.
     */
    public SourceNewsApi withCountry(Country country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    /**
     * The 2-letter ISO 3166-1 code of the country you want to get headlines
     * for. You can't mix this with the sources parameter.
     */
    public SourceNewsApi withCountry(Optional<? extends Country> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
     * engadget.com) to restrict the search to.
     */
    public SourceNewsApi withDomains(List<String> domains) {
        Utils.checkNotNull(domains, "domains");
        this.domains = Optional.ofNullable(domains);
        return this;
    }

    /**
     * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
     * engadget.com) to restrict the search to.
     */
    public SourceNewsApi withDomains(Optional<? extends List<String>> domains) {
        Utils.checkNotNull(domains, "domains");
        this.domains = domains;
        return this;
    }

    /**
     * A date and optional time for the newest article allowed. This should
     * be in ISO 8601 format.
     */
    public SourceNewsApi withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * A date and optional time for the newest article allowed. This should
     * be in ISO 8601 format.
     */
    public SourceNewsApi withEndDate(Optional<String> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
     * engadget.com) to remove from the results.
     */
    public SourceNewsApi withExcludeDomains(List<String> excludeDomains) {
        Utils.checkNotNull(excludeDomains, "excludeDomains");
        this.excludeDomains = Optional.ofNullable(excludeDomains);
        return this;
    }

    /**
     * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
     * engadget.com) to remove from the results.
     */
    public SourceNewsApi withExcludeDomains(Optional<? extends List<String>> excludeDomains) {
        Utils.checkNotNull(excludeDomains, "excludeDomains");
        this.excludeDomains = excludeDomains;
        return this;
    }

    /**
     * The 2-letter ISO-639-1 code of the language you want to get headlines
     * for. Possible options: ar de en es fr he it nl no pt ru se ud zh.
     */
    public SourceNewsApi withLanguage(Language language) {
        Utils.checkNotNull(language, "language");
        this.language = Optional.ofNullable(language);
        return this;
    }

    /**
     * The 2-letter ISO-639-1 code of the language you want to get headlines
     * for. Possible options: ar de en es fr he it nl no pt ru se ud zh.
     */
    public SourceNewsApi withLanguage(Optional<? extends Language> language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
        return this;
    }

    /**
     * Where to apply search query. Possible values are: title, description,
     * content.
     */
    public SourceNewsApi withSearchIn(List<SearchIn> searchIn) {
        Utils.checkNotNull(searchIn, "searchIn");
        this.searchIn = Optional.ofNullable(searchIn);
        return this;
    }

    /**
     * Where to apply search query. Possible values are: title, description,
     * content.
     */
    public SourceNewsApi withSearchIn(Optional<? extends List<SearchIn>> searchIn) {
        Utils.checkNotNull(searchIn, "searchIn");
        this.searchIn = searchIn;
        return this;
    }

    /**
     * Search query. See https://newsapi.org/docs/endpoints/everything for 
     * information.
     */
    public SourceNewsApi withSearchQuery(String searchQuery) {
        Utils.checkNotNull(searchQuery, "searchQuery");
        this.searchQuery = Optional.ofNullable(searchQuery);
        return this;
    }

    /**
     * Search query. See https://newsapi.org/docs/endpoints/everything for 
     * information.
     */
    public SourceNewsApi withSearchQuery(Optional<String> searchQuery) {
        Utils.checkNotNull(searchQuery, "searchQuery");
        this.searchQuery = searchQuery;
        return this;
    }

    /**
     * The order to sort the articles in. Possible options: relevancy,
     * popularity, publishedAt.
     */
    public SourceNewsApi withSortBy(SortBy sortBy) {
        Utils.checkNotNull(sortBy, "sortBy");
        this.sortBy = Optional.ofNullable(sortBy);
        return this;
    }

    /**
     * The order to sort the articles in. Possible options: relevancy,
     * popularity, publishedAt.
     */
    public SourceNewsApi withSortBy(Optional<? extends SortBy> sortBy) {
        Utils.checkNotNull(sortBy, "sortBy");
        this.sortBy = sortBy;
        return this;
    }

    /**
     * Identifiers (maximum 20) for the news sources or blogs you want
     * headlines from. Use the `/sources` endpoint to locate these
     * programmatically or look at the sources index:
     * https://newsapi.com/sources. Will override both country and category.
     */
    public SourceNewsApi withSources(List<String> sources) {
        Utils.checkNotNull(sources, "sources");
        this.sources = Optional.ofNullable(sources);
        return this;
    }

    /**
     * Identifiers (maximum 20) for the news sources or blogs you want
     * headlines from. Use the `/sources` endpoint to locate these
     * programmatically or look at the sources index:
     * https://newsapi.com/sources. Will override both country and category.
     */
    public SourceNewsApi withSources(Optional<? extends List<String>> sources) {
        Utils.checkNotNull(sources, "sources");
        this.sources = sources;
        return this;
    }

    /**
     * A date and optional time for the oldest article allowed. This should
     * be in ISO 8601 format.
     */
    public SourceNewsApi withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * A date and optional time for the oldest article allowed. This should
     * be in ISO 8601 format.
     */
    public SourceNewsApi withStartDate(Optional<String> startDate) {
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
        SourceNewsApi other = (SourceNewsApi) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.category, other.category) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.domains, other.domains) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.excludeDomains, other.excludeDomains) &&
            Objects.deepEquals(this.language, other.language) &&
            Objects.deepEquals(this.searchIn, other.searchIn) &&
            Objects.deepEquals(this.searchQuery, other.searchQuery) &&
            Objects.deepEquals(this.sortBy, other.sortBy) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.sources, other.sources) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            category,
            country,
            domains,
            endDate,
            excludeDomains,
            language,
            searchIn,
            searchQuery,
            sortBy,
            sourceType,
            sources,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceNewsApi.class,
                "apiKey", apiKey,
                "category", category,
                "country", country,
                "domains", domains,
                "endDate", endDate,
                "excludeDomains", excludeDomains,
                "language", language,
                "searchIn", searchIn,
                "searchQuery", searchQuery,
                "sortBy", sortBy,
                "sourceType", sourceType,
                "sources", sources,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<? extends Category> category;
 
        private Optional<? extends Country> country;
 
        private Optional<? extends List<String>> domains = Optional.empty();
 
        private Optional<String> endDate = Optional.empty();
 
        private Optional<? extends List<String>> excludeDomains = Optional.empty();
 
        private Optional<? extends Language> language = Optional.empty();
 
        private Optional<? extends List<SearchIn>> searchIn = Optional.empty();
 
        private Optional<String> searchQuery = Optional.empty();
 
        private Optional<? extends SortBy> sortBy;
 
        private Optional<? extends List<String>> sources = Optional.empty();
 
        private Optional<String> startDate = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API Key
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The category you want to get top headlines for.
         */
        public Builder category(Category category) {
            Utils.checkNotNull(category, "category");
            this.category = Optional.ofNullable(category);
            return this;
        }

        /**
         * The category you want to get top headlines for.
         */
        public Builder category(Optional<? extends Category> category) {
            Utils.checkNotNull(category, "category");
            this.category = category;
            return this;
        }

        /**
         * The 2-letter ISO 3166-1 code of the country you want to get headlines
         * for. You can't mix this with the sources parameter.
         */
        public Builder country(Country country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        /**
         * The 2-letter ISO 3166-1 code of the country you want to get headlines
         * for. You can't mix this with the sources parameter.
         */
        public Builder country(Optional<? extends Country> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
         * engadget.com) to restrict the search to.
         */
        public Builder domains(List<String> domains) {
            Utils.checkNotNull(domains, "domains");
            this.domains = Optional.ofNullable(domains);
            return this;
        }

        /**
         * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
         * engadget.com) to restrict the search to.
         */
        public Builder domains(Optional<? extends List<String>> domains) {
            Utils.checkNotNull(domains, "domains");
            this.domains = domains;
            return this;
        }

        /**
         * A date and optional time for the newest article allowed. This should
         * be in ISO 8601 format.
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * A date and optional time for the newest article allowed. This should
         * be in ISO 8601 format.
         */
        public Builder endDate(Optional<String> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
         * engadget.com) to remove from the results.
         */
        public Builder excludeDomains(List<String> excludeDomains) {
            Utils.checkNotNull(excludeDomains, "excludeDomains");
            this.excludeDomains = Optional.ofNullable(excludeDomains);
            return this;
        }

        /**
         * A comma-seperated string of domains (eg bbc.co.uk, techcrunch.com,
         * engadget.com) to remove from the results.
         */
        public Builder excludeDomains(Optional<? extends List<String>> excludeDomains) {
            Utils.checkNotNull(excludeDomains, "excludeDomains");
            this.excludeDomains = excludeDomains;
            return this;
        }

        /**
         * The 2-letter ISO-639-1 code of the language you want to get headlines
         * for. Possible options: ar de en es fr he it nl no pt ru se ud zh.
         */
        public Builder language(Language language) {
            Utils.checkNotNull(language, "language");
            this.language = Optional.ofNullable(language);
            return this;
        }

        /**
         * The 2-letter ISO-639-1 code of the language you want to get headlines
         * for. Possible options: ar de en es fr he it nl no pt ru se ud zh.
         */
        public Builder language(Optional<? extends Language> language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }

        /**
         * Where to apply search query. Possible values are: title, description,
         * content.
         */
        public Builder searchIn(List<SearchIn> searchIn) {
            Utils.checkNotNull(searchIn, "searchIn");
            this.searchIn = Optional.ofNullable(searchIn);
            return this;
        }

        /**
         * Where to apply search query. Possible values are: title, description,
         * content.
         */
        public Builder searchIn(Optional<? extends List<SearchIn>> searchIn) {
            Utils.checkNotNull(searchIn, "searchIn");
            this.searchIn = searchIn;
            return this;
        }

        /**
         * Search query. See https://newsapi.org/docs/endpoints/everything for 
         * information.
         */
        public Builder searchQuery(String searchQuery) {
            Utils.checkNotNull(searchQuery, "searchQuery");
            this.searchQuery = Optional.ofNullable(searchQuery);
            return this;
        }

        /**
         * Search query. See https://newsapi.org/docs/endpoints/everything for 
         * information.
         */
        public Builder searchQuery(Optional<String> searchQuery) {
            Utils.checkNotNull(searchQuery, "searchQuery");
            this.searchQuery = searchQuery;
            return this;
        }

        /**
         * The order to sort the articles in. Possible options: relevancy,
         * popularity, publishedAt.
         */
        public Builder sortBy(SortBy sortBy) {
            Utils.checkNotNull(sortBy, "sortBy");
            this.sortBy = Optional.ofNullable(sortBy);
            return this;
        }

        /**
         * The order to sort the articles in. Possible options: relevancy,
         * popularity, publishedAt.
         */
        public Builder sortBy(Optional<? extends SortBy> sortBy) {
            Utils.checkNotNull(sortBy, "sortBy");
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Identifiers (maximum 20) for the news sources or blogs you want
         * headlines from. Use the `/sources` endpoint to locate these
         * programmatically or look at the sources index:
         * https://newsapi.com/sources. Will override both country and category.
         */
        public Builder sources(List<String> sources) {
            Utils.checkNotNull(sources, "sources");
            this.sources = Optional.ofNullable(sources);
            return this;
        }

        /**
         * Identifiers (maximum 20) for the news sources or blogs you want
         * headlines from. Use the `/sources` endpoint to locate these
         * programmatically or look at the sources index:
         * https://newsapi.com/sources. Will override both country and category.
         */
        public Builder sources(Optional<? extends List<String>> sources) {
            Utils.checkNotNull(sources, "sources");
            this.sources = sources;
            return this;
        }

        /**
         * A date and optional time for the oldest article allowed. This should
         * be in ISO 8601 format.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * A date and optional time for the oldest article allowed. This should
         * be in ISO 8601 format.
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceNewsApi build() {
            if (category == null) {
                category = _SINGLETON_VALUE_Category.value();
            }
            if (country == null) {
                country = _SINGLETON_VALUE_Country.value();
            }
            if (sortBy == null) {
                sortBy = _SINGLETON_VALUE_SortBy.value();
            }
            return new SourceNewsApi(
                apiKey,
                category,
                country,
                domains,
                endDate,
                excludeDomains,
                language,
                searchIn,
                searchQuery,
                sortBy,
                sources,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Category>> _SINGLETON_VALUE_Category =
                new LazySingletonValue<>(
                        "category",
                        "\"business\"",
                        new TypeReference<Optional<? extends Category>>() {});

        private static final LazySingletonValue<Optional<? extends Country>> _SINGLETON_VALUE_Country =
                new LazySingletonValue<>(
                        "country",
                        "\"us\"",
                        new TypeReference<Optional<? extends Country>>() {});

        private static final LazySingletonValue<Optional<? extends SortBy>> _SINGLETON_VALUE_SortBy =
                new LazySingletonValue<>(
                        "sort_by",
                        "\"publishedAt\"",
                        new TypeReference<Optional<? extends SortBy>>() {});

        private static final LazySingletonValue<NewsApi> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"news-api\"",
                        new TypeReference<NewsApi>() {});
    }
}
