/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
 * ChromaLocalPersistance - Chroma is a popular vector store that can be used to store and retrieve embeddings. It will build its index in memory and persist it to disk by the end of the sync.
 */

public class ChromaLocalPersistance {

    /**
     * Name of the collection to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collection_name")
    private Optional<? extends String> collectionName;

    /**
     * Path to the directory where chroma files will be written. The files will be placed inside that local mount.
     */
    @JsonProperty("destination_path")
    private String destinationPath;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationLangchainSchemasIndexingIndexing3Mode> mode;

    @JsonCreator
    public ChromaLocalPersistance(
            @JsonProperty("collection_name") Optional<? extends String> collectionName,
            @JsonProperty("destination_path") String destinationPath) {
        Utils.checkNotNull(collectionName, "collectionName");
        Utils.checkNotNull(destinationPath, "destinationPath");
        this.collectionName = collectionName;
        this.destinationPath = destinationPath;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }
    
    public ChromaLocalPersistance(
            String destinationPath) {
        this(Optional.empty(), destinationPath);
    }

    /**
     * Name of the collection to use.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> collectionName() {
        return (Optional<String>) collectionName;
    }

    /**
     * Path to the directory where chroma files will be written. The files will be placed inside that local mount.
     */
    @JsonIgnore
    public String destinationPath() {
        return destinationPath;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationLangchainSchemasIndexingIndexing3Mode> mode() {
        return (Optional<DestinationLangchainSchemasIndexingIndexing3Mode>) mode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the collection to use.
     */
    public ChromaLocalPersistance withCollectionName(String collectionName) {
        Utils.checkNotNull(collectionName, "collectionName");
        this.collectionName = Optional.ofNullable(collectionName);
        return this;
    }

    /**
     * Name of the collection to use.
     */
    public ChromaLocalPersistance withCollectionName(Optional<? extends String> collectionName) {
        Utils.checkNotNull(collectionName, "collectionName");
        this.collectionName = collectionName;
        return this;
    }

    /**
     * Path to the directory where chroma files will be written. The files will be placed inside that local mount.
     */
    public ChromaLocalPersistance withDestinationPath(String destinationPath) {
        Utils.checkNotNull(destinationPath, "destinationPath");
        this.destinationPath = destinationPath;
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
        ChromaLocalPersistance other = (ChromaLocalPersistance) o;
        return 
            java.util.Objects.deepEquals(this.collectionName, other.collectionName) &&
            java.util.Objects.deepEquals(this.destinationPath, other.destinationPath) &&
            java.util.Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            collectionName,
            destinationPath,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ChromaLocalPersistance.class,
                "collectionName", collectionName,
                "destinationPath", destinationPath,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> collectionName;
 
        private String destinationPath;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the collection to use.
         */
        public Builder collectionName(String collectionName) {
            Utils.checkNotNull(collectionName, "collectionName");
            this.collectionName = Optional.ofNullable(collectionName);
            return this;
        }

        /**
         * Name of the collection to use.
         */
        public Builder collectionName(Optional<? extends String> collectionName) {
            Utils.checkNotNull(collectionName, "collectionName");
            this.collectionName = collectionName;
            return this;
        }

        /**
         * Path to the directory where chroma files will be written. The files will be placed inside that local mount.
         */
        public Builder destinationPath(String destinationPath) {
            Utils.checkNotNull(destinationPath, "destinationPath");
            this.destinationPath = destinationPath;
            return this;
        }
        
        public ChromaLocalPersistance build() {
            if (collectionName == null) {
                collectionName = _SINGLETON_VALUE_CollectionName.value();
            }
            return new ChromaLocalPersistance(
                collectionName,
                destinationPath);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_CollectionName =
                new LazySingletonValue<>(
                        "collection_name",
                        "\"langchain\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends DestinationLangchainSchemasIndexingIndexing3Mode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"chroma_local\"",
                        new TypeReference<Optional<? extends DestinationLangchainSchemasIndexingIndexing3Mode>>() {});
    }
}

