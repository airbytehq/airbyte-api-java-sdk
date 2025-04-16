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
import java.util.Objects;
import java.util.Optional;

public class SourcePutRequest {

    /**
     * The values required to configure the source.
     */
    @JsonProperty("configuration")
    private SourceConfiguration configuration;

    @JsonProperty("name")
    private String name;

    /**
     * actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resourceAllocation")
    private Optional<? extends ScopedResourceRequirements> resourceAllocation;

    @JsonCreator
    public SourcePutRequest(
            @JsonProperty("configuration") SourceConfiguration configuration,
            @JsonProperty("name") String name,
            @JsonProperty("resourceAllocation") Optional<? extends ScopedResourceRequirements> resourceAllocation) {
        Utils.checkNotNull(configuration, "configuration");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(resourceAllocation, "resourceAllocation");
        this.configuration = configuration;
        this.name = name;
        this.resourceAllocation = resourceAllocation;
    }
    
    public SourcePutRequest(
            SourceConfiguration configuration,
            String name) {
        this(configuration, name, Optional.empty());
    }

    /**
     * The values required to configure the source.
     */
    @JsonIgnore
    public SourceConfiguration configuration() {
        return configuration;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ScopedResourceRequirements> resourceAllocation() {
        return (Optional<ScopedResourceRequirements>) resourceAllocation;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The values required to configure the source.
     */
    public SourcePutRequest withConfiguration(SourceConfiguration configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = configuration;
        return this;
    }

    public SourcePutRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.
     */
    public SourcePutRequest withResourceAllocation(ScopedResourceRequirements resourceAllocation) {
        Utils.checkNotNull(resourceAllocation, "resourceAllocation");
        this.resourceAllocation = Optional.ofNullable(resourceAllocation);
        return this;
    }

    /**
     * actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.
     */
    public SourcePutRequest withResourceAllocation(Optional<? extends ScopedResourceRequirements> resourceAllocation) {
        Utils.checkNotNull(resourceAllocation, "resourceAllocation");
        this.resourceAllocation = resourceAllocation;
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
        SourcePutRequest other = (SourcePutRequest) o;
        return 
            Objects.deepEquals(this.configuration, other.configuration) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.resourceAllocation, other.resourceAllocation);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            configuration,
            name,
            resourceAllocation);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePutRequest.class,
                "configuration", configuration,
                "name", name,
                "resourceAllocation", resourceAllocation);
    }
    
    public final static class Builder {
 
        private SourceConfiguration configuration;
 
        private String name;
 
        private Optional<? extends ScopedResourceRequirements> resourceAllocation = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The values required to configure the source.
         */
        public Builder configuration(SourceConfiguration configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = configuration;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.
         */
        public Builder resourceAllocation(ScopedResourceRequirements resourceAllocation) {
            Utils.checkNotNull(resourceAllocation, "resourceAllocation");
            this.resourceAllocation = Optional.ofNullable(resourceAllocation);
            return this;
        }

        /**
         * actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.
         */
        public Builder resourceAllocation(Optional<? extends ScopedResourceRequirements> resourceAllocation) {
            Utils.checkNotNull(resourceAllocation, "resourceAllocation");
            this.resourceAllocation = resourceAllocation;
            return this;
        }
        
        public SourcePutRequest build() {
            return new SourcePutRequest(
                configuration,
                name,
                resourceAllocation);
        }
    }
}
