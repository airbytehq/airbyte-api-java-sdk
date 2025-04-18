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

/**
 * ResourceRequirements
 * 
 * <p>optional resource requirements to run workers (blank for unbounded allocations)
 */
public class ResourceRequirements {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cpu_limit")
    private Optional<String> cpuLimit;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cpu_request")
    private Optional<String> cpuRequest;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ephemeral_storage_limit")
    private Optional<String> ephemeralStorageLimit;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ephemeral_storage_request")
    private Optional<String> ephemeralStorageRequest;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memory_limit")
    private Optional<String> memoryLimit;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memory_request")
    private Optional<String> memoryRequest;

    @JsonCreator
    public ResourceRequirements(
            @JsonProperty("cpu_limit") Optional<String> cpuLimit,
            @JsonProperty("cpu_request") Optional<String> cpuRequest,
            @JsonProperty("ephemeral_storage_limit") Optional<String> ephemeralStorageLimit,
            @JsonProperty("ephemeral_storage_request") Optional<String> ephemeralStorageRequest,
            @JsonProperty("memory_limit") Optional<String> memoryLimit,
            @JsonProperty("memory_request") Optional<String> memoryRequest) {
        Utils.checkNotNull(cpuLimit, "cpuLimit");
        Utils.checkNotNull(cpuRequest, "cpuRequest");
        Utils.checkNotNull(ephemeralStorageLimit, "ephemeralStorageLimit");
        Utils.checkNotNull(ephemeralStorageRequest, "ephemeralStorageRequest");
        Utils.checkNotNull(memoryLimit, "memoryLimit");
        Utils.checkNotNull(memoryRequest, "memoryRequest");
        this.cpuLimit = cpuLimit;
        this.cpuRequest = cpuRequest;
        this.ephemeralStorageLimit = ephemeralStorageLimit;
        this.ephemeralStorageRequest = ephemeralStorageRequest;
        this.memoryLimit = memoryLimit;
        this.memoryRequest = memoryRequest;
    }
    
    public ResourceRequirements() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> cpuLimit() {
        return cpuLimit;
    }

    @JsonIgnore
    public Optional<String> cpuRequest() {
        return cpuRequest;
    }

    @JsonIgnore
    public Optional<String> ephemeralStorageLimit() {
        return ephemeralStorageLimit;
    }

    @JsonIgnore
    public Optional<String> ephemeralStorageRequest() {
        return ephemeralStorageRequest;
    }

    @JsonIgnore
    public Optional<String> memoryLimit() {
        return memoryLimit;
    }

    @JsonIgnore
    public Optional<String> memoryRequest() {
        return memoryRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ResourceRequirements withCpuLimit(String cpuLimit) {
        Utils.checkNotNull(cpuLimit, "cpuLimit");
        this.cpuLimit = Optional.ofNullable(cpuLimit);
        return this;
    }

    public ResourceRequirements withCpuLimit(Optional<String> cpuLimit) {
        Utils.checkNotNull(cpuLimit, "cpuLimit");
        this.cpuLimit = cpuLimit;
        return this;
    }

    public ResourceRequirements withCpuRequest(String cpuRequest) {
        Utils.checkNotNull(cpuRequest, "cpuRequest");
        this.cpuRequest = Optional.ofNullable(cpuRequest);
        return this;
    }

    public ResourceRequirements withCpuRequest(Optional<String> cpuRequest) {
        Utils.checkNotNull(cpuRequest, "cpuRequest");
        this.cpuRequest = cpuRequest;
        return this;
    }

    public ResourceRequirements withEphemeralStorageLimit(String ephemeralStorageLimit) {
        Utils.checkNotNull(ephemeralStorageLimit, "ephemeralStorageLimit");
        this.ephemeralStorageLimit = Optional.ofNullable(ephemeralStorageLimit);
        return this;
    }

    public ResourceRequirements withEphemeralStorageLimit(Optional<String> ephemeralStorageLimit) {
        Utils.checkNotNull(ephemeralStorageLimit, "ephemeralStorageLimit");
        this.ephemeralStorageLimit = ephemeralStorageLimit;
        return this;
    }

    public ResourceRequirements withEphemeralStorageRequest(String ephemeralStorageRequest) {
        Utils.checkNotNull(ephemeralStorageRequest, "ephemeralStorageRequest");
        this.ephemeralStorageRequest = Optional.ofNullable(ephemeralStorageRequest);
        return this;
    }

    public ResourceRequirements withEphemeralStorageRequest(Optional<String> ephemeralStorageRequest) {
        Utils.checkNotNull(ephemeralStorageRequest, "ephemeralStorageRequest");
        this.ephemeralStorageRequest = ephemeralStorageRequest;
        return this;
    }

    public ResourceRequirements withMemoryLimit(String memoryLimit) {
        Utils.checkNotNull(memoryLimit, "memoryLimit");
        this.memoryLimit = Optional.ofNullable(memoryLimit);
        return this;
    }

    public ResourceRequirements withMemoryLimit(Optional<String> memoryLimit) {
        Utils.checkNotNull(memoryLimit, "memoryLimit");
        this.memoryLimit = memoryLimit;
        return this;
    }

    public ResourceRequirements withMemoryRequest(String memoryRequest) {
        Utils.checkNotNull(memoryRequest, "memoryRequest");
        this.memoryRequest = Optional.ofNullable(memoryRequest);
        return this;
    }

    public ResourceRequirements withMemoryRequest(Optional<String> memoryRequest) {
        Utils.checkNotNull(memoryRequest, "memoryRequest");
        this.memoryRequest = memoryRequest;
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
        ResourceRequirements other = (ResourceRequirements) o;
        return 
            Objects.deepEquals(this.cpuLimit, other.cpuLimit) &&
            Objects.deepEquals(this.cpuRequest, other.cpuRequest) &&
            Objects.deepEquals(this.ephemeralStorageLimit, other.ephemeralStorageLimit) &&
            Objects.deepEquals(this.ephemeralStorageRequest, other.ephemeralStorageRequest) &&
            Objects.deepEquals(this.memoryLimit, other.memoryLimit) &&
            Objects.deepEquals(this.memoryRequest, other.memoryRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cpuLimit,
            cpuRequest,
            ephemeralStorageLimit,
            ephemeralStorageRequest,
            memoryLimit,
            memoryRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ResourceRequirements.class,
                "cpuLimit", cpuLimit,
                "cpuRequest", cpuRequest,
                "ephemeralStorageLimit", ephemeralStorageLimit,
                "ephemeralStorageRequest", ephemeralStorageRequest,
                "memoryLimit", memoryLimit,
                "memoryRequest", memoryRequest);
    }
    
    public final static class Builder {
 
        private Optional<String> cpuLimit = Optional.empty();
 
        private Optional<String> cpuRequest = Optional.empty();
 
        private Optional<String> ephemeralStorageLimit = Optional.empty();
 
        private Optional<String> ephemeralStorageRequest = Optional.empty();
 
        private Optional<String> memoryLimit = Optional.empty();
 
        private Optional<String> memoryRequest = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cpuLimit(String cpuLimit) {
            Utils.checkNotNull(cpuLimit, "cpuLimit");
            this.cpuLimit = Optional.ofNullable(cpuLimit);
            return this;
        }

        public Builder cpuLimit(Optional<String> cpuLimit) {
            Utils.checkNotNull(cpuLimit, "cpuLimit");
            this.cpuLimit = cpuLimit;
            return this;
        }

        public Builder cpuRequest(String cpuRequest) {
            Utils.checkNotNull(cpuRequest, "cpuRequest");
            this.cpuRequest = Optional.ofNullable(cpuRequest);
            return this;
        }

        public Builder cpuRequest(Optional<String> cpuRequest) {
            Utils.checkNotNull(cpuRequest, "cpuRequest");
            this.cpuRequest = cpuRequest;
            return this;
        }

        public Builder ephemeralStorageLimit(String ephemeralStorageLimit) {
            Utils.checkNotNull(ephemeralStorageLimit, "ephemeralStorageLimit");
            this.ephemeralStorageLimit = Optional.ofNullable(ephemeralStorageLimit);
            return this;
        }

        public Builder ephemeralStorageLimit(Optional<String> ephemeralStorageLimit) {
            Utils.checkNotNull(ephemeralStorageLimit, "ephemeralStorageLimit");
            this.ephemeralStorageLimit = ephemeralStorageLimit;
            return this;
        }

        public Builder ephemeralStorageRequest(String ephemeralStorageRequest) {
            Utils.checkNotNull(ephemeralStorageRequest, "ephemeralStorageRequest");
            this.ephemeralStorageRequest = Optional.ofNullable(ephemeralStorageRequest);
            return this;
        }

        public Builder ephemeralStorageRequest(Optional<String> ephemeralStorageRequest) {
            Utils.checkNotNull(ephemeralStorageRequest, "ephemeralStorageRequest");
            this.ephemeralStorageRequest = ephemeralStorageRequest;
            return this;
        }

        public Builder memoryLimit(String memoryLimit) {
            Utils.checkNotNull(memoryLimit, "memoryLimit");
            this.memoryLimit = Optional.ofNullable(memoryLimit);
            return this;
        }

        public Builder memoryLimit(Optional<String> memoryLimit) {
            Utils.checkNotNull(memoryLimit, "memoryLimit");
            this.memoryLimit = memoryLimit;
            return this;
        }

        public Builder memoryRequest(String memoryRequest) {
            Utils.checkNotNull(memoryRequest, "memoryRequest");
            this.memoryRequest = Optional.ofNullable(memoryRequest);
            return this;
        }

        public Builder memoryRequest(Optional<String> memoryRequest) {
            Utils.checkNotNull(memoryRequest, "memoryRequest");
            this.memoryRequest = memoryRequest;
            return this;
        }
        
        public ResourceRequirements build() {
            return new ResourceRequirements(
                cpuLimit,
                cpuRequest,
                ephemeralStorageLimit,
                ephemeralStorageRequest,
                memoryLimit,
                memoryRequest);
        }
    }
}
