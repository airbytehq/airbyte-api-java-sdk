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
 * DocArrayHnswSearch - DocArrayHnswSearch is a lightweight Document Index implementation provided by Docarray that runs fully locally and is best suited for small- to medium-sized datasets. It stores vectors on disk in hnswlib, and stores all other data in SQLite.
 */

public class DocArrayHnswSearch {

    /**
     * Path to the directory where hnswlib and meta data files will be written. The files will be placed inside that local mount. All files in the specified destination directory will be deleted on each run.
     */
    @JsonProperty("destination_path")
    private String destinationPath;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationLangchainSchemasIndexingIndexingMode> mode;

    public DocArrayHnswSearch(
            @JsonProperty("destination_path") String destinationPath) {
        Utils.checkNotNull(destinationPath, "destinationPath");
        this.destinationPath = destinationPath;
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
    }

    /**
     * Path to the directory where hnswlib and meta data files will be written. The files will be placed inside that local mount. All files in the specified destination directory will be deleted on each run.
     */
    public String destinationPath() {
        return destinationPath;
    }

    public Optional<? extends DestinationLangchainSchemasIndexingIndexingMode> mode() {
        return mode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Path to the directory where hnswlib and meta data files will be written. The files will be placed inside that local mount. All files in the specified destination directory will be deleted on each run.
     */
    public DocArrayHnswSearch withDestinationPath(String destinationPath) {
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
        DocArrayHnswSearch other = (DocArrayHnswSearch) o;
        return 
            java.util.Objects.deepEquals(this.destinationPath, other.destinationPath) &&
            java.util.Objects.deepEquals(this.mode, other.mode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            destinationPath,
            mode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DocArrayHnswSearch.class,
                "destinationPath", destinationPath,
                "mode", mode);
    }
    
    public final static class Builder {
 
        private String destinationPath;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Path to the directory where hnswlib and meta data files will be written. The files will be placed inside that local mount. All files in the specified destination directory will be deleted on each run.
         */
        public Builder destinationPath(String destinationPath) {
            Utils.checkNotNull(destinationPath, "destinationPath");
            this.destinationPath = destinationPath;
            return this;
        }
        
        public DocArrayHnswSearch build() {
            return new DocArrayHnswSearch(
                destinationPath);
        }

        private static final LazySingletonValue<Optional<? extends DestinationLangchainSchemasIndexingIndexingMode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"DocArrayHnswSearch\"",
                        new TypeReference<Optional<? extends DestinationLangchainSchemasIndexingIndexingMode>>() {});
    }
}

