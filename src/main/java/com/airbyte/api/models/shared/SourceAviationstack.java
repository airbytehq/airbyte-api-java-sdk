/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

public class SourceAviationstack {

    /**
     * Your unique API key for authenticating with the Aviation API. You can find it in your Aviation account dashboard at https://aviationstack.com/dashboard
     */
    @JsonProperty("access_key")
    private String accessKey;

    @JsonProperty("sourceType")
    private Aviationstack sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceAviationstack(
            @JsonProperty("access_key") String accessKey,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(accessKey, "accessKey");
        Utils.checkNotNull(startDate, "startDate");
        this.accessKey = accessKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * Your unique API key for authenticating with the Aviation API. You can find it in your Aviation account dashboard at https://aviationstack.com/dashboard
     */
    @JsonIgnore
    public String accessKey() {
        return accessKey;
    }

    @JsonIgnore
    public Aviationstack sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your unique API key for authenticating with the Aviation API. You can find it in your Aviation account dashboard at https://aviationstack.com/dashboard
     */
    public SourceAviationstack withAccessKey(String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
        return this;
    }

    public SourceAviationstack withStartDate(OffsetDateTime startDate) {
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
        SourceAviationstack other = (SourceAviationstack) o;
        return 
            Objects.deepEquals(this.accessKey, other.accessKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessKey,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAviationstack.class,
                "accessKey", accessKey,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String accessKey;
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your unique API key for authenticating with the Aviation API. You can find it in your Aviation account dashboard at https://aviationstack.com/dashboard
         */
        public Builder accessKey(String accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = accessKey;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceAviationstack build() {
            return new SourceAviationstack(
                accessKey,
                startDate);
        }

        private static final LazySingletonValue<Aviationstack> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"aviationstack\"",
                        new TypeReference<Aviationstack>() {});
    }
}
