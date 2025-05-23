/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * JobCreateRequest
 * 
 * <p>Creates a new Job from the configuration provided in the request body.
 */
public class JobCreateRequest {

    @JsonProperty("connectionId")
    private String connectionId;

    /**
     * Enum that describes the different types of jobs that the platform runs.
     */
    @JsonProperty("jobType")
    private JobTypeEnum jobType;

    @JsonCreator
    public JobCreateRequest(
            @JsonProperty("connectionId") String connectionId,
            @JsonProperty("jobType") JobTypeEnum jobType) {
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(jobType, "jobType");
        this.connectionId = connectionId;
        this.jobType = jobType;
    }

    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Enum that describes the different types of jobs that the platform runs.
     */
    @JsonIgnore
    public JobTypeEnum jobType() {
        return jobType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public JobCreateRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Enum that describes the different types of jobs that the platform runs.
     */
    public JobCreateRequest withJobType(JobTypeEnum jobType) {
        Utils.checkNotNull(jobType, "jobType");
        this.jobType = jobType;
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
        JobCreateRequest other = (JobCreateRequest) o;
        return 
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.jobType, other.jobType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectionId,
            jobType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JobCreateRequest.class,
                "connectionId", connectionId,
                "jobType", jobType);
    }
    
    public final static class Builder {
 
        private String connectionId;
 
        private JobTypeEnum jobType;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Enum that describes the different types of jobs that the platform runs.
         */
        public Builder jobType(JobTypeEnum jobType) {
            Utils.checkNotNull(jobType, "jobType");
            this.jobType = jobType;
            return this;
        }
        
        public JobCreateRequest build() {
            return new JobCreateRequest(
                connectionId,
                jobType);
        }
    }
}
