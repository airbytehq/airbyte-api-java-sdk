/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;


import com.airbyte.api.models.shared.WorkspacesResponse;
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


public class ListWorkspacesResponse implements Response {

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
    private Optional<? extends WorkspacesResponse> workspacesResponse;

    @JsonCreator
    public ListWorkspacesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends WorkspacesResponse> workspacesResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(workspacesResponse, "workspacesResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.workspacesResponse = workspacesResponse;
    }
    
    public ListWorkspacesResponse(
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
    public Optional<WorkspacesResponse> workspacesResponse() {
        return (Optional<WorkspacesResponse>) workspacesResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListWorkspacesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListWorkspacesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListWorkspacesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Successful operation
     */
    public ListWorkspacesResponse withWorkspacesResponse(WorkspacesResponse workspacesResponse) {
        Utils.checkNotNull(workspacesResponse, "workspacesResponse");
        this.workspacesResponse = Optional.ofNullable(workspacesResponse);
        return this;
    }

    /**
     * Successful operation
     */
    public ListWorkspacesResponse withWorkspacesResponse(Optional<? extends WorkspacesResponse> workspacesResponse) {
        Utils.checkNotNull(workspacesResponse, "workspacesResponse");
        this.workspacesResponse = workspacesResponse;
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
        ListWorkspacesResponse other = (ListWorkspacesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.workspacesResponse, other.workspacesResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            workspacesResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListWorkspacesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "workspacesResponse", workspacesResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends WorkspacesResponse> workspacesResponse = Optional.empty();  
        
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
        public Builder workspacesResponse(WorkspacesResponse workspacesResponse) {
            Utils.checkNotNull(workspacesResponse, "workspacesResponse");
            this.workspacesResponse = Optional.ofNullable(workspacesResponse);
            return this;
        }

        /**
         * Successful operation
         */
        public Builder workspacesResponse(Optional<? extends WorkspacesResponse> workspacesResponse) {
            Utils.checkNotNull(workspacesResponse, "workspacesResponse");
            this.workspacesResponse = workspacesResponse;
            return this;
        }
        
        public ListWorkspacesResponse build() {
            return new ListWorkspacesResponse(
                contentType,
                statusCode,
                rawResponse,
                workspacesResponse);
        }
    }
}

