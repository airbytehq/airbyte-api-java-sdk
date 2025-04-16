/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class DestinationMongodb {

    /**
     * Authorization type.
     */
    @JsonProperty("auth_type")
    private AuthorizationType authType;

    /**
     * Name of the database.
     */
    @JsonProperty("database")
    private String database;

    @JsonProperty("destinationType")
    private Mongodb destinationType;

    /**
     * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instance_type")
    private Optional<? extends MongoDbInstanceType> instanceType;

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends DestinationMongodbSSHTunnelMethod> tunnelMethod;

    @JsonCreator
    public DestinationMongodb(
            @JsonProperty("auth_type") AuthorizationType authType,
            @JsonProperty("database") String database,
            @JsonProperty("instance_type") Optional<? extends MongoDbInstanceType> instanceType,
            @JsonProperty("tunnel_method") Optional<? extends DestinationMongodbSSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(authType, "authType");
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(instanceType, "instanceType");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.authType = authType;
        this.database = database;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.instanceType = instanceType;
        this.tunnelMethod = tunnelMethod;
    }
    
    public DestinationMongodb(
            AuthorizationType authType,
            String database) {
        this(authType, database, Optional.empty(), Optional.empty());
    }

    /**
     * Authorization type.
     */
    @JsonIgnore
    public AuthorizationType authType() {
        return authType;
    }

    /**
     * Name of the database.
     */
    @JsonIgnore
    public String database() {
        return database;
    }

    @JsonIgnore
    public Mongodb destinationType() {
        return destinationType;
    }

    /**
     * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MongoDbInstanceType> instanceType() {
        return (Optional<MongoDbInstanceType>) instanceType;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationMongodbSSHTunnelMethod> tunnelMethod() {
        return (Optional<DestinationMongodbSSHTunnelMethod>) tunnelMethod;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Authorization type.
     */
    public DestinationMongodb withAuthType(AuthorizationType authType) {
        Utils.checkNotNull(authType, "authType");
        this.authType = authType;
        return this;
    }

    /**
     * Name of the database.
     */
    public DestinationMongodb withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
     */
    public DestinationMongodb withInstanceType(MongoDbInstanceType instanceType) {
        Utils.checkNotNull(instanceType, "instanceType");
        this.instanceType = Optional.ofNullable(instanceType);
        return this;
    }

    /**
     * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
     */
    public DestinationMongodb withInstanceType(Optional<? extends MongoDbInstanceType> instanceType) {
        Utils.checkNotNull(instanceType, "instanceType");
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationMongodb withTunnelMethod(DestinationMongodbSSHTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationMongodb withTunnelMethod(Optional<? extends DestinationMongodbSSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
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
        DestinationMongodb other = (DestinationMongodb) o;
        return 
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.database, other.database) &&
            Objects.deepEquals(this.destinationType, other.destinationType) &&
            Objects.deepEquals(this.instanceType, other.instanceType) &&
            Objects.deepEquals(this.tunnelMethod, other.tunnelMethod);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authType,
            database,
            destinationType,
            instanceType,
            tunnelMethod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMongodb.class,
                "authType", authType,
                "database", database,
                "destinationType", destinationType,
                "instanceType", instanceType,
                "tunnelMethod", tunnelMethod);
    }
    
    public final static class Builder {
 
        private AuthorizationType authType;
 
        private String database;
 
        private Optional<? extends MongoDbInstanceType> instanceType = Optional.empty();
 
        private Optional<? extends DestinationMongodbSSHTunnelMethod> tunnelMethod = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Authorization type.
         */
        public Builder authType(AuthorizationType authType) {
            Utils.checkNotNull(authType, "authType");
            this.authType = authType;
            return this;
        }

        /**
         * Name of the database.
         */
        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }

        /**
         * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
         */
        public Builder instanceType(MongoDbInstanceType instanceType) {
            Utils.checkNotNull(instanceType, "instanceType");
            this.instanceType = Optional.ofNullable(instanceType);
            return this;
        }

        /**
         * MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
         */
        public Builder instanceType(Optional<? extends MongoDbInstanceType> instanceType) {
            Utils.checkNotNull(instanceType, "instanceType");
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(DestinationMongodbSSHTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(Optional<? extends DestinationMongodbSSHTunnelMethod> tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = tunnelMethod;
            return this;
        }
        
        public DestinationMongodb build() {
            return new DestinationMongodb(
                authType,
                database,
                instanceType,
                tunnelMethod);
        }

        private static final LazySingletonValue<Mongodb> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"mongodb\"",
                        new TypeReference<Mongodb>() {});
    }
}
