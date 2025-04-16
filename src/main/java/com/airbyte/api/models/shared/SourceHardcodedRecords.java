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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class SourceHardcodedRecords {

    /**
     * How many records per stream should be generated
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count")
    private Optional<Long> count;

    @JsonProperty("sourceType")
    private HardcodedRecords sourceType;

    @JsonCreator
    public SourceHardcodedRecords(
            @JsonProperty("count") Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceHardcodedRecords() {
        this(Optional.empty());
    }

    /**
     * How many records per stream should be generated
     */
    @JsonIgnore
    public Optional<Long> count() {
        return count;
    }

    @JsonIgnore
    public HardcodedRecords sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * How many records per stream should be generated
     */
    public SourceHardcodedRecords withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    /**
     * How many records per stream should be generated
     */
    public SourceHardcodedRecords withCount(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
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
        SourceHardcodedRecords other = (SourceHardcodedRecords) o;
        return 
            Objects.deepEquals(this.count, other.count) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            count,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceHardcodedRecords.class,
                "count", count,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<Long> count;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * How many records per stream should be generated
         */
        public Builder count(long count) {
            Utils.checkNotNull(count, "count");
            this.count = Optional.ofNullable(count);
            return this;
        }

        /**
         * How many records per stream should be generated
         */
        public Builder count(Optional<Long> count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }
        
        public SourceHardcodedRecords build() {
            if (count == null) {
                count = _SINGLETON_VALUE_Count.value();
            }
            return new SourceHardcodedRecords(
                count);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Count =
                new LazySingletonValue<>(
                        "count",
                        "1000",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<HardcodedRecords> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"hardcoded-records\"",
                        new TypeReference<HardcodedRecords>() {});
    }
}
