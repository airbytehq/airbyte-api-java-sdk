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


public class SourceUsCensus {

    /**
     * Your API Key. Get your key &lt;a href="https://api.census.gov/data/key_signup.html"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * The query parameters portion of the GET request, without the api key
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query_params")
    private Optional<? extends String> queryParams;

    /**
     * The path portion of the GET request
     */
    @JsonProperty("query_path")
    private String queryPath;

    @JsonProperty("sourceType")
    private UsCensus sourceType;

    @JsonCreator
    public SourceUsCensus(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("query_params") Optional<? extends String> queryParams,
            @JsonProperty("query_path") String queryPath) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(queryParams, "queryParams");
        Utils.checkNotNull(queryPath, "queryPath");
        this.apiKey = apiKey;
        this.queryParams = queryParams;
        this.queryPath = queryPath;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceUsCensus(
            String apiKey,
            String queryPath) {
        this(apiKey, Optional.empty(), queryPath);
    }

    /**
     * Your API Key. Get your key &lt;a href="https://api.census.gov/data/key_signup.html"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * The query parameters portion of the GET request, without the api key
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> queryParams() {
        return (Optional<String>) queryParams;
    }

    /**
     * The path portion of the GET request
     */
    @JsonIgnore
    public String queryPath() {
        return queryPath;
    }

    @JsonIgnore
    public UsCensus sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your API Key. Get your key &lt;a href="https://api.census.gov/data/key_signup.html"&gt;here&lt;/a&gt;.
     */
    public SourceUsCensus withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The query parameters portion of the GET request, without the api key
     */
    public SourceUsCensus withQueryParams(String queryParams) {
        Utils.checkNotNull(queryParams, "queryParams");
        this.queryParams = Optional.ofNullable(queryParams);
        return this;
    }

    /**
     * The query parameters portion of the GET request, without the api key
     */
    public SourceUsCensus withQueryParams(Optional<? extends String> queryParams) {
        Utils.checkNotNull(queryParams, "queryParams");
        this.queryParams = queryParams;
        return this;
    }

    /**
     * The path portion of the GET request
     */
    public SourceUsCensus withQueryPath(String queryPath) {
        Utils.checkNotNull(queryPath, "queryPath");
        this.queryPath = queryPath;
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
        SourceUsCensus other = (SourceUsCensus) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.queryParams, other.queryParams) &&
            java.util.Objects.deepEquals(this.queryPath, other.queryPath) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            queryParams,
            queryPath,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceUsCensus.class,
                "apiKey", apiKey,
                "queryParams", queryParams,
                "queryPath", queryPath,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<? extends String> queryParams = Optional.empty();
 
        private String queryPath;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your API Key. Get your key &lt;a href="https://api.census.gov/data/key_signup.html"&gt;here&lt;/a&gt;.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The query parameters portion of the GET request, without the api key
         */
        public Builder queryParams(String queryParams) {
            Utils.checkNotNull(queryParams, "queryParams");
            this.queryParams = Optional.ofNullable(queryParams);
            return this;
        }

        /**
         * The query parameters portion of the GET request, without the api key
         */
        public Builder queryParams(Optional<? extends String> queryParams) {
            Utils.checkNotNull(queryParams, "queryParams");
            this.queryParams = queryParams;
            return this;
        }

        /**
         * The path portion of the GET request
         */
        public Builder queryPath(String queryPath) {
            Utils.checkNotNull(queryPath, "queryPath");
            this.queryPath = queryPath;
            return this;
        }
        
        public SourceUsCensus build() {
            return new SourceUsCensus(
                apiKey,
                queryParams,
                queryPath);
        }

        private static final LazySingletonValue<UsCensus> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"us-census\"",
                        new TypeReference<UsCensus>() {});
    }
}
