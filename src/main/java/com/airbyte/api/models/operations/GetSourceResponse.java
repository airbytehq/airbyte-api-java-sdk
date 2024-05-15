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


public class GetSourceResponse implements com.airbyte.api.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Get a Source by the id in the path.
     */
    private Optional<? extends com.airbyte.api.models.shared.SourceResponse> sourceResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetSourceResponse(
            String contentType,
            Optional<? extends com.airbyte.api.models.shared.SourceResponse> sourceResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(sourceResponse, "sourceResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.sourceResponse = sourceResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetSourceResponse(
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
     * Get a Source by the id in the path.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.airbyte.api.models.shared.SourceResponse> sourceResponse() {
        return (Optional<com.airbyte.api.models.shared.SourceResponse>) sourceResponse;
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
    public GetSourceResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Get a Source by the id in the path.
     */
    public GetSourceResponse withSourceResponse(com.airbyte.api.models.shared.SourceResponse sourceResponse) {
        Utils.checkNotNull(sourceResponse, "sourceResponse");
        this.sourceResponse = Optional.ofNullable(sourceResponse);
        return this;
    }

    /**
     * Get a Source by the id in the path.
     */
    public GetSourceResponse withSourceResponse(Optional<? extends com.airbyte.api.models.shared.SourceResponse> sourceResponse) {
        Utils.checkNotNull(sourceResponse, "sourceResponse");
        this.sourceResponse = sourceResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetSourceResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetSourceResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetSourceResponse other = (GetSourceResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.sourceResponse, other.sourceResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            sourceResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSourceResponse.class,
                "contentType", contentType,
                "sourceResponse", sourceResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.airbyte.api.models.shared.SourceResponse> sourceResponse = Optional.empty();
 
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
         * Get a Source by the id in the path.
         */
        public Builder sourceResponse(com.airbyte.api.models.shared.SourceResponse sourceResponse) {
            Utils.checkNotNull(sourceResponse, "sourceResponse");
            this.sourceResponse = Optional.ofNullable(sourceResponse);
            return this;
        }

        /**
         * Get a Source by the id in the path.
         */
        public Builder sourceResponse(Optional<? extends com.airbyte.api.models.shared.SourceResponse> sourceResponse) {
            Utils.checkNotNull(sourceResponse, "sourceResponse");
            this.sourceResponse = sourceResponse;
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
        
        public GetSourceResponse build() {
            return new GetSourceResponse(
                contentType,
                sourceResponse,
                statusCode,
                rawResponse);
        }
    }
}

