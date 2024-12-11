/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;


import com.airbyte.api.models.shared.UsersResponse;
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


public class ListUsersWithinAnOrganizationResponse implements Response {

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
     * List Users.
     */
    private Optional<? extends UsersResponse> usersResponse;

    @JsonCreator
    public ListUsersWithinAnOrganizationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends UsersResponse> usersResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(usersResponse, "usersResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.usersResponse = usersResponse;
    }
    
    public ListUsersWithinAnOrganizationResponse(
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
     * List Users.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UsersResponse> usersResponse() {
        return (Optional<UsersResponse>) usersResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListUsersWithinAnOrganizationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListUsersWithinAnOrganizationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListUsersWithinAnOrganizationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * List Users.
     */
    public ListUsersWithinAnOrganizationResponse withUsersResponse(UsersResponse usersResponse) {
        Utils.checkNotNull(usersResponse, "usersResponse");
        this.usersResponse = Optional.ofNullable(usersResponse);
        return this;
    }

    /**
     * List Users.
     */
    public ListUsersWithinAnOrganizationResponse withUsersResponse(Optional<? extends UsersResponse> usersResponse) {
        Utils.checkNotNull(usersResponse, "usersResponse");
        this.usersResponse = usersResponse;
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
        ListUsersWithinAnOrganizationResponse other = (ListUsersWithinAnOrganizationResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.usersResponse, other.usersResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            usersResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListUsersWithinAnOrganizationResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "usersResponse", usersResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends UsersResponse> usersResponse = Optional.empty();  
        
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
         * List Users.
         */
        public Builder usersResponse(UsersResponse usersResponse) {
            Utils.checkNotNull(usersResponse, "usersResponse");
            this.usersResponse = Optional.ofNullable(usersResponse);
            return this;
        }

        /**
         * List Users.
         */
        public Builder usersResponse(Optional<? extends UsersResponse> usersResponse) {
            Utils.checkNotNull(usersResponse, "usersResponse");
            this.usersResponse = usersResponse;
            return this;
        }
        
        public ListUsersWithinAnOrganizationResponse build() {
            return new ListUsersWithinAnOrganizationResponse(
                contentType,
                statusCode,
                rawResponse,
                usersResponse);
        }
    }
}

