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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class SourceRdStationMarketing {

    /**
     * Choose one of the possible authorization method
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorization")
    private Optional<? extends SourceRdStationMarketingAuthenticationType> authorization;

    @JsonProperty("sourceType")
    private SourceRdStationMarketingRdStationMarketing sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. When specified and not None, then stream will behave as incremental
     */
    @JsonProperty("start_date")
    private String startDate;

    @JsonCreator
    public SourceRdStationMarketing(
            @JsonProperty("authorization") Optional<? extends SourceRdStationMarketingAuthenticationType> authorization,
            @JsonProperty("start_date") String startDate) {
        Utils.checkNotNull(authorization, "authorization");
        Utils.checkNotNull(startDate, "startDate");
        this.authorization = authorization;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceRdStationMarketing(
            String startDate) {
        this(Optional.empty(), startDate);
    }

    /**
     * Choose one of the possible authorization method
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceRdStationMarketingAuthenticationType> authorization() {
        return (Optional<SourceRdStationMarketingAuthenticationType>) authorization;
    }

    @JsonIgnore
    public SourceRdStationMarketingRdStationMarketing sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. When specified and not None, then stream will behave as incremental
     */
    @JsonIgnore
    public String startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Choose one of the possible authorization method
     */
    public SourceRdStationMarketing withAuthorization(SourceRdStationMarketingAuthenticationType authorization) {
        Utils.checkNotNull(authorization, "authorization");
        this.authorization = Optional.ofNullable(authorization);
        return this;
    }

    /**
     * Choose one of the possible authorization method
     */
    public SourceRdStationMarketing withAuthorization(Optional<? extends SourceRdStationMarketingAuthenticationType> authorization) {
        Utils.checkNotNull(authorization, "authorization");
        this.authorization = authorization;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. When specified and not None, then stream will behave as incremental
     */
    public SourceRdStationMarketing withStartDate(String startDate) {
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
        SourceRdStationMarketing other = (SourceRdStationMarketing) o;
        return 
            Objects.deepEquals(this.authorization, other.authorization) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authorization,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRdStationMarketing.class,
                "authorization", authorization,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceRdStationMarketingAuthenticationType> authorization = Optional.empty();
 
        private String startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Choose one of the possible authorization method
         */
        public Builder authorization(SourceRdStationMarketingAuthenticationType authorization) {
            Utils.checkNotNull(authorization, "authorization");
            this.authorization = Optional.ofNullable(authorization);
            return this;
        }

        /**
         * Choose one of the possible authorization method
         */
        public Builder authorization(Optional<? extends SourceRdStationMarketingAuthenticationType> authorization) {
            Utils.checkNotNull(authorization, "authorization");
            this.authorization = authorization;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. When specified and not None, then stream will behave as incremental
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceRdStationMarketing build() {
            return new SourceRdStationMarketing(
                authorization,
                startDate);
        }

        private static final LazySingletonValue<SourceRdStationMarketingRdStationMarketing> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"rd-station-marketing\"",
                        new TypeReference<SourceRdStationMarketingRdStationMarketing>() {});
    }
}
