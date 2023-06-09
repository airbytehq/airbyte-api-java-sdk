/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PutDestinationResponse {
    
    public String contentType;

    public PutDestinationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Update a Destination and fully overwrite it
     */
    
    public com.airbyte.api.models.shared.DestinationResponse destinationResponse;

    public PutDestinationResponse withDestinationResponse(com.airbyte.api.models.shared.DestinationResponse destinationResponse) {
        this.destinationResponse = destinationResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public PutDestinationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PutDestinationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PutDestinationResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
