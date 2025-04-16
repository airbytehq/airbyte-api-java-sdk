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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * SourceS3CopyRawFiles
 * 
 * <p>Copy raw files without parsing their contents. Bits are copied into the destination exactly as they appeared in the source. Recommended for use with unstructured text data, non-text and compressed files.
 */
public class SourceS3CopyRawFiles {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("delivery_type")
    private Optional<? extends SourceS3SchemasDeliveryType> deliveryType;

    /**
     * If enabled, sends subdirectory folder structure along with source file names to the destination. Otherwise, files will be synced by their names only. This option is ignored when file-based replication is not enabled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preserve_directory_structure")
    private Optional<Boolean> preserveDirectoryStructure;

    @JsonCreator
    public SourceS3CopyRawFiles(
            @JsonProperty("preserve_directory_structure") Optional<Boolean> preserveDirectoryStructure) {
        Utils.checkNotNull(preserveDirectoryStructure, "preserveDirectoryStructure");
        this.deliveryType = Builder._SINGLETON_VALUE_DeliveryType.value();
        this.preserveDirectoryStructure = preserveDirectoryStructure;
    }
    
    public SourceS3CopyRawFiles() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceS3SchemasDeliveryType> deliveryType() {
        return (Optional<SourceS3SchemasDeliveryType>) deliveryType;
    }

    /**
     * If enabled, sends subdirectory folder structure along with source file names to the destination. Otherwise, files will be synced by their names only. This option is ignored when file-based replication is not enabled.
     */
    @JsonIgnore
    public Optional<Boolean> preserveDirectoryStructure() {
        return preserveDirectoryStructure;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * If enabled, sends subdirectory folder structure along with source file names to the destination. Otherwise, files will be synced by their names only. This option is ignored when file-based replication is not enabled.
     */
    public SourceS3CopyRawFiles withPreserveDirectoryStructure(boolean preserveDirectoryStructure) {
        Utils.checkNotNull(preserveDirectoryStructure, "preserveDirectoryStructure");
        this.preserveDirectoryStructure = Optional.ofNullable(preserveDirectoryStructure);
        return this;
    }

    /**
     * If enabled, sends subdirectory folder structure along with source file names to the destination. Otherwise, files will be synced by their names only. This option is ignored when file-based replication is not enabled.
     */
    public SourceS3CopyRawFiles withPreserveDirectoryStructure(Optional<Boolean> preserveDirectoryStructure) {
        Utils.checkNotNull(preserveDirectoryStructure, "preserveDirectoryStructure");
        this.preserveDirectoryStructure = preserveDirectoryStructure;
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
        SourceS3CopyRawFiles other = (SourceS3CopyRawFiles) o;
        return 
            Objects.deepEquals(this.deliveryType, other.deliveryType) &&
            Objects.deepEquals(this.preserveDirectoryStructure, other.preserveDirectoryStructure);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            deliveryType,
            preserveDirectoryStructure);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceS3CopyRawFiles.class,
                "deliveryType", deliveryType,
                "preserveDirectoryStructure", preserveDirectoryStructure);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> preserveDirectoryStructure;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * If enabled, sends subdirectory folder structure along with source file names to the destination. Otherwise, files will be synced by their names only. This option is ignored when file-based replication is not enabled.
         */
        public Builder preserveDirectoryStructure(boolean preserveDirectoryStructure) {
            Utils.checkNotNull(preserveDirectoryStructure, "preserveDirectoryStructure");
            this.preserveDirectoryStructure = Optional.ofNullable(preserveDirectoryStructure);
            return this;
        }

        /**
         * If enabled, sends subdirectory folder structure along with source file names to the destination. Otherwise, files will be synced by their names only. This option is ignored when file-based replication is not enabled.
         */
        public Builder preserveDirectoryStructure(Optional<Boolean> preserveDirectoryStructure) {
            Utils.checkNotNull(preserveDirectoryStructure, "preserveDirectoryStructure");
            this.preserveDirectoryStructure = preserveDirectoryStructure;
            return this;
        }
        
        public SourceS3CopyRawFiles build() {
            if (preserveDirectoryStructure == null) {
                preserveDirectoryStructure = _SINGLETON_VALUE_PreserveDirectoryStructure.value();
            }
            return new SourceS3CopyRawFiles(
                preserveDirectoryStructure);
        }

        private static final LazySingletonValue<Optional<? extends SourceS3SchemasDeliveryType>> _SINGLETON_VALUE_DeliveryType =
                new LazySingletonValue<>(
                        "delivery_type",
                        "\"use_file_transfer\"",
                        new TypeReference<Optional<? extends SourceS3SchemasDeliveryType>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_PreserveDirectoryStructure =
                new LazySingletonValue<>(
                        "preserve_directory_structure",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
