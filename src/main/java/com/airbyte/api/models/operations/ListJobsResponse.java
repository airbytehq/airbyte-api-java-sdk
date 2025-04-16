/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.models.shared.JobsResponse;
import com.airbyte.api.utils.Response;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class ListJobsResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * List all the Jobs by connectionId.
     */
    private Optional<? extends JobsResponse> jobsResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListJobsResponse(
            String contentType,
            Optional<? extends JobsResponse> jobsResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(jobsResponse, "jobsResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.jobsResponse = jobsResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListJobsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * List all the Jobs by connectionId.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<JobsResponse> jobsResponse() {
        return (Optional<JobsResponse>) jobsResponse;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public ListJobsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * List all the Jobs by connectionId.
     */
    public ListJobsResponse withJobsResponse(JobsResponse jobsResponse) {
        Utils.checkNotNull(jobsResponse, "jobsResponse");
        this.jobsResponse = Optional.ofNullable(jobsResponse);
        return this;
    }

    /**
     * List all the Jobs by connectionId.
     */
    public ListJobsResponse withJobsResponse(Optional<? extends JobsResponse> jobsResponse) {
        Utils.checkNotNull(jobsResponse, "jobsResponse");
        this.jobsResponse = jobsResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListJobsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListJobsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        ListJobsResponse other = (ListJobsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.jobsResponse, other.jobsResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            jobsResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListJobsResponse.class,
                "contentType", contentType,
                "jobsResponse", jobsResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends JobsResponse> jobsResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * List all the Jobs by connectionId.
         */
        public Builder jobsResponse(JobsResponse jobsResponse) {
            Utils.checkNotNull(jobsResponse, "jobsResponse");
            this.jobsResponse = Optional.ofNullable(jobsResponse);
            return this;
        }

        /**
         * List all the Jobs by connectionId.
         */
        public Builder jobsResponse(Optional<? extends JobsResponse> jobsResponse) {
            Utils.checkNotNull(jobsResponse, "jobsResponse");
            this.jobsResponse = jobsResponse;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public ListJobsResponse build() {
            return new ListJobsResponse(
                contentType,
                jobsResponse,
                statusCode,
                rawResponse);
        }
    }
}
