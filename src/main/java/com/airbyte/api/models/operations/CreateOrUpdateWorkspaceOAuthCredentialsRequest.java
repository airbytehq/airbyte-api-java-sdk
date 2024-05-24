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

public class CreateOrUpdateWorkspaceOAuthCredentialsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest workspaceOAuthCredentialsRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceId")
    private String workspaceId;

    @JsonCreator
    public CreateOrUpdateWorkspaceOAuthCredentialsRequest(
            com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest workspaceOAuthCredentialsRequest,
            String workspaceId) {
        Utils.checkNotNull(workspaceOAuthCredentialsRequest, "workspaceOAuthCredentialsRequest");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceOAuthCredentialsRequest = workspaceOAuthCredentialsRequest;
        this.workspaceId = workspaceId;
    }

    @JsonIgnore
    public com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest workspaceOAuthCredentialsRequest() {
        return workspaceOAuthCredentialsRequest;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateOrUpdateWorkspaceOAuthCredentialsRequest withWorkspaceOAuthCredentialsRequest(com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest workspaceOAuthCredentialsRequest) {
        Utils.checkNotNull(workspaceOAuthCredentialsRequest, "workspaceOAuthCredentialsRequest");
        this.workspaceOAuthCredentialsRequest = workspaceOAuthCredentialsRequest;
        return this;
    }

    public CreateOrUpdateWorkspaceOAuthCredentialsRequest withWorkspaceId(String workspaceId) {
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
        CreateOrUpdateWorkspaceOAuthCredentialsRequest other = (CreateOrUpdateWorkspaceOAuthCredentialsRequest) o;
        return 
            java.util.Objects.deepEquals(this.workspaceOAuthCredentialsRequest, other.workspaceOAuthCredentialsRequest) &&
            java.util.Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            workspaceOAuthCredentialsRequest,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateOrUpdateWorkspaceOAuthCredentialsRequest.class,
                "workspaceOAuthCredentialsRequest", workspaceOAuthCredentialsRequest,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest workspaceOAuthCredentialsRequest;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder workspaceOAuthCredentialsRequest(com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest workspaceOAuthCredentialsRequest) {
            Utils.checkNotNull(workspaceOAuthCredentialsRequest, "workspaceOAuthCredentialsRequest");
            this.workspaceOAuthCredentialsRequest = workspaceOAuthCredentialsRequest;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public CreateOrUpdateWorkspaceOAuthCredentialsRequest build() {
            return new CreateOrUpdateWorkspaceOAuthCredentialsRequest(
                workspaceOAuthCredentialsRequest,
                workspaceId);
        }
    }
}

