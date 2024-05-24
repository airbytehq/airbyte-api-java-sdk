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

public class UpdateWorkspaceRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.airbyte.api.models.shared.WorkspaceUpdateRequest workspaceUpdateRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceId")
    private String workspaceId;

    @JsonCreator
    public UpdateWorkspaceRequest(
            com.airbyte.api.models.shared.WorkspaceUpdateRequest workspaceUpdateRequest,
            String workspaceId) {
        Utils.checkNotNull(workspaceUpdateRequest, "workspaceUpdateRequest");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceUpdateRequest = workspaceUpdateRequest;
        this.workspaceId = workspaceId;
    }

    @JsonIgnore
    public com.airbyte.api.models.shared.WorkspaceUpdateRequest workspaceUpdateRequest() {
        return workspaceUpdateRequest;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateWorkspaceRequest withWorkspaceUpdateRequest(com.airbyte.api.models.shared.WorkspaceUpdateRequest workspaceUpdateRequest) {
        Utils.checkNotNull(workspaceUpdateRequest, "workspaceUpdateRequest");
        this.workspaceUpdateRequest = workspaceUpdateRequest;
        return this;
    }

    public UpdateWorkspaceRequest withWorkspaceId(String workspaceId) {
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
        UpdateWorkspaceRequest other = (UpdateWorkspaceRequest) o;
        return 
            java.util.Objects.deepEquals(this.workspaceUpdateRequest, other.workspaceUpdateRequest) &&
            java.util.Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            workspaceUpdateRequest,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateWorkspaceRequest.class,
                "workspaceUpdateRequest", workspaceUpdateRequest,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private com.airbyte.api.models.shared.WorkspaceUpdateRequest workspaceUpdateRequest;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder workspaceUpdateRequest(com.airbyte.api.models.shared.WorkspaceUpdateRequest workspaceUpdateRequest) {
            Utils.checkNotNull(workspaceUpdateRequest, "workspaceUpdateRequest");
            this.workspaceUpdateRequest = workspaceUpdateRequest;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public UpdateWorkspaceRequest build() {
            return new UpdateWorkspaceRequest(
                workspaceUpdateRequest,
                workspaceId);
        }
    }
}

