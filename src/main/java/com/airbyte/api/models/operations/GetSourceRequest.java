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

public class GetSourceRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sourceId")
    private String sourceId;

    @JsonCreator
    public GetSourceRequest(
            String sourceId) {
        Utils.checkNotNull(sourceId, "sourceId");
        this.sourceId = sourceId;
    }

    @JsonIgnore
    public String sourceId() {
        return sourceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetSourceRequest withSourceId(String sourceId) {
        Utils.checkNotNull(sourceId, "sourceId");
        this.sourceId = sourceId;
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
        GetSourceRequest other = (GetSourceRequest) o;
        return 
            java.util.Objects.deepEquals(this.sourceId, other.sourceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sourceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSourceRequest.class,
                "sourceId", sourceId);
    }
    
    public final static class Builder {
 
        private String sourceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder sourceId(String sourceId) {
            Utils.checkNotNull(sourceId, "sourceId");
            this.sourceId = sourceId;
            return this;
        }
        
        public GetSourceRequest build() {
            return new GetSourceRequest(
                sourceId);
        }
    }
}

