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
import java.util.Objects;
import java.util.Optional;

/**
 * DestinationMilvusIndexing
 * 
 * <p>Indexing configuration
 */
public class DestinationMilvusIndexing {

    /**
     * Authentication method
     */
    @JsonProperty("auth")
    private DestinationMilvusAuthentication auth;

    /**
     * The collection to load data into
     */
    @JsonProperty("collection")
    private String collection;

    /**
     * The database to connect to
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("db")
    private Optional<String> db;

    /**
     * The public endpoint of the Milvus instance.
     */
    @JsonProperty("host")
    private String host;

    /**
     * The field in the entity that contains the embedded text
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_field")
    private Optional<String> textField;

    /**
     * The field in the entity that contains the vector
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vector_field")
    private Optional<String> vectorField;

    @JsonCreator
    public DestinationMilvusIndexing(
            @JsonProperty("auth") DestinationMilvusAuthentication auth,
            @JsonProperty("collection") String collection,
            @JsonProperty("db") Optional<String> db,
            @JsonProperty("host") String host,
            @JsonProperty("text_field") Optional<String> textField,
            @JsonProperty("vector_field") Optional<String> vectorField) {
        Utils.checkNotNull(auth, "auth");
        Utils.checkNotNull(collection, "collection");
        Utils.checkNotNull(db, "db");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(textField, "textField");
        Utils.checkNotNull(vectorField, "vectorField");
        this.auth = auth;
        this.collection = collection;
        this.db = db;
        this.host = host;
        this.textField = textField;
        this.vectorField = vectorField;
    }
    
    public DestinationMilvusIndexing(
            DestinationMilvusAuthentication auth,
            String collection,
            String host) {
        this(auth, collection, Optional.empty(), host, Optional.empty(), Optional.empty());
    }

    /**
     * Authentication method
     */
    @JsonIgnore
    public DestinationMilvusAuthentication auth() {
        return auth;
    }

    /**
     * The collection to load data into
     */
    @JsonIgnore
    public String collection() {
        return collection;
    }

    /**
     * The database to connect to
     */
    @JsonIgnore
    public Optional<String> db() {
        return db;
    }

    /**
     * The public endpoint of the Milvus instance.
     */
    @JsonIgnore
    public String host() {
        return host;
    }

    /**
     * The field in the entity that contains the embedded text
     */
    @JsonIgnore
    public Optional<String> textField() {
        return textField;
    }

    /**
     * The field in the entity that contains the vector
     */
    @JsonIgnore
    public Optional<String> vectorField() {
        return vectorField;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Authentication method
     */
    public DestinationMilvusIndexing withAuth(DestinationMilvusAuthentication auth) {
        Utils.checkNotNull(auth, "auth");
        this.auth = auth;
        return this;
    }

    /**
     * The collection to load data into
     */
    public DestinationMilvusIndexing withCollection(String collection) {
        Utils.checkNotNull(collection, "collection");
        this.collection = collection;
        return this;
    }

    /**
     * The database to connect to
     */
    public DestinationMilvusIndexing withDb(String db) {
        Utils.checkNotNull(db, "db");
        this.db = Optional.ofNullable(db);
        return this;
    }

    /**
     * The database to connect to
     */
    public DestinationMilvusIndexing withDb(Optional<String> db) {
        Utils.checkNotNull(db, "db");
        this.db = db;
        return this;
    }

    /**
     * The public endpoint of the Milvus instance.
     */
    public DestinationMilvusIndexing withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * The field in the entity that contains the embedded text
     */
    public DestinationMilvusIndexing withTextField(String textField) {
        Utils.checkNotNull(textField, "textField");
        this.textField = Optional.ofNullable(textField);
        return this;
    }

    /**
     * The field in the entity that contains the embedded text
     */
    public DestinationMilvusIndexing withTextField(Optional<String> textField) {
        Utils.checkNotNull(textField, "textField");
        this.textField = textField;
        return this;
    }

    /**
     * The field in the entity that contains the vector
     */
    public DestinationMilvusIndexing withVectorField(String vectorField) {
        Utils.checkNotNull(vectorField, "vectorField");
        this.vectorField = Optional.ofNullable(vectorField);
        return this;
    }

    /**
     * The field in the entity that contains the vector
     */
    public DestinationMilvusIndexing withVectorField(Optional<String> vectorField) {
        Utils.checkNotNull(vectorField, "vectorField");
        this.vectorField = vectorField;
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
        DestinationMilvusIndexing other = (DestinationMilvusIndexing) o;
        return 
            Objects.deepEquals(this.auth, other.auth) &&
            Objects.deepEquals(this.collection, other.collection) &&
            Objects.deepEquals(this.db, other.db) &&
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.textField, other.textField) &&
            Objects.deepEquals(this.vectorField, other.vectorField);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            auth,
            collection,
            db,
            host,
            textField,
            vectorField);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMilvusIndexing.class,
                "auth", auth,
                "collection", collection,
                "db", db,
                "host", host,
                "textField", textField,
                "vectorField", vectorField);
    }
    
    public final static class Builder {
 
        private DestinationMilvusAuthentication auth;
 
        private String collection;
 
        private Optional<String> db;
 
        private String host;
 
        private Optional<String> textField;
 
        private Optional<String> vectorField;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Authentication method
         */
        public Builder auth(DestinationMilvusAuthentication auth) {
            Utils.checkNotNull(auth, "auth");
            this.auth = auth;
            return this;
        }

        /**
         * The collection to load data into
         */
        public Builder collection(String collection) {
            Utils.checkNotNull(collection, "collection");
            this.collection = collection;
            return this;
        }

        /**
         * The database to connect to
         */
        public Builder db(String db) {
            Utils.checkNotNull(db, "db");
            this.db = Optional.ofNullable(db);
            return this;
        }

        /**
         * The database to connect to
         */
        public Builder db(Optional<String> db) {
            Utils.checkNotNull(db, "db");
            this.db = db;
            return this;
        }

        /**
         * The public endpoint of the Milvus instance.
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * The field in the entity that contains the embedded text
         */
        public Builder textField(String textField) {
            Utils.checkNotNull(textField, "textField");
            this.textField = Optional.ofNullable(textField);
            return this;
        }

        /**
         * The field in the entity that contains the embedded text
         */
        public Builder textField(Optional<String> textField) {
            Utils.checkNotNull(textField, "textField");
            this.textField = textField;
            return this;
        }

        /**
         * The field in the entity that contains the vector
         */
        public Builder vectorField(String vectorField) {
            Utils.checkNotNull(vectorField, "vectorField");
            this.vectorField = Optional.ofNullable(vectorField);
            return this;
        }

        /**
         * The field in the entity that contains the vector
         */
        public Builder vectorField(Optional<String> vectorField) {
            Utils.checkNotNull(vectorField, "vectorField");
            this.vectorField = vectorField;
            return this;
        }
        
        public DestinationMilvusIndexing build() {
            if (db == null) {
                db = _SINGLETON_VALUE_Db.value();
            }
            if (textField == null) {
                textField = _SINGLETON_VALUE_TextField.value();
            }
            if (vectorField == null) {
                vectorField = _SINGLETON_VALUE_VectorField.value();
            }
            return new DestinationMilvusIndexing(
                auth,
                collection,
                db,
                host,
                textField,
                vectorField);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Db =
                new LazySingletonValue<>(
                        "db",
                        "\"\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_TextField =
                new LazySingletonValue<>(
                        "text_field",
                        "\"text\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_VectorField =
                new LazySingletonValue<>(
                        "vector_field",
                        "\"vector\"",
                        new TypeReference<Optional<String>>() {});
    }
}
