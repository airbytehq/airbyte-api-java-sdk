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

public class SourceInsightly {

    @JsonProperty("sourceType")
    private Insightly sourceType;

    /**
     * The date from which you'd like to replicate data for Insightly in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only for incremental streams.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("start_date")
    private Optional<OffsetDateTime> startDate;

    /**
     * Your Insightly API token.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("token")
    private Optional<String> token;

    @JsonCreator
    public SourceInsightly(
            @JsonProperty("start_date") Optional<OffsetDateTime> startDate,
            @JsonProperty("token") Optional<String> token) {
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(token, "token");
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.token = token;
    }
    
    public SourceInsightly() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Insightly sourceType() {
        return sourceType;
    }

    /**
     * The date from which you'd like to replicate data for Insightly in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only for incremental streams.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return startDate;
    }

    /**
     * Your Insightly API token.
     */
    @JsonIgnore
    public Optional<String> token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The date from which you'd like to replicate data for Insightly in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only for incremental streams.
     */
    public SourceInsightly withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The date from which you'd like to replicate data for Insightly in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only for incremental streams.
     */
    public SourceInsightly withStartDate(Optional<OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Your Insightly API token.
     */
    public SourceInsightly withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = Optional.ofNullable(token);
        return this;
    }

    /**
     * Your Insightly API token.
     */
    public SourceInsightly withToken(Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
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
        SourceInsightly other = (SourceInsightly) o;
        return 
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sourceType,
            startDate,
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceInsightly.class,
                "sourceType", sourceType,
                "startDate", startDate,
                "token", token);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> startDate = Optional.empty();
 
        private Optional<String> token = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The date from which you'd like to replicate data for Insightly in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only for incremental streams.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The date from which you'd like to replicate data for Insightly in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated. Note that it will be used only for incremental streams.
         */
        public Builder startDate(Optional<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Your Insightly API token.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = Optional.ofNullable(token);
            return this;
        }

        /**
         * Your Insightly API token.
         */
        public Builder token(Optional<String> token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public SourceInsightly build() {
            return new SourceInsightly(
                startDate,
                token);
        }

        private static final LazySingletonValue<Insightly> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"insightly\"",
                        new TypeReference<Insightly>() {});
    }
}
