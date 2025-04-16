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

public class DeleteDestinationDefinitionRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=definitionId")
    private String definitionId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceId")
    private String workspaceId;

    @JsonCreator
    public DeleteDestinationDefinitionRequest(
            String definitionId,
            String workspaceId) {
        Utils.checkNotNull(definitionId, "definitionId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.definitionId = definitionId;
        this.workspaceId = workspaceId;
    }

    @JsonIgnore
    public String definitionId() {
        return definitionId;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public DeleteDestinationDefinitionRequest withDefinitionId(String definitionId) {
        Utils.checkNotNull(definitionId, "definitionId");
        this.definitionId = definitionId;
        return this;
    }

    public DeleteDestinationDefinitionRequest withWorkspaceId(String workspaceId) {
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
        DeleteDestinationDefinitionRequest other = (DeleteDestinationDefinitionRequest) o;
        return 
            Objects.deepEquals(this.definitionId, other.definitionId) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            definitionId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteDestinationDefinitionRequest.class,
                "definitionId", definitionId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private String definitionId;
 
        private String workspaceId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder definitionId(String definitionId) {
            Utils.checkNotNull(definitionId, "definitionId");
            this.definitionId = definitionId;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public DeleteDestinationDefinitionRequest build() {
            return new DeleteDestinationDefinitionRequest(
                definitionId,
                workspaceId);
        }
    }
}
