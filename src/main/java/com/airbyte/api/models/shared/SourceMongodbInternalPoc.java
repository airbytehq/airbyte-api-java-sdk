/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SourceMongodbInternalPoc {

    /**
     * The authentication source where the user information is stored.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_source")
    private Optional<? extends String> authSource;

    /**
     * The connection string of the database that you want to replicate..
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connection_string")
    private Optional<? extends String> connectionString;

    /**
     * The password associated with this username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    /**
     * The name of the replica set to be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replica_set")
    private Optional<? extends String> replicaSet;

    @JsonProperty("sourceType")
    private MongodbInternalPoc sourceType;

    /**
     * The username which is used to access the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    private Optional<? extends String> user;

    public SourceMongodbInternalPoc(
            @JsonProperty("auth_source") Optional<? extends String> authSource,
            @JsonProperty("connection_string") Optional<? extends String> connectionString,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("replica_set") Optional<? extends String> replicaSet,
            @JsonProperty("user") Optional<? extends String> user) {
        Utils.checkNotNull(authSource, "authSource");
        Utils.checkNotNull(connectionString, "connectionString");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(replicaSet, "replicaSet");
        Utils.checkNotNull(user, "user");
        this.authSource = authSource;
        this.connectionString = connectionString;
        this.password = password;
        this.replicaSet = replicaSet;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.user = user;
    }

    /**
     * The authentication source where the user information is stored.
     */
    public Optional<? extends String> authSource() {
        return authSource;
    }

    /**
     * The connection string of the database that you want to replicate..
     */
    public Optional<? extends String> connectionString() {
        return connectionString;
    }

    /**
     * The password associated with this username.
     */
    public Optional<? extends String> password() {
        return password;
    }

    /**
     * The name of the replica set to be replicated.
     */
    public Optional<? extends String> replicaSet() {
        return replicaSet;
    }

    public MongodbInternalPoc sourceType() {
        return sourceType;
    }

    /**
     * The username which is used to access the database.
     */
    public Optional<? extends String> user() {
        return user;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The authentication source where the user information is stored.
     */
    public SourceMongodbInternalPoc withAuthSource(String authSource) {
        Utils.checkNotNull(authSource, "authSource");
        this.authSource = Optional.ofNullable(authSource);
        return this;
    }

    /**
     * The authentication source where the user information is stored.
     */
    public SourceMongodbInternalPoc withAuthSource(Optional<? extends String> authSource) {
        Utils.checkNotNull(authSource, "authSource");
        this.authSource = authSource;
        return this;
    }

    /**
     * The connection string of the database that you want to replicate..
     */
    public SourceMongodbInternalPoc withConnectionString(String connectionString) {
        Utils.checkNotNull(connectionString, "connectionString");
        this.connectionString = Optional.ofNullable(connectionString);
        return this;
    }

    /**
     * The connection string of the database that you want to replicate..
     */
    public SourceMongodbInternalPoc withConnectionString(Optional<? extends String> connectionString) {
        Utils.checkNotNull(connectionString, "connectionString");
        this.connectionString = connectionString;
        return this;
    }

    /**
     * The password associated with this username.
     */
    public SourceMongodbInternalPoc withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * The password associated with this username.
     */
    public SourceMongodbInternalPoc withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * The name of the replica set to be replicated.
     */
    public SourceMongodbInternalPoc withReplicaSet(String replicaSet) {
        Utils.checkNotNull(replicaSet, "replicaSet");
        this.replicaSet = Optional.ofNullable(replicaSet);
        return this;
    }

    /**
     * The name of the replica set to be replicated.
     */
    public SourceMongodbInternalPoc withReplicaSet(Optional<? extends String> replicaSet) {
        Utils.checkNotNull(replicaSet, "replicaSet");
        this.replicaSet = replicaSet;
        return this;
    }

    /**
     * The username which is used to access the database.
     */
    public SourceMongodbInternalPoc withUser(String user) {
        Utils.checkNotNull(user, "user");
        this.user = Optional.ofNullable(user);
        return this;
    }

    /**
     * The username which is used to access the database.
     */
    public SourceMongodbInternalPoc withUser(Optional<? extends String> user) {
        Utils.checkNotNull(user, "user");
        this.user = user;
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
        SourceMongodbInternalPoc other = (SourceMongodbInternalPoc) o;
        return 
            java.util.Objects.deepEquals(this.authSource, other.authSource) &&
            java.util.Objects.deepEquals(this.connectionString, other.connectionString) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.replicaSet, other.replicaSet) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.user, other.user);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authSource,
            connectionString,
            password,
            replicaSet,
            sourceType,
            user);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMongodbInternalPoc.class,
                "authSource", authSource,
                "connectionString", connectionString,
                "password", password,
                "replicaSet", replicaSet,
                "sourceType", sourceType,
                "user", user);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> authSource;
 
        private Optional<? extends String> connectionString = Optional.empty();
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends String> replicaSet = Optional.empty();
 
        private Optional<? extends String> user = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        public Builder authSource(Optional<? extends String> authSource) {
            Utils.checkNotNull(authSource, "authSource");
            this.authSource = authSource;
            return this;
        }

        /**
         * The connection string of the database that you want to replicate..
         */
        public Builder connectionString(String connectionString) {
            Utils.checkNotNull(connectionString, "connectionString");
            this.connectionString = Optional.ofNullable(connectionString);
            return this;
        }

        /**
         * The connection string of the database that you want to replicate..
         */
        public Builder connectionString(Optional<? extends String> connectionString) {
            Utils.checkNotNull(connectionString, "connectionString");
            this.connectionString = connectionString;
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
        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * The name of the replica set to be replicated.
         */
        public Builder replicaSet(String replicaSet) {
            Utils.checkNotNull(replicaSet, "replicaSet");
            this.replicaSet = Optional.ofNullable(replicaSet);
            return this;
        }

        /**
         * The name of the replica set to be replicated.
         */
        public Builder replicaSet(Optional<? extends String> replicaSet) {
            Utils.checkNotNull(replicaSet, "replicaSet");
            this.replicaSet = replicaSet;
            return this;
        }

        /**
         * The username which is used to access the database.
         */
        public Builder user(String user) {
            Utils.checkNotNull(user, "user");
            this.user = Optional.ofNullable(user);
            return this;
        }

        /**
         * The username which is used to access the database.
         */
        public Builder user(Optional<? extends String> user) {
            Utils.checkNotNull(user, "user");
            this.user = user;
            return this;
        }
        
        public SourceMongodbInternalPoc build() {
            if (authSource == null) {
                authSource = _SINGLETON_VALUE_AuthSource.value();
            }
            return new SourceMongodbInternalPoc(
                authSource,
                connectionString,
                password,
                replicaSet,
                user);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_AuthSource =
                new LazySingletonValue<>(
                        "auth_source",
                        "\"admin\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<MongodbInternalPoc> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mongodb-internal-poc\"",
                        new TypeReference<MongodbInternalPoc>() {});
    }
}

