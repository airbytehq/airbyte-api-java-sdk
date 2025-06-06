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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * FirstNEntries
 * 
 * <p>Log first N entries per stream.
 */
public class FirstNEntries {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logging_type")
    private Optional<? extends LoggingType> loggingType;

    /**
     * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_entry_count")
    private Optional<Double> maxEntryCount;

    @JsonCreator
    public FirstNEntries(
            @JsonProperty("logging_type") Optional<? extends LoggingType> loggingType,
            @JsonProperty("max_entry_count") Optional<Double> maxEntryCount) {
        Utils.checkNotNull(loggingType, "loggingType");
        Utils.checkNotNull(maxEntryCount, "maxEntryCount");
        this.additionalProperties = new HashMap<>();
        this.loggingType = loggingType;
        this.maxEntryCount = maxEntryCount;
    }
    
    public FirstNEntries() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LoggingType> loggingType() {
        return (Optional<LoggingType>) loggingType;
    }

    /**
     * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
     */
    @JsonIgnore
    public Optional<Double> maxEntryCount() {
        return maxEntryCount;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    @JsonAnySetter
    public FirstNEntries withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }    

    public FirstNEntries withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
    }

    public FirstNEntries withLoggingType(LoggingType loggingType) {
        Utils.checkNotNull(loggingType, "loggingType");
        this.loggingType = Optional.ofNullable(loggingType);
        return this;
    }

    public FirstNEntries withLoggingType(Optional<? extends LoggingType> loggingType) {
        Utils.checkNotNull(loggingType, "loggingType");
        this.loggingType = loggingType;
        return this;
    }

    /**
     * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
     */
    public FirstNEntries withMaxEntryCount(double maxEntryCount) {
        Utils.checkNotNull(maxEntryCount, "maxEntryCount");
        this.maxEntryCount = Optional.ofNullable(maxEntryCount);
        return this;
    }

    /**
     * Number of entries to log. This destination is for testing only. So it won't make sense to log infinitely. The maximum is 1,000 entries.
     */
    public FirstNEntries withMaxEntryCount(Optional<Double> maxEntryCount) {
        Utils.checkNotNull(maxEntryCount, "maxEntryCount");
        this.maxEntryCount = maxEntryCount;
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
        FirstNEntries other = (FirstNEntries) o;
        return 
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.loggingType, other.loggingType) &&
            Objects.deepEquals(this.maxEntryCount, other.maxEntryCount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            loggingType,
            maxEntryCount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FirstNEntries.class,
                "additionalProperties", additionalProperties,
                "loggingType", loggingType,
                "maxEntryCount", maxEntryCount);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();
 
        private Optional<? extends LoggingType> loggingType;
 
        private Optional<Double> maxEntryCount;
        
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

        public Builder loggingType(LoggingType loggingType) {
            Utils.checkNotNull(loggingType, "loggingType");
            this.loggingType = Optional.ofNullable(loggingType);
            return this;
        }

        public Builder loggingType(Optional<? extends LoggingType> loggingType) {
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
        
        public FirstNEntries build() {
            if (loggingType == null) {
                loggingType = _SINGLETON_VALUE_LoggingType.value();
            }
            if (maxEntryCount == null) {
                maxEntryCount = _SINGLETON_VALUE_MaxEntryCount.value();
            }
            return new FirstNEntries(
                loggingType,
                maxEntryCount)
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<Optional<? extends LoggingType>> _SINGLETON_VALUE_LoggingType =
                new LazySingletonValue<>(
                        "logging_type",
                        "\"FirstN\"",
                        new TypeReference<Optional<? extends LoggingType>>() {});

        private static final LazySingletonValue<Optional<Double>> _SINGLETON_VALUE_MaxEntryCount =
                new LazySingletonValue<>(
                        "max_entry_count",
                        "100",
                        new TypeReference<Optional<Double>>() {});
    }
}
