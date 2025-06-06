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

public class SourceSimplesat {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Date till when the sync should end
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<OffsetDateTime> endDate;

    @JsonProperty("sourceType")
    private Simplesat sourceType;

    /**
     * Date from when the sync should start
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<OffsetDateTime> startDate;

    @JsonCreator
    public SourceSimplesat(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("end_date") Optional<OffsetDateTime> endDate,
            @JsonProperty("start_date") Optional<OffsetDateTime> startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.endDate = endDate;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceSimplesat(
            String apiKey) {
        this(apiKey, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Date till when the sync should end
     */
    @JsonIgnore
    public Optional<OffsetDateTime> endDate() {
        return endDate;
    }

    @JsonIgnore
    public Simplesat sourceType() {
        return sourceType;
    }

    /**
     * Date from when the sync should start
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceSimplesat withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Date till when the sync should end
     */
    public SourceSimplesat withEndDate(OffsetDateTime endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * Date till when the sync should end
     */
    public SourceSimplesat withEndDate(Optional<OffsetDateTime> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Date from when the sync should start
     */
    public SourceSimplesat withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * Date from when the sync should start
     */
    public SourceSimplesat withStartDate(Optional<OffsetDateTime> startDate) {
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
        SourceSimplesat other = (SourceSimplesat) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            endDate,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSimplesat.class,
                "apiKey", apiKey,
                "endDate", endDate,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<OffsetDateTime> endDate = Optional.empty();
 
        private Optional<OffsetDateTime> startDate = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Date till when the sync should end
         */
        public Builder endDate(OffsetDateTime endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * Date till when the sync should end
         */
        public Builder endDate(Optional<OffsetDateTime> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * Date from when the sync should start
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * Date from when the sync should start
         */
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceSimplesat build() {
            return new SourceSimplesat(
                apiKey,
                endDate,
                startDate);
        }

        private static final LazySingletonValue<Simplesat> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"simplesat\"",
                        new TypeReference<Simplesat>() {});
    }
}
