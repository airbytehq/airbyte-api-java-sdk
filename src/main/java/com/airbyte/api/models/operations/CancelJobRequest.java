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

public class CancelJobRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=jobId")
    private long jobId;

    @JsonCreator
    public CancelJobRequest(
            long jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
    }

    @JsonIgnore
    public long jobId() {
        return jobId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CancelJobRequest withJobId(long jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
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
        CancelJobRequest other = (CancelJobRequest) o;
        return 
            java.util.Objects.deepEquals(this.jobId, other.jobId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            jobId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CancelJobRequest.class,
                "jobId", jobId);
    }
    
    public final static class Builder {
 
        private Long jobId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder jobId(long jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
            return this;
        }
        
        public CancelJobRequest build() {
            return new CancelJobRequest(
                jobId);
        }
    }
}

