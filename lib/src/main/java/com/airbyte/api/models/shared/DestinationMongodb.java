/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMongodb - The values required to configure the destination.
 */

public class DestinationMongodb {
    /**
     * Authorization type.
     */
    @JsonProperty("auth_type")
    public Object authType;

    public DestinationMongodb withAuthType(Object authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * Name of the database.
     */
    @JsonProperty("database")
    public String database;

    public DestinationMongodb withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationMongodbMongodb destinationType;

    public DestinationMongodb withDestinationType(DestinationMongodbMongodb destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instance_type")
    public Object instanceType;

    public DestinationMongodb withInstanceType(Object instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;

    public DestinationMongodb withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    public DestinationMongodb(@JsonProperty("auth_type") Object authType, @JsonProperty("database") String database, @JsonProperty("destinationType") DestinationMongodbMongodb destinationType) {
        this.authType = authType;
        this.database = database;
        this.destinationType = destinationType;
  }
}
