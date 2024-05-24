/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
/**
 * WorkspaceResponse - Provides details of a single workspace.
 */

public class WorkspaceResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataResidency")
    private Optional<? extends GeographyEnum> dataResidency;

    @JsonProperty("name")
    private String name;

    @JsonProperty("workspaceId")
    private String workspaceId;

    @JsonCreator
    public WorkspaceResponse(
            @JsonProperty("dataResidency") Optional<? extends GeographyEnum> dataResidency,
            @JsonProperty("name") String name,
            @JsonProperty("workspaceId") String workspaceId) {
        Utils.checkNotNull(dataResidency, "dataResidency");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.dataResidency = dataResidency;
        this.name = name;
        this.workspaceId = workspaceId;
    }
    
    public WorkspaceResponse(
            String name,
            String workspaceId) {
        this(Optional.empty(), name, workspaceId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GeographyEnum> dataResidency() {
        return (Optional<GeographyEnum>) dataResidency;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WorkspaceResponse withDataResidency(GeographyEnum dataResidency) {
        Utils.checkNotNull(dataResidency, "dataResidency");
        this.dataResidency = Optional.ofNullable(dataResidency);
        return this;
    }

    public WorkspaceResponse withDataResidency(Optional<? extends GeographyEnum> dataResidency) {
        Utils.checkNotNull(dataResidency, "dataResidency");
        this.dataResidency = dataResidency;
        return this;
    }

    public WorkspaceResponse withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public WorkspaceResponse withWorkspaceId(String workspaceId) {
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
        WorkspaceResponse other = (WorkspaceResponse) o;
        return 
            java.util.Objects.deepEquals(this.dataResidency, other.dataResidency) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataResidency,
            name,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkspaceResponse.class,
                "dataResidency", dataResidency,
                "name", name,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private Optional<? extends GeographyEnum> dataResidency;
 
        private String name;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dataResidency(GeographyEnum dataResidency) {
            Utils.checkNotNull(dataResidency, "dataResidency");
            this.dataResidency = Optional.ofNullable(dataResidency);
            return this;
        }

        public Builder dataResidency(Optional<? extends GeographyEnum> dataResidency) {
            Utils.checkNotNull(dataResidency, "dataResidency");
            this.dataResidency = dataResidency;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public WorkspaceResponse build() {
            if (dataResidency == null) {
                dataResidency = _SINGLETON_VALUE_DataResidency.value();
            }
            return new WorkspaceResponse(
                dataResidency,
                name,
                workspaceId);
        }

        private static final LazySingletonValue<Optional<? extends GeographyEnum>> _SINGLETON_VALUE_DataResidency =
                new LazySingletonValue<>(
                        "dataResidency",
                        "\"auto\"",
                        new TypeReference<Optional<? extends GeographyEnum>>() {});
    }
}

