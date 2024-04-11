/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SourceFaker {

    /**
     * Should the updated_at values for every record be new each sync?  Setting this to false will case the source to stop emitting records after COUNT records have been emitted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("always_updated")
    private Optional<? extends Boolean> alwaysUpdated;

    /**
     * How many users should be generated in total. The purchases table will be scaled to match, with 10 purchases created per 10 users. This setting does not apply to the products stream.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count")
    private Optional<? extends Long> count;

    /**
     * How many parallel workers should we use to generate fake data?  Choose a value equal to the number of CPUs you will allocate to this source.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parallelism")
    private Optional<? extends Long> parallelism;

    /**
     * How many fake records will be in each page (stream slice), before a state message is emitted?
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("records_per_slice")
    private Optional<? extends Long> recordsPerSlice;

    /**
     * Manually control the faker random seed to return the same values on subsequent runs (leave -1 for random)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("seed")
    private Optional<? extends Long> seed;

    @JsonProperty("sourceType")
    private Faker sourceType;

    public SourceFaker(
            @JsonProperty("always_updated") Optional<? extends Boolean> alwaysUpdated,
            @JsonProperty("count") Optional<? extends Long> count,
            @JsonProperty("parallelism") Optional<? extends Long> parallelism,
            @JsonProperty("records_per_slice") Optional<? extends Long> recordsPerSlice,
            @JsonProperty("seed") Optional<? extends Long> seed) {
        Utils.checkNotNull(alwaysUpdated, "alwaysUpdated");
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(parallelism, "parallelism");
        Utils.checkNotNull(recordsPerSlice, "recordsPerSlice");
        Utils.checkNotNull(seed, "seed");
        this.alwaysUpdated = alwaysUpdated;
        this.count = count;
        this.parallelism = parallelism;
        this.recordsPerSlice = recordsPerSlice;
        this.seed = seed;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Should the updated_at values for every record be new each sync?  Setting this to false will case the source to stop emitting records after COUNT records have been emitted.
     */
    public Optional<? extends Boolean> alwaysUpdated() {
        return alwaysUpdated;
    }

    /**
     * How many users should be generated in total. The purchases table will be scaled to match, with 10 purchases created per 10 users. This setting does not apply to the products stream.
     */
    public Optional<? extends Long> count() {
        return count;
    }

    /**
     * How many parallel workers should we use to generate fake data?  Choose a value equal to the number of CPUs you will allocate to this source.
     */
    public Optional<? extends Long> parallelism() {
        return parallelism;
    }

    /**
     * How many fake records will be in each page (stream slice), before a state message is emitted?
     */
    public Optional<? extends Long> recordsPerSlice() {
        return recordsPerSlice;
    }

    /**
     * Manually control the faker random seed to return the same values on subsequent runs (leave -1 for random)
     */
    public Optional<? extends Long> seed() {
        return seed;
    }

    public Faker sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Should the updated_at values for every record be new each sync?  Setting this to false will case the source to stop emitting records after COUNT records have been emitted.
     */
    public SourceFaker withAlwaysUpdated(boolean alwaysUpdated) {
        Utils.checkNotNull(alwaysUpdated, "alwaysUpdated");
        this.alwaysUpdated = Optional.ofNullable(alwaysUpdated);
        return this;
    }

    /**
     * Should the updated_at values for every record be new each sync?  Setting this to false will case the source to stop emitting records after COUNT records have been emitted.
     */
    public SourceFaker withAlwaysUpdated(Optional<? extends Boolean> alwaysUpdated) {
        Utils.checkNotNull(alwaysUpdated, "alwaysUpdated");
        this.alwaysUpdated = alwaysUpdated;
        return this;
    }

    /**
     * How many users should be generated in total. The purchases table will be scaled to match, with 10 purchases created per 10 users. This setting does not apply to the products stream.
     */
    public SourceFaker withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    /**
     * How many users should be generated in total. The purchases table will be scaled to match, with 10 purchases created per 10 users. This setting does not apply to the products stream.
     */
    public SourceFaker withCount(Optional<? extends Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    /**
     * How many parallel workers should we use to generate fake data?  Choose a value equal to the number of CPUs you will allocate to this source.
     */
    public SourceFaker withParallelism(long parallelism) {
        Utils.checkNotNull(parallelism, "parallelism");
        this.parallelism = Optional.ofNullable(parallelism);
        return this;
    }

    /**
     * How many parallel workers should we use to generate fake data?  Choose a value equal to the number of CPUs you will allocate to this source.
     */
    public SourceFaker withParallelism(Optional<? extends Long> parallelism) {
        Utils.checkNotNull(parallelism, "parallelism");
        this.parallelism = parallelism;
        return this;
    }

    /**
     * How many fake records will be in each page (stream slice), before a state message is emitted?
     */
    public SourceFaker withRecordsPerSlice(long recordsPerSlice) {
        Utils.checkNotNull(recordsPerSlice, "recordsPerSlice");
        this.recordsPerSlice = Optional.ofNullable(recordsPerSlice);
        return this;
    }

    /**
     * How many fake records will be in each page (stream slice), before a state message is emitted?
     */
    public SourceFaker withRecordsPerSlice(Optional<? extends Long> recordsPerSlice) {
        Utils.checkNotNull(recordsPerSlice, "recordsPerSlice");
        this.recordsPerSlice = recordsPerSlice;
        return this;
    }

    /**
     * Manually control the faker random seed to return the same values on subsequent runs (leave -1 for random)
     */
    public SourceFaker withSeed(long seed) {
        Utils.checkNotNull(seed, "seed");
        this.seed = Optional.ofNullable(seed);
        return this;
    }

    /**
     * Manually control the faker random seed to return the same values on subsequent runs (leave -1 for random)
     */
    public SourceFaker withSeed(Optional<? extends Long> seed) {
        Utils.checkNotNull(seed, "seed");
        this.seed = seed;
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
        SourceFaker other = (SourceFaker) o;
        return 
            java.util.Objects.deepEquals(this.alwaysUpdated, other.alwaysUpdated) &&
            java.util.Objects.deepEquals(this.count, other.count) &&
            java.util.Objects.deepEquals(this.parallelism, other.parallelism) &&
            java.util.Objects.deepEquals(this.recordsPerSlice, other.recordsPerSlice) &&
            java.util.Objects.deepEquals(this.seed, other.seed) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            alwaysUpdated,
            count,
            parallelism,
            recordsPerSlice,
            seed,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceFaker.class,
                "alwaysUpdated", alwaysUpdated,
                "count", count,
                "parallelism", parallelism,
                "recordsPerSlice", recordsPerSlice,
                "seed", seed,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> alwaysUpdated;
 
        private Optional<? extends Long> count;
 
        private Optional<? extends Long> parallelism;
 
        private Optional<? extends Long> recordsPerSlice;
 
        private Optional<? extends Long> seed;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Should the updated_at values for every record be new each sync?  Setting this to false will case the source to stop emitting records after COUNT records have been emitted.
         */
        public Builder alwaysUpdated(boolean alwaysUpdated) {
            Utils.checkNotNull(alwaysUpdated, "alwaysUpdated");
            this.alwaysUpdated = Optional.ofNullable(alwaysUpdated);
            return this;
        }

        /**
         * Should the updated_at values for every record be new each sync?  Setting this to false will case the source to stop emitting records after COUNT records have been emitted.
         */
        public Builder alwaysUpdated(Optional<? extends Boolean> alwaysUpdated) {
            Utils.checkNotNull(alwaysUpdated, "alwaysUpdated");
            this.alwaysUpdated = alwaysUpdated;
            return this;
        }

        /**
         * How many users should be generated in total. The purchases table will be scaled to match, with 10 purchases created per 10 users. This setting does not apply to the products stream.
         */
        public Builder count(long count) {
            Utils.checkNotNull(count, "count");
            this.count = Optional.ofNullable(count);
            return this;
        }

        /**
         * How many users should be generated in total. The purchases table will be scaled to match, with 10 purchases created per 10 users. This setting does not apply to the products stream.
         */
        public Builder count(Optional<? extends Long> count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }

        /**
         * How many parallel workers should we use to generate fake data?  Choose a value equal to the number of CPUs you will allocate to this source.
         */
        public Builder parallelism(long parallelism) {
            Utils.checkNotNull(parallelism, "parallelism");
            this.parallelism = Optional.ofNullable(parallelism);
            return this;
        }

        /**
         * How many parallel workers should we use to generate fake data?  Choose a value equal to the number of CPUs you will allocate to this source.
         */
        public Builder parallelism(Optional<? extends Long> parallelism) {
            Utils.checkNotNull(parallelism, "parallelism");
            this.parallelism = parallelism;
            return this;
        }

        /**
         * How many fake records will be in each page (stream slice), before a state message is emitted?
         */
        public Builder recordsPerSlice(long recordsPerSlice) {
            Utils.checkNotNull(recordsPerSlice, "recordsPerSlice");
            this.recordsPerSlice = Optional.ofNullable(recordsPerSlice);
            return this;
        }

        /**
         * How many fake records will be in each page (stream slice), before a state message is emitted?
         */
        public Builder recordsPerSlice(Optional<? extends Long> recordsPerSlice) {
            Utils.checkNotNull(recordsPerSlice, "recordsPerSlice");
            this.recordsPerSlice = recordsPerSlice;
            return this;
        }

        /**
         * Manually control the faker random seed to return the same values on subsequent runs (leave -1 for random)
         */
        public Builder seed(long seed) {
            Utils.checkNotNull(seed, "seed");
            this.seed = Optional.ofNullable(seed);
            return this;
        }

        /**
         * Manually control the faker random seed to return the same values on subsequent runs (leave -1 for random)
         */
        public Builder seed(Optional<? extends Long> seed) {
            Utils.checkNotNull(seed, "seed");
            this.seed = seed;
            return this;
        }
        
        public SourceFaker build() {
            if (alwaysUpdated == null) {
                alwaysUpdated = _SINGLETON_VALUE_AlwaysUpdated.value();
            }
            if (count == null) {
                count = _SINGLETON_VALUE_Count.value();
            }
            if (parallelism == null) {
                parallelism = _SINGLETON_VALUE_Parallelism.value();
            }
            if (recordsPerSlice == null) {
                recordsPerSlice = _SINGLETON_VALUE_RecordsPerSlice.value();
            }
            if (seed == null) {
                seed = _SINGLETON_VALUE_Seed.value();
            }
            return new SourceFaker(
                alwaysUpdated,
                count,
                parallelism,
                recordsPerSlice,
                seed);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_AlwaysUpdated =
                new LazySingletonValue<>(
                        "always_updated",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Count =
                new LazySingletonValue<>(
                        "count",
                        "1000",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Parallelism =
                new LazySingletonValue<>(
                        "parallelism",
                        "4",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_RecordsPerSlice =
                new LazySingletonValue<>(
                        "records_per_slice",
                        "1000",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Seed =
                new LazySingletonValue<>(
                        "seed",
                        "-1",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Faker> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"faker\"",
                        new TypeReference<Faker>() {});
    }
}

