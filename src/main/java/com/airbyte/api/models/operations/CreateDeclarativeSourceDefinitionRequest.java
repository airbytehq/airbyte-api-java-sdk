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

public class CreateDeclarativeSourceDefinitionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.airbyte.api.models.shared.CreateDeclarativeSourceDefinitionRequest createDeclarativeSourceDefinitionRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceId")
    private String workspaceId;

    @JsonCreator
    public CreateDeclarativeSourceDefinitionRequest(
            com.airbyte.api.models.shared.CreateDeclarativeSourceDefinitionRequest createDeclarativeSourceDefinitionRequest,
            String workspaceId) {
        Utils.checkNotNull(createDeclarativeSourceDefinitionRequest, "createDeclarativeSourceDefinitionRequest");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.createDeclarativeSourceDefinitionRequest = createDeclarativeSourceDefinitionRequest;
        this.workspaceId = workspaceId;
    }

    @JsonIgnore
    public com.airbyte.api.models.shared.CreateDeclarativeSourceDefinitionRequest createDeclarativeSourceDefinitionRequest() {
        return createDeclarativeSourceDefinitionRequest;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public CreateDeclarativeSourceDefinitionRequest withCreateDeclarativeSourceDefinitionRequest(com.airbyte.api.models.shared.CreateDeclarativeSourceDefinitionRequest createDeclarativeSourceDefinitionRequest) {
        Utils.checkNotNull(createDeclarativeSourceDefinitionRequest, "createDeclarativeSourceDefinitionRequest");
        this.createDeclarativeSourceDefinitionRequest = createDeclarativeSourceDefinitionRequest;
        return this;
    }

    public CreateDeclarativeSourceDefinitionRequest withWorkspaceId(String workspaceId) {
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
        CreateDeclarativeSourceDefinitionRequest other = (CreateDeclarativeSourceDefinitionRequest) o;
        return 
            Objects.deepEquals(this.createDeclarativeSourceDefinitionRequest, other.createDeclarativeSourceDefinitionRequest) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createDeclarativeSourceDefinitionRequest,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDeclarativeSourceDefinitionRequest.class,
                "createDeclarativeSourceDefinitionRequest", createDeclarativeSourceDefinitionRequest,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private com.airbyte.api.models.shared.CreateDeclarativeSourceDefinitionRequest createDeclarativeSourceDefinitionRequest;
 
        private String workspaceId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createDeclarativeSourceDefinitionRequest(com.airbyte.api.models.shared.CreateDeclarativeSourceDefinitionRequest createDeclarativeSourceDefinitionRequest) {
            Utils.checkNotNull(createDeclarativeSourceDefinitionRequest, "createDeclarativeSourceDefinitionRequest");
            this.createDeclarativeSourceDefinitionRequest = createDeclarativeSourceDefinitionRequest;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public CreateDeclarativeSourceDefinitionRequest build() {
            return new CreateDeclarativeSourceDefinitionRequest(
                createDeclarativeSourceDefinitionRequest,
                workspaceId);
        }
    }
}
