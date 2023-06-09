/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaker - The values required to configure the source.
 */

public class SourceFaker {
    /**
     * Should the updated_at values for every record be new each sync?  Setting this to false will case the source to stop emitting records after COUNT records have been emitted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("always_updated")
    public Boolean alwaysUpdated;

    public SourceFaker withAlwaysUpdated(Boolean alwaysUpdated) {
        this.alwaysUpdated = alwaysUpdated;
        return this;
    }
    
    /**
     * How many users should be generated in total.  This setting does not apply to the purchases or products stream.
     */
    @JsonProperty("count")
    public Long count;

    public SourceFaker withCount(Long count) {
        this.count = count;
        return this;
    }
    
    /**
     * How many parallel workers should we use to generate fake data?  Choose a value equal to the number of CPUs you will allocate to this source.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parallelism")
    public Long parallelism;

    public SourceFaker withParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    
    /**
     * How many fake records will be in each page (stream slice), before a state message is emitted?
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("records_per_slice")
    public Long recordsPerSlice;

    public SourceFaker withRecordsPerSlice(Long recordsPerSlice) {
        this.recordsPerSlice = recordsPerSlice;
        return this;
    }
    
    /**
     * Manually control the faker random seed to return the same values on subsequent runs (leave -1 for random)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("seed")
    public Long seed;

    public SourceFaker withSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceFakerFaker sourceType;

    public SourceFaker withSourceType(SourceFakerFaker sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceFaker(@JsonProperty("count") Long count, @JsonProperty("sourceType") SourceFakerFaker sourceType) {
        this.count = count;
        this.sourceType = sourceType;
  }
}
