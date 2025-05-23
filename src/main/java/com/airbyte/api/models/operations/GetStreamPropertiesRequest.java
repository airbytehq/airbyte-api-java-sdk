/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetStreamPropertiesRequest {

    /**
     * ID of the destination
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=destinationId")
    private Optional<String> destinationId;

    /**
     * If true pull the latest schema from the source, else pull from cache (default false)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=ignoreCache")
    private Optional<Boolean> ignoreCache;

    /**
     * ID of the source
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sourceId")
    private String sourceId;

    @JsonCreator
    public GetStreamPropertiesRequest(
            Optional<String> destinationId,
            Optional<Boolean> ignoreCache,
            String sourceId) {
        Utils.checkNotNull(destinationId, "destinationId");
        Utils.checkNotNull(ignoreCache, "ignoreCache");
        Utils.checkNotNull(sourceId, "sourceId");
        this.destinationId = destinationId;
        this.ignoreCache = ignoreCache;
        this.sourceId = sourceId;
    }
    
    public GetStreamPropertiesRequest(
            String sourceId) {
        this(Optional.empty(), Optional.empty(), sourceId);
    }

    /**
     * ID of the destination
     */
    @JsonIgnore
    public Optional<String> destinationId() {
        return destinationId;
    }

    /**
     * If true pull the latest schema from the source, else pull from cache (default false)
     */
    @JsonIgnore
    public Optional<Boolean> ignoreCache() {
        return ignoreCache;
    }

    /**
     * ID of the source
     */
    @JsonIgnore
    public String sourceId() {
        return sourceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * ID of the destination
     */
    public GetStreamPropertiesRequest withDestinationId(String destinationId) {
        Utils.checkNotNull(destinationId, "destinationId");
        this.destinationId = Optional.ofNullable(destinationId);
        return this;
    }

    /**
     * ID of the destination
     */
    public GetStreamPropertiesRequest withDestinationId(Optional<String> destinationId) {
        Utils.checkNotNull(destinationId, "destinationId");
        this.destinationId = destinationId;
        return this;
    }

    /**
     * If true pull the latest schema from the source, else pull from cache (default false)
     */
    public GetStreamPropertiesRequest withIgnoreCache(boolean ignoreCache) {
        Utils.checkNotNull(ignoreCache, "ignoreCache");
        this.ignoreCache = Optional.ofNullable(ignoreCache);
        return this;
    }

    /**
     * If true pull the latest schema from the source, else pull from cache (default false)
     */
    public GetStreamPropertiesRequest withIgnoreCache(Optional<Boolean> ignoreCache) {
        Utils.checkNotNull(ignoreCache, "ignoreCache");
        this.ignoreCache = ignoreCache;
        return this;
    }

    /**
     * ID of the source
     */
    public GetStreamPropertiesRequest withSourceId(String sourceId) {
        Utils.checkNotNull(sourceId, "sourceId");
        this.sourceId = sourceId;
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
        GetStreamPropertiesRequest other = (GetStreamPropertiesRequest) o;
        return 
            Objects.deepEquals(this.destinationId, other.destinationId) &&
            Objects.deepEquals(this.ignoreCache, other.ignoreCache) &&
            Objects.deepEquals(this.sourceId, other.sourceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            destinationId,
            ignoreCache,
            sourceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetStreamPropertiesRequest.class,
                "destinationId", destinationId,
                "ignoreCache", ignoreCache,
                "sourceId", sourceId);
    }
    
    public final static class Builder {
 
        private Optional<String> destinationId = Optional.empty();
 
        private Optional<Boolean> ignoreCache;
 
        private String sourceId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the destination
         */
        public Builder destinationId(String destinationId) {
            Utils.checkNotNull(destinationId, "destinationId");
            this.destinationId = Optional.ofNullable(destinationId);
            return this;
        }

        /**
         * ID of the destination
         */
        public Builder destinationId(Optional<String> destinationId) {
            Utils.checkNotNull(destinationId, "destinationId");
            this.destinationId = destinationId;
            return this;
        }

        /**
         * If true pull the latest schema from the source, else pull from cache (default false)
         */
        public Builder ignoreCache(boolean ignoreCache) {
            Utils.checkNotNull(ignoreCache, "ignoreCache");
            this.ignoreCache = Optional.ofNullable(ignoreCache);
            return this;
        }

        /**
         * If true pull the latest schema from the source, else pull from cache (default false)
         */
        public Builder ignoreCache(Optional<Boolean> ignoreCache) {
            Utils.checkNotNull(ignoreCache, "ignoreCache");
            this.ignoreCache = ignoreCache;
            return this;
        }

        /**
         * ID of the source
         */
        public Builder sourceId(String sourceId) {
            Utils.checkNotNull(sourceId, "sourceId");
            this.sourceId = sourceId;
            return this;
        }
        
        public GetStreamPropertiesRequest build() {
            if (ignoreCache == null) {
                ignoreCache = _SINGLETON_VALUE_IgnoreCache.value();
            }
            return new GetStreamPropertiesRequest(
                destinationId,
                ignoreCache,
                sourceId);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_IgnoreCache =
                new LazySingletonValue<>(
                        "ignoreCache",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
