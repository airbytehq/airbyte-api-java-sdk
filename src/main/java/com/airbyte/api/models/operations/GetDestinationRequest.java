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


public class GetDestinationRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=destinationId")
    private String destinationId;

    @JsonCreator
    public GetDestinationRequest(
            String destinationId) {
        Utils.checkNotNull(destinationId, "destinationId");
        this.destinationId = destinationId;
    }

    @JsonIgnore
    public String destinationId() {
        return destinationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetDestinationRequest withDestinationId(String destinationId) {
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
        GetDestinationRequest other = (GetDestinationRequest) o;
        return 
            Objects.deepEquals(this.destinationId, other.destinationId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            destinationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDestinationRequest.class,
                "destinationId", destinationId);
    }
    
    public final static class Builder {
 
        private String destinationId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder destinationId(String destinationId) {
            Utils.checkNotNull(destinationId, "destinationId");
            this.destinationId = destinationId;
            return this;
        }
        
        public GetDestinationRequest build() {
            return new GetDestinationRequest(
                destinationId);
        }
    }
}

