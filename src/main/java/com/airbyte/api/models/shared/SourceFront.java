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

public class SourceFront {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Page limit for the responses
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_limit")
    private Optional<? extends String> pageLimit;

    @JsonProperty("sourceType")
    private Front sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceFront(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("page_limit") Optional<? extends String> pageLimit,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(pageLimit, "pageLimit");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.pageLimit = pageLimit;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceFront(
            String apiKey,
            OffsetDateTime startDate) {
        this(apiKey, Optional.empty(), startDate);
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Page limit for the responses
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> pageLimit() {
        return (Optional<String>) pageLimit;
    }

    @JsonIgnore
    public Front sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceFront withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Page limit for the responses
     */
    public SourceFront withPageLimit(String pageLimit) {
        Utils.checkNotNull(pageLimit, "pageLimit");
        this.pageLimit = Optional.ofNullable(pageLimit);
        return this;
    }

    /**
     * Page limit for the responses
     */
    public SourceFront withPageLimit(Optional<? extends String> pageLimit) {
        Utils.checkNotNull(pageLimit, "pageLimit");
        this.pageLimit = pageLimit;
        return this;
    }

    public SourceFront withStartDate(OffsetDateTime startDate) {
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
        SourceFront other = (SourceFront) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.pageLimit, other.pageLimit) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            pageLimit,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceFront.class,
                "apiKey", apiKey,
                "pageLimit", pageLimit,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<? extends String> pageLimit;
 
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
         * Page limit for the responses
         */
        public Builder pageLimit(String pageLimit) {
            Utils.checkNotNull(pageLimit, "pageLimit");
            this.pageLimit = Optional.ofNullable(pageLimit);
            return this;
        }

        /**
         * Page limit for the responses
         */
        public Builder pageLimit(Optional<? extends String> pageLimit) {
            Utils.checkNotNull(pageLimit, "pageLimit");
            this.pageLimit = pageLimit;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceFront build() {
            if (pageLimit == null) {
                pageLimit = _SINGLETON_VALUE_PageLimit.value();
            }
            return new SourceFront(
                apiKey,
                pageLimit,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_PageLimit =
                new LazySingletonValue<>(
                        "page_limit",
                        "\"50\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Front> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"front\"",
                        new TypeReference<Front>() {});
    }
}

