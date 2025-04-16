/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Cohorts {

    @JsonProperty("dateRange")
    private DateRange dateRange;

    /**
     * Dimension used by the cohort. Required and only supports `firstSessionDate`
     */
    @JsonProperty("dimension")
    private Dimension dimension;

    /**
     * Assigns a name to this cohort. If not set, cohorts are named by their zero based index cohort_0, cohort_1, etc.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonCreator
    public Cohorts(
            @JsonProperty("dateRange") DateRange dateRange,
            @JsonProperty("dimension") Dimension dimension,
            @JsonProperty("name") Optional<String> name) {
        Utils.checkNotNull(dateRange, "dateRange");
        Utils.checkNotNull(dimension, "dimension");
        Utils.checkNotNull(name, "name");
        this.dateRange = dateRange;
        this.dimension = dimension;
        this.name = name;
    }
    
    public Cohorts(
            DateRange dateRange,
            Dimension dimension) {
        this(dateRange, dimension, Optional.empty());
    }

    @JsonIgnore
    public DateRange dateRange() {
        return dateRange;
    }

    /**
     * Dimension used by the cohort. Required and only supports `firstSessionDate`
     */
    @JsonIgnore
    public Dimension dimension() {
        return dimension;
    }

    /**
     * Assigns a name to this cohort. If not set, cohorts are named by their zero based index cohort_0, cohort_1, etc.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Cohorts withDateRange(DateRange dateRange) {
        Utils.checkNotNull(dateRange, "dateRange");
        this.dateRange = dateRange;
        return this;
    }

    /**
     * Dimension used by the cohort. Required and only supports `firstSessionDate`
     */
    public Cohorts withDimension(Dimension dimension) {
        Utils.checkNotNull(dimension, "dimension");
        this.dimension = dimension;
        return this;
    }

    /**
     * Assigns a name to this cohort. If not set, cohorts are named by their zero based index cohort_0, cohort_1, etc.
     */
    public Cohorts withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Assigns a name to this cohort. If not set, cohorts are named by their zero based index cohort_0, cohort_1, etc.
     */
    public Cohorts withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        Cohorts other = (Cohorts) o;
        return 
            Objects.deepEquals(this.dateRange, other.dateRange) &&
            Objects.deepEquals(this.dimension, other.dimension) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dateRange,
            dimension,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Cohorts.class,
                "dateRange", dateRange,
                "dimension", dimension,
                "name", name);
    }
    
    public final static class Builder {
 
        private DateRange dateRange;
 
        private Dimension dimension;
 
        private Optional<String> name = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dateRange(DateRange dateRange) {
            Utils.checkNotNull(dateRange, "dateRange");
            this.dateRange = dateRange;
            return this;
        }

        /**
         * Dimension used by the cohort. Required and only supports `firstSessionDate`
         */
        public Builder dimension(Dimension dimension) {
            Utils.checkNotNull(dimension, "dimension");
            this.dimension = dimension;
            return this;
        }

        /**
         * Assigns a name to this cohort. If not set, cohorts are named by their zero based index cohort_0, cohort_1, etc.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Assigns a name to this cohort. If not set, cohorts are named by their zero based index cohort_0, cohort_1, etc.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public Cohorts build() {
            return new Cohorts(
                dateRange,
                dimension,
                name);
        }
    }
}
