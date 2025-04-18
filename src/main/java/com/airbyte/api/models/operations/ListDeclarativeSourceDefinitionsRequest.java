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

public class ListDeclarativeSourceDefinitionsRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceId")
    private String workspaceId;

    @JsonCreator
    public ListDeclarativeSourceDefinitionsRequest(
            String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ListDeclarativeSourceDefinitionsRequest withWorkspaceId(String workspaceId) {
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
        ListDeclarativeSourceDefinitionsRequest other = (ListDeclarativeSourceDefinitionsRequest) o;
        return 
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListDeclarativeSourceDefinitionsRequest.class,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private String workspaceId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public ListDeclarativeSourceDefinitionsRequest build() {
            return new ListDeclarativeSourceDefinitionsRequest(
                workspaceId);
        }
    }
}
