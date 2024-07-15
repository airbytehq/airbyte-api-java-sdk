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
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class SourceDatadog {

    /**
     * Datadog API key
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Datadog application key
     */
    @JsonProperty("application_key")
    private String applicationKey;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Data after this date will  not be replicated. An empty value will represent the current datetime for each  execution. This just applies to Incremental syncs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<? extends String> endDate;

    /**
     * Maximum number of records to collect per request.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_records_per_request")
    private Optional<? extends Long> maxRecordsPerRequest;

    /**
     * List of queries to be run and used as inputs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("queries")
    private Optional<? extends java.util.List<Queries>> queries;

    /**
     * The search query. This just applies to Incremental syncs. If empty, it'll collect all logs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query")
    private Optional<? extends String> query;

    /**
     * The site where Datadog data resides in.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("site")
    private Optional<? extends Site> site;

    @JsonProperty("sourceType")
    private Datadog sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This just applies to Incremental syncs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends String> startDate;

    @JsonCreator
    public SourceDatadog(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("application_key") String applicationKey,
            @JsonProperty("end_date") Optional<? extends String> endDate,
            @JsonProperty("max_records_per_request") Optional<? extends Long> maxRecordsPerRequest,
            @JsonProperty("queries") Optional<? extends java.util.List<Queries>> queries,
            @JsonProperty("query") Optional<? extends String> query,
            @JsonProperty("site") Optional<? extends Site> site,
            @JsonProperty("start_date") Optional<? extends String> startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(applicationKey, "applicationKey");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(maxRecordsPerRequest, "maxRecordsPerRequest");
        Utils.checkNotNull(queries, "queries");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(site, "site");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.applicationKey = applicationKey;
        this.endDate = endDate;
        this.maxRecordsPerRequest = maxRecordsPerRequest;
        this.queries = queries;
        this.query = query;
        this.site = site;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceDatadog(
            String apiKey,
            String applicationKey) {
        this(apiKey, applicationKey, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Datadog API key
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Datadog application key
     */
    @JsonIgnore
    public String applicationKey() {
        return applicationKey;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Data after this date will  not be replicated. An empty value will represent the current datetime for each  execution. This just applies to Incremental syncs.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> endDate() {
        return (Optional<String>) endDate;
    }

    /**
     * Maximum number of records to collect per request.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> maxRecordsPerRequest() {
        return (Optional<Long>) maxRecordsPerRequest;
    }

    /**
     * List of queries to be run and used as inputs.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<Queries>> queries() {
        return (Optional<java.util.List<Queries>>) queries;
    }

    /**
     * The search query. This just applies to Incremental syncs. If empty, it'll collect all logs.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> query() {
        return (Optional<String>) query;
    }

    /**
     * The site where Datadog data resides in.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Site> site() {
        return (Optional<Site>) site;
    }

    @JsonIgnore
    public Datadog sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This just applies to Incremental syncs.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> startDate() {
        return (Optional<String>) startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Datadog API key
     */
    public SourceDatadog withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Datadog application key
     */
    public SourceDatadog withApplicationKey(String applicationKey) {
        Utils.checkNotNull(applicationKey, "applicationKey");
        this.applicationKey = applicationKey;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Data after this date will  not be replicated. An empty value will represent the current datetime for each  execution. This just applies to Incremental syncs.
     */
    public SourceDatadog withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Data after this date will  not be replicated. An empty value will represent the current datetime for each  execution. This just applies to Incremental syncs.
     */
    public SourceDatadog withEndDate(Optional<? extends String> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Maximum number of records to collect per request.
     */
    public SourceDatadog withMaxRecordsPerRequest(long maxRecordsPerRequest) {
        Utils.checkNotNull(maxRecordsPerRequest, "maxRecordsPerRequest");
        this.maxRecordsPerRequest = Optional.ofNullable(maxRecordsPerRequest);
        return this;
    }

    /**
     * Maximum number of records to collect per request.
     */
    public SourceDatadog withMaxRecordsPerRequest(Optional<? extends Long> maxRecordsPerRequest) {
        Utils.checkNotNull(maxRecordsPerRequest, "maxRecordsPerRequest");
        this.maxRecordsPerRequest = maxRecordsPerRequest;
        return this;
    }

    /**
     * List of queries to be run and used as inputs.
     */
    public SourceDatadog withQueries(java.util.List<Queries> queries) {
        Utils.checkNotNull(queries, "queries");
        this.queries = Optional.ofNullable(queries);
        return this;
    }

    /**
     * List of queries to be run and used as inputs.
     */
    public SourceDatadog withQueries(Optional<? extends java.util.List<Queries>> queries) {
        Utils.checkNotNull(queries, "queries");
        this.queries = queries;
        return this;
    }

    /**
     * The search query. This just applies to Incremental syncs. If empty, it'll collect all logs.
     */
    public SourceDatadog withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * The search query. This just applies to Incremental syncs. If empty, it'll collect all logs.
     */
    public SourceDatadog withQuery(Optional<? extends String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    /**
     * The site where Datadog data resides in.
     */
    public SourceDatadog withSite(Site site) {
        Utils.checkNotNull(site, "site");
        this.site = Optional.ofNullable(site);
        return this;
    }

    /**
     * The site where Datadog data resides in.
     */
    public SourceDatadog withSite(Optional<? extends Site> site) {
        Utils.checkNotNull(site, "site");
        this.site = site;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This just applies to Incremental syncs.
     */
    public SourceDatadog withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This just applies to Incremental syncs.
     */
    public SourceDatadog withStartDate(Optional<? extends String> startDate) {
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
        SourceDatadog other = (SourceDatadog) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.applicationKey, other.applicationKey) &&
            java.util.Objects.deepEquals(this.endDate, other.endDate) &&
            java.util.Objects.deepEquals(this.maxRecordsPerRequest, other.maxRecordsPerRequest) &&
            java.util.Objects.deepEquals(this.queries, other.queries) &&
            java.util.Objects.deepEquals(this.query, other.query) &&
            java.util.Objects.deepEquals(this.site, other.site) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            applicationKey,
            endDate,
            maxRecordsPerRequest,
            queries,
            query,
            site,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceDatadog.class,
                "apiKey", apiKey,
                "applicationKey", applicationKey,
                "endDate", endDate,
                "maxRecordsPerRequest", maxRecordsPerRequest,
                "queries", queries,
                "query", query,
                "site", site,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String applicationKey;
 
        private Optional<? extends String> endDate = Optional.empty();
 
        private Optional<? extends Long> maxRecordsPerRequest;
 
        private Optional<? extends java.util.List<Queries>> queries = Optional.empty();
 
        private Optional<? extends String> query = Optional.empty();
 
        private Optional<? extends Site> site;
 
        private Optional<? extends String> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Datadog API key
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Datadog application key
         */
        public Builder applicationKey(String applicationKey) {
            Utils.checkNotNull(applicationKey, "applicationKey");
            this.applicationKey = applicationKey;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Data after this date will  not be replicated. An empty value will represent the current datetime for each  execution. This just applies to Incremental syncs.
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Data after this date will  not be replicated. An empty value will represent the current datetime for each  execution. This just applies to Incremental syncs.
         */
        public Builder endDate(Optional<? extends String> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * Maximum number of records to collect per request.
         */
        public Builder maxRecordsPerRequest(long maxRecordsPerRequest) {
            Utils.checkNotNull(maxRecordsPerRequest, "maxRecordsPerRequest");
            this.maxRecordsPerRequest = Optional.ofNullable(maxRecordsPerRequest);
            return this;
        }

        /**
         * Maximum number of records to collect per request.
         */
        public Builder maxRecordsPerRequest(Optional<? extends Long> maxRecordsPerRequest) {
            Utils.checkNotNull(maxRecordsPerRequest, "maxRecordsPerRequest");
            this.maxRecordsPerRequest = maxRecordsPerRequest;
            return this;
        }

        /**
         * List of queries to be run and used as inputs.
         */
        public Builder queries(java.util.List<Queries> queries) {
            Utils.checkNotNull(queries, "queries");
            this.queries = Optional.ofNullable(queries);
            return this;
        }

        /**
         * List of queries to be run and used as inputs.
         */
        public Builder queries(Optional<? extends java.util.List<Queries>> queries) {
            Utils.checkNotNull(queries, "queries");
            this.queries = queries;
            return this;
        }

        /**
         * The search query. This just applies to Incremental syncs. If empty, it'll collect all logs.
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * The search query. This just applies to Incremental syncs. If empty, it'll collect all logs.
         */
        public Builder query(Optional<? extends String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }

        /**
         * The site where Datadog data resides in.
         */
        public Builder site(Site site) {
            Utils.checkNotNull(site, "site");
            this.site = Optional.ofNullable(site);
            return this;
        }

        /**
         * The site where Datadog data resides in.
         */
        public Builder site(Optional<? extends Site> site) {
            Utils.checkNotNull(site, "site");
            this.site = site;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This just applies to Incremental syncs.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. This just applies to Incremental syncs.
         */
        public Builder startDate(Optional<? extends String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceDatadog build() {
            if (maxRecordsPerRequest == null) {
                maxRecordsPerRequest = _SINGLETON_VALUE_MaxRecordsPerRequest.value();
            }
            if (site == null) {
                site = _SINGLETON_VALUE_Site.value();
            }
            return new SourceDatadog(
                apiKey,
                applicationKey,
                endDate,
                maxRecordsPerRequest,
                queries,
                query,
                site,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_MaxRecordsPerRequest =
                new LazySingletonValue<>(
                        "max_records_per_request",
                        "5000",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Site>> _SINGLETON_VALUE_Site =
                new LazySingletonValue<>(
                        "site",
                        "\"datadoghq.com\"",
                        new TypeReference<Optional<? extends Site>>() {});

        private static final LazySingletonValue<Datadog> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"datadog\"",
                        new TypeReference<Datadog>() {});
    }
}

