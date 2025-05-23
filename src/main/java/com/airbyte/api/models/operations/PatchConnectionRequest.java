/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.models.shared.ConnectionPatchRequest;
import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class PatchConnectionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private ConnectionPatchRequest connectionPatchRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    @JsonCreator
    public PatchConnectionRequest(
            ConnectionPatchRequest connectionPatchRequest,
            String connectionId) {
        Utils.checkNotNull(connectionPatchRequest, "connectionPatchRequest");
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionPatchRequest = connectionPatchRequest;
        this.connectionId = connectionId;
    }

    @JsonIgnore
    public ConnectionPatchRequest connectionPatchRequest() {
        return connectionPatchRequest;
    }

    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public PatchConnectionRequest withConnectionPatchRequest(ConnectionPatchRequest connectionPatchRequest) {
        Utils.checkNotNull(connectionPatchRequest, "connectionPatchRequest");
        this.connectionPatchRequest = connectionPatchRequest;
        return this;
    }

    public PatchConnectionRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
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
        PatchConnectionRequest other = (PatchConnectionRequest) o;
        return 
            Objects.deepEquals(this.connectionPatchRequest, other.connectionPatchRequest) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectionPatchRequest,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchConnectionRequest.class,
                "connectionPatchRequest", connectionPatchRequest,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private ConnectionPatchRequest connectionPatchRequest;
 
        private String connectionId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connectionPatchRequest(ConnectionPatchRequest connectionPatchRequest) {
            Utils.checkNotNull(connectionPatchRequest, "connectionPatchRequest");
            this.connectionPatchRequest = connectionPatchRequest;
            return this;
        }

        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }
        
        public PatchConnectionRequest build() {
            return new PatchConnectionRequest(
                connectionPatchRequest,
                connectionId);
        }
    }
}
