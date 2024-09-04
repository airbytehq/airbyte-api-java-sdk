/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;


public class DateRange {

    @JsonProperty("endDate")
    private LocalDate endDate;

    @JsonProperty("startDate")
    private LocalDate startDate;

    @JsonCreator
    public DateRange(
            @JsonProperty("endDate") LocalDate endDate,
            @JsonProperty("startDate") LocalDate startDate) {
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(startDate, "startDate");
        this.endDate = endDate;
        this.startDate = startDate;
    }

    @JsonIgnore
    public LocalDate endDate() {
        return endDate;
    }

    @JsonIgnore
    public LocalDate startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DateRange withEndDate(LocalDate endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    public DateRange withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        DateRange other = (DateRange) o;
        return 
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            endDate,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DateRange.class,
                "endDate", endDate,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private LocalDate endDate;
 
        private LocalDate startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder endDate(LocalDate endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public DateRange build() {
            return new DateRange(
                endDate,
                startDate);
        }
    }
}

