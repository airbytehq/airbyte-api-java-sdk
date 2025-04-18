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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * StreamConfigurations
 * 
 * <p>A list of configured stream options for a connection.
 */
public class StreamConfigurations {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streams")
    private Optional<? extends List<StreamConfiguration>> streams;

    @JsonCreator
    public StreamConfigurations(
            @JsonProperty("streams") Optional<? extends List<StreamConfiguration>> streams) {
        Utils.checkNotNull(streams, "streams");
        this.streams = streams;
    }
    
    public StreamConfigurations() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<StreamConfiguration>> streams() {
        return (Optional<List<StreamConfiguration>>) streams;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public StreamConfigurations withStreams(List<StreamConfiguration> streams) {
        Utils.checkNotNull(streams, "streams");
        this.streams = Optional.ofNullable(streams);
        return this;
    }

    public StreamConfigurations withStreams(Optional<? extends List<StreamConfiguration>> streams) {
        Utils.checkNotNull(streams, "streams");
        this.streams = streams;
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
        StreamConfigurations other = (StreamConfigurations) o;
        return 
            Objects.deepEquals(this.streams, other.streams);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            streams);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StreamConfigurations.class,
                "streams", streams);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<StreamConfiguration>> streams = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder streams(List<StreamConfiguration> streams) {
            Utils.checkNotNull(streams, "streams");
            this.streams = Optional.ofNullable(streams);
            return this;
        }

        public Builder streams(Optional<? extends List<StreamConfiguration>> streams) {
            Utils.checkNotNull(streams, "streams");
            this.streams = streams;
            return this;
        }
        
        public StreamConfigurations build() {
            return new StreamConfigurations(
                streams);
        }
    }
}
