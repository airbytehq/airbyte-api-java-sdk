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
import java.util.Objects;
import java.util.Optional;

public class SourceOpenDataDc {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * address or place or block
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    private Optional<String> location;

    /**
     * A unique identifier (Master Address Repository).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("marid")
    private Optional<String> marid;

    @JsonProperty("sourceType")
    private OpenDataDc sourceType;

    @JsonCreator
    public SourceOpenDataDc(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("location") Optional<String> location,
            @JsonProperty("marid") Optional<String> marid) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(location, "location");
        Utils.checkNotNull(marid, "marid");
        this.apiKey = apiKey;
        this.location = location;
        this.marid = marid;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceOpenDataDc(
            String apiKey) {
        this(apiKey, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * address or place or block
     */
    @JsonIgnore
    public Optional<String> location() {
        return location;
    }

    /**
     * A unique identifier (Master Address Repository).
     */
    @JsonIgnore
    public Optional<String> marid() {
        return marid;
    }

    @JsonIgnore
    public OpenDataDc sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceOpenDataDc withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * address or place or block
     */
    public SourceOpenDataDc withLocation(String location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    /**
     * address or place or block
     */
    public SourceOpenDataDc withLocation(Optional<String> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
        return this;
    }

    /**
     * A unique identifier (Master Address Repository).
     */
    public SourceOpenDataDc withMarid(String marid) {
        Utils.checkNotNull(marid, "marid");
        this.marid = Optional.ofNullable(marid);
        return this;
    }

    /**
     * A unique identifier (Master Address Repository).
     */
    public SourceOpenDataDc withMarid(Optional<String> marid) {
        Utils.checkNotNull(marid, "marid");
        this.marid = marid;
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
        SourceOpenDataDc other = (SourceOpenDataDc) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.location, other.location) &&
            Objects.deepEquals(this.marid, other.marid) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            location,
            marid,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOpenDataDc.class,
                "apiKey", apiKey,
                "location", location,
                "marid", marid,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> location = Optional.empty();
 
        private Optional<String> marid = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * address or place or block
         */
        public Builder location(String location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        /**
         * address or place or block
         */
        public Builder location(Optional<String> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }

        /**
         * A unique identifier (Master Address Repository).
         */
        public Builder marid(String marid) {
            Utils.checkNotNull(marid, "marid");
            this.marid = Optional.ofNullable(marid);
            return this;
        }

        /**
         * A unique identifier (Master Address Repository).
         */
        public Builder marid(Optional<String> marid) {
            Utils.checkNotNull(marid, "marid");
            this.marid = marid;
            return this;
        }
        
        public SourceOpenDataDc build() {
            return new SourceOpenDataDc(
                apiKey,
                location,
                marid);
        }

        private static final LazySingletonValue<OpenDataDc> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"open-data-dc\"",
                        new TypeReference<OpenDataDc>() {});
    }
}
