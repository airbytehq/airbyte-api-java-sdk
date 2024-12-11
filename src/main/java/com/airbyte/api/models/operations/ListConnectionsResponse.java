/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;


import com.airbyte.api.models.shared.ConnectionsResponse;
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


public class ListConnectionsResponse implements Response {

    /**
     * Successful operation
     */
    private Optional<? extends ConnectionsResponse> connectionsResponse;

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
    public ListConnectionsResponse(
            Optional<? extends ConnectionsResponse> connectionsResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(connectionsResponse, "connectionsResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.connectionsResponse = connectionsResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListConnectionsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Successful operation
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConnectionsResponse> connectionsResponse() {
        return (Optional<ConnectionsResponse>) connectionsResponse;
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
     * Successful operation
     */
    public ListConnectionsResponse withConnectionsResponse(ConnectionsResponse connectionsResponse) {
        Utils.checkNotNull(connectionsResponse, "connectionsResponse");
        this.connectionsResponse = Optional.ofNullable(connectionsResponse);
        return this;
    }

    /**
     * Successful operation
     */
    public ListConnectionsResponse withConnectionsResponse(Optional<? extends ConnectionsResponse> connectionsResponse) {
        Utils.checkNotNull(connectionsResponse, "connectionsResponse");
        this.connectionsResponse = connectionsResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListConnectionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListConnectionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListConnectionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListConnectionsResponse other = (ListConnectionsResponse) o;
        return 
            Objects.deepEquals(this.connectionsResponse, other.connectionsResponse) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectionsResponse,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListConnectionsResponse.class,
                "connectionsResponse", connectionsResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends ConnectionsResponse> connectionsResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Successful operation
         */
        public Builder connectionsResponse(ConnectionsResponse connectionsResponse) {
            Utils.checkNotNull(connectionsResponse, "connectionsResponse");
            this.connectionsResponse = Optional.ofNullable(connectionsResponse);
            return this;
        }

        /**
         * Successful operation
         */
        public Builder connectionsResponse(Optional<? extends ConnectionsResponse> connectionsResponse) {
            Utils.checkNotNull(connectionsResponse, "connectionsResponse");
            this.connectionsResponse = connectionsResponse;
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
        
        public ListConnectionsResponse build() {
            return new ListConnectionsResponse(
                connectionsResponse,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

