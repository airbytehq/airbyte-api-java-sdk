/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationTypesense - The values required to configure the destination.
 */

public class DestinationTypesense {
    /**
     * Typesense API Key
     */
    @JsonProperty("api_key")
    public String apiKey;

    public DestinationTypesense withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * How many documents should be imported together. Default 1000
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batch_size")
    public String batchSize;

    public DestinationTypesense withBatchSize(String batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationTypesenseTypesense destinationType;

    public DestinationTypesense withDestinationType(DestinationTypesenseTypesense destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Hostname of the Typesense instance without protocol.
     */
    @JsonProperty("host")
    public String host;

    public DestinationTypesense withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Port of the Typesense instance. Ex: 8108, 80, 443. Default is 443
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    public String port;

    public DestinationTypesense withPort(String port) {
        this.port = port;
        return this;
    }
    
    /**
     * Protocol of the Typesense instance. Ex: http or https. Default is https
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocol")
    public String protocol;

    public DestinationTypesense withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    public DestinationTypesense(@JsonProperty("api_key") String apiKey, @JsonProperty("destinationType") DestinationTypesenseTypesense destinationType, @JsonProperty("host") String host) {
        this.apiKey = apiKey;
        this.destinationType = destinationType;
        this.host = host;
  }
}
