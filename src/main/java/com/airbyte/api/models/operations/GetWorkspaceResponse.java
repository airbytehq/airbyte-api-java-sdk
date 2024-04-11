/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetWorkspaceResponse implements com.airbyte.api.utils.Response {

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
     * Get a Workspace by the id in the path.
     */
    private Optional<? extends com.airbyte.api.models.shared.WorkspaceResponse> workspaceResponse;

    public GetWorkspaceResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.airbyte.api.models.shared.WorkspaceResponse> workspaceResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(workspaceResponse, "workspaceResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.workspaceResponse = workspaceResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Get a Workspace by the id in the path.
     */
    public Optional<? extends com.airbyte.api.models.shared.WorkspaceResponse> workspaceResponse() {
        return workspaceResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetWorkspaceResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetWorkspaceResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetWorkspaceResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Get a Workspace by the id in the path.
     */
    public GetWorkspaceResponse withWorkspaceResponse(com.airbyte.api.models.shared.WorkspaceResponse workspaceResponse) {
        Utils.checkNotNull(workspaceResponse, "workspaceResponse");
        this.workspaceResponse = Optional.ofNullable(workspaceResponse);
        return this;
    }

    /**
     * Get a Workspace by the id in the path.
     */
    public GetWorkspaceResponse withWorkspaceResponse(Optional<? extends com.airbyte.api.models.shared.WorkspaceResponse> workspaceResponse) {
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
        GetWorkspaceResponse other = (GetWorkspaceResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.workspaceResponse, other.workspaceResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            workspaceResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkspaceResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "workspaceResponse", workspaceResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.airbyte.api.models.shared.WorkspaceResponse> workspaceResponse = Optional.empty();  
        
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
         * Get a Workspace by the id in the path.
         */
        public Builder workspaceResponse(com.airbyte.api.models.shared.WorkspaceResponse workspaceResponse) {
            Utils.checkNotNull(workspaceResponse, "workspaceResponse");
            this.workspaceResponse = Optional.ofNullable(workspaceResponse);
            return this;
        }

        /**
         * Get a Workspace by the id in the path.
         */
        public Builder workspaceResponse(Optional<? extends com.airbyte.api.models.shared.WorkspaceResponse> workspaceResponse) {
            Utils.checkNotNull(workspaceResponse, "workspaceResponse");
            this.workspaceResponse = workspaceResponse;
            return this;
        }
        
        public GetWorkspaceResponse build() {
            return new GetWorkspaceResponse(
                contentType,
                statusCode,
                rawResponse,
                workspaceResponse);
        }
    }
}

