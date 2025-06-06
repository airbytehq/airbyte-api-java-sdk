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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class SourceMention {

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Mention sourceType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stats_end_date")
    private Optional<LocalDate> statsEndDate;

    /**
     * Periodicity of statistics returned. it may be daily(P1D), weekly(P1W) or monthly(P1M).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stats_interval")
    private Optional<? extends StatisticsInterval> statsInterval;

    @JsonProperty("stats_start_date")
    private OffsetDateTime statsStartDate;

    @JsonCreator
    public SourceMention(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("stats_end_date") Optional<LocalDate> statsEndDate,
            @JsonProperty("stats_interval") Optional<? extends StatisticsInterval> statsInterval,
            @JsonProperty("stats_start_date") OffsetDateTime statsStartDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(statsEndDate, "statsEndDate");
        Utils.checkNotNull(statsInterval, "statsInterval");
        Utils.checkNotNull(statsStartDate, "statsStartDate");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.statsEndDate = statsEndDate;
        this.statsInterval = statsInterval;
        this.statsStartDate = statsStartDate;
    }
    
    public SourceMention(
            String apiKey,
            OffsetDateTime statsStartDate) {
        this(apiKey, Optional.empty(), Optional.empty(), statsStartDate);
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Mention sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public Optional<LocalDate> statsEndDate() {
        return statsEndDate;
    }

    /**
     * Periodicity of statistics returned. it may be daily(P1D), weekly(P1W) or monthly(P1M).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<StatisticsInterval> statsInterval() {
        return (Optional<StatisticsInterval>) statsInterval;
    }

    @JsonIgnore
    public OffsetDateTime statsStartDate() {
        return statsStartDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceMention withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public SourceMention withStatsEndDate(LocalDate statsEndDate) {
        Utils.checkNotNull(statsEndDate, "statsEndDate");
        this.statsEndDate = Optional.ofNullable(statsEndDate);
        return this;
    }

    public SourceMention withStatsEndDate(Optional<LocalDate> statsEndDate) {
        Utils.checkNotNull(statsEndDate, "statsEndDate");
        this.statsEndDate = statsEndDate;
        return this;
    }

    /**
     * Periodicity of statistics returned. it may be daily(P1D), weekly(P1W) or monthly(P1M).
     */
    public SourceMention withStatsInterval(StatisticsInterval statsInterval) {
        Utils.checkNotNull(statsInterval, "statsInterval");
        this.statsInterval = Optional.ofNullable(statsInterval);
        return this;
    }

    /**
     * Periodicity of statistics returned. it may be daily(P1D), weekly(P1W) or monthly(P1M).
     */
    public SourceMention withStatsInterval(Optional<? extends StatisticsInterval> statsInterval) {
        Utils.checkNotNull(statsInterval, "statsInterval");
        this.statsInterval = statsInterval;
        return this;
    }

    public SourceMention withStatsStartDate(OffsetDateTime statsStartDate) {
        Utils.checkNotNull(statsStartDate, "statsStartDate");
        this.statsStartDate = statsStartDate;
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
        SourceMention other = (SourceMention) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.statsEndDate, other.statsEndDate) &&
            Objects.deepEquals(this.statsInterval, other.statsInterval) &&
            Objects.deepEquals(this.statsStartDate, other.statsStartDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            sourceType,
            statsEndDate,
            statsInterval,
            statsStartDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMention.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "statsEndDate", statsEndDate,
                "statsInterval", statsInterval,
                "statsStartDate", statsStartDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<LocalDate> statsEndDate = Optional.empty();
 
        private Optional<? extends StatisticsInterval> statsInterval;
 
        private OffsetDateTime statsStartDate;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder statsEndDate(LocalDate statsEndDate) {
            Utils.checkNotNull(statsEndDate, "statsEndDate");
            this.statsEndDate = Optional.ofNullable(statsEndDate);
            return this;
        }

        public Builder statsEndDate(Optional<LocalDate> statsEndDate) {
            Utils.checkNotNull(statsEndDate, "statsEndDate");
            this.statsEndDate = statsEndDate;
            return this;
        }

        /**
         * Periodicity of statistics returned. it may be daily(P1D), weekly(P1W) or monthly(P1M).
         */
        public Builder statsInterval(StatisticsInterval statsInterval) {
            Utils.checkNotNull(statsInterval, "statsInterval");
            this.statsInterval = Optional.ofNullable(statsInterval);
            return this;
        }

        /**
         * Periodicity of statistics returned. it may be daily(P1D), weekly(P1W) or monthly(P1M).
         */
        public Builder statsInterval(Optional<? extends StatisticsInterval> statsInterval) {
            Utils.checkNotNull(statsInterval, "statsInterval");
            this.statsInterval = statsInterval;
            return this;
        }

        public Builder statsStartDate(OffsetDateTime statsStartDate) {
            Utils.checkNotNull(statsStartDate, "statsStartDate");
            this.statsStartDate = statsStartDate;
            return this;
        }
        
        public SourceMention build() {
            if (statsInterval == null) {
                statsInterval = _SINGLETON_VALUE_StatsInterval.value();
            }
            return new SourceMention(
                apiKey,
                statsEndDate,
                statsInterval,
                statsStartDate);
        }

        private static final LazySingletonValue<Mention> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mention\"",
                        new TypeReference<Mention>() {});

        private static final LazySingletonValue<Optional<? extends StatisticsInterval>> _SINGLETON_VALUE_StatsInterval =
                new LazySingletonValue<>(
                        "stats_interval",
                        "\"P1D\"",
                        new TypeReference<Optional<? extends StatisticsInterval>>() {});
    }
}
