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
import java.util.Objects;
import java.util.Optional;

public class SourceGutendex {

    /**
     * (Optional) Defines the maximum birth year of the authors. Books by authors born after the end year will not be returned. Supports both positive (CE) or negative (BCE) integer values
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("author_year_end")
    private Optional<String> authorYearEnd;

    /**
     * (Optional) Defines the minimum birth year of the authors. Books by authors born prior to the start year will not be returned. Supports both positive (CE) or negative (BCE) integer values
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("author_year_start")
    private Optional<String> authorYearStart;

    /**
     * (Optional) Use this to find books with a certain copyright status - true for books with existing copyrights, false for books in the public domain in the USA, or null for books with no available copyright information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("copyright")
    private Optional<String> copyright;

    /**
     * (Optional) Use this to find books in any of a list of languages. They must be comma-separated, two-character language codes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("languages")
    private Optional<String> languages;

    /**
     * (Optional) Use this to search author names and book titles with given words. They must be separated by a space (i.e. %20 in URL-encoded format) and are case-insensitive.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search")
    private Optional<String> search;

    /**
     * (Optional) Use this to sort books - ascending for Project Gutenberg ID numbers from lowest to highest, descending for IDs highest to lowest, or popular (the default) for most popular to least popular by number of downloads.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    private Optional<String> sort;

    @JsonProperty("sourceType")
    private Gutendex sourceType;

    /**
     * (Optional) Use this to search for a case-insensitive key-phrase in books' bookshelves or subjects.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("topic")
    private Optional<String> topic;

    @JsonCreator
    public SourceGutendex(
            @JsonProperty("author_year_end") Optional<String> authorYearEnd,
            @JsonProperty("author_year_start") Optional<String> authorYearStart,
            @JsonProperty("copyright") Optional<String> copyright,
            @JsonProperty("languages") Optional<String> languages,
            @JsonProperty("search") Optional<String> search,
            @JsonProperty("sort") Optional<String> sort,
            @JsonProperty("topic") Optional<String> topic) {
        Utils.checkNotNull(authorYearEnd, "authorYearEnd");
        Utils.checkNotNull(authorYearStart, "authorYearStart");
        Utils.checkNotNull(copyright, "copyright");
        Utils.checkNotNull(languages, "languages");
        Utils.checkNotNull(search, "search");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(topic, "topic");
        this.authorYearEnd = authorYearEnd;
        this.authorYearStart = authorYearStart;
        this.copyright = copyright;
        this.languages = languages;
        this.search = search;
        this.sort = sort;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.topic = topic;
    }
    
    public SourceGutendex() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * (Optional) Defines the maximum birth year of the authors. Books by authors born after the end year will not be returned. Supports both positive (CE) or negative (BCE) integer values
     */
    @JsonIgnore
    public Optional<String> authorYearEnd() {
        return authorYearEnd;
    }

    /**
     * (Optional) Defines the minimum birth year of the authors. Books by authors born prior to the start year will not be returned. Supports both positive (CE) or negative (BCE) integer values
     */
    @JsonIgnore
    public Optional<String> authorYearStart() {
        return authorYearStart;
    }

    /**
     * (Optional) Use this to find books with a certain copyright status - true for books with existing copyrights, false for books in the public domain in the USA, or null for books with no available copyright information.
     */
    @JsonIgnore
    public Optional<String> copyright() {
        return copyright;
    }

    /**
     * (Optional) Use this to find books in any of a list of languages. They must be comma-separated, two-character language codes.
     */
    @JsonIgnore
    public Optional<String> languages() {
        return languages;
    }

    /**
     * (Optional) Use this to search author names and book titles with given words. They must be separated by a space (i.e. %20 in URL-encoded format) and are case-insensitive.
     */
    @JsonIgnore
    public Optional<String> search() {
        return search;
    }

    /**
     * (Optional) Use this to sort books - ascending for Project Gutenberg ID numbers from lowest to highest, descending for IDs highest to lowest, or popular (the default) for most popular to least popular by number of downloads.
     */
    @JsonIgnore
    public Optional<String> sort() {
        return sort;
    }

    @JsonIgnore
    public Gutendex sourceType() {
        return sourceType;
    }

    /**
     * (Optional) Use this to search for a case-insensitive key-phrase in books' bookshelves or subjects.
     */
    @JsonIgnore
    public Optional<String> topic() {
        return topic;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * (Optional) Defines the maximum birth year of the authors. Books by authors born after the end year will not be returned. Supports both positive (CE) or negative (BCE) integer values
     */
    public SourceGutendex withAuthorYearEnd(String authorYearEnd) {
        Utils.checkNotNull(authorYearEnd, "authorYearEnd");
        this.authorYearEnd = Optional.ofNullable(authorYearEnd);
        return this;
    }

    /**
     * (Optional) Defines the maximum birth year of the authors. Books by authors born after the end year will not be returned. Supports both positive (CE) or negative (BCE) integer values
     */
    public SourceGutendex withAuthorYearEnd(Optional<String> authorYearEnd) {
        Utils.checkNotNull(authorYearEnd, "authorYearEnd");
        this.authorYearEnd = authorYearEnd;
        return this;
    }

    /**
     * (Optional) Defines the minimum birth year of the authors. Books by authors born prior to the start year will not be returned. Supports both positive (CE) or negative (BCE) integer values
     */
    public SourceGutendex withAuthorYearStart(String authorYearStart) {
        Utils.checkNotNull(authorYearStart, "authorYearStart");
        this.authorYearStart = Optional.ofNullable(authorYearStart);
        return this;
    }

    /**
     * (Optional) Defines the minimum birth year of the authors. Books by authors born prior to the start year will not be returned. Supports both positive (CE) or negative (BCE) integer values
     */
    public SourceGutendex withAuthorYearStart(Optional<String> authorYearStart) {
        Utils.checkNotNull(authorYearStart, "authorYearStart");
        this.authorYearStart = authorYearStart;
        return this;
    }

    /**
     * (Optional) Use this to find books with a certain copyright status - true for books with existing copyrights, false for books in the public domain in the USA, or null for books with no available copyright information.
     */
    public SourceGutendex withCopyright(String copyright) {
        Utils.checkNotNull(copyright, "copyright");
        this.copyright = Optional.ofNullable(copyright);
        return this;
    }

    /**
     * (Optional) Use this to find books with a certain copyright status - true for books with existing copyrights, false for books in the public domain in the USA, or null for books with no available copyright information.
     */
    public SourceGutendex withCopyright(Optional<String> copyright) {
        Utils.checkNotNull(copyright, "copyright");
        this.copyright = copyright;
        return this;
    }

    /**
     * (Optional) Use this to find books in any of a list of languages. They must be comma-separated, two-character language codes.
     */
    public SourceGutendex withLanguages(String languages) {
        Utils.checkNotNull(languages, "languages");
        this.languages = Optional.ofNullable(languages);
        return this;
    }

    /**
     * (Optional) Use this to find books in any of a list of languages. They must be comma-separated, two-character language codes.
     */
    public SourceGutendex withLanguages(Optional<String> languages) {
        Utils.checkNotNull(languages, "languages");
        this.languages = languages;
        return this;
    }

    /**
     * (Optional) Use this to search author names and book titles with given words. They must be separated by a space (i.e. %20 in URL-encoded format) and are case-insensitive.
     */
    public SourceGutendex withSearch(String search) {
        Utils.checkNotNull(search, "search");
        this.search = Optional.ofNullable(search);
        return this;
    }

    /**
     * (Optional) Use this to search author names and book titles with given words. They must be separated by a space (i.e. %20 in URL-encoded format) and are case-insensitive.
     */
    public SourceGutendex withSearch(Optional<String> search) {
        Utils.checkNotNull(search, "search");
        this.search = search;
        return this;
    }

    /**
     * (Optional) Use this to sort books - ascending for Project Gutenberg ID numbers from lowest to highest, descending for IDs highest to lowest, or popular (the default) for most popular to least popular by number of downloads.
     */
    public SourceGutendex withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    /**
     * (Optional) Use this to sort books - ascending for Project Gutenberg ID numbers from lowest to highest, descending for IDs highest to lowest, or popular (the default) for most popular to least popular by number of downloads.
     */
    public SourceGutendex withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * (Optional) Use this to search for a case-insensitive key-phrase in books' bookshelves or subjects.
     */
    public SourceGutendex withTopic(String topic) {
        Utils.checkNotNull(topic, "topic");
        this.topic = Optional.ofNullable(topic);
        return this;
    }

    /**
     * (Optional) Use this to search for a case-insensitive key-phrase in books' bookshelves or subjects.
     */
    public SourceGutendex withTopic(Optional<String> topic) {
        Utils.checkNotNull(topic, "topic");
        this.topic = topic;
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
        SourceGutendex other = (SourceGutendex) o;
        return 
            Objects.deepEquals(this.authorYearEnd, other.authorYearEnd) &&
            Objects.deepEquals(this.authorYearStart, other.authorYearStart) &&
            Objects.deepEquals(this.copyright, other.copyright) &&
            Objects.deepEquals(this.languages, other.languages) &&
            Objects.deepEquals(this.search, other.search) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.topic, other.topic);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authorYearEnd,
            authorYearStart,
            copyright,
            languages,
            search,
            sort,
            sourceType,
            topic);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGutendex.class,
                "authorYearEnd", authorYearEnd,
                "authorYearStart", authorYearStart,
                "copyright", copyright,
                "languages", languages,
                "search", search,
                "sort", sort,
                "sourceType", sourceType,
                "topic", topic);
    }
    
    public final static class Builder {
 
        private Optional<String> authorYearEnd = Optional.empty();
 
        private Optional<String> authorYearStart = Optional.empty();
 
        private Optional<String> copyright = Optional.empty();
 
        private Optional<String> languages = Optional.empty();
 
        private Optional<String> search = Optional.empty();
 
        private Optional<String> sort = Optional.empty();
 
        private Optional<String> topic = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * (Optional) Defines the maximum birth year of the authors. Books by authors born after the end year will not be returned. Supports both positive (CE) or negative (BCE) integer values
         */
        public Builder authorYearEnd(String authorYearEnd) {
            Utils.checkNotNull(authorYearEnd, "authorYearEnd");
            this.authorYearEnd = Optional.ofNullable(authorYearEnd);
            return this;
        }

        /**
         * (Optional) Defines the maximum birth year of the authors. Books by authors born after the end year will not be returned. Supports both positive (CE) or negative (BCE) integer values
         */
        public Builder authorYearEnd(Optional<String> authorYearEnd) {
            Utils.checkNotNull(authorYearEnd, "authorYearEnd");
            this.authorYearEnd = authorYearEnd;
            return this;
        }

        /**
         * (Optional) Defines the minimum birth year of the authors. Books by authors born prior to the start year will not be returned. Supports both positive (CE) or negative (BCE) integer values
         */
        public Builder authorYearStart(String authorYearStart) {
            Utils.checkNotNull(authorYearStart, "authorYearStart");
            this.authorYearStart = Optional.ofNullable(authorYearStart);
            return this;
        }

        /**
         * (Optional) Defines the minimum birth year of the authors. Books by authors born prior to the start year will not be returned. Supports both positive (CE) or negative (BCE) integer values
         */
        public Builder authorYearStart(Optional<String> authorYearStart) {
            Utils.checkNotNull(authorYearStart, "authorYearStart");
            this.authorYearStart = authorYearStart;
            return this;
        }

        /**
         * (Optional) Use this to find books with a certain copyright status - true for books with existing copyrights, false for books in the public domain in the USA, or null for books with no available copyright information.
         */
        public Builder copyright(String copyright) {
            Utils.checkNotNull(copyright, "copyright");
            this.copyright = Optional.ofNullable(copyright);
            return this;
        }

        /**
         * (Optional) Use this to find books with a certain copyright status - true for books with existing copyrights, false for books in the public domain in the USA, or null for books with no available copyright information.
         */
        public Builder copyright(Optional<String> copyright) {
            Utils.checkNotNull(copyright, "copyright");
            this.copyright = copyright;
            return this;
        }

        /**
         * (Optional) Use this to find books in any of a list of languages. They must be comma-separated, two-character language codes.
         */
        public Builder languages(String languages) {
            Utils.checkNotNull(languages, "languages");
            this.languages = Optional.ofNullable(languages);
            return this;
        }

        /**
         * (Optional) Use this to find books in any of a list of languages. They must be comma-separated, two-character language codes.
         */
        public Builder languages(Optional<String> languages) {
            Utils.checkNotNull(languages, "languages");
            this.languages = languages;
            return this;
        }

        /**
         * (Optional) Use this to search author names and book titles with given words. They must be separated by a space (i.e. %20 in URL-encoded format) and are case-insensitive.
         */
        public Builder search(String search) {
            Utils.checkNotNull(search, "search");
            this.search = Optional.ofNullable(search);
            return this;
        }

        /**
         * (Optional) Use this to search author names and book titles with given words. They must be separated by a space (i.e. %20 in URL-encoded format) and are case-insensitive.
         */
        public Builder search(Optional<String> search) {
            Utils.checkNotNull(search, "search");
            this.search = search;
            return this;
        }

        /**
         * (Optional) Use this to sort books - ascending for Project Gutenberg ID numbers from lowest to highest, descending for IDs highest to lowest, or popular (the default) for most popular to least popular by number of downloads.
         */
        public Builder sort(String sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        /**
         * (Optional) Use this to sort books - ascending for Project Gutenberg ID numbers from lowest to highest, descending for IDs highest to lowest, or popular (the default) for most popular to least popular by number of downloads.
         */
        public Builder sort(Optional<String> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }

        /**
         * (Optional) Use this to search for a case-insensitive key-phrase in books' bookshelves or subjects.
         */
        public Builder topic(String topic) {
            Utils.checkNotNull(topic, "topic");
            this.topic = Optional.ofNullable(topic);
            return this;
        }

        /**
         * (Optional) Use this to search for a case-insensitive key-phrase in books' bookshelves or subjects.
         */
        public Builder topic(Optional<String> topic) {
            Utils.checkNotNull(topic, "topic");
            this.topic = topic;
            return this;
        }
        
        public SourceGutendex build() {
            return new SourceGutendex(
                authorYearEnd,
                authorYearStart,
                copyright,
                languages,
                search,
                sort,
                topic);
        }

        private static final LazySingletonValue<Gutendex> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"gutendex\"",
                        new TypeReference<Gutendex>() {});
    }
}
