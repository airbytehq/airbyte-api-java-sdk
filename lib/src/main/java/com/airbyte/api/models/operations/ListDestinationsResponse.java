/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ListDestinationsResponse {
    
    public String contentType;
    public ListDestinationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful operation
     */
    
    public com.airbyte.api.models.shared.DestinationsResponse destinationsResponse;
    public ListDestinationsResponse withDestinationsResponse(com.airbyte.api.models.shared.DestinationsResponse destinationsResponse) {
        this.destinationsResponse = destinationsResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public ListDestinationsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public ListDestinationsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    

    public ListDestinationsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}
