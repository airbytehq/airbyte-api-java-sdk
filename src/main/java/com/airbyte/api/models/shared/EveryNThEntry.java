/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Double;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * EveryNThEntry - For each stream, log every N-th entry with a maximum cap.
 */

public class EveryNThEntry {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logging_type")
    private Optional<? extends DestinationDevNullLoggingType> loggingType;

    /**
     * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_entry_count")
    private Optional<Double> maxEntryCount;

    /**
     * The N-th entry to log for each stream. N starts from 1. For example, when N = 1, every entry is logged; when N = 2, every other entry is logged; when N = 3, one out of three entries is logged.
     */
    @JsonProperty("nth_entry_to_log")
    private long nthEntryToLog;

    @JsonCreator
    public EveryNThEntry(
            @JsonProperty("logging_type") Optional<? extends DestinationDevNullLoggingType> loggingType,
            @JsonProperty("max_entry_count") Optional<Double> maxEntryCount,
            @JsonProperty("nth_entry_to_log") long nthEntryToLog) {
        Utils.checkNotNull(loggingType, "loggingType");
        Utils.checkNotNull(maxEntryCount, "maxEntryCount");
        Utils.checkNotNull(nthEntryToLog, "nthEntryToLog");
        this.additionalProperties = new HashMap<>();
        this.loggingType = loggingType;
        this.maxEntryCount = maxEntryCount;
        this.nthEntryToLog = nthEntryToLog;
    }
    
    public EveryNThEntry(
            long nthEntryToLog) {
        this(Optional.empty(), Optional.empty(), nthEntryToLog);
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationDevNullLoggingType> loggingType() {
        return (Optional<DestinationDevNullLoggingType>) loggingType;
    }

    /**
     * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
     */
    @JsonIgnore
    public Optional<Double> maxEntryCount() {
        return maxEntryCount;
    }

    /**
     * The N-th entry to log for each stream. N starts from 1. For example, when N = 1, every entry is logged; when N = 2, every other entry is logged; when N = 3, one out of three entries is logged.
     */
    @JsonIgnore
    public long nthEntryToLog() {
        return nthEntryToLog;
    }

    public final static Builder builder() {
        return new Builder();
    }

    @JsonAnySetter
    public EveryNThEntry withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }
    
    public EveryNThEntry withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
    }

    public EveryNThEntry withLoggingType(DestinationDevNullLoggingType loggingType) {
        Utils.checkNotNull(loggingType, "loggingType");
        this.loggingType = Optional.ofNullable(loggingType);
        return this;
    }

    public EveryNThEntry withLoggingType(Optional<? extends DestinationDevNullLoggingType> loggingType) {
        Utils.checkNotNull(loggingType, "loggingType");
        this.loggingType = loggingType;
        return this;
    }

    /**
     * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
     */
    public EveryNThEntry withMaxEntryCount(double maxEntryCount) {
        Utils.checkNotNull(maxEntryCount, "maxEntryCount");
        this.maxEntryCount = Optional.ofNullable(maxEntryCount);
        return this;
    }

    /**
     * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
     */
    public EveryNThEntry withMaxEntryCount(Optional<Double> maxEntryCount) {
        Utils.checkNotNull(maxEntryCount, "maxEntryCount");
        this.maxEntryCount = maxEntryCount;
        return this;
    }

    /**
     * The N-th entry to log for each stream. N starts from 1. For example, when N = 1, every entry is logged; when N = 2, every other entry is logged; when N = 3, one out of three entries is logged.
     */
    public EveryNThEntry withNthEntryToLog(long nthEntryToLog) {
        Utils.checkNotNull(nthEntryToLog, "nthEntryToLog");
        this.nthEntryToLog = nthEntryToLog;
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
        EveryNThEntry other = (EveryNThEntry) o;
        return 
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.loggingType, other.loggingType) &&
            Objects.deepEquals(this.maxEntryCount, other.maxEntryCount) &&
            Objects.deepEquals(this.nthEntryToLog, other.nthEntryToLog);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            loggingType,
            maxEntryCount,
            nthEntryToLog);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EveryNThEntry.class,
                "additionalProperties", additionalProperties,
                "loggingType", loggingType,
                "maxEntryCount", maxEntryCount,
                "nthEntryToLog", nthEntryToLog);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();
 
        private Optional<? extends DestinationDevNullLoggingType> loggingType;
 
        private Optional<Double> maxEntryCount;
 
        private Long nthEntryToLog;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalProperty(String key, Object value) {
            Utils.checkNotNull(key, "key");
            // we could be strict about null values (force the user
            // to pass `JsonNullable.of(null)`) but likely to be a bit 
            // annoying for additional properties building so we'll 
            // relax preconditions.
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
        }

        public Builder loggingType(DestinationDevNullLoggingType loggingType) {
            Utils.checkNotNull(loggingType, "loggingType");
            this.loggingType = Optional.ofNullable(loggingType);
            return this;
        }

        public Builder loggingType(Optional<? extends DestinationDevNullLoggingType> loggingType) {
            Utils.checkNotNull(loggingType, "loggingType");
            this.loggingType = loggingType;
            return this;
        }

        /**
         * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
         */
        public Builder maxEntryCount(double maxEntryCount) {
            Utils.checkNotNull(maxEntryCount, "maxEntryCount");
            this.maxEntryCount = Optional.ofNullable(maxEntryCount);
            return this;
        }

        /**
         * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
         */
        public Builder maxEntryCount(Optional<Double> maxEntryCount) {
            Utils.checkNotNull(maxEntryCount, "maxEntryCount");
            this.maxEntryCount = maxEntryCount;
            return this;
        }

        /**
         * The N-th entry to log for each stream. N starts from 1. For example, when N = 1, every entry is logged; when N = 2, every other entry is logged; when N = 3, one out of three entries is logged.
         */
        public Builder nthEntryToLog(long nthEntryToLog) {
            Utils.checkNotNull(nthEntryToLog, "nthEntryToLog");
            this.nthEntryToLog = nthEntryToLog;
            return this;
        }
        
        public EveryNThEntry build() {
            if (loggingType == null) {
                loggingType = _SINGLETON_VALUE_LoggingType.value();
            }
            if (maxEntryCount == null) {
                maxEntryCount = _SINGLETON_VALUE_MaxEntryCount.value();
            }            return new EveryNThEntry(
                loggingType,
                maxEntryCount,
                nthEntryToLog)
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<Optional<? extends DestinationDevNullLoggingType>> _SINGLETON_VALUE_LoggingType =
                new LazySingletonValue<>(
                        "logging_type",
                        "\"EveryNth\"",
                        new TypeReference<Optional<? extends DestinationDevNullLoggingType>>() {});

        private static final LazySingletonValue<Optional<Double>> _SINGLETON_VALUE_MaxEntryCount =
                new LazySingletonValue<>(
                        "max_entry_count",
                        "100",
                        new TypeReference<Optional<Double>>() {});
    }
}

