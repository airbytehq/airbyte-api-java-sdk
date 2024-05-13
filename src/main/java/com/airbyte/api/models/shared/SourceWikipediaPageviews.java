/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceWikipediaPageviews {

    /**
     * If you want to filter by access method, use one of desktop, mobile-app or mobile-web. If you are interested in pageviews regardless of access method, use all-access.
     */
    @JsonProperty("access")
    private String access;

    /**
     * If you want to filter by agent type, use one of user, automated or spider. If you are interested in pageviews regardless of agent type, use all-agents.
     */
    @JsonProperty("agent")
    private String agent;

    /**
     * The title of any article in the specified project. Any spaces should be replaced with underscores. It also should be URI-encoded, so that non-URI-safe characters like %, / or ? are accepted.
     */
    @JsonProperty("article")
    private String article;

    /**
     * The ISO 3166-1 alpha-2 code of a country for which to retrieve top articles.
     */
    @JsonProperty("country")
    private String country;

    /**
     * The date of the last day to include, in YYYYMMDD or YYYYMMDDHH format.
     */
    @JsonProperty("end")
    private String end;

    /**
     * If you want to filter by project, use the domain of any Wikimedia project.
     */
    @JsonProperty("project")
    private String project;

    @JsonProperty("sourceType")
    private WikipediaPageviews sourceType;

    /**
     * The date of the first day to include, in YYYYMMDD or YYYYMMDDHH format.
     */
    @JsonProperty("start")
    private String start;

    @JsonCreator
    public SourceWikipediaPageviews(
            @JsonProperty("access") String access,
            @JsonProperty("agent") String agent,
            @JsonProperty("article") String article,
            @JsonProperty("country") String country,
            @JsonProperty("end") String end,
            @JsonProperty("project") String project,
            @JsonProperty("start") String start) {
        Utils.checkNotNull(access, "access");
        Utils.checkNotNull(agent, "agent");
        Utils.checkNotNull(article, "article");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(end, "end");
        Utils.checkNotNull(project, "project");
        Utils.checkNotNull(start, "start");
        this.access = access;
        this.agent = agent;
        this.article = article;
        this.country = country;
        this.end = end;
        this.project = project;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.start = start;
    }

    /**
     * If you want to filter by access method, use one of desktop, mobile-app or mobile-web. If you are interested in pageviews regardless of access method, use all-access.
     */
    @JsonIgnore
    public String access() {
        return access;
    }

    /**
     * If you want to filter by agent type, use one of user, automated or spider. If you are interested in pageviews regardless of agent type, use all-agents.
     */
    @JsonIgnore
    public String agent() {
        return agent;
    }

    /**
     * The title of any article in the specified project. Any spaces should be replaced with underscores. It also should be URI-encoded, so that non-URI-safe characters like %, / or ? are accepted.
     */
    @JsonIgnore
    public String article() {
        return article;
    }

    /**
     * The ISO 3166-1 alpha-2 code of a country for which to retrieve top articles.
     */
    @JsonIgnore
    public String country() {
        return country;
    }

    /**
     * The date of the last day to include, in YYYYMMDD or YYYYMMDDHH format.
     */
    @JsonIgnore
    public String end() {
        return end;
    }

    /**
     * If you want to filter by project, use the domain of any Wikimedia project.
     */
    @JsonIgnore
    public String project() {
        return project;
    }

    @JsonIgnore
    public WikipediaPageviews sourceType() {
        return sourceType;
    }

    /**
     * The date of the first day to include, in YYYYMMDD or YYYYMMDDHH format.
     */
    @JsonIgnore
    public String start() {
        return start;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * If you want to filter by access method, use one of desktop, mobile-app or mobile-web. If you are interested in pageviews regardless of access method, use all-access.
     */
    public SourceWikipediaPageviews withAccess(String access) {
        Utils.checkNotNull(access, "access");
        this.access = access;
        return this;
    }

    /**
     * If you want to filter by agent type, use one of user, automated or spider. If you are interested in pageviews regardless of agent type, use all-agents.
     */
    public SourceWikipediaPageviews withAgent(String agent) {
        Utils.checkNotNull(agent, "agent");
        this.agent = agent;
        return this;
    }

    /**
     * The title of any article in the specified project. Any spaces should be replaced with underscores. It also should be URI-encoded, so that non-URI-safe characters like %, / or ? are accepted.
     */
    public SourceWikipediaPageviews withArticle(String article) {
        Utils.checkNotNull(article, "article");
        this.article = article;
        return this;
    }

    /**
     * The ISO 3166-1 alpha-2 code of a country for which to retrieve top articles.
     */
    public SourceWikipediaPageviews withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * The date of the last day to include, in YYYYMMDD or YYYYMMDDHH format.
     */
    public SourceWikipediaPageviews withEnd(String end) {
        Utils.checkNotNull(end, "end");
        this.end = end;
        return this;
    }

    /**
     * If you want to filter by project, use the domain of any Wikimedia project.
     */
    public SourceWikipediaPageviews withProject(String project) {
        Utils.checkNotNull(project, "project");
        this.project = project;
        return this;
    }

    /**
     * The date of the first day to include, in YYYYMMDD or YYYYMMDDHH format.
     */
    public SourceWikipediaPageviews withStart(String start) {
        Utils.checkNotNull(start, "start");
        this.start = start;
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
        SourceWikipediaPageviews other = (SourceWikipediaPageviews) o;
        return 
            java.util.Objects.deepEquals(this.access, other.access) &&
            java.util.Objects.deepEquals(this.agent, other.agent) &&
            java.util.Objects.deepEquals(this.article, other.article) &&
            java.util.Objects.deepEquals(this.country, other.country) &&
            java.util.Objects.deepEquals(this.end, other.end) &&
            java.util.Objects.deepEquals(this.project, other.project) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.start, other.start);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            access,
            agent,
            article,
            country,
            end,
            project,
            sourceType,
            start);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceWikipediaPageviews.class,
                "access", access,
                "agent", agent,
                "article", article,
                "country", country,
                "end", end,
                "project", project,
                "sourceType", sourceType,
                "start", start);
    }
    
    public final static class Builder {
 
        private String access;
 
        private String agent;
 
        private String article;
 
        private String country;
 
        private String end;
 
        private String project;
 
        private String start;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * If you want to filter by access method, use one of desktop, mobile-app or mobile-web. If you are interested in pageviews regardless of access method, use all-access.
         */
        public Builder access(String access) {
            Utils.checkNotNull(access, "access");
            this.access = access;
            return this;
        }

        /**
         * If you want to filter by agent type, use one of user, automated or spider. If you are interested in pageviews regardless of agent type, use all-agents.
         */
        public Builder agent(String agent) {
            Utils.checkNotNull(agent, "agent");
            this.agent = agent;
            return this;
        }

        /**
         * The title of any article in the specified project. Any spaces should be replaced with underscores. It also should be URI-encoded, so that non-URI-safe characters like %, / or ? are accepted.
         */
        public Builder article(String article) {
            Utils.checkNotNull(article, "article");
            this.article = article;
            return this;
        }

        /**
         * The ISO 3166-1 alpha-2 code of a country for which to retrieve top articles.
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * The date of the last day to include, in YYYYMMDD or YYYYMMDDHH format.
         */
        public Builder end(String end) {
            Utils.checkNotNull(end, "end");
            this.end = end;
            return this;
        }

        /**
         * If you want to filter by project, use the domain of any Wikimedia project.
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }

        /**
         * The date of the first day to include, in YYYYMMDD or YYYYMMDDHH format.
         */
        public Builder start(String start) {
            Utils.checkNotNull(start, "start");
            this.start = start;
            return this;
        }
        
        public SourceWikipediaPageviews build() {
            return new SourceWikipediaPageviews(
                access,
                agent,
                article,
                country,
                end,
                project,
                start);
        }

        private static final LazySingletonValue<WikipediaPageviews> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"wikipedia-pageviews\"",
                        new TypeReference<WikipediaPageviews>() {});
    }
}

