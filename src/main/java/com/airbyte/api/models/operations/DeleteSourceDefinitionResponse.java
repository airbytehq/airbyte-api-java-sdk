/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.models.shared.DefinitionResponse;
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

public class DeleteSourceDefinitionResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends DefinitionResponse> definitionResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public DeleteSourceDefinitionResponse(
            String contentType,
            Optional<? extends DefinitionResponse> definitionResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(definitionResponse, "definitionResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.definitionResponse = definitionResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public DeleteSourceDefinitionResponse(
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
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DefinitionResponse> definitionResponse() {
        return (Optional<DefinitionResponse>) definitionResponse;
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
    public DeleteSourceDefinitionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public DeleteSourceDefinitionResponse withDefinitionResponse(DefinitionResponse definitionResponse) {
        Utils.checkNotNull(definitionResponse, "definitionResponse");
        this.definitionResponse = Optional.ofNullable(definitionResponse);
        return this;
    }

    /**
     * Success
     */
    public DeleteSourceDefinitionResponse withDefinitionResponse(Optional<? extends DefinitionResponse> definitionResponse) {
        Utils.checkNotNull(definitionResponse, "definitionResponse");
        this.definitionResponse = definitionResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public DeleteSourceDefinitionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public DeleteSourceDefinitionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        DeleteSourceDefinitionResponse other = (DeleteSourceDefinitionResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.definitionResponse, other.definitionResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            definitionResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteSourceDefinitionResponse.class,
                "contentType", contentType,
                "definitionResponse", definitionResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends DefinitionResponse> definitionResponse = Optional.empty();
 
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
         * Success
         */
        public Builder definitionResponse(DefinitionResponse definitionResponse) {
            Utils.checkNotNull(definitionResponse, "definitionResponse");
            this.definitionResponse = Optional.ofNullable(definitionResponse);
            return this;
        }

        /**
         * Success
         */
        public Builder definitionResponse(Optional<? extends DefinitionResponse> definitionResponse) {
            Utils.checkNotNull(definitionResponse, "definitionResponse");
            this.definitionResponse = definitionResponse;
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
        
        public DeleteSourceDefinitionResponse build() {
            return new DeleteSourceDefinitionResponse(
                contentType,
                definitionResponse,
                statusCode,
                rawResponse);
        }
    }
}
