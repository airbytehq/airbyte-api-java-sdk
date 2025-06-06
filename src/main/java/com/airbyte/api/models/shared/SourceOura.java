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

public class SourceOura {

    /**
     * API Key
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * End datetime to sync until. Default is current UTC datetime.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_datetime")
    private Optional<OffsetDateTime> endDatetime;

    @JsonProperty("sourceType")
    private Oura sourceType;

    /**
     * Start datetime to sync from. Default is current UTC datetime minus 1
     * day.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_datetime")
    private Optional<OffsetDateTime> startDatetime;

    @JsonCreator
    public SourceOura(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("end_datetime") Optional<OffsetDateTime> endDatetime,
            @JsonProperty("start_datetime") Optional<OffsetDateTime> startDatetime) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(endDatetime, "endDatetime");
        Utils.checkNotNull(startDatetime, "startDatetime");
        this.apiKey = apiKey;
        this.endDatetime = endDatetime;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDatetime = startDatetime;
    }
    
    public SourceOura(
            String apiKey) {
        this(apiKey, Optional.empty(), Optional.empty());
    }

    /**
     * API Key
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * End datetime to sync until. Default is current UTC datetime.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> endDatetime() {
        return endDatetime;
    }

    @JsonIgnore
    public Oura sourceType() {
        return sourceType;
    }

    /**
     * Start datetime to sync from. Default is current UTC datetime minus 1
     * day.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDatetime() {
        return startDatetime;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * API Key
     */
    public SourceOura withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * End datetime to sync until. Default is current UTC datetime.
     */
    public SourceOura withEndDatetime(OffsetDateTime endDatetime) {
        Utils.checkNotNull(endDatetime, "endDatetime");
        this.endDatetime = Optional.ofNullable(endDatetime);
        return this;
    }

    /**
     * End datetime to sync until. Default is current UTC datetime.
     */
    public SourceOura withEndDatetime(Optional<OffsetDateTime> endDatetime) {
        Utils.checkNotNull(endDatetime, "endDatetime");
        this.endDatetime = endDatetime;
        return this;
    }

    /**
     * Start datetime to sync from. Default is current UTC datetime minus 1
     * day.
     */
    public SourceOura withStartDatetime(OffsetDateTime startDatetime) {
        Utils.checkNotNull(startDatetime, "startDatetime");
        this.startDatetime = Optional.ofNullable(startDatetime);
        return this;
    }

    /**
     * Start datetime to sync from. Default is current UTC datetime minus 1
     * day.
     */
    public SourceOura withStartDatetime(Optional<OffsetDateTime> startDatetime) {
        Utils.checkNotNull(startDatetime, "startDatetime");
        this.startDatetime = startDatetime;
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
        SourceOura other = (SourceOura) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.endDatetime, other.endDatetime) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDatetime, other.startDatetime);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            endDatetime,
            sourceType,
            startDatetime);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOura.class,
                "apiKey", apiKey,
                "endDatetime", endDatetime,
                "sourceType", sourceType,
                "startDatetime", startDatetime);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<OffsetDateTime> endDatetime = Optional.empty();
 
        private Optional<OffsetDateTime> startDatetime = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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
         * End datetime to sync until. Default is current UTC datetime.
         */
        public Builder endDatetime(OffsetDateTime endDatetime) {
            Utils.checkNotNull(endDatetime, "endDatetime");
            this.endDatetime = Optional.ofNullable(endDatetime);
            return this;
        }

        /**
         * End datetime to sync until. Default is current UTC datetime.
         */
        public Builder endDatetime(Optional<OffsetDateTime> endDatetime) {
            Utils.checkNotNull(endDatetime, "endDatetime");
            this.endDatetime = endDatetime;
            return this;
        }

        /**
         * Start datetime to sync from. Default is current UTC datetime minus 1
         * day.
         */
        public Builder startDatetime(OffsetDateTime startDatetime) {
            Utils.checkNotNull(startDatetime, "startDatetime");
            this.startDatetime = Optional.ofNullable(startDatetime);
            return this;
        }

        /**
         * Start datetime to sync from. Default is current UTC datetime minus 1
         * day.
         */
        public Builder startDatetime(Optional<OffsetDateTime> startDatetime) {
            Utils.checkNotNull(startDatetime, "startDatetime");
            this.startDatetime = startDatetime;
            return this;
        }
        
        public SourceOura build() {
            return new SourceOura(
                apiKey,
                endDatetime,
                startDatetime);
        }

        private static final LazySingletonValue<Oura> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"oura\"",
                        new TypeReference<Oura>() {});
    }
}
