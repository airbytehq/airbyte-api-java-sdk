/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationTimeplus - The values required to configure the destination.
 */

public class DestinationTimeplus {
    /**
     * Personal API key
     */
    @JsonProperty("apikey")
    public String apikey;

    public DestinationTimeplus withApikey(String apikey) {
        this.apikey = apikey;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationTimeplusTimeplus destinationType;

    public DestinationTimeplus withDestinationType(DestinationTimeplusTimeplus destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Timeplus workspace endpoint
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    public String endpoint;

    public DestinationTimeplus withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    public DestinationTimeplus(@JsonProperty("apikey") String apikey, @JsonProperty("destinationType") DestinationTimeplusTimeplus destinationType) {
        this.apikey = apikey;
        this.destinationType = destinationType;
  }
}
