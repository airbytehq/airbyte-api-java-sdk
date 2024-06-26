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
            java.util.Objects.deepEquals(this.destinationId, other.destinationId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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

