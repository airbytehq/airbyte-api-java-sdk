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

public class SourceChameleon {

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("end_date")
    private OffsetDateTime endDate;

    /**
     * Filter for using in the `segments_experiences` stream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<? extends Filter> filter;

    /**
     * Max records per page limit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    private Optional<? extends String> limit;

    @JsonProperty("sourceType")
    private Chameleon sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceChameleon(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("end_date") OffsetDateTime endDate,
            @JsonProperty("filter") Optional<? extends Filter> filter,
            @JsonProperty("limit") Optional<? extends String> limit,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.endDate = endDate;
        this.filter = filter;
        this.limit = limit;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceChameleon(
            String apiKey,
            OffsetDateTime endDate,
            OffsetDateTime startDate) {
        this(apiKey, endDate, Optional.empty(), Optional.empty(), startDate);
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public OffsetDateTime endDate() {
        return endDate;
    }

    /**
     * Filter for using in the `segments_experiences` stream
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Filter> filter() {
        return (Optional<Filter>) filter;
    }

    /**
     * Max records per page limit
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> limit() {
        return (Optional<String>) limit;
    }

    @JsonIgnore
    public Chameleon sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceChameleon withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public SourceChameleon withEndDate(OffsetDateTime endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Filter for using in the `segments_experiences` stream
     */
    public SourceChameleon withFilter(Filter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * Filter for using in the `segments_experiences` stream
     */
    public SourceChameleon withFilter(Optional<? extends Filter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * Max records per page limit
     */
    public SourceChameleon withLimit(String limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Max records per page limit
     */
    public SourceChameleon withLimit(Optional<? extends String> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public SourceChameleon withStartDate(OffsetDateTime startDate) {
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
        SourceChameleon other = (SourceChameleon) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.endDate, other.endDate) &&
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            endDate,
            filter,
            limit,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceChameleon.class,
                "apiKey", apiKey,
                "endDate", endDate,
                "filter", filter,
                "limit", limit,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private OffsetDateTime endDate;
 
        private Optional<? extends Filter> filter;
 
        private Optional<? extends String> limit;
 
        private OffsetDateTime startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder endDate(OffsetDateTime endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * Filter for using in the `segments_experiences` stream
         */
        public Builder filter(Filter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * Filter for using in the `segments_experiences` stream
         */
        public Builder filter(Optional<? extends Filter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * Max records per page limit
         */
        public Builder limit(String limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Max records per page limit
         */
        public Builder limit(Optional<? extends String> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceChameleon build() {
            if (filter == null) {
                filter = _SINGLETON_VALUE_Filter.value();
            }
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            return new SourceChameleon(
                apiKey,
                endDate,
                filter,
                limit,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Filter>> _SINGLETON_VALUE_Filter =
                new LazySingletonValue<>(
                        "filter",
                        "\"tour\"",
                        new TypeReference<Optional<? extends Filter>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "\"50\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Chameleon> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"chameleon\"",
                        new TypeReference<Chameleon>() {});
    }
}
