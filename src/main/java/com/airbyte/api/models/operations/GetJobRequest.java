/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class GetJobRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=jobId")
    private long jobId;

    @JsonCreator
    public GetJobRequest(
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

    public GetJobRequest withJobId(long jobId) {
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
        GetJobRequest other = (GetJobRequest) o;
        return 
            Objects.deepEquals(this.jobId, other.jobId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            jobId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetJobRequest.class,
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
        
        public GetJobRequest build() {
            return new GetJobRequest(
                jobId);
        }
    }
}
