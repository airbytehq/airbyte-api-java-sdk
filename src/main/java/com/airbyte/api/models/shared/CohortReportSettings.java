/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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

/**
 * CohortReportSettings - Optional settings for a cohort report.
 */

public class CohortReportSettings {

    /**
     * If true, accumulates the result from first touch day to the end day
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accumulate")
    private Optional<? extends Boolean> accumulate;

    public CohortReportSettings(
            @JsonProperty("accumulate") Optional<? extends Boolean> accumulate) {
        Utils.checkNotNull(accumulate, "accumulate");
        this.accumulate = accumulate;
    }

    /**
     * If true, accumulates the result from first touch day to the end day
     */
    public Optional<? extends Boolean> accumulate() {
        return accumulate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * If true, accumulates the result from first touch day to the end day
     */
    public CohortReportSettings withAccumulate(boolean accumulate) {
        Utils.checkNotNull(accumulate, "accumulate");
        this.accumulate = Optional.ofNullable(accumulate);
        return this;
    }

    /**
     * If true, accumulates the result from first touch day to the end day
     */
    public CohortReportSettings withAccumulate(Optional<? extends Boolean> accumulate) {
        Utils.checkNotNull(accumulate, "accumulate");
        this.accumulate = accumulate;
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
        CohortReportSettings other = (CohortReportSettings) o;
        return 
            java.util.Objects.deepEquals(this.accumulate, other.accumulate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accumulate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CohortReportSettings.class,
                "accumulate", accumulate);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> accumulate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * If true, accumulates the result from first touch day to the end day
         */
        public Builder accumulate(boolean accumulate) {
            Utils.checkNotNull(accumulate, "accumulate");
            this.accumulate = Optional.ofNullable(accumulate);
            return this;
        }

        /**
         * If true, accumulates the result from first touch day to the end day
         */
        public Builder accumulate(Optional<? extends Boolean> accumulate) {
            Utils.checkNotNull(accumulate, "accumulate");
            this.accumulate = accumulate;
            return this;
        }
        
        public CohortReportSettings build() {
            return new CohortReportSettings(
                accumulate);
        }
    }
}

