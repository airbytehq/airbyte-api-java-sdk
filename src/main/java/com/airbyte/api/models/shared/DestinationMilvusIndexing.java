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

/**
 * DestinationMilvusIndexing - Indexing configuration
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
    private Optional<? extends String> db;

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
    private Optional<? extends String> textField;

    /**
     * The field in the entity that contains the vector
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vector_field")
    private Optional<? extends String> vectorField;

    public DestinationMilvusIndexing(
            @JsonProperty("auth") DestinationMilvusAuthentication auth,
            @JsonProperty("collection") String collection,
            @JsonProperty("db") Optional<? extends String> db,
            @JsonProperty("host") String host,
            @JsonProperty("text_field") Optional<? extends String> textField,
            @JsonProperty("vector_field") Optional<? extends String> vectorField) {
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

    /**
     * Authentication method
     */
    public DestinationMilvusAuthentication auth() {
        return auth;
    }

    /**
     * The collection to load data into
     */
    public String collection() {
        return collection;
    }

    /**
     * The database to connect to
     */
    public Optional<? extends String> db() {
        return db;
    }

    /**
     * The public endpoint of the Milvus instance. 
     */
    public String host() {
        return host;
    }

    /**
     * The field in the entity that contains the embedded text
     */
    public Optional<? extends String> textField() {
        return textField;
    }

    /**
     * The field in the entity that contains the vector
     */
    public Optional<? extends String> vectorField() {
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
    public DestinationMilvusIndexing withDb(Optional<? extends String> db) {
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
    public DestinationMilvusIndexing withTextField(Optional<? extends String> textField) {
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
    public DestinationMilvusIndexing withVectorField(Optional<? extends String> vectorField) {
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
            java.util.Objects.deepEquals(this.auth, other.auth) &&
            java.util.Objects.deepEquals(this.collection, other.collection) &&
            java.util.Objects.deepEquals(this.db, other.db) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.textField, other.textField) &&
            java.util.Objects.deepEquals(this.vectorField, other.vectorField);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends String> db;
 
        private String host;
 
        private Optional<? extends String> textField;
 
        private Optional<? extends String> vectorField;  
        
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
        public Builder db(Optional<? extends String> db) {
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
        public Builder textField(Optional<? extends String> textField) {
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
        public Builder vectorField(Optional<? extends String> vectorField) {
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

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Db =
                new LazySingletonValue<>(
                        "db",
                        "\"\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_TextField =
                new LazySingletonValue<>(
                        "text_field",
                        "\"text\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_VectorField =
                new LazySingletonValue<>(
                        "vector_field",
                        "\"vector\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

