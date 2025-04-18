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

public class SourceNewsdata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("OneOf")
    private Optional<? extends Object> oneOf;

    /**
     * API Key
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Categories (maximum 5) to restrict the search to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("category")
    private Optional<? extends List<SourceNewsdataCategory>> category;

    /**
     * 2-letter ISO 3166-1 countries (maximum 5) to restrict the search to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<? extends List<SourceNewsdataCountry>> country;

    /**
     * Domains (maximum 5) to restrict the search to. Use the sources stream to find top sources id.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain")
    private Optional<? extends List<String>> domain;

    /**
     * Languages (maximum 5) to restrict the search to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    private Optional<? extends List<SourceNewsdataLanguage>> language;

    @JsonProperty("sourceType")
    private Newsdata sourceType;

    @JsonCreator
    public SourceNewsdata(
            @JsonProperty("OneOf") Optional<? extends Object> oneOf,
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("category") Optional<? extends List<SourceNewsdataCategory>> category,
            @JsonProperty("country") Optional<? extends List<SourceNewsdataCountry>> country,
            @JsonProperty("domain") Optional<? extends List<String>> domain,
            @JsonProperty("language") Optional<? extends List<SourceNewsdataLanguage>> language) {
        Utils.checkNotNull(oneOf, "oneOf");
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(category, "category");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(domain, "domain");
        Utils.checkNotNull(language, "language");
        this.oneOf = oneOf;
        this.apiKey = apiKey;
        this.category = category;
        this.country = country;
        this.domain = domain;
        this.language = language;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceNewsdata(
            String apiKey) {
        this(Optional.empty(), apiKey, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Object> oneOf() {
        return (Optional<Object>) oneOf;
    }

    /**
     * API Key
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Categories (maximum 5) to restrict the search to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SourceNewsdataCategory>> category() {
        return (Optional<List<SourceNewsdataCategory>>) category;
    }

    /**
     * 2-letter ISO 3166-1 countries (maximum 5) to restrict the search to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SourceNewsdataCountry>> country() {
        return (Optional<List<SourceNewsdataCountry>>) country;
    }

    /**
     * Domains (maximum 5) to restrict the search to. Use the sources stream to find top sources id.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> domain() {
        return (Optional<List<String>>) domain;
    }

    /**
     * Languages (maximum 5) to restrict the search to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SourceNewsdataLanguage>> language() {
        return (Optional<List<SourceNewsdataLanguage>>) language;
    }

    @JsonIgnore
    public Newsdata sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceNewsdata withOneOf(Object oneOf) {
        Utils.checkNotNull(oneOf, "oneOf");
        this.oneOf = Optional.ofNullable(oneOf);
        return this;
    }

    public SourceNewsdata withOneOf(Optional<? extends Object> oneOf) {
        Utils.checkNotNull(oneOf, "oneOf");
        this.oneOf = oneOf;
        return this;
    }

    /**
     * API Key
     */
    public SourceNewsdata withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Categories (maximum 5) to restrict the search to.
     */
    public SourceNewsdata withCategory(List<SourceNewsdataCategory> category) {
        Utils.checkNotNull(category, "category");
        this.category = Optional.ofNullable(category);
        return this;
    }

    /**
     * Categories (maximum 5) to restrict the search to.
     */
    public SourceNewsdata withCategory(Optional<? extends List<SourceNewsdataCategory>> category) {
        Utils.checkNotNull(category, "category");
        this.category = category;
        return this;
    }

    /**
     * 2-letter ISO 3166-1 countries (maximum 5) to restrict the search to.
     */
    public SourceNewsdata withCountry(List<SourceNewsdataCountry> country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    /**
     * 2-letter ISO 3166-1 countries (maximum 5) to restrict the search to.
     */
    public SourceNewsdata withCountry(Optional<? extends List<SourceNewsdataCountry>> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * Domains (maximum 5) to restrict the search to. Use the sources stream to find top sources id.
     */
    public SourceNewsdata withDomain(List<String> domain) {
        Utils.checkNotNull(domain, "domain");
        this.domain = Optional.ofNullable(domain);
        return this;
    }

    /**
     * Domains (maximum 5) to restrict the search to. Use the sources stream to find top sources id.
     */
    public SourceNewsdata withDomain(Optional<? extends List<String>> domain) {
        Utils.checkNotNull(domain, "domain");
        this.domain = domain;
        return this;
    }

    /**
     * Languages (maximum 5) to restrict the search to.
     */
    public SourceNewsdata withLanguage(List<SourceNewsdataLanguage> language) {
        Utils.checkNotNull(language, "language");
        this.language = Optional.ofNullable(language);
        return this;
    }

    /**
     * Languages (maximum 5) to restrict the search to.
     */
    public SourceNewsdata withLanguage(Optional<? extends List<SourceNewsdataLanguage>> language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
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
        SourceNewsdata other = (SourceNewsdata) o;
        return 
            Objects.deepEquals(this.oneOf, other.oneOf) &&
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.category, other.category) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.domain, other.domain) &&
            Objects.deepEquals(this.language, other.language) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            oneOf,
            apiKey,
            category,
            country,
            domain,
            language,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceNewsdata.class,
                "oneOf", oneOf,
                "apiKey", apiKey,
                "category", category,
                "country", country,
                "domain", domain,
                "language", language,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends Object> oneOf = Optional.empty();
 
        private String apiKey;
 
        private Optional<? extends List<SourceNewsdataCategory>> category = Optional.empty();
 
        private Optional<? extends List<SourceNewsdataCountry>> country = Optional.empty();
 
        private Optional<? extends List<String>> domain = Optional.empty();
 
        private Optional<? extends List<SourceNewsdataLanguage>> language = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder oneOf(Object oneOf) {
            Utils.checkNotNull(oneOf, "oneOf");
            this.oneOf = Optional.ofNullable(oneOf);
            return this;
        }

        public Builder oneOf(Optional<? extends Object> oneOf) {
            Utils.checkNotNull(oneOf, "oneOf");
            this.oneOf = oneOf;
            return this;
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
         * Categories (maximum 5) to restrict the search to.
         */
        public Builder category(List<SourceNewsdataCategory> category) {
            Utils.checkNotNull(category, "category");
            this.category = Optional.ofNullable(category);
            return this;
        }

        /**
         * Categories (maximum 5) to restrict the search to.
         */
        public Builder category(Optional<? extends List<SourceNewsdataCategory>> category) {
            Utils.checkNotNull(category, "category");
            this.category = category;
            return this;
        }

        /**
         * 2-letter ISO 3166-1 countries (maximum 5) to restrict the search to.
         */
        public Builder country(List<SourceNewsdataCountry> country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        /**
         * 2-letter ISO 3166-1 countries (maximum 5) to restrict the search to.
         */
        public Builder country(Optional<? extends List<SourceNewsdataCountry>> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * Domains (maximum 5) to restrict the search to. Use the sources stream to find top sources id.
         */
        public Builder domain(List<String> domain) {
            Utils.checkNotNull(domain, "domain");
            this.domain = Optional.ofNullable(domain);
            return this;
        }

        /**
         * Domains (maximum 5) to restrict the search to. Use the sources stream to find top sources id.
         */
        public Builder domain(Optional<? extends List<String>> domain) {
            Utils.checkNotNull(domain, "domain");
            this.domain = domain;
            return this;
        }

        /**
         * Languages (maximum 5) to restrict the search to.
         */
        public Builder language(List<SourceNewsdataLanguage> language) {
            Utils.checkNotNull(language, "language");
            this.language = Optional.ofNullable(language);
            return this;
        }

        /**
         * Languages (maximum 5) to restrict the search to.
         */
        public Builder language(Optional<? extends List<SourceNewsdataLanguage>> language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }
        
        public SourceNewsdata build() {
            return new SourceNewsdata(
                oneOf,
                apiKey,
                category,
                country,
                domain,
                language);
        }

        private static final LazySingletonValue<Newsdata> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"newsdata\"",
                        new TypeReference<Newsdata>() {});
    }
}
