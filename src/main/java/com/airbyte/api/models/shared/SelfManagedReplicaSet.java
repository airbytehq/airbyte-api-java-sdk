/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * SelfManagedReplicaSet
 * 
 * <p>MongoDB self-hosted cluster configured as a replica set
 */
public class SelfManagedReplicaSet {

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * The authentication source where the user information is stored.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_source")
    private Optional<String> authSource;

    @JsonProperty("cluster_type")
    private SourceMongodbV2ClusterType clusterType;

    /**
     * The connection string of the cluster that you want to replicate.  https://www.mongodb.com/docs/manual/reference/connection-string/#find-your-self-hosted-deployment-s-connection-string for more information.
     */
    @JsonProperty("connection_string")
    private String connectionString;

    /**
     * The name of the MongoDB database that contains the collection(s) to replicate.
     */
    @JsonProperty("database")
    private String database;

    /**
     * The password associated with this username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    /**
     * When enabled, syncs will validate and structure records against the stream's schema.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema_enforced")
    private Optional<Boolean> schemaEnforced;

    /**
     * The username which is used to access the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private Optional<String> username;

    @JsonCreator
    public SelfManagedReplicaSet(
            @JsonProperty("auth_source") Optional<String> authSource,
            @JsonProperty("connection_string") String connectionString,
            @JsonProperty("database") String database,
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("schema_enforced") Optional<Boolean> schemaEnforced,
            @JsonProperty("username") Optional<String> username) {
        Utils.checkNotNull(authSource, "authSource");
        Utils.checkNotNull(connectionString, "connectionString");
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(schemaEnforced, "schemaEnforced");
        Utils.checkNotNull(username, "username");
        this.additionalProperties = new HashMap<>();
        this.authSource = authSource;
        this.clusterType = Builder._SINGLETON_VALUE_ClusterType.value();
        this.connectionString = connectionString;
        this.database = database;
        this.password = password;
        this.schemaEnforced = schemaEnforced;
        this.username = username;
    }
    
    public SelfManagedReplicaSet(
            String connectionString,
            String database) {
        this(Optional.empty(), connectionString, database, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    /**
     * The authentication source where the user information is stored.
     */
    @JsonIgnore
    public Optional<String> authSource() {
        return authSource;
    }

    @JsonIgnore
    public SourceMongodbV2ClusterType clusterType() {
        return clusterType;
    }

    /**
     * The connection string of the cluster that you want to replicate.  https://www.mongodb.com/docs/manual/reference/connection-string/#find-your-self-hosted-deployment-s-connection-string for more information.
     */
    @JsonIgnore
    public String connectionString() {
        return connectionString;
    }

    /**
     * The name of the MongoDB database that contains the collection(s) to replicate.
     */
    @JsonIgnore
    public String database() {
        return database;
    }

    /**
     * The password associated with this username.
     */
    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    /**
     * When enabled, syncs will validate and structure records against the stream's schema.
     */
    @JsonIgnore
    public Optional<Boolean> schemaEnforced() {
        return schemaEnforced;
    }

    /**
     * The username which is used to access the database.
     */
    @JsonIgnore
    public Optional<String> username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    @JsonAnySetter
    public SelfManagedReplicaSet withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }    

    public SelfManagedReplicaSet withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * The authentication source where the user information is stored.
     */
    public SelfManagedReplicaSet withAuthSource(String authSource) {
        Utils.checkNotNull(authSource, "authSource");
        this.authSource = Optional.ofNullable(authSource);
        return this;
    }

    /**
     * The authentication source where the user information is stored.
     */
    public SelfManagedReplicaSet withAuthSource(Optional<String> authSource) {
        Utils.checkNotNull(authSource, "authSource");
        this.authSource = authSource;
        return this;
    }

    /**
     * The connection string of the cluster that you want to replicate.  https://www.mongodb.com/docs/manual/reference/connection-string/#find-your-self-hosted-deployment-s-connection-string for more information.
     */
    public SelfManagedReplicaSet withConnectionString(String connectionString) {
        Utils.checkNotNull(connectionString, "connectionString");
        this.connectionString = connectionString;
        return this;
    }

    /**
     * The name of the MongoDB database that contains the collection(s) to replicate.
     */
    public SelfManagedReplicaSet withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * The password associated with this username.
     */
    public SelfManagedReplicaSet withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * The password associated with this username.
     */
    public SelfManagedReplicaSet withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * When enabled, syncs will validate and structure records against the stream's schema.
     */
    public SelfManagedReplicaSet withSchemaEnforced(boolean schemaEnforced) {
        Utils.checkNotNull(schemaEnforced, "schemaEnforced");
        this.schemaEnforced = Optional.ofNullable(schemaEnforced);
        return this;
    }

    /**
     * When enabled, syncs will validate and structure records against the stream's schema.
     */
    public SelfManagedReplicaSet withSchemaEnforced(Optional<Boolean> schemaEnforced) {
        Utils.checkNotNull(schemaEnforced, "schemaEnforced");
        this.schemaEnforced = schemaEnforced;
        return this;
    }

    /**
     * The username which is used to access the database.
     */
    public SelfManagedReplicaSet withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = Optional.ofNullable(username);
        return this;
    }

    /**
     * The username which is used to access the database.
     */
    public SelfManagedReplicaSet withUsername(Optional<String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        SelfManagedReplicaSet other = (SelfManagedReplicaSet) o;
        return 
            Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            Objects.deepEquals(this.authSource, other.authSource) &&
            Objects.deepEquals(this.clusterType, other.clusterType) &&
            Objects.deepEquals(this.connectionString, other.connectionString) &&
            Objects.deepEquals(this.database, other.database) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.schemaEnforced, other.schemaEnforced) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalProperties,
            authSource,
            clusterType,
            connectionString,
            database,
            password,
            schemaEnforced,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SelfManagedReplicaSet.class,
                "additionalProperties", additionalProperties,
                "authSource", authSource,
                "clusterType", clusterType,
                "connectionString", connectionString,
                "database", database,
                "password", password,
                "schemaEnforced", schemaEnforced,
                "username", username);
    }
    
    public final static class Builder {
 
        private Map<String, Object> additionalProperties = new HashMap<>();
 
        private Optional<String> authSource;
 
        private String connectionString;
 
        private String database;
 
        private Optional<String> password = Optional.empty();
 
        private Optional<Boolean> schemaEnforced;
 
        private Optional<String> username = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalProperty(String key, Object value) {
            Utils.checkNotNull(key, "key");
            // we could be strict about null values (force the user
            // to pass `JsonNullable.of(null)`) but likely to be a bit 
            // annoying for additional properties building so we'll 
            // relax preconditions.
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * The authentication source where the user information is stored.
         */
        public Builder authSource(String authSource) {
            Utils.checkNotNull(authSource, "authSource");
            this.authSource = Optional.ofNullable(authSource);
            return this;
        }

        /**
         * The authentication source where the user information is stored.
         */
        public Builder authSource(Optional<String> authSource) {
            Utils.checkNotNull(authSource, "authSource");
            this.authSource = authSource;
            return this;
        }

        /**
         * The connection string of the cluster that you want to replicate.  https://www.mongodb.com/docs/manual/reference/connection-string/#find-your-self-hosted-deployment-s-connection-string for more information.
         */
        public Builder connectionString(String connectionString) {
            Utils.checkNotNull(connectionString, "connectionString");
            this.connectionString = connectionString;
            return this;
        }

        /**
         * The name of the MongoDB database that contains the collection(s) to replicate.
         */
        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }

        /**
         * The password associated with this username.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * The password associated with this username.
         */
        public Builder password(Optional<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * When enabled, syncs will validate and structure records against the stream's schema.
         */
        public Builder schemaEnforced(boolean schemaEnforced) {
            Utils.checkNotNull(schemaEnforced, "schemaEnforced");
            this.schemaEnforced = Optional.ofNullable(schemaEnforced);
            return this;
        }

        /**
         * When enabled, syncs will validate and structure records against the stream's schema.
         */
        public Builder schemaEnforced(Optional<Boolean> schemaEnforced) {
            Utils.checkNotNull(schemaEnforced, "schemaEnforced");
            this.schemaEnforced = schemaEnforced;
            return this;
        }

        /**
         * The username which is used to access the database.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = Optional.ofNullable(username);
            return this;
        }

        /**
         * The username which is used to access the database.
         */
        public Builder username(Optional<String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SelfManagedReplicaSet build() {
            if (authSource == null) {
                authSource = _SINGLETON_VALUE_AuthSource.value();
            }
            if (schemaEnforced == null) {
                schemaEnforced = _SINGLETON_VALUE_SchemaEnforced.value();
            }
            return new SelfManagedReplicaSet(
                authSource,
                connectionString,
                database,
                password,
                schemaEnforced,
                username)
                .withAdditionalProperties(additionalProperties);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_AuthSource =
                new LazySingletonValue<>(
                        "auth_source",
                        "\"admin\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<SourceMongodbV2ClusterType> _SINGLETON_VALUE_ClusterType =
                new LazySingletonValue<>(
                        "cluster_type",
                        "\"SELF_MANAGED_REPLICA_SET\"",
                        new TypeReference<SourceMongodbV2ClusterType>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_SchemaEnforced =
                new LazySingletonValue<>(
                        "schema_enforced",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
