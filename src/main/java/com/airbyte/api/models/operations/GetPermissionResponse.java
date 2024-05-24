/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class GetPermissionResponse implements com.airbyte.api.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Get a Permission by the id in the path.
     */
    private Optional<? extends com.airbyte.api.models.shared.PermissionResponse> permissionResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetPermissionResponse(
            String contentType,
            Optional<? extends com.airbyte.api.models.shared.PermissionResponse> permissionResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(permissionResponse, "permissionResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.permissionResponse = permissionResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetPermissionResponse(
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
     * Get a Permission by the id in the path.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.airbyte.api.models.shared.PermissionResponse> permissionResponse() {
        return (Optional<com.airbyte.api.models.shared.PermissionResponse>) permissionResponse;
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
    public GetPermissionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Get a Permission by the id in the path.
     */
    public GetPermissionResponse withPermissionResponse(com.airbyte.api.models.shared.PermissionResponse permissionResponse) {
        Utils.checkNotNull(permissionResponse, "permissionResponse");
        this.permissionResponse = Optional.ofNullable(permissionResponse);
        return this;
    }

    /**
     * Get a Permission by the id in the path.
     */
    public GetPermissionResponse withPermissionResponse(Optional<? extends com.airbyte.api.models.shared.PermissionResponse> permissionResponse) {
        Utils.checkNotNull(permissionResponse, "permissionResponse");
        this.permissionResponse = permissionResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetPermissionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetPermissionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetPermissionResponse other = (GetPermissionResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.permissionResponse, other.permissionResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            permissionResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPermissionResponse.class,
                "contentType", contentType,
                "permissionResponse", permissionResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.airbyte.api.models.shared.PermissionResponse> permissionResponse = Optional.empty();
 
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
         * Get a Permission by the id in the path.
         */
        public Builder permissionResponse(com.airbyte.api.models.shared.PermissionResponse permissionResponse) {
            Utils.checkNotNull(permissionResponse, "permissionResponse");
            this.permissionResponse = Optional.ofNullable(permissionResponse);
            return this;
        }

        /**
         * Get a Permission by the id in the path.
         */
        public Builder permissionResponse(Optional<? extends com.airbyte.api.models.shared.PermissionResponse> permissionResponse) {
            Utils.checkNotNull(permissionResponse, "permissionResponse");
            this.permissionResponse = permissionResponse;
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
        
        public GetPermissionResponse build() {
            return new GetPermissionResponse(
                contentType,
                permissionResponse,
                statusCode,
                rawResponse);
        }
    }
}

