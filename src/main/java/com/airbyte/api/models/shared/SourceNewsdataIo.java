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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class SourceNewsdataIo {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Search the news articles for a specific category. You can add up to 5 categories in a single query.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("categories")
    private Optional<? extends List<Object>> categories;

    /**
     * Search the news articles from a specific country. You can add up to 5 countries in a single query. Example: au, jp, br
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("countries")
    private Optional<? extends List<Object>> countries;

    /**
     * Search the news articles for specific domains or news sources. You can add up to 5 domains in a single query. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domains")
    private Optional<? extends List<Object>> domains;

    /**
     * Choose an end date. Now UTC is default value
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<LocalDate> endDate;

    /**
     * Search the news articles for a specific language. You can add up to 5 languages in a single query. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("languages")
    private Optional<? extends List<Object>> languages;

    /**
     * Search news articles for specific keywords or phrases present in the news title, content, URL, meta keywords and meta description.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_query")
    private Optional<String> searchQuery;

    @JsonProperty("sourceType")
    private NewsdataIo sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceNewsdataIo(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("categories") Optional<? extends List<Object>> categories,
            @JsonProperty("countries") Optional<? extends List<Object>> countries,
            @JsonProperty("domains") Optional<? extends List<Object>> domains,
            @JsonProperty("end_date") Optional<LocalDate> endDate,
            @JsonProperty("languages") Optional<? extends List<Object>> languages,
            @JsonProperty("search_query") Optional<String> searchQuery,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(categories, "categories");
        Utils.checkNotNull(countries, "countries");
        Utils.checkNotNull(domains, "domains");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(languages, "languages");
        Utils.checkNotNull(searchQuery, "searchQuery");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.categories = categories;
        this.countries = countries;
        this.domains = domains;
        this.endDate = endDate;
        this.languages = languages;
        this.searchQuery = searchQuery;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceNewsdataIo(
            String apiKey,
            OffsetDateTime startDate) {
        this(apiKey, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), startDate);
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Search the news articles for a specific category. You can add up to 5 categories in a single query.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Object>> categories() {
        return (Optional<List<Object>>) categories;
    }

    /**
     * Search the news articles from a specific country. You can add up to 5 countries in a single query. Example: au, jp, br
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Object>> countries() {
        return (Optional<List<Object>>) countries;
    }

    /**
     * Search the news articles for specific domains or news sources. You can add up to 5 domains in a single query. 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Object>> domains() {
        return (Optional<List<Object>>) domains;
    }

    /**
     * Choose an end date. Now UTC is default value
     */
    @JsonIgnore
    public Optional<LocalDate> endDate() {
        return endDate;
    }

    /**
     * Search the news articles for a specific language. You can add up to 5 languages in a single query. 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Object>> languages() {
        return (Optional<List<Object>>) languages;
    }

    /**
     * Search news articles for specific keywords or phrases present in the news title, content, URL, meta keywords and meta description.
     */
    @JsonIgnore
    public Optional<String> searchQuery() {
        return searchQuery;
    }

    @JsonIgnore
    public NewsdataIo sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceNewsdataIo withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Search the news articles for a specific category. You can add up to 5 categories in a single query.
     */
    public SourceNewsdataIo withCategories(List<Object> categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = Optional.ofNullable(categories);
        return this;
    }

    /**
     * Search the news articles for a specific category. You can add up to 5 categories in a single query.
     */
    public SourceNewsdataIo withCategories(Optional<? extends List<Object>> categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = categories;
        return this;
    }

    /**
     * Search the news articles from a specific country. You can add up to 5 countries in a single query. Example: au, jp, br
     */
    public SourceNewsdataIo withCountries(List<Object> countries) {
        Utils.checkNotNull(countries, "countries");
        this.countries = Optional.ofNullable(countries);
        return this;
    }

    /**
     * Search the news articles from a specific country. You can add up to 5 countries in a single query. Example: au, jp, br
     */
    public SourceNewsdataIo withCountries(Optional<? extends List<Object>> countries) {
        Utils.checkNotNull(countries, "countries");
        this.countries = countries;
        return this;
    }

    /**
     * Search the news articles for specific domains or news sources. You can add up to 5 domains in a single query. 
     */
    public SourceNewsdataIo withDomains(List<Object> domains) {
        Utils.checkNotNull(domains, "domains");
        this.domains = Optional.ofNullable(domains);
        return this;
    }

    /**
     * Search the news articles for specific domains or news sources. You can add up to 5 domains in a single query. 
     */
    public SourceNewsdataIo withDomains(Optional<? extends List<Object>> domains) {
        Utils.checkNotNull(domains, "domains");
        this.domains = domains;
        return this;
    }

    /**
     * Choose an end date. Now UTC is default value
     */
    public SourceNewsdataIo withEndDate(LocalDate endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * Choose an end date. Now UTC is default value
     */
    public SourceNewsdataIo withEndDate(Optional<LocalDate> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Search the news articles for a specific language. You can add up to 5 languages in a single query. 
     */
    public SourceNewsdataIo withLanguages(List<Object> languages) {
        Utils.checkNotNull(languages, "languages");
        this.languages = Optional.ofNullable(languages);
        return this;
    }

    /**
     * Search the news articles for a specific language. You can add up to 5 languages in a single query. 
     */
    public SourceNewsdataIo withLanguages(Optional<? extends List<Object>> languages) {
        Utils.checkNotNull(languages, "languages");
        this.languages = languages;
        return this;
    }

    /**
     * Search news articles for specific keywords or phrases present in the news title, content, URL, meta keywords and meta description.
     */
    public SourceNewsdataIo withSearchQuery(String searchQuery) {
        Utils.checkNotNull(searchQuery, "searchQuery");
        this.searchQuery = Optional.ofNullable(searchQuery);
        return this;
    }

    /**
     * Search news articles for specific keywords or phrases present in the news title, content, URL, meta keywords and meta description.
     */
    public SourceNewsdataIo withSearchQuery(Optional<String> searchQuery) {
        Utils.checkNotNull(searchQuery, "searchQuery");
        this.searchQuery = searchQuery;
        return this;
    }

    public SourceNewsdataIo withStartDate(OffsetDateTime startDate) {
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
        SourceNewsdataIo other = (SourceNewsdataIo) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.categories, other.categories) &&
            Objects.deepEquals(this.countries, other.countries) &&
            Objects.deepEquals(this.domains, other.domains) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.languages, other.languages) &&
            Objects.deepEquals(this.searchQuery, other.searchQuery) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            categories,
            countries,
            domains,
            endDate,
            languages,
            searchQuery,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceNewsdataIo.class,
                "apiKey", apiKey,
                "categories", categories,
                "countries", countries,
                "domains", domains,
                "endDate", endDate,
                "languages", languages,
                "searchQuery", searchQuery,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<? extends List<Object>> categories = Optional.empty();
 
        private Optional<? extends List<Object>> countries = Optional.empty();
 
        private Optional<? extends List<Object>> domains = Optional.empty();
 
        private Optional<LocalDate> endDate = Optional.empty();
 
        private Optional<? extends List<Object>> languages = Optional.empty();
 
        private Optional<String> searchQuery = Optional.empty();
 
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
         * Search the news articles for a specific category. You can add up to 5 categories in a single query.
         */
        public Builder categories(List<Object> categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = Optional.ofNullable(categories);
            return this;
        }

        /**
         * Search the news articles for a specific category. You can add up to 5 categories in a single query.
         */
        public Builder categories(Optional<? extends List<Object>> categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = categories;
            return this;
        }

        /**
         * Search the news articles from a specific country. You can add up to 5 countries in a single query. Example: au, jp, br
         */
        public Builder countries(List<Object> countries) {
            Utils.checkNotNull(countries, "countries");
            this.countries = Optional.ofNullable(countries);
            return this;
        }

        /**
         * Search the news articles from a specific country. You can add up to 5 countries in a single query. Example: au, jp, br
         */
        public Builder countries(Optional<? extends List<Object>> countries) {
            Utils.checkNotNull(countries, "countries");
            this.countries = countries;
            return this;
        }

        /**
         * Search the news articles for specific domains or news sources. You can add up to 5 domains in a single query. 
         */
        public Builder domains(List<Object> domains) {
            Utils.checkNotNull(domains, "domains");
            this.domains = Optional.ofNullable(domains);
            return this;
        }

        /**
         * Search the news articles for specific domains or news sources. You can add up to 5 domains in a single query. 
         */
        public Builder domains(Optional<? extends List<Object>> domains) {
            Utils.checkNotNull(domains, "domains");
            this.domains = domains;
            return this;
        }

        /**
         * Choose an end date. Now UTC is default value
         */
        public Builder endDate(LocalDate endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * Choose an end date. Now UTC is default value
         */
        public Builder endDate(Optional<LocalDate> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * Search the news articles for a specific language. You can add up to 5 languages in a single query. 
         */
        public Builder languages(List<Object> languages) {
            Utils.checkNotNull(languages, "languages");
            this.languages = Optional.ofNullable(languages);
            return this;
        }

        /**
         * Search the news articles for a specific language. You can add up to 5 languages in a single query. 
         */
        public Builder languages(Optional<? extends List<Object>> languages) {
            Utils.checkNotNull(languages, "languages");
            this.languages = languages;
            return this;
        }

        /**
         * Search news articles for specific keywords or phrases present in the news title, content, URL, meta keywords and meta description.
         */
        public Builder searchQuery(String searchQuery) {
            Utils.checkNotNull(searchQuery, "searchQuery");
            this.searchQuery = Optional.ofNullable(searchQuery);
            return this;
        }

        /**
         * Search news articles for specific keywords or phrases present in the news title, content, URL, meta keywords and meta description.
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
        
        public SourceNewsdataIo build() {
            return new SourceNewsdataIo(
                apiKey,
                categories,
                countries,
                domains,
                endDate,
                languages,
                searchQuery,
                startDate);
        }

        private static final LazySingletonValue<NewsdataIo> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"newsdata-io\"",
                        new TypeReference<NewsdataIo>() {});
    }
}
