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

public class PermissionCreateRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("organizationId")
    private Optional<String> organizationId;

    /**
     * Subset of `PermissionType` (removing `instance_admin`), could be used in public-api.
     */
    @JsonProperty("permissionType")
    private PublicPermissionType permissionType;

    /**
     * Internal Airbyte user ID
     */
    @JsonProperty("userId")
    private String userId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workspaceId")
    private Optional<String> workspaceId;

    @JsonCreator
    public PermissionCreateRequest(
            @JsonProperty("organizationId") Optional<String> organizationId,
            @JsonProperty("permissionType") PublicPermissionType permissionType,
            @JsonProperty("userId") String userId,
            @JsonProperty("workspaceId") Optional<String> workspaceId) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(permissionType, "permissionType");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.organizationId = organizationId;
        this.permissionType = permissionType;
        this.userId = userId;
        this.workspaceId = workspaceId;
    }
    
    public PermissionCreateRequest(
            PublicPermissionType permissionType,
            String userId) {
        this(Optional.empty(), permissionType, userId, Optional.empty());
    }

    @JsonIgnore
    public Optional<String> organizationId() {
        return organizationId;
    }

    /**
     * Subset of `PermissionType` (removing `instance_admin`), could be used in public-api.
     */
    @JsonIgnore
    public PublicPermissionType permissionType() {
        return permissionType;
    }

    /**
     * Internal Airbyte user ID
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    @JsonIgnore
    public Optional<String> workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public PermissionCreateRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = Optional.ofNullable(organizationId);
        return this;
    }

    public PermissionCreateRequest withOrganizationId(Optional<String> organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Subset of `PermissionType` (removing `instance_admin`), could be used in public-api.
     */
    public PermissionCreateRequest withPermissionType(PublicPermissionType permissionType) {
        Utils.checkNotNull(permissionType, "permissionType");
        this.permissionType = permissionType;
        return this;
    }

    /**
     * Internal Airbyte user ID
     */
    public PermissionCreateRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public PermissionCreateRequest withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = Optional.ofNullable(workspaceId);
        return this;
    }

    public PermissionCreateRequest withWorkspaceId(Optional<String> workspaceId) {
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
        PermissionCreateRequest other = (PermissionCreateRequest) o;
        return 
            Objects.deepEquals(this.organizationId, other.organizationId) &&
            Objects.deepEquals(this.permissionType, other.permissionType) &&
            Objects.deepEquals(this.userId, other.userId) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            organizationId,
            permissionType,
            userId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PermissionCreateRequest.class,
                "organizationId", organizationId,
                "permissionType", permissionType,
                "userId", userId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private Optional<String> organizationId = Optional.empty();
 
        private PublicPermissionType permissionType;
 
        private String userId;
 
        private Optional<String> workspaceId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = Optional.ofNullable(organizationId);
            return this;
        }

        public Builder organizationId(Optional<String> organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        /**
         * Subset of `PermissionType` (removing `instance_admin`), could be used in public-api.
         */
        public Builder permissionType(PublicPermissionType permissionType) {
            Utils.checkNotNull(permissionType, "permissionType");
            this.permissionType = permissionType;
            return this;
        }

        /**
         * Internal Airbyte user ID
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = Optional.ofNullable(workspaceId);
            return this;
        }

        public Builder workspaceId(Optional<String> workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public PermissionCreateRequest build() {
            return new PermissionCreateRequest(
                organizationId,
                permissionType,
                userId,
                workspaceId);
        }
    }
}
