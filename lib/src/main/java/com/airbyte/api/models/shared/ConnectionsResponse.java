/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectionsResponse - Successful operation
 */
public class ConnectionsResponse {
    @JsonProperty("data")
    public ConnectionResponse[] data;
    public ConnectionsResponse withData(ConnectionResponse[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;
    public ConnectionsResponse withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;
    public ConnectionsResponse withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
}