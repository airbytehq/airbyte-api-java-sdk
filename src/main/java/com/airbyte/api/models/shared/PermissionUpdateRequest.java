/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class PermissionUpdateRequest {

    /**
     * Describes what actions/endpoints the permission entitles to
     */
    @JsonProperty("permissionType")
    private PermissionType permissionType;

    @JsonCreator
    public PermissionUpdateRequest(
            @JsonProperty("permissionType") PermissionType permissionType) {
        Utils.checkNotNull(permissionType, "permissionType");
        this.permissionType = permissionType;
    }

    /**
     * Describes what actions/endpoints the permission entitles to
     */
    @JsonIgnore
    public PermissionType permissionType() {
        return permissionType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Describes what actions/endpoints the permission entitles to
     */
    public PermissionUpdateRequest withPermissionType(PermissionType permissionType) {
        Utils.checkNotNull(permissionType, "permissionType");
        this.permissionType = permissionType;
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
        PermissionUpdateRequest other = (PermissionUpdateRequest) o;
        return 
            Objects.deepEquals(this.permissionType, other.permissionType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            permissionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PermissionUpdateRequest.class,
                "permissionType", permissionType);
    }
    
    public final static class Builder {
 
        private PermissionType permissionType;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Describes what actions/endpoints the permission entitles to
         */
        public Builder permissionType(PermissionType permissionType) {
            Utils.checkNotNull(permissionType, "permissionType");
            this.permissionType = permissionType;
            return this;
        }
        
        public PermissionUpdateRequest build() {
            return new PermissionUpdateRequest(
                permissionType);
        }
    }
}
