/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JobCreateRequest - Creates a new Job from the configuration provided in the request body.
 */
public class JobCreateRequest {
    @JsonProperty("connectionId")
    public String connectionId;
    public JobCreateRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * Enum that describes the different types of jobs that the platform runs.
     */
    @JsonProperty("jobType")
    public JobTypeEnumEnum jobType;
    public JobCreateRequest withJobType(JobTypeEnumEnum jobType) {
        this.jobType = jobType;
        return this;
    }
    

    public JobCreateRequest(@JsonProperty("connectionId") String connectionId, @JsonProperty("jobType") JobTypeEnumEnum jobType) {
    this.connectionId = connectionId;
this.jobType = jobType;
  }
}
