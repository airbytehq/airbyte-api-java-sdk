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


public class SourceFactorial {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Max records per page limit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    private Optional<String> limit;

    @JsonProperty("sourceType")
    private Factorial sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceFactorial(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("limit") Optional<String> limit,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.limit = limit;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceFactorial(
            String apiKey,
            OffsetDateTime startDate) {
        this(apiKey, Optional.empty(), startDate);
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Max records per page limit
     */
    @JsonIgnore
    public Optional<String> limit() {
        return limit;
    }

    @JsonIgnore
    public Factorial sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceFactorial withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Max records per page limit
     */
    public SourceFactorial withLimit(String limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Max records per page limit
     */
    public SourceFactorial withLimit(Optional<String> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public SourceFactorial withStartDate(OffsetDateTime startDate) {
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
        SourceFactorial other = (SourceFactorial) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            limit,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceFactorial.class,
                "apiKey", apiKey,
                "limit", limit,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> limit;
 
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
        public Builder limit(Optional<String> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceFactorial build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }            return new SourceFactorial(
                apiKey,
                limit,
                startDate);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "\"50\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Factorial> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"factorial\"",
                        new TypeReference<Factorial>() {});
    }
}

