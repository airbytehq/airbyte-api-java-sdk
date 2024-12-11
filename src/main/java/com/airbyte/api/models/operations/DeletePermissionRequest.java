/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;


import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeletePermissionRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=permissionId")
    private String permissionId;

    @JsonCreator
    public DeletePermissionRequest(
            String permissionId) {
        Utils.checkNotNull(permissionId, "permissionId");
        this.permissionId = permissionId;
    }

    @JsonIgnore
    public String permissionId() {
        return permissionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DeletePermissionRequest withPermissionId(String permissionId) {
        Utils.checkNotNull(permissionId, "permissionId");
        this.permissionId = permissionId;
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
        DeletePermissionRequest other = (DeletePermissionRequest) o;
        return 
            Objects.deepEquals(this.permissionId, other.permissionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            permissionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeletePermissionRequest.class,
                "permissionId", permissionId);
    }
    
    public final static class Builder {
 
        private String permissionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder permissionId(String permissionId) {
            Utils.checkNotNull(permissionId, "permissionId");
            this.permissionId = permissionId;
            return this;
        }
        
        public DeletePermissionRequest build() {
            return new DeletePermissionRequest(
                permissionId);
        }
    }
}

