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

public class PatchConnectionResponse implements com.airbyte.api.utils.Response {

    /**
     * Update a Connection by the id in the path.
     */
    private Optional<? extends com.airbyte.api.models.shared.ConnectionResponse> connectionResponse;

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

    @JsonCreator
    public PatchConnectionResponse(
            Optional<? extends com.airbyte.api.models.shared.ConnectionResponse> connectionResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(connectionResponse, "connectionResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.connectionResponse = connectionResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public PatchConnectionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Update a Connection by the id in the path.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.airbyte.api.models.shared.ConnectionResponse> connectionResponse() {
        return (Optional<com.airbyte.api.models.shared.ConnectionResponse>) connectionResponse;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Update a Connection by the id in the path.
     */
    public PatchConnectionResponse withConnectionResponse(com.airbyte.api.models.shared.ConnectionResponse connectionResponse) {
        Utils.checkNotNull(connectionResponse, "connectionResponse");
        this.connectionResponse = Optional.ofNullable(connectionResponse);
        return this;
    }

    /**
     * Update a Connection by the id in the path.
     */
    public PatchConnectionResponse withConnectionResponse(Optional<? extends com.airbyte.api.models.shared.ConnectionResponse> connectionResponse) {
        Utils.checkNotNull(connectionResponse, "connectionResponse");
        this.connectionResponse = connectionResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public PatchConnectionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PatchConnectionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PatchConnectionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        PatchConnectionResponse other = (PatchConnectionResponse) o;
        return 
            java.util.Objects.deepEquals(this.connectionResponse, other.connectionResponse) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connectionResponse,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchConnectionResponse.class,
                "connectionResponse", connectionResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.airbyte.api.models.shared.ConnectionResponse> connectionResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Update a Connection by the id in the path.
         */
        public Builder connectionResponse(com.airbyte.api.models.shared.ConnectionResponse connectionResponse) {
            Utils.checkNotNull(connectionResponse, "connectionResponse");
            this.connectionResponse = Optional.ofNullable(connectionResponse);
            return this;
        }

        /**
         * Update a Connection by the id in the path.
         */
        public Builder connectionResponse(Optional<? extends com.airbyte.api.models.shared.ConnectionResponse> connectionResponse) {
            Utils.checkNotNull(connectionResponse, "connectionResponse");
            this.connectionResponse = connectionResponse;
            return this;
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
        
        public PatchConnectionResponse build() {
            return new PatchConnectionResponse(
                connectionResponse,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

