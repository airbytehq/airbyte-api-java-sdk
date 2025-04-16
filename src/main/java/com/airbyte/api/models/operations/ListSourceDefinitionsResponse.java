/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.models.shared.DefinitionsResponse;
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

public class ListSourceDefinitionsResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful operation
     */
    private Optional<? extends DefinitionsResponse> definitionsResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListSourceDefinitionsResponse(
            String contentType,
            Optional<? extends DefinitionsResponse> definitionsResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(definitionsResponse, "definitionsResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.definitionsResponse = definitionsResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListSourceDefinitionsResponse(
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
     * Successful operation
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DefinitionsResponse> definitionsResponse() {
        return (Optional<DefinitionsResponse>) definitionsResponse;
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
    public ListSourceDefinitionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful operation
     */
    public ListSourceDefinitionsResponse withDefinitionsResponse(DefinitionsResponse definitionsResponse) {
        Utils.checkNotNull(definitionsResponse, "definitionsResponse");
        this.definitionsResponse = Optional.ofNullable(definitionsResponse);
        return this;
    }

    /**
     * Successful operation
     */
    public ListSourceDefinitionsResponse withDefinitionsResponse(Optional<? extends DefinitionsResponse> definitionsResponse) {
        Utils.checkNotNull(definitionsResponse, "definitionsResponse");
        this.definitionsResponse = definitionsResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListSourceDefinitionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListSourceDefinitionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListSourceDefinitionsResponse other = (ListSourceDefinitionsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.definitionsResponse, other.definitionsResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            definitionsResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListSourceDefinitionsResponse.class,
                "contentType", contentType,
                "definitionsResponse", definitionsResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends DefinitionsResponse> definitionsResponse = Optional.empty();
 
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
         * Successful operation
         */
        public Builder definitionsResponse(DefinitionsResponse definitionsResponse) {
            Utils.checkNotNull(definitionsResponse, "definitionsResponse");
            this.definitionsResponse = Optional.ofNullable(definitionsResponse);
            return this;
        }

        /**
         * Successful operation
         */
        public Builder definitionsResponse(Optional<? extends DefinitionsResponse> definitionsResponse) {
            Utils.checkNotNull(definitionsResponse, "definitionsResponse");
            this.definitionsResponse = definitionsResponse;
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
        
        public ListSourceDefinitionsResponse build() {
            return new ListSourceDefinitionsResponse(
                contentType,
                definitionsResponse,
                statusCode,
                rawResponse);
        }
    }
}
