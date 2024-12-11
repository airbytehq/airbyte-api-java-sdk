/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;


import com.airbyte.api.models.shared.WorkspaceResponse;
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


public class UpdateWorkspaceResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Successful operation
     */
    private Optional<? extends WorkspaceResponse> workspaceResponse;

    @JsonCreator
    public UpdateWorkspaceResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends WorkspaceResponse> workspaceResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(workspaceResponse, "workspaceResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.workspaceResponse = workspaceResponse;
    }
    
    public UpdateWorkspaceResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
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

    /**
     * Successful operation
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WorkspaceResponse> workspaceResponse() {
        return (Optional<WorkspaceResponse>) workspaceResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateWorkspaceResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateWorkspaceResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateWorkspaceResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Successful operation
     */
    public UpdateWorkspaceResponse withWorkspaceResponse(WorkspaceResponse workspaceResponse) {
        Utils.checkNotNull(workspaceResponse, "workspaceResponse");
        this.workspaceResponse = Optional.ofNullable(workspaceResponse);
        return this;
    }

    /**
     * Successful operation
     */
    public UpdateWorkspaceResponse withWorkspaceResponse(Optional<? extends WorkspaceResponse> workspaceResponse) {
        Utils.checkNotNull(workspaceResponse, "workspaceResponse");
        this.workspaceResponse = workspaceResponse;
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
        UpdateWorkspaceResponse other = (UpdateWorkspaceResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.workspaceResponse, other.workspaceResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            workspaceResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateWorkspaceResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "workspaceResponse", workspaceResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends WorkspaceResponse> workspaceResponse = Optional.empty();  
        
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

        /**
         * Successful operation
         */
        public Builder workspaceResponse(WorkspaceResponse workspaceResponse) {
            Utils.checkNotNull(workspaceResponse, "workspaceResponse");
            this.workspaceResponse = Optional.ofNullable(workspaceResponse);
            return this;
        }

        /**
         * Successful operation
         */
        public Builder workspaceResponse(Optional<? extends WorkspaceResponse> workspaceResponse) {
            Utils.checkNotNull(workspaceResponse, "workspaceResponse");
            this.workspaceResponse = workspaceResponse;
            return this;
        }
        
        public UpdateWorkspaceResponse build() {
            return new UpdateWorkspaceResponse(
                contentType,
                statusCode,
                rawResponse,
                workspaceResponse);
        }
    }
}

