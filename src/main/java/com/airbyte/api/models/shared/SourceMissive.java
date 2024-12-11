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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class SourceMissive {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Kind parameter for `contact_groups` stream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("kind")
    private Optional<? extends Kind> kind;

    /**
     * Max records per page limit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    private Optional<String> limit;

    @JsonProperty("sourceType")
    private Missive sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceMissive(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("kind") Optional<? extends Kind> kind,
            @JsonProperty("limit") Optional<String> limit,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(kind, "kind");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.kind = kind;
        this.limit = limit;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceMissive(
            String apiKey,
            OffsetDateTime startDate) {
        this(apiKey, Optional.empty(), Optional.empty(), startDate);
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Kind parameter for `contact_groups` stream
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Kind> kind() {
        return (Optional<Kind>) kind;
    }

    /**
     * Max records per page limit
     */
    @JsonIgnore
    public Optional<String> limit() {
        return limit;
    }

    @JsonIgnore
    public Missive sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceMissive withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Kind parameter for `contact_groups` stream
     */
    public SourceMissive withKind(Kind kind) {
        Utils.checkNotNull(kind, "kind");
        this.kind = Optional.ofNullable(kind);
        return this;
    }

    /**
     * Kind parameter for `contact_groups` stream
     */
    public SourceMissive withKind(Optional<? extends Kind> kind) {
        Utils.checkNotNull(kind, "kind");
        this.kind = kind;
        return this;
    }

    /**
     * Max records per page limit
     */
    public SourceMissive withLimit(String limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Max records per page limit
     */
    public SourceMissive withLimit(Optional<String> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public SourceMissive withStartDate(OffsetDateTime startDate) {
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
        SourceMissive other = (SourceMissive) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.kind, other.kind) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            kind,
            limit,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMissive.class,
                "apiKey", apiKey,
                "kind", kind,
                "limit", limit,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<? extends Kind> kind;
 
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
         * Kind parameter for `contact_groups` stream
         */
        public Builder kind(Kind kind) {
            Utils.checkNotNull(kind, "kind");
            this.kind = Optional.ofNullable(kind);
            return this;
        }

        /**
         * Kind parameter for `contact_groups` stream
         */
        public Builder kind(Optional<? extends Kind> kind) {
            Utils.checkNotNull(kind, "kind");
            this.kind = kind;
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
        
        public SourceMissive build() {
            if (kind == null) {
                kind = _SINGLETON_VALUE_Kind.value();
            }
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }            return new SourceMissive(
                apiKey,
                kind,
                limit,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Kind>> _SINGLETON_VALUE_Kind =
                new LazySingletonValue<>(
                        "kind",
                        "\"group\"",
                        new TypeReference<Optional<? extends Kind>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "\"50\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Missive> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"missive\"",
                        new TypeReference<Missive>() {});
    }
}

