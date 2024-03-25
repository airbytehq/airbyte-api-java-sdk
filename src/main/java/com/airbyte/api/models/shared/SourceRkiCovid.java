/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceRkiCovid {

    @JsonProperty("sourceType")
    private RkiCovid sourceType;

    /**
     * UTC date in the format 2017-01-25. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private String startDate;

    public SourceRkiCovid(
            @JsonProperty("start_date") String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    public RkiCovid sourceType() {
        return sourceType;
    }

    /**
     * UTC date in the format 2017-01-25. Any data before this date will not be replicated.
     */
    public String startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * UTC date in the format 2017-01-25. Any data before this date will not be replicated.
     */
    public SourceRkiCovid withStartDate(String startDate) {
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
        SourceRkiCovid other = (SourceRkiCovid) o;
        return 
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRkiCovid.class,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * UTC date in the format 2017-01-25. Any data before this date will not be replicated.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceRkiCovid build() {
            return new SourceRkiCovid(
                startDate);
        }

        private static final LazySingletonValue<RkiCovid> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"rki-covid\"",
                        new TypeReference<RkiCovid>() {});
    }
}

