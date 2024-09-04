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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ConnectionsResponse {

    @JsonProperty("data")
    private List<ConnectionResponse> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private Optional<String> next;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    private Optional<String> previous;

    @JsonCreator
    public ConnectionsResponse(
            @JsonProperty("data") List<ConnectionResponse> data,
            @JsonProperty("next") Optional<String> next,
            @JsonProperty("previous") Optional<String> previous) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(previous, "previous");
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
    
    public ConnectionsResponse(
            List<ConnectionResponse> data) {
        this(data, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public List<ConnectionResponse> data() {
        return data;
    }

    @JsonIgnore
    public Optional<String> next() {
        return next;
    }

    @JsonIgnore
    public Optional<String> previous() {
        return previous;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConnectionsResponse withData(List<ConnectionResponse> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public ConnectionsResponse withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = Optional.ofNullable(next);
        return this;
    }

    public ConnectionsResponse withNext(Optional<String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public ConnectionsResponse withPrevious(String previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = Optional.ofNullable(previous);
        return this;
    }

    public ConnectionsResponse withPrevious(Optional<String> previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = previous;
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
        ConnectionsResponse other = (ConnectionsResponse) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.next, other.next) &&
            Objects.deepEquals(this.previous, other.previous);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            next,
            previous);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectionsResponse.class,
                "data", data,
                "next", next,
                "previous", previous);
    }
    
    public final static class Builder {
 
        private List<ConnectionResponse> data;
 
        private Optional<String> next = Optional.empty();
 
        private Optional<String> previous = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<ConnectionResponse> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = Optional.ofNullable(next);
            return this;
        }

        public Builder next(Optional<String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        public Builder previous(String previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = Optional.ofNullable(previous);
            return this;
        }

        public Builder previous(Optional<String> previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = previous;
            return this;
        }
        
        public ConnectionsResponse build() {
            return new ConnectionsResponse(
                data,
                next,
                previous);
        }
    }
}

