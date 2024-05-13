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
import java.util.Optional;


public class PatchDestinationRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.airbyte.api.models.shared.DestinationPatchRequest> destinationPatchRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=destinationId")
    private String destinationId;

    @JsonCreator
    public PatchDestinationRequest(
            Optional<? extends com.airbyte.api.models.shared.DestinationPatchRequest> destinationPatchRequest,
            String destinationId) {
        Utils.checkNotNull(destinationPatchRequest, "destinationPatchRequest");
        Utils.checkNotNull(destinationId, "destinationId");
        this.destinationPatchRequest = destinationPatchRequest;
        this.destinationId = destinationId;
    }
    
    public PatchDestinationRequest(
            String destinationId) {
        this(Optional.empty(), destinationId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.airbyte.api.models.shared.DestinationPatchRequest> destinationPatchRequest() {
        return (Optional<com.airbyte.api.models.shared.DestinationPatchRequest>) destinationPatchRequest;
    }

    @JsonIgnore
    public String destinationId() {
        return destinationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchDestinationRequest withDestinationPatchRequest(com.airbyte.api.models.shared.DestinationPatchRequest destinationPatchRequest) {
        Utils.checkNotNull(destinationPatchRequest, "destinationPatchRequest");
        this.destinationPatchRequest = Optional.ofNullable(destinationPatchRequest);
        return this;
    }

    public PatchDestinationRequest withDestinationPatchRequest(Optional<? extends com.airbyte.api.models.shared.DestinationPatchRequest> destinationPatchRequest) {
        Utils.checkNotNull(destinationPatchRequest, "destinationPatchRequest");
        this.destinationPatchRequest = destinationPatchRequest;
        return this;
    }

    public PatchDestinationRequest withDestinationId(String destinationId) {
        Utils.checkNotNull(destinationId, "destinationId");
        this.destinationId = destinationId;
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
        PatchDestinationRequest other = (PatchDestinationRequest) o;
        return 
            java.util.Objects.deepEquals(this.destinationPatchRequest, other.destinationPatchRequest) &&
            java.util.Objects.deepEquals(this.destinationId, other.destinationId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            destinationPatchRequest,
            destinationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchDestinationRequest.class,
                "destinationPatchRequest", destinationPatchRequest,
                "destinationId", destinationId);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.airbyte.api.models.shared.DestinationPatchRequest> destinationPatchRequest = Optional.empty();
 
        private String destinationId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder destinationPatchRequest(com.airbyte.api.models.shared.DestinationPatchRequest destinationPatchRequest) {
            Utils.checkNotNull(destinationPatchRequest, "destinationPatchRequest");
            this.destinationPatchRequest = Optional.ofNullable(destinationPatchRequest);
            return this;
        }

        public Builder destinationPatchRequest(Optional<? extends com.airbyte.api.models.shared.DestinationPatchRequest> destinationPatchRequest) {
            Utils.checkNotNull(destinationPatchRequest, "destinationPatchRequest");
            this.destinationPatchRequest = destinationPatchRequest;
            return this;
        }

        public Builder destinationId(String destinationId) {
            Utils.checkNotNull(destinationId, "destinationId");
            this.destinationId = destinationId;
            return this;
        }
        
        public PatchDestinationRequest build() {
            return new PatchDestinationRequest(
                destinationPatchRequest,
                destinationId);
        }
    }
}

