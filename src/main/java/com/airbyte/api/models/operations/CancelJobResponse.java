/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.models.shared.JobResponse;
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

public class CancelJobResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Cancel a Job.
     */
    private Optional<? extends JobResponse> jobResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CancelJobResponse(
            String contentType,
            Optional<? extends JobResponse> jobResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(jobResponse, "jobResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.jobResponse = jobResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CancelJobResponse(
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
     * Cancel a Job.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<JobResponse> jobResponse() {
        return (Optional<JobResponse>) jobResponse;
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
    public CancelJobResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Cancel a Job.
     */
    public CancelJobResponse withJobResponse(JobResponse jobResponse) {
        Utils.checkNotNull(jobResponse, "jobResponse");
        this.jobResponse = Optional.ofNullable(jobResponse);
        return this;
    }

    /**
     * Cancel a Job.
     */
    public CancelJobResponse withJobResponse(Optional<? extends JobResponse> jobResponse) {
        Utils.checkNotNull(jobResponse, "jobResponse");
        this.jobResponse = jobResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CancelJobResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CancelJobResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CancelJobResponse other = (CancelJobResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.jobResponse, other.jobResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            jobResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CancelJobResponse.class,
                "contentType", contentType,
                "jobResponse", jobResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends JobResponse> jobResponse = Optional.empty();
 
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
         * Cancel a Job.
         */
        public Builder jobResponse(JobResponse jobResponse) {
            Utils.checkNotNull(jobResponse, "jobResponse");
            this.jobResponse = Optional.ofNullable(jobResponse);
            return this;
        }

        /**
         * Cancel a Job.
         */
        public Builder jobResponse(Optional<? extends JobResponse> jobResponse) {
            Utils.checkNotNull(jobResponse, "jobResponse");
            this.jobResponse = jobResponse;
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
        
        public CancelJobResponse build() {
            return new CancelJobResponse(
                contentType,
                jobResponse,
                statusCode,
                rawResponse);
        }
    }
}
