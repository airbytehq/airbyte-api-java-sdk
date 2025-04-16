/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class LocalFilesystemLimited {

    /**
     * WARNING: Note that the local storage URL available for reading must start with the local mount "/local/" at the moment until we implement more advanced docker mounting options.
     */
    @JsonProperty("storage")
    private SourceFileSchemasProviderStorageProvider8Storage storage;

    @JsonCreator
    public LocalFilesystemLimited() {
        
        this.storage = Builder._SINGLETON_VALUE_Storage.value();
    }

    /**
     * WARNING: Note that the local storage URL available for reading must start with the local mount "/local/" at the moment until we implement more advanced docker mounting options.
     */
    @JsonIgnore
    public SourceFileSchemasProviderStorageProvider8Storage storage() {
        return storage;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalFilesystemLimited other = (LocalFilesystemLimited) o;
        return 
            Objects.deepEquals(this.storage, other.storage);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            storage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LocalFilesystemLimited.class,
                "storage", storage);
    }
    
    public final static class Builder {
        
        private Builder() {
          // force use of static builder() method
        }
        
        public LocalFilesystemLimited build() {
            return new LocalFilesystemLimited(
                );
        }

        private static final LazySingletonValue<SourceFileSchemasProviderStorageProvider8Storage> _SINGLETON_VALUE_Storage =
                new LazySingletonValue<>(
                        "storage",
                        "\"local\"",
                        new TypeReference<SourceFileSchemasProviderStorageProvider8Storage>() {});
    }
}
