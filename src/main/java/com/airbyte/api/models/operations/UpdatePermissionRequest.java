/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UpdatePermissionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.airbyte.api.models.shared.PermissionUpdateRequest permissionUpdateRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=permissionId")
    private String permissionId;

    @JsonCreator
    public UpdatePermissionRequest(
            com.airbyte.api.models.shared.PermissionUpdateRequest permissionUpdateRequest,
            String permissionId) {
        Utils.checkNotNull(permissionUpdateRequest, "permissionUpdateRequest");
        Utils.checkNotNull(permissionId, "permissionId");
        this.permissionUpdateRequest = permissionUpdateRequest;
        this.permissionId = permissionId;
    }

    @JsonIgnore
    public com.airbyte.api.models.shared.PermissionUpdateRequest permissionUpdateRequest() {
        return permissionUpdateRequest;
    }

    @JsonIgnore
    public String permissionId() {
        return permissionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdatePermissionRequest withPermissionUpdateRequest(com.airbyte.api.models.shared.PermissionUpdateRequest permissionUpdateRequest) {
        Utils.checkNotNull(permissionUpdateRequest, "permissionUpdateRequest");
        this.permissionUpdateRequest = permissionUpdateRequest;
        return this;
    }

    public UpdatePermissionRequest withPermissionId(String permissionId) {
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
        UpdatePermissionRequest other = (UpdatePermissionRequest) o;
        return 
            java.util.Objects.deepEquals(this.permissionUpdateRequest, other.permissionUpdateRequest) &&
            java.util.Objects.deepEquals(this.permissionId, other.permissionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            permissionUpdateRequest,
            permissionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdatePermissionRequest.class,
                "permissionUpdateRequest", permissionUpdateRequest,
                "permissionId", permissionId);
    }
    
    public final static class Builder {
 
        private com.airbyte.api.models.shared.PermissionUpdateRequest permissionUpdateRequest;
 
        private String permissionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder permissionUpdateRequest(com.airbyte.api.models.shared.PermissionUpdateRequest permissionUpdateRequest) {
            Utils.checkNotNull(permissionUpdateRequest, "permissionUpdateRequest");
            this.permissionUpdateRequest = permissionUpdateRequest;
            return this;
        }

        public Builder permissionId(String permissionId) {
            Utils.checkNotNull(permissionId, "permissionId");
            this.permissionId = permissionId;
            return this;
        }
        
        public UpdatePermissionRequest build() {
            return new UpdatePermissionRequest(
                permissionUpdateRequest,
                permissionId);
        }
    }
}

