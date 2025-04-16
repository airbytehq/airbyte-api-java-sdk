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

public class DestinationCreateRequest {

    /**
     * The values required to configure the destination.
     */
    @JsonProperty("configuration")
    private DestinationConfiguration configuration;

    /**
     * The UUID of the connector definition. One of configuration.destinationType or definitionId must be provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("definitionId")
    private Optional<String> definitionId;

    /**
     * Name of the destination e.g. dev-mysql-instance.
     */
    @JsonProperty("name")
    private String name;

    /**
     * actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resourceAllocation")
    private Optional<? extends ScopedResourceRequirements> resourceAllocation;

    @JsonProperty("workspaceId")
    private String workspaceId;

    @JsonCreator
    public DestinationCreateRequest(
            @JsonProperty("configuration") DestinationConfiguration configuration,
            @JsonProperty("definitionId") Optional<String> definitionId,
            @JsonProperty("name") String name,
            @JsonProperty("resourceAllocation") Optional<? extends ScopedResourceRequirements> resourceAllocation,
            @JsonProperty("workspaceId") String workspaceId) {
        Utils.checkNotNull(configuration, "configuration");
        Utils.checkNotNull(definitionId, "definitionId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(resourceAllocation, "resourceAllocation");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.configuration = configuration;
        this.definitionId = definitionId;
        this.name = name;
        this.resourceAllocation = resourceAllocation;
        this.workspaceId = workspaceId;
    }
    
    public DestinationCreateRequest(
            DestinationConfiguration configuration,
            String name,
            String workspaceId) {
        this(configuration, Optional.empty(), name, Optional.empty(), workspaceId);
    }

    /**
     * The values required to configure the destination.
     */
    @JsonIgnore
    public DestinationConfiguration configuration() {
        return configuration;
    }

    /**
     * The UUID of the connector definition. One of configuration.destinationType or definitionId must be provided.
     */
    @JsonIgnore
    public Optional<String> definitionId() {
        return definitionId;
    }

    /**
     * Name of the destination e.g. dev-mysql-instance.
     */
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

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The values required to configure the destination.
     */
    public DestinationCreateRequest withConfiguration(DestinationConfiguration configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = configuration;
        return this;
    }

    /**
     * The UUID of the connector definition. One of configuration.destinationType or definitionId must be provided.
     */
    public DestinationCreateRequest withDefinitionId(String definitionId) {
        Utils.checkNotNull(definitionId, "definitionId");
        this.definitionId = Optional.ofNullable(definitionId);
        return this;
    }

    /**
     * The UUID of the connector definition. One of configuration.destinationType or definitionId must be provided.
     */
    public DestinationCreateRequest withDefinitionId(Optional<String> definitionId) {
        Utils.checkNotNull(definitionId, "definitionId");
        this.definitionId = definitionId;
        return this;
    }

    /**
     * Name of the destination e.g. dev-mysql-instance.
     */
    public DestinationCreateRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.
     */
    public DestinationCreateRequest withResourceAllocation(ScopedResourceRequirements resourceAllocation) {
        Utils.checkNotNull(resourceAllocation, "resourceAllocation");
        this.resourceAllocation = Optional.ofNullable(resourceAllocation);
        return this;
    }

    /**
     * actor or actor definition specific resource requirements. if default is set, these are the requirements that should be set for ALL jobs run for this actor definition. it is overriden by the job type specific configurations. if not set, the platform will use defaults. these values will be overriden by configuration at the connection level.
     */
    public DestinationCreateRequest withResourceAllocation(Optional<? extends ScopedResourceRequirements> resourceAllocation) {
        Utils.checkNotNull(resourceAllocation, "resourceAllocation");
        this.resourceAllocation = resourceAllocation;
        return this;
    }

    public DestinationCreateRequest withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
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
        DestinationCreateRequest other = (DestinationCreateRequest) o;
        return 
            Objects.deepEquals(this.configuration, other.configuration) &&
            Objects.deepEquals(this.definitionId, other.definitionId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.resourceAllocation, other.resourceAllocation) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            configuration,
            definitionId,
            name,
            resourceAllocation,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationCreateRequest.class,
                "configuration", configuration,
                "definitionId", definitionId,
                "name", name,
                "resourceAllocation", resourceAllocation,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private DestinationConfiguration configuration;
 
        private Optional<String> definitionId = Optional.empty();
 
        private String name;
 
        private Optional<? extends ScopedResourceRequirements> resourceAllocation = Optional.empty();
 
        private String workspaceId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The values required to configure the destination.
         */
        public Builder configuration(DestinationConfiguration configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = configuration;
            return this;
        }

        /**
         * The UUID of the connector definition. One of configuration.destinationType or definitionId must be provided.
         */
        public Builder definitionId(String definitionId) {
            Utils.checkNotNull(definitionId, "definitionId");
            this.definitionId = Optional.ofNullable(definitionId);
            return this;
        }

        /**
         * The UUID of the connector definition. One of configuration.destinationType or definitionId must be provided.
         */
        public Builder definitionId(Optional<String> definitionId) {
            Utils.checkNotNull(definitionId, "definitionId");
            this.definitionId = definitionId;
            return this;
        }

        /**
         * Name of the destination e.g. dev-mysql-instance.
         */
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

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public DestinationCreateRequest build() {
            return new DestinationCreateRequest(
                configuration,
                definitionId,
                name,
                resourceAllocation,
                workspaceId);
        }
    }
}
