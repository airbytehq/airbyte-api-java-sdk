/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class CohortsRange {

    /**
     * Specifies the end date of the extended reporting date range for a cohort report.
     */
    @JsonProperty("endOffset")
    private long endOffset;

    /**
     * The granularity used to interpret the startOffset and endOffset for the extended reporting date range for a cohort report.
     */
    @JsonProperty("granularity")
    private SourceGoogleAnalyticsDataApiGranularity granularity;

    /**
     * Specifies the start date of the extended reporting date range for a cohort report.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("startOffset")
    private Optional<? extends Long> startOffset;

    @JsonCreator
    public CohortsRange(
            @JsonProperty("endOffset") long endOffset,
            @JsonProperty("granularity") SourceGoogleAnalyticsDataApiGranularity granularity,
            @JsonProperty("startOffset") Optional<? extends Long> startOffset) {
        Utils.checkNotNull(endOffset, "endOffset");
        Utils.checkNotNull(granularity, "granularity");
        Utils.checkNotNull(startOffset, "startOffset");
        this.endOffset = endOffset;
        this.granularity = granularity;
        this.startOffset = startOffset;
    }
    
    public CohortsRange(
            long endOffset,
            SourceGoogleAnalyticsDataApiGranularity granularity) {
        this(endOffset, granularity, Optional.empty());
    }

    /**
     * Specifies the end date of the extended reporting date range for a cohort report.
     */
    @JsonIgnore
    public long endOffset() {
        return endOffset;
    }

    /**
     * The granularity used to interpret the startOffset and endOffset for the extended reporting date range for a cohort report.
     */
    @JsonIgnore
    public SourceGoogleAnalyticsDataApiGranularity granularity() {
        return granularity;
    }

    /**
     * Specifies the start date of the extended reporting date range for a cohort report.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> startOffset() {
        return (Optional<Long>) startOffset;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specifies the end date of the extended reporting date range for a cohort report.
     */
    public CohortsRange withEndOffset(long endOffset) {
        Utils.checkNotNull(endOffset, "endOffset");
        this.endOffset = endOffset;
        return this;
    }

    /**
     * The granularity used to interpret the startOffset and endOffset for the extended reporting date range for a cohort report.
     */
    public CohortsRange withGranularity(SourceGoogleAnalyticsDataApiGranularity granularity) {
        Utils.checkNotNull(granularity, "granularity");
        this.granularity = granularity;
        return this;
    }

    /**
     * Specifies the start date of the extended reporting date range for a cohort report.
     */
    public CohortsRange withStartOffset(long startOffset) {
        Utils.checkNotNull(startOffset, "startOffset");
        this.startOffset = Optional.ofNullable(startOffset);
        return this;
    }

    /**
     * Specifies the start date of the extended reporting date range for a cohort report.
     */
    public CohortsRange withStartOffset(Optional<? extends Long> startOffset) {
        Utils.checkNotNull(startOffset, "startOffset");
        this.startOffset = startOffset;
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
        CohortsRange other = (CohortsRange) o;
        return 
            java.util.Objects.deepEquals(this.endOffset, other.endOffset) &&
            java.util.Objects.deepEquals(this.granularity, other.granularity) &&
            java.util.Objects.deepEquals(this.startOffset, other.startOffset);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            endOffset,
            granularity,
            startOffset);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CohortsRange.class,
                "endOffset", endOffset,
                "granularity", granularity,
                "startOffset", startOffset);
    }
    
    public final static class Builder {
 
        private Long endOffset;
 
        private SourceGoogleAnalyticsDataApiGranularity granularity;
 
        private Optional<? extends Long> startOffset = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specifies the end date of the extended reporting date range for a cohort report.
         */
        public Builder endOffset(long endOffset) {
            Utils.checkNotNull(endOffset, "endOffset");
            this.endOffset = endOffset;
            return this;
        }

        /**
         * The granularity used to interpret the startOffset and endOffset for the extended reporting date range for a cohort report.
         */
        public Builder granularity(SourceGoogleAnalyticsDataApiGranularity granularity) {
            Utils.checkNotNull(granularity, "granularity");
            this.granularity = granularity;
            return this;
        }

        /**
         * Specifies the start date of the extended reporting date range for a cohort report.
         */
        public Builder startOffset(long startOffset) {
            Utils.checkNotNull(startOffset, "startOffset");
            this.startOffset = Optional.ofNullable(startOffset);
            return this;
        }

        /**
         * Specifies the start date of the extended reporting date range for a cohort report.
         */
        public Builder startOffset(Optional<? extends Long> startOffset) {
            Utils.checkNotNull(startOffset, "startOffset");
            this.startOffset = startOffset;
            return this;
        }
        
        public CohortsRange build() {
            return new CohortsRange(
                endOffset,
                granularity,
                startOffset);
        }
    }
}

